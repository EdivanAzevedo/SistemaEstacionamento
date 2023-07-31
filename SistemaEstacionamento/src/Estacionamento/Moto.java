package Estacionamento;

public class Moto extends Veiculo {

	public Moto(String placa, String fabricante, String modelo) {
		super(placa, fabricante, modelo);
	}

	public double calcularValor(double tempo) {
		return 2.00 * tempo;
	}

}
