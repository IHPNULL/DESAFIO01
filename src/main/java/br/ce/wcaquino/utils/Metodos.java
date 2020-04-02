package br.ce.wcaquino.utils;

import br.ce.wcaquino.entidades.VeiculoObjeto;

public class Metodos {

	public static void estadoAtual(VeiculoObjeto e) {
		System.out.println("---------------------------");
		System.out.println("Marca: " + e.getMarca());
		System.out.println("Modelo: " + e.getModelo());
		System.out.println("Placa: " + e.getPlaca());
		System.out.println("Cor: " + e.getCor(null));
		System.out.println("Kilometragem: " + e.getKm());
		System.out.println("Est� ligado: " + e.getIsLigado());
		System.out.println("Combustivel: " + e.getLitrosCombustivel());
		System.out.println("Velocidade: " + e.getVelocidade());
		System.out.println("Pre�o: " + e.getPreco());
	}

	public static void Acelerar(int v, VeiculoObjeto e) {
		if (e.getIsLigado() == true && e.getLitrosCombustivel() > 0) {
			e.setVelocidade(e.getVelocidade() + v + 20);
			e.setLitrosCombustivel(e.getLitrosCombustivel() - 1);
			System.out.println("O carro est� agora a " + e.getVelocidade() + ", com " + e.getLitrosCombustivel()
					+ " Litros de gasolina.");
		} else if (e.getIsLigado() == false) {
			System.out.println("O carro est� desligado, n�o � possivel acelerar.");
		} else {
			System.out.println("Nao � possivel acelerar sem combustivel");
		}
	}

	public static void Abastecer(int gasosa, VeiculoObjeto e) {
		if (100 < (e.getLitrosCombustivel() + gasosa)) {
			System.out.println("N�o � possivel abastecer esta quantidade, apenas � possivel abastecer "
					+ (100 - e.getLitrosCombustivel()) + " litros.");
			e.setLitrosCombustivel(100);
		} else {
			e.setLitrosCombustivel(e.getLitrosCombustivel() + gasosa);
			System.out.println("Carro abastecido com sucesso.");
		}
	}

	public static void Frear(VeiculoObjeto e) {
		if (e.getIsLigado() == true && e.getVelocidade() > 0) {
			if (e.getVelocidade() < 10)
				e.setVelocidade(0);
			else
				e.setVelocidade(e.getVelocidade() - 10);

			System.out.println("A velocidade do carro foi para " + e.getVelocidade());
		} else if (e.getIsLigado() == false) {
			System.out.println("O carro est� desligado, n�o � possivel freiar.");
		} else {
			System.out.println("A velocidade ja esta em 0.");
		}
	}

	public static void Pintar(String cor, VeiculoObjeto e) {
		e.setCor(cor);
		System.out.println("A cor agora do carro � " + e.getCor(cor));
	}

	public static void Ligar(VeiculoObjeto e) {
		if (e.getIsLigado() == false) {
			e.setisLigado(true);
			System.out.println("Agora o carro est� ligado.");
		} else {
			System.out.println("O carro ja esta ligado.");
		}
	}

	public static void Desligar(VeiculoObjeto e) {
		if (e.getIsLigado() == true && e.getVelocidade() == 0) {
			e.setisLigado(false);
			System.out.println("Agora o carro est� desligado.");
		} else if (e.getIsLigado() == false) {
			System.out.println("O carro j� est� desligado.");
		} else {
			System.out.println("Nao pode desligar em movimento");
		}
	}
}