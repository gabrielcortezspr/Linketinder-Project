import spock.lang.Specification
import Server.Vaga
import Users.Candidato
import Users.Empresa

class TesteCriarCandidato extends Specification{

    def "Testar criação de candidato e inserção no array de candidatos"() {
        given: "Um novo candidato com dados específicos"
        List<String> competenciasCandidato = ["Java", "Python", "SQL"]
        Candidato candidato = new Candidato("Gabriel", "gabriel@example.com", "123456789", 25, "SP", "01000-000", "Descrição do candidato", competenciasCandidato)

        expect: "O candidato deve ser criado corretamente"
        candidato.nome == "Gabriel"
        candidato.email == "gabriel@example.com"
        candidato.cpf == "123456789"
        candidato.idade == 25
        candidato.estado == "SP"
        candidato.CEP == "01000-000"
        candidato.descricao == "Descrição do candidato"
        candidato.CompetenciasCandidato == competenciasCandidato

        and: "O candidato deve ser inserido na lista de candidatos em Dados"
        Dados.listaCandidatos.size() == 1
        Dados.listaCandidatos.contains(candidato)
    }
}