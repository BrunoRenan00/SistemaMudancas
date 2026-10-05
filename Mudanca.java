public class Mudanca {

    private Cliente cliente;
    private String origem;
    private String destino;
    private double distancia;
    private int quantidadeItens;
    private Veiculo veiculo;
    private double valor;
    private String status;

    public Mudanca(
            Cliente cliente,
            String origem,
            String destino,
            double distancia,
            int quantidadeItens,
            Veiculo veiculo) {

        this.cliente = cliente;
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
        this.quantidadeItens = quantidadeItens;
        this.veiculo = veiculo;
        this.status = "Agendado";
    }

    public void calcularValor() {

        valor = veiculo.calcularValor(distancia);

        if (quantidadeItens > 30) {
            valor += 100;
        }

        if (distancia > 200) {
            valor += 150;
        }
    }

    public void iniciarTransporte() {
        status = "Em transporte";
    }

    public void concluirTransporte() {
        status = "Concluído";
    }

    public void exibirDados() {

        System.out.println("\n===== DADOS DA MUDANÇA =====");

        cliente.exibirDados();

        System.out.println("Origem: " + origem);
        System.out.println("Destino: " + destino);
        System.out.println("Distância: " + distancia + " km");
        System.out.println("Quantidade de itens: " + quantidadeItens);
        System.out.println("Veículo: " + veiculo.getModelo());
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.printf("Valor: R$ %.2f%n", valor);
        System.out.println("Status: " + status);
    }

    public String getStatus() {
        return status;
    }

    public double getValor() {
        return valor;
    }
}