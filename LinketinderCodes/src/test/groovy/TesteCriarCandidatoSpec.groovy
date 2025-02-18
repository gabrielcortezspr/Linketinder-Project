import Users.Candidato
import spock.lang.Specification

class TesteCriarCandidatoSpec extends Specification {

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
        Candidato candidato = new Candidato( nome, email, cpf, idade, estado, CEP, descricao, competencias)

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
}
