package entities;

public class Sunga extends Produto {

	private double valorSunga = 25.00;

	public Sunga(String descricao, String codigo, String marca, String tamanho, int qtdeEstoque, double valorSunga) {
		super(descricao, codigo, marca, tamanho, qtdeEstoque);
		this.valorSunga = valorSunga;
	}

	public double getValorSunga() {
		return valorSunga;
	}

	public void setValorSunga(double valorSunga) {
		this.valorSunga = valorSunga;
	}

	
}
