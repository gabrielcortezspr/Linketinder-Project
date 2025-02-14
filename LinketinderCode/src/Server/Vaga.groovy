package Server

import Users.Empresa

class Vaga {

    String titulo
    Empresa empresaCriadora

    Vaga (String titulo, Empresa empresaCriadora){
        this.titulo = titulo
        this.empresaCriadora = empresaCriadora

    }

    @Override
    String toString (){
        "$titulo, Vaga na empresa $empresaCriadora.nome"
    }
}
