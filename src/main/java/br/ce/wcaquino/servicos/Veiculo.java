package br.ce.wcaquino.servicos;

import java.util.Scanner;

import br.ce.wcaquino.entidades.VeiculoObjeto;
import br.ce.wcaquino.utils.Metodos;

public class Veiculo {

	public static void main(String[] args) {
	}
	/*
		 * 
		 * 
		 * Scanner leitor = new Scanner(System.in);

		int op = 7, qtdgas = 0;

		VeiculoObjeto v = new VeiculoObjeto();
		v.setMarca("Honda");
		v.setModelo("NSX");
		v.setPlaca("ABC-1234");
		v.setCor("Vermelho");
		v.setKm((float) 0.0000);
		v.setisLigado(false);
		v.setLitrosCombustivel(90);
		v.setVelocidade(0);
		v.setPreco(0.0);

		Metodos.estadoAtual(v);

		do {
			System.out.println(
					"Oque deseja fazer?\n----------------------------\n\nDigite 1 para ligar.\nDigite 2 para acelerar\nDigite 3 para pintar\nDigite 4 para abastecer\nDigite 5 para desligar\nDigite 6 para frear\nDigite 7 para sair\n");
			op = leitor.nextInt();
			switch (op) {
			case 1:
				Metodos.Ligar(v);
				Metodos.estadoAtual(v);
				break;
			case 2:
				Metodos.Acelerar(v.getVelocidade(), v);
				Metodos.estadoAtual(v);
				break;
			case 3:
				System.out.println("Digite a cor desejada: ");
				String cor = leitor.next();
				Metodos.Pintar(cor, v);
				Metodos.estadoAtual(v);
				break;
			case 4:
				System.out.println(
						"Quanto deseja abastecer: \nDigite 1 para abastecer 20 litros\nDigite 2 para abastecer 3 litros\nDigite 4 para abastecer 50 litros\nDigite 5 para abastecer 100 litros\n");
				qtdgas = leitor.nextInt();
				switch (qtdgas) {
				case 1:
					Metodos.Abastecer(20, v);
					Metodos.estadoAtual(v);
					break;
				case 2:
					Metodos.Abastecer(30, v);
					Metodos.estadoAtual(v);
					break;
				case 3:
					Metodos.Abastecer(40, v);
					Metodos.estadoAtual(v);
					break;
				case 4:
					Metodos.Abastecer(50, v);
					Metodos.estadoAtual(v);
					break;
				case 5:
					Metodos.Abastecer(100, v);
					Metodos.estadoAtual(v);
					break;
				}
			case 5:
				Metodos.Desligar(v);
				Metodos.estadoAtual(v);
				break;
			case 6:
				Metodos.Frear(v);
				Metodos.estadoAtual(v);
				break;
			case 7:
				op = 0;
			}

		} while (op != 0);
		leitor.close();


	 * public static void main(String[] args) {
	 * 
	 * VeiculoObjeto veiculo = new VeiculoObjeto(null,null,null, null, null, null,
	 * null, null, null);
	 * 
	 * //Scanner dados = new Scanner(System.in);
	 * //System.out.println("Digite uma marca: ");
	 * 
	 * //String marca = dados.toString();
	 * 
	 * 
	 * veiculo.setMarca("Honda"); veiculo.setModelo("NSX");
	 * veiculo.setPlaca("ABC-1234"); veiculo.setCor("Vermelho");
	 * veiculo.setKm((float) 0.0000); veiculo.setisLigado(false);
	 * veiculo.setLitrosCombustivel(0); veiculo.setVelocidade(15);
	 * veiculo.setPreco(0.0);
	 * 
	 * //Printa(veiculo);
	 * 
	 * veiculo.setVelocidade(Freia(veiculo.getVelocidade()));
	 * 
	 * if (veiculo.getIsLigado() == true ) {
	 * 
	 * 
	 * }
	 * 
	 * //Printa(veiculo);
	 * 
	 * 
	 * }
	 * 
	 * public static void Printa(VeiculoObjeto v) {
	 * 
	 * 
	 * System.out.println("O carro � da marca " + v.getMarca());
	 * System.out.println("O modelo do carro � " + v.getModelo());
	 * System.out.println("A placa � " + v.getPlaca());
	 * System.out.println("A cor � " + v.getCor());
	 * System.out.println("Quilometros rodados: " + v.getKm());
	 * System.out.println("Est� " + v.getIsLigado()); System.out.println("Com " +
	 * v.getLitrosCombustivel() + " litros de combustivel.");
	 * System.out.println("Com a velocidade de " +v.getVelocidade() + "por hora.");
	 * System.out.println("O pre�o do carro � de " +v.getPreco());
	 * 
	 * 
	 * 
	 * }
	 * 
	 * public static int Freia(int Vel) {
	 * 
	 * if (Vel > 0 ) { Vel -= 10; return Vel; } return 0; }
	 */

}
