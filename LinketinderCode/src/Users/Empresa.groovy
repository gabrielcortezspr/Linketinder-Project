package Users
import Server.Dados
import groovy.transform.Canonical

@Canonical
class Empresa {
    String nome
    String emailCorp
    String cnpj
    String paisOrigem
    String estado
    String CEP
    String descricao
    List<String> competenciasEmpresa

    // Construtor que adiciona automaticamente a empresa à lista
    Empresa(String nome, String emailCorp, String cnpj, String paisOrigem, String estado, String CEP, String descricao, List<String> competenciasEmpresa) {
        this.nome = nome
        this.emailCorp = emailCorp
        this.cnpj = cnpj
        this.paisOrigem = paisOrigem
        this.estado = estado
        this.CEP = CEP
        this.descricao = descricao
        this.competenciasEmpresa = competenciasEmpresa

        // Adiciona a empresa à lista de empresas dentro de Dados
        Dados.listaEmpresas << this
    }

    @Override
    String toString() {
        return """\
        Empresa: $nome
        Email Corporativo: $emailCorp
        CNPJ: $cnpj
        País de Origem: $paisOrigem
        Estado: $estado
        CEP: $CEP
        Descrição: $descricao
        Competências: ${competenciasEmpresa.join(', ')}
        """
    }
}
