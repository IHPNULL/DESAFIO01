package br.ce.wcaquino.utils;

import static java.lang.System.out;

import br.ce.wcaquino.entidades.VeiculoObjeto;

public class Metodos {

	public static void estadoAtual(VeiculoObjeto e) {
		out.println("---------------------------");
		out.println("Marca: " + e.getMarca());
		out.println("Modelo: " + e.getModelo());
		out.println("Placa: " + e.getPlaca());
		out.println("Cor: " + e.getCor());
		out.println("Kilometragem: " + e.getKm());
		out.println("Está ligado: " + e.getIsLigado());
		out.println("Combustivel: " + e.getLitrosCombustivel());
		out.println("Velocidade: " + e.getVelocidade());
		out.println("Preço: " + e.getPreco());
	}

	public static void Acelerar(int v, VeiculoObjeto e) {
		if (e.getIsLigado() == true && e.getLitrosCombustivel() > 0) {
			e.setVelocidade(e.getVelocidade() + v + 20);
			e.setLitrosCombustivel(e.getLitrosCombustivel() - 1);
			out.println("O carro está agora a " + e.getVelocidade() + ", com " + e.getLitrosCombustivel()
					+ " Litros de gasolina.");
		} else if (e.getIsLigado() == false) {
			out.println("O carro está desligado, não é possivel acelerar.");
		} else {
			out.println("Nao é possivel acelerar sem combustivel");
		}
	}

	public static void Abastecer(int gasosa, VeiculoObjeto e) {
		if (100 < (e.getLitrosCombustivel() + gasosa)) {
			out.println("Não é possivel abastecer esta quantidade, apenas é possivel abastecer "
					+ (100 - e.getLitrosCombustivel()) + " litros.");
			e.setLitrosCombustivel(100);
		} else {
			e.setLitrosCombustivel(e.getLitrosCombustivel() + gasosa);
			out.println("Carro abastecido com sucesso.");
		}
	}

	public static void Frear(VeiculoObjeto e) {
		if (e.getIsLigado() == true && e.getVelocidade() > 0) {
			if (e.getVelocidade() < 10)
				e.setVelocidade(0);
			else
				e.setVelocidade(e.getVelocidade() - 10);

			out.println("A velocidade do carro foi para " + e.getVelocidade());
		} else if (e.getIsLigado() == false) {
			out.println("O carro está desligado, não é possivel freiar.");
		} else {
			out.println("A velocidade ja esta em 0.");
		}
	}

	public static void Pintar(String cor, VeiculoObjeto e) {
		e.setCor(cor);
		out.println("A cor agora do carro é " + e.getCor());
	}

	public static void Ligar(VeiculoObjeto e) {
		if (e.getIsLigado() == false) {
			e.setisLigado(true);
			out.println("Agora o carro está ligado.");
		} else {
			out.println("O carro ja esta ligado.");
		}
	}

	public static void Desligar(VeiculoObjeto e) {
		if (e.getIsLigado() == true && e.getVelocidade() == 0) {
			e.setisLigado(false);
			out.println("Agora o carro está desligado.");
		} else if (e.getIsLigado() == false) {
			out.println("O carro já está desligado.");
		} else {
			out.println("Nao pode desligar em movimento");
		}
	}
}