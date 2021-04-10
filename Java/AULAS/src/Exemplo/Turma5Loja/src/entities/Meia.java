package entities;

public class Meia extends Produto {

	private double valorMeia = 12.50;

	public Meia(String descricao, String codigo, String marca, String tamanho, int qtdeEstoque, double valorMeia) {
		super(descricao, codigo, marca, tamanho, qtdeEstoque);
		this.valorMeia = valorMeia;
	}

	public double getValorMeia() {
		return valorMeia;
	}

	public void setValorMeia(double valorMeia) {
		this.valorMeia = valorMeia;
	}

	
	
}
