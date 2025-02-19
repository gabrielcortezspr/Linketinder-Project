import Server.Vaga
import Users.Candidato
import spock.lang.*

class TesteCandidatoSpec extends Specification {

    def "Deve criar um candidato com os atributos corretos"() {
        given: "Dados do candidato"

        String nome = "Gabriel Cortez"
        String email = "gabriel.cortez@example.com"
        String cpf = "123.456.789-00"
        int idade = 25
        String estado = "AM"
        String CEP = "69000-000"
        String descricao = "Engenheiro de computação apaixonado por QA e IoT"
        List<String> competencias = ["Java", "Groovy", "Selenium"]

        when: "Criamos um candidato"
        Candidato candidato = new Candidato(nome, email, cpf, idade, estado, CEP, descricao, competencias)

        then: "Os atributos devem ser corretamente atribuídos"
        expect:
        candidato.nome == nome
        candidato.email == email
        candidato.cpf == cpf
        candidato.idade == idade
        candidato.estado == estado
        candidato.CEP == CEP
        candidato.descricao == descricao
        candidato.CompetenciasCandidato == competencias
    }

    def "Deve adicionar uma vaga na lista de vagas curtidas"() {
        given: "Um candidato e uma vaga mockada"
        Candidato candidato = new Candidato("João Silva", "joao@email.com", "123.456.789-00", 30, "SP", "01000-000", "Desenvolvedor", ["Java", "Groovy"])
        Vaga vaga = GroovyMock(Vaga)

        when: "O candidato curte a vaga"
        candidato.curtirVaga(vaga)

        then: "A vaga deve estar na lista de vagas curtidas do candidato"
        candidato.vagasCurtidas.contains(vaga)
    }

    def "Não deve adicionar a mesma vaga duas vezes"() {
        given: "Um candidato e uma vaga mockada"
        Candidato candidato = new Candidato("Maria Oliveira", "maria@email.com", "987.654.321-00", 25, "RJ", "22000-000", "QA Engineer", ["Selenium", "Python"])
        Vaga vaga = GroovyMock(Vaga)

        when: "O candidato curte a mesma vaga duas vezes"
        candidato.curtirVaga(vaga)
        candidato.curtirVaga(vaga)

        then: "A vaga deve estar na lista apenas uma vez"
        candidato.vagasCurtidas.size() == 1
    }
}
