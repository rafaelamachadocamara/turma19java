package entities;

public class Chinelo extends Produto {

	private double valorChinelo = 45.00;

	public Chinelo(String descricao, String codigo, String marca, String tamanho, int qtdeEstoque, double valorChinelo) {
		super(descricao, codigo, marca, tamanho, qtdeEstoque);
		this.valorChinelo = valorChinelo;
	}

	public double getValorChinelo() {
		return valorChinelo;
	}

	public void setValorChinelo(double valorChinelo) {
		this.valorChinelo = valorChinelo;
	}

	
}
