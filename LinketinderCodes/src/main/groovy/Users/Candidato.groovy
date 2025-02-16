package Users

import Server.Dados
import Server.Vaga

class Candidato {

    String nome
    String email
    String cpf
    int idade
    String estado
    String CEP
    String descricao
    List<String> CompetenciasCandidato = []
    List<Vaga> vagasCurtidas = []


    Candidato(String nome, String email, String cpf, int idade, String estado, String CEP, String descricao, List<String> competenciasCandidato) {
        this.nome = nome
        this.email = email
        this.cpf = cpf
        this.idade = idade
        this.estado = estado
        this.CEP = CEP
        this.descricao = descricao
        CompetenciasCandidato = competenciasCandidato

        Dados.listaCandidatos << this
    }
    @Override
    String toString() {
        return """\
        Candidato: $nome
        Email: $email
        CPF: $cpf
        Idade: $idade
        Estado: $estado
        CEP: $CEP
        Descrição: $descricao
        Competências: ${CompetenciasCandidato.join(', ')}
        """
    }
    void curtirVaga(Vaga vaga){
        if (!vagasCurtidas.contains(vaga)){
            vagasCurtidas.add(vaga)
            println("$nome curtiu vaga ${vaga.titulo}")

        }
    }

}
