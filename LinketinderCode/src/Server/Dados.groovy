package Server

import Users.Candidato
import Users.Empresa
import groovy.transform.Canonical

@Canonical
class Dados {
    // Listas estáticas para armazenar os candidatos e empresas globalmente
    static List<Candidato> listaCandidatos = []
    static List<Empresa> listaEmpresas = []

    // Método para adicionar um candidato
    static void adicionarCandidato(Candidato candidato) {
        listaCandidatos << candidato
    }

    // Método para listar candidatos
    static void listarCandidatos() {
        println "Lista de Candidatos:"
        listaCandidatos.each { println it }
    }

    static void adicionarEmpresa (Empresa empresa){
        listaEmpresas << empresa
    }

    // Método para listar Empresas
    static void listarEmpresas() {
        println "Lista de Empresas:"
        listaEmpresas.each { println it }
    }
}
