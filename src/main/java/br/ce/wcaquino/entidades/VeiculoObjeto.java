package br.ce.wcaquino.entidades;

public class VeiculoObjeto {

	private String Marca;
	private String Modelo;
	private String Placa;
	private String Cor;
	private Float Km;
	private Boolean isLigado;
	private int litrosCombustivel;
	private int Velocidade;
	private Double Preco;

	// Metodos especiais

	public VeiculoObjeto(String Marca, String Modelo, String Placa, String Cor, Float Km, Boolean isLigado,
			Integer litrosCombustivel, Integer Velocidade, double i) {

		this.setMarca(Marca);
		this.setModelo(Modelo);
		this.setPlaca(Placa);
		this.setCor(Cor);
		this.setKm(Km);
		this.setisLigado(isLigado);
		this.setLitrosCombustivel(litrosCombustivel);
		this.setVelocidade(Velocidade);
		this.setPreco(i);

	}

	public VeiculoObjeto() {
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String Marca) {
		this.Marca = Marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}

	public String getCor(String cor) {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public Float getKm() {
		return Km;
	}

	public void setKm(Float km) {
		Km = km;
	}

	public Boolean getIsLigado() {
		return isLigado;
	}

	public void setisLigado(Boolean isLigado) {
		this.isLigado = isLigado;
	}

	public Integer getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(Integer litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public Integer getVelocidade() {
		return Velocidade;
	}

	public void setVelocidade(Integer velocidade) {
		Velocidade = velocidade;
	}

	public Double getPreco() {
		return Preco;
	}

	public void setPreco(Double preco) {
		Preco = preco;
	}

}
