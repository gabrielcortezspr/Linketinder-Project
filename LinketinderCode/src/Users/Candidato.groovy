package Users
import groovy.transform.Canonical

@Canonical
class Candidato {

    String nome
    String email
    String cpf
    int idade
    String estado
    String CEP
    String descricao
    List <String> CompetenciasCandidato

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


}
