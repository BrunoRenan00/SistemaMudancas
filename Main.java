import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("\n==============================");
            System.out.println(" SISTEMA DE TRANSPORTE");
            System.out.println("       DE MUDANÇAS");
            System.out.println("==============================");

            System.out.println("1 - Cadastrar mudança");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {

                System.out.println("\n===== CADASTRO DA MUDANÇA =====");

                System.out.print("Nome do cliente: ");
                String nome = scanner.nextLine();

                System.out.print("Telefone: ");
                String telefone = scanner.nextLine();

                System.out.print("Endereço de origem: ");
                String origem = scanner.nextLine();

                System.out.print("Endereço de destino: ");
                String destino = scanner.nextLine();

                System.out.print("Distância em km: ");
                double distancia = scanner.nextDouble();

                System.out.print("Quantidade de itens: ");
                int quantidadeItens = scanner.nextInt();

                System.out.println("\nEscolha o veículo:");
                System.out.println("1 - Van");
                System.out.println("2 - Caminhão");
                System.out.print("Opção: ");

                int opcaoVeiculo = scanner.nextInt();

                Veiculo veiculo;

                if (opcaoVeiculo == 1) {

                    veiculo = new Van(
                            "VAN-1234",
                            "Van de Mudanças"
                    );

                } else {

                    veiculo = new Caminhao(
                            "CAM-5678",
                            "Caminhão de Mudanças"
                    );
                }

                Cliente cliente = new Cliente(
                        nome,
                        telefone
                );

                Mudanca mudanca = new Mudanca(
                        cliente,
                        origem,
                        destino,
                        distancia,
                        quantidadeItens,
                        veiculo
                );

                mudanca.calcularValor();

                System.out.println("\nMudança cadastrada com sucesso!");

                mudanca.exibirDados();

                System.out.println("\nDeseja iniciar o transporte?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                System.out.print("Opção: ");

                int iniciar = scanner.nextInt();

                if (iniciar == 1) {

                    mudanca.iniciarTransporte();

                    System.out.println("\nTransporte iniciado!");

                    mudanca.exibirDados();
                }

                System.out.println("\nDeseja finalizar o transporte?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                System.out.print("Opção: ");

                int finalizar = scanner.nextInt();

                if (finalizar == 1) {

                    mudanca.concluirTransporte();

                    System.out.println("\nTransporte concluído!");

                    mudanca.exibirDados();
                }

            } else if (opcao == 2) {

                System.out.println("\nSistema encerrado.");

            } else {

                System.out.println("\nOpção inválida!");
            }

        } while (opcao != 2);

        scanner.close();
    }
}