import spock.lang.Specification
import Users.Empresa
import Users.Candidato
import Server.Vaga
import Server.Dados

class TesteEmpresaSpec extends Specification {

    def "Deve criar uma empresa com os atributos corretos"() {
        given: "Dados da empresa"
        String nome = "Tech Corp"
        String emailCorp = "contato@techcorp.com"
        String cnpj = "12.345.678/0001-99"
        String paisOrigem = "Brasil"
        String estado = "SP"
        String CEP = "01000-000"
        String descricao = "Empresa de tecnologia inovadora"
        List<String> competencias = ["IA", "Cloud", "Big Data"]

        when: "Criamos uma empresa"
        Empresa empresa = new Empresa(nome, emailCorp, cnpj, paisOrigem, estado, CEP, descricao, competencias)

        then: "Os atributos devem ser corretamente atribuídos"
        expect:
        empresa.nome == nome
        empresa.emailCorp == emailCorp
        empresa.cnpj == cnpj
        empresa.paisOrigem == paisOrigem
        empresa.estado == estado
        empresa.CEP == CEP
        empresa.descricao == descricao
        empresa.competenciasEmpresa == competencias
    }

    def "Deve adicionar um candidato à lista de curtidos"() {
        given: "Uma empresa, um candidato mockado e uma vaga mockada"
        Empresa empresa = new Empresa("Tech Corp", "contato@techcorp.com", "12.345.678/0001-99", "Brasil", "SP", "01000-000", "Empresa de tecnologia", ["IA", "Cloud"])
        Candidato candidatoMock = GroovyMock(Candidato)
        Vaga vagaMock = GroovyMock(Vaga)
        vagaMock.titulo >> "Desenvolvedor Java"

        and: "Mock de Dados para evitar execução real do método"
        GroovyMock(Dados, global: true)

        when: "A empresa curte o candidato"
        empresa.curtirCandidato(candidatoMock, vagaMock)

        then: "O candidato deve estar na lista de curtidos"
        empresa.candidatosCurtidos.contains(candidatoMock)

        and: "O método verificarMatches deve ser chamado"
        1 * Dados.verificarMatches(empresa, candidatoMock)
    }

    def "Deve criar uma nova vaga corretamente"() {
        given: "Uma empresa"
        Empresa empresa = new Empresa("Tech Corp", "contato@techcorp.com", "12.345.678/0001-99", "Brasil", "SP", "01000-000", "Empresa de tecnologia", ["IA", "Cloud"])

        when: "Criamos uma nova vaga"
        Vaga novaVaga = empresa.criarVaga("Engenheiro de Software")

        then: "A vaga deve ser criada e adicionada à lista"
        novaVaga.titulo == "Engenheiro de Software"
        empresa.vagasDaEmpresa.contains(novaVaga)
    }
}
