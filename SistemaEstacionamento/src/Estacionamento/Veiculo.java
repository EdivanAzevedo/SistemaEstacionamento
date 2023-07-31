package Estacionamento;

abstract public class Veiculo {
	private String placa;
	private String fabricante;
	private String modelo;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Veiculo(String placa, String fabricante, String modelo) {
		this.setPlaca(placa);
		this.setFabricante(fabricante);
		this.setModelo(modelo);
	}

	public abstract double calcularValor(double tempo);
}
