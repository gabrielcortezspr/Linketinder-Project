package Server

import Users.Candidato
import Users.Empresa
import groovy.transform.Canonical

@Canonical
class Dados {
    // Listas estáticas para armazenar os candidatos e empresas globalmente
    static List<Candidato> listaCandidatos = []
    static List<Empresa> listaEmpresas = []

    // Métodos para Lista Candidatos e Empresa
    static void listarCandidatos() {
        println "Lista de Candidatos:"
        listaCandidatos.each { println it }
    }
    static void listarEmpresas() {
        println ("Lista de Empresas: "+ listaEmpresas.size())
        listaEmpresas.each { println it }
    }
}
