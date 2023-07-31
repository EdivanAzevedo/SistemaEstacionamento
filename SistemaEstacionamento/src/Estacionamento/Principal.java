package Estacionamento;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Estacionamento es = new Estacionamento();

		Scanner scanner = new Scanner(System.in);
		int op = 0;
		int cap;

		System.out.println("Informe a capacidade de carros do estacionamento: ");
		cap = scanner.nextInt();
		es.setCapacidadeC(cap);
		System.out.println("Informe a capacidade de motos do estacionamento: ");
		cap = scanner.nextInt();
		es.setCapacidadeM(cap);
		System.out.println("Informe a capacidade de pickups do estacionamento: ");
		cap = scanner.nextInt();
		es.setCapacidadeP(cap);

		do {
			System.out.println("****************************************************************");
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println("1 - Estacionar um veículo");
			System.out.println("2 - Retirar um veículo");
			System.out.println("3 - Exibir veículos estacionados");
			System.out.println("4 - Exibir vagas disponíveis");
			System.out.println("5 - Sair");
			System.out.println("****************************************************************");

			op = scanner.nextInt();

			switch (op) {
			case 1:
				int op1 = 0;
				System.out.println("****************************************************************");
				System.out.println("Qual o tipo do veiculo?");
				System.out.println("1 - Carro");
				System.out.println("2 - Moto");
				System.out.println("3 - Pickup");
				System.out.println("****************************************************************");
				op1 = scanner.nextInt();

				switch (op1) {
				case 1:
					String placaC;
					String fabricanteC;
					String modeloC;
					System.out.println("Informe a placa do carro:");
					placaC = scanner.next();
					System.out.println("Informe o fabricante do carro:");
					fabricanteC = scanner.next();
					System.out.println("Informe o modelo do carro:");
					modeloC = scanner.next();
					try {
						Carro c = new Carro(placaC, fabricanteC, modeloC);
						if (es.estacionar(c)) {
							System.out.println("Sucesso ao estacionar.");
						} else {
							System.out.println("Falha ao estacionar.");
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 2:
					String placaM;
					String fabricanteM;
					String modeloM;
					System.out.println("Informe a placa da moto: ");
					placaM = scanner.next();
					System.out.println("Informe o fabricante da moto: ");
					fabricanteM = scanner.next();
					System.out.println("Informe o modelo da moto:");
					modeloM = scanner.next();
					try {
						Moto m = new Moto(placaM, fabricanteM, modeloM);
						if (es.estacionar(m)) {
							System.out.println("Sucesso ao estacionar.");
						} else {
							System.out.println("Falha ao estacionar.");
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 3:
					String placaP;
					String fabricanteP;
					String modeloP;
					System.out.println("Informe a placa da moto: ");
					placaP = scanner.next();
					System.out.println("Informe o fabricante da moto: ");
					fabricanteP = scanner.next();
					System.out.println("Informe o modelo da moto:");
					modeloP = scanner.next();
					try {
						Pickups p = new Pickups(placaP, fabricanteP, modeloP);
						if (es.estacionar(p)) {
							System.out.println("Sucesso ao estacionar.");
						} else {
							System.out.println("Falha ao estacionar.");
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				default:
					throw new IllegalArgumentException("Unexpected value: " + op);
				}
				break;
			case 2:
				String placaR;
				double tempo;
				System.out.println("Informe a placa do veículo:");
				placaR = scanner.next();
				System.out.println("Informe a quantas horas o veículo ficou: ");
				tempo = Double.valueOf(scanner.next());
				try {
					double valor = es.retirar(placaR, tempo);
					System.out.println("Sucesso na retirada, valor total:" + valor);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 3:
				es.listarVeiculos();
				break;
			case 4:
				es.listarVagas();
				break;
			case 5:
				System.out.println("Saindo...");
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + op);
			}

		} while (op != 5);

	}

}
