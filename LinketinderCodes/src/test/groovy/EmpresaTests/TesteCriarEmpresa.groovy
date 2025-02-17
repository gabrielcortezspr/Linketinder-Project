import spock.lang.Specification
import Server.Vaga
import Users.Candidato
import Users.Empresa

class TesteCriarEmpresa extends Specification {

    def "Testar criação de empresa e inserção no array de empresas"() {
        given: "Uma nova empresa com dados específicos"
        List<String> competenciasEmpresa = ["Java", "Python", "SQL"]
        Empresa empresa = new Empresa("TechCorp", "contato@techcorp.com", "12345678000195", "Brasil", "SP", "01000-000", "Empresa de tecnologia", competenciasEmpresa)

        expect: "A empresa deve ser criada corretamente"
        empresa.nome == "TechCorp"
        empresa.emailCorp == "contato@techcorp.com"
        empresa.cnpj == "12345678000195"
        empresa.paisOrigem == "Brasil"
        empresa.estado == "SP"
        empresa.CEP == "01000-000"
        empresa.descricao == "Empresa de tecnologia"
        empresa.competenciasEmpresa == competenciasEmpresa

        and: "A empresa deve ser inserida na lista de empresas em Dados"
        Dados.listaEmpresas.size() == 1
        Dados.listaEmpresas.contains(empresa)
    }
}