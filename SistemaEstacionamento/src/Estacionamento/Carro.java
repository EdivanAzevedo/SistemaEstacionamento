package Estacionamento;

public class Carro extends Veiculo {

	public Carro(String placa, String fabricante, String modelo) {
		super(placa, fabricante, modelo);
	}

	@Override
	public double calcularValor(double tempo) {
		return 4.00 * tempo;
	}

}
