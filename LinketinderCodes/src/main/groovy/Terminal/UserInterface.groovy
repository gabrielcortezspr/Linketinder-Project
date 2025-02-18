package Terminal
import Server.Dados;

public class UserInterface {

    public static void exibirMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            println("\nEscolha uma opção:");
            println("1 - Listar todas as empresas");
            println("2 - Listar todos os candidatos");
            println("0 - Sair");
            print("Opção: ");

            String escolha = scanner.nextLine();

            switch (escolha) {
                case "1":
                    println("\n--- Lista de Empresas ---");
                    if (Dados.listaEmpresas.isEmpty()) {
                        println("Nenhuma empresa cadastrada.");
                    } else {
                        Dados.listarEmpresas();
                    }
                    break;

                case "2":
                    println("\n--- Lista de Candidatos ---");
                    if (Dados.listaCandidatos.isEmpty()) {
                        println("Nenhum candidato cadastrado.");
                    } else {
                        Dados.listarCandidatos();
                    }
                    break;

                case "0":
                    println("Saindo...");
                    scanner.close();  // Fecha o Scanner antes de sair
                    return;

                default:
                    println("Opção inválida. Tente novamente.");
            }
        }
    }
}

