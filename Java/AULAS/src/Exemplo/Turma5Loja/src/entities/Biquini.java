package entities;

public class Biquini extends Produto {

	private double valorBiquini = 99.90;

	public Biquini(String descricao, String codigo, String marca, String tamanho, int qtdeEstoque, double valorBiquini) {
		super(descricao, codigo, marca, tamanho, qtdeEstoque);
		this.valorBiquini = valorBiquini;
	}

	public double getValorBiquini() {
		return valorBiquini;
	}

	public void setValorBiquini(double valorBiquini) {
		this.valorBiquini = valorBiquini;
	}

	
}
