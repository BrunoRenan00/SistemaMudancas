public class Van extends Veiculo {

    public Van(String placa, String modelo) {
        super(placa, modelo);
    }

    @Override
    public double calcularValor(double distancia) {

        double valorPorKm = 3.50;

        return distancia * valorPorKm;
    }
}