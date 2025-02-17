import spock.lang.Specification
import Server.Vaga
import Users.Candidato
import Users.Empresa

class TesteCriarVaga extends Specification {

    def "Testar criação de vaga e inserção no array de vagas da empresa"() {
        given: "Uma empresa e a criação de uma vaga"
        List<String> competenciasEmpresa = ["Java", "Python", "SQL"]
        Empresa empresa = new Empresa("TechCorp", "contato@techcorp.com", "12345678000195", "Brasil", "SP", "01000-000", "Empresa de tecnologia", competenciasEmpresa)

        when: "A empresa cria uma nova vaga"
        Vaga vaga = empresa.criarVaga("Desenvolvedor Java")

        then: "A vaga deve ser adicionada à lista de vagas da empresa"
        empresa.vagasDaEmpresa.size() == 1
        empresa.vagasDaEmpresa.contains(vaga)
    }
}
