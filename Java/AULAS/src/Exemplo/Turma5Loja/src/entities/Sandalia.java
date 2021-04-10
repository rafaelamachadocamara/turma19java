package entities;

public class Sandalia extends Produto {

	private double valorSandalia = 45.90;

	public Sandalia(String descricao, String codigo, String marca, String tamanho, int qtdeEstoque,
			double valorSandalia) {
		super(descricao, codigo, marca, tamanho, qtdeEstoque);
		this.valorSandalia = valorSandalia;
	}

	public double getValorSandalia() {
		return valorSandalia;
	}

	public void setValorSandalia(double valorSandalia) {
		this.valorSandalia = valorSandalia;
	}

}
