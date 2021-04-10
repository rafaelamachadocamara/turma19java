package entities;

public class Calca extends Produto {

	private double valorCalca = 109.99;

	public Calca(String descricao, String codigo, String marca, String tamanho, int qtdeEstoque, double valorCalca) {
		super(descricao, codigo, marca, tamanho, qtdeEstoque);
		this.valorCalca = valorCalca;
	}

	public double getValorCalca() {
		return valorCalca;
	}

	public void setValorCalca(double valorCalca) {
		this.valorCalca = valorCalca;
	}

	
}
