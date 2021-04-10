package entities;

public class Camisa extends Produto {

	private double valorCamisa = 39.99;

	public Camisa(String descricao, String codigo, String marca, String tamanho, int qtdeEstoque, double valorCamisa) {
		super(descricao, codigo, marca, tamanho, qtdeEstoque);
		this.valorCamisa = valorCamisa;
	}

	public double getValorCamisa() {
		return valorCamisa;
	}

	public void setValorCamisa(double valorCamisa) {
		this.valorCamisa = valorCamisa;
	}

	
}
