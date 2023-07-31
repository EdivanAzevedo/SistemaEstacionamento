package Estacionamento;

public class Pickups extends Veiculo {

	public Pickups(String placa, String fabricante, String modelo) {
		super(placa, fabricante, modelo);
	}

	@Override
	public double calcularValor(double tempo) {
		return 6.00 * tempo;
	}

}
