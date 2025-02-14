package Server

import Users.Candidato
import Users.Empresa
import groovy.transform.Canonical

@Canonical
class Dados {
    // Listas estáticas para armazenar os candidatos e empresas globalmente
    static List<Candidato> listaCandidatos  = []
    static List<Empresa> listaEmpresas  = []
    static List<Vaga> listaVagas  = []

    // Métodos para Lista Candidatos e Empresa
    static void listarCandidatos() {
        println "Lista de Candidatos:"
        listaCandidatos.each { println it }
    }
    static void listarEmpresas() {
        println ("Lista de Empresas: "+ listaEmpresas.size())
        listaEmpresas.each { println it }
    }
    static void verificarMatches(Empresa empresa, Candidato candidato) {

        boolean candidatoCurtiu = candidato.vagasCurtidas.any { it.empresaCriadora == empresa }
        boolean empresaCurtiu = empresa.candidatosCurtidos.contains(candidato)

        if (candidatoCurtiu && empresaCurtiu) {
            println("🎉 MATCH! ${candidato.nome} e ${empresa.nome} agora podem se comunicar!")
        }
    }
}
