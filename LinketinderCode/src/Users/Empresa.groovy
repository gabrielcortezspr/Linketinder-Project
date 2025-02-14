package Users
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
    List <String> CompetenciasEmpresa

    @Override
    String toString() {
        return """\
        Empresa: $nome
        Email Corporativo: $emailCorp
        CNPJ: $cnpj
        País: $paisOrigem
        Estado: $estado
        CEP: $CEP
        Descrição: $descricao
        Competências: ${competenciasEmpresa.join(', ')}
        """
    }
    public List <String> addComp (String Competencia) {
        //adcionar competencias
    }
    public List <String> removeComp (String Competencia) {
        //remover competencias ja adicionadas
    }
}

