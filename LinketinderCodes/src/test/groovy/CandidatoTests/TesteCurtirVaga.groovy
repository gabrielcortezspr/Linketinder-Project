import spock.lang.Specification
import Server.Vaga
import Users.Candidato
import Users.Empresa

class TesteCurtirVaga extends Specification {

    def "Testar método curtirVaga"() {
        given: "Um candidato e uma vaga"
        List<String> competenciasCandidato = ["Java", "Python", "SQL"]
        Candidato candidato = new Candidato("Gabriel", "gabriel@example.com", "123456789", 25, "SP", "01000-000", "Descrição do candidato", competenciasCandidato)
        Vaga vaga = new Vaga("Desenvolvedor Java", new Empresa("TechCorp", "contato@techcorp.com", "12345678000195", "Brasil", "SP", "01000-000", "Empresa de tecnologia", ["Java", "Python", "SQL"]))

        when: "O candidato curte a vaga"
        candidato.curtirVaga(vaga)

        then: "A vaga deve ser adicionada à lista de vagas curtidas do candidato"
        candidato.vagasCurtidas.size() == 1
        candidato.vagasCurtidas.contains(vaga)
    }
}
