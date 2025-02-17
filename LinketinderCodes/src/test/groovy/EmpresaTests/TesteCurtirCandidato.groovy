import spock.lang.Specification
import Server.Vaga
import Users.Candidato
import Users.Empresa

class TesteCurtirCandidato extends Specification {
    def "Testar método curtirCandidato"() {
        given: "Uma empresa e um candidato"
        List<String> competenciasEmpresa = ["Java", "Python", "SQL"]
        Empresa empresa = new Empresa("TechCorp", "contato@techcorp.com", "12345678000195", "Brasil", "SP", "01000-000", "Empresa de tecnologia", competenciasEmpresa)
        List<String> competenciasCandidato = ["Java", "Python", "SQL"]
        Candidato candidato = new Candidato("Gabriel", "gabriel@example.com", "123456789", 25, "SP", "01000-000", "Descrição do candidato", competenciasCandidato)
        Vaga vaga = new Vaga("Desenvolvedor Java", empresa)

        when: "A empresa curte o candidato para a vaga"
        empresa.curtirCandidato(candidato, vaga)

        then: "O candidato deve ser adicionado à lista de candidatos curtidos da empresa"
        empresa.candidatosCurtidos.size() == 1
        empresa.candidatosCurtidos.contains(candidato)
    }
}