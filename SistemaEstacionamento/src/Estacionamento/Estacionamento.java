package Estacionamento;

import java.util.ArrayList;

public class Estacionamento {

	private int capacidadeM;
	private int capacidadeC;
	private int capacidadeP;

	public int getCapacidadeM() {
		return capacidadeM;
	}

	public void setCapacidadeM(int capacidadeM) {
		this.capacidadeM = capacidadeM;
	}

	public int getCapacidadeC() {
		return capacidadeC;
	}

	public void setCapacidadeC(int capacidadeC) {
		this.capacidadeC = capacidadeC;
	}

	public int getCapacidadeP() {
		return capacidadeP;
	}

	public void setCapacidadeP(int capacidadeP) {
		this.capacidadeP = capacidadeP;
	}

	ArrayList<Carro> carros = new ArrayList<Carro>();
	ArrayList<Moto> motos = new ArrayList<Moto>();
	ArrayList<Pickups> pickups = new ArrayList<Pickups>();

	public boolean estacionar(Veiculo v) {
		if (v instanceof Carro) {
			if (carros.size() < capacidadeC) {
				carros.add((Carro) v);
				return true;
			} else if (v instanceof Moto) {
				if (motos.size() < capacidadeM) {
					motos.add((Moto) v);
					return true;
				}
			} else if (v instanceof Pickups) {
				if (pickups.size() < capacidadeP) {
					pickups.add((Pickups) v);
					return true;
				}
			}
		}
		return false;
	}

	public double retirar(String placa, double tempo) {
		for (Carro c : carros) {
			if (c.getPlaca().equals(placa)) {
				carros.remove(c);
				return c.calcularValor(tempo);
			}
		}
		for (Moto m : motos) {
			if (m.getPlaca().equals(placa)) {
				motos.remove(m);
				return m.calcularValor(tempo);
			}
		}
		for (Pickups p : pickups) {
			if (p.getPlaca().equals(placa)) {
				pickups.remove(p);
				return p.calcularValor(tempo);
			}
		}
		return 0;
	}

	public void listarVeiculos() {
		for (Carro c : carros) {
			System.out.println("Placa: " + c.getPlaca() + ", Modelo: " + c.getModelo() + ", Fabricante: "
					+ c.getFabricante() + "\n");
		}
		for (Moto m : motos) {
			System.out.println("Placa: " + m.getPlaca() + ", Modelo: " + m.getModelo() + ", Fabricante: "
					+ m.getFabricante() + "\n");
		}
		for (Pickups p : pickups) {
			System.out.println("Placa: " + p.getPlaca() + ", Modelo: " + p.getModelo() + ", Fabricante: "
					+ p.getFabricante() + "\n");
		}
	}

	public void listarVagas() {
		int vagasC = capacidadeC - carros.size();
		int vagasM = capacidadeM - motos.size();
		int vagasP = capacidadeP - pickups.size();

		System.out.println("Vagas para carros: " + vagasC);
		System.out.println("Vagas para motos: " + vagasM);
		System.out.println("Vagas para pickups: " + vagasP);
	}
}
