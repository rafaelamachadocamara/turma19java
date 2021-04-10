package entities;

public class Tenis extends Produto {

	private double valorTenis = 200.00;

	public Tenis(String descricao, String codigo, String marca, String tamanho, int qtdeEstoque, double valorTenis) {
		super(descricao, codigo, marca, tamanho, qtdeEstoque);
		this.valorTenis = valorTenis;
	}

	public double getValorTenis() {
		return valorTenis;
	}

	public void setValorTenis(double valorTenis) {
		this.valorTenis = valorTenis;
	}

	
}
