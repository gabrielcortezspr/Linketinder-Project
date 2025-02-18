package Users
import Server.Dados
import Server.Vaga
import groovy.transform.Canonical

@Canonical
class Empresa {

    String nome
    String emailCorp
    String cnpj
    String paisOrigem
    String estado
    String CEP
    String descricao
    List<String> competenciasEmpresa = []
    List<Candidato> candidatosCurtidos = []
    List<Vaga> vagasDaEmpresa = []

    // Construtor que adiciona automaticamente a empresa à lista
    Empresa(String nome, String emailCorp, String cnpj, String paisOrigem, String estado, String CEP, String descricao, List<String> competenciasEmpresa) {
        this.nome = nome
        this.emailCorp = emailCorp
        this.cnpj = cnpj
        this.paisOrigem = paisOrigem
        this.estado = estado
        this.CEP = CEP
        this.descricao = descricao
        this.competenciasEmpresa = competenciasEmpresa

    }

    @Override
    String toString() {
        return """\
        Empresa: $nome
        Email Corporativo: $emailCorp
        CNPJ: $cnpj
        País de Origem: $paisOrigem
        Estado: $estado
        CEP: $CEP
        Descrição: $descricao
        Competências: ${competenciasEmpresa.join(', ')}
        """
    }

    void curtirCandidato (Candidato candidato, Vaga vaga){
        if (!candidatosCurtidos.contains(candidato)){
            candidatosCurtidos.add(candidato)
            println(nome + ' curtiu o(a) candidato(a) para a vaga:' + vaga.titulo)
            Dados.verificarMatches(this, candidato)  // Verifica se houve match
        }
    }
    Vaga criarVaga(String nomeDaVaga) {
        Vaga novaVaga = new Vaga(nomeDaVaga, this) // Passa o nome da empresa
        vagasDaEmpresa << novaVaga // Adiciona à lista de vagas
        return novaVaga
    }

}
