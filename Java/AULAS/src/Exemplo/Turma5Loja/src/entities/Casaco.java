package entities;

public class Casaco extends Produto {

	private double valorCasaco = 149.99;

	public Casaco(String descricao, String codigo, String marca, String tamanho, int qtdeEstoque, double valorCasaco) {
		super(descricao, codigo, marca, tamanho, qtdeEstoque);
		this.valorCasaco = valorCasaco;
	}

	public double getValorCasaco() {
		return valorCasaco;
	}

	public void setValorCasaco(double valorCasaco) {
		this.valorCasaco = valorCasaco;
	}

	
}
