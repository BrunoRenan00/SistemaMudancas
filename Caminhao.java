public class Caminhao extends Veiculo {

    public Caminhao(String placa, String modelo) {
        super(placa, modelo);
    }

    @Override
    public double calcularValor(double distancia) {

        double valorPorKm = 5.00;

        return distancia * valorPorKm;
    }
}