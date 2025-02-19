import spock.lang.Specification
import Server.Dados
import Users.Candidato
import Users.Empresa

class TesteAdicionarDadosSpec extends Specification {

    def "Testa adicionar Candidato"() {
        given: "Um candidato mockado"
        Candidato candidato = GroovyMock(Candidato)
        candidato.nome >> "João Silva"

        when: "Adicionamos o candidato à lista"
        Dados.addCandidato(candidato)

        then: "A lista de candidatos contém o candidato"
        Dados.listaCandidatos.size() == 1
        Dados.listaCandidatos.contains(candidato)
    }

    def "Testa adicionar Empresa"() {
        given: "Uma empresa mockada"
        Empresa empresa = GroovyMock(Empresa)
        empresa.nome >> "TechCorp"

        when: "Adicionamos a empresa à lista"
        Dados.addEmpresa(empresa)

        then: "A lista de empresas contém a empresa"
        Dados.listaEmpresas.size() == 1
        Dados.listaEmpresas.contains(empresa)
    }
}
