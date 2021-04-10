package entities;

public abstract class Produto {

	private String descricao;
	private String codigo;
	private double valorUnitario;
	private int qtdeEstoque;
	
	public Produto(String descricao, String codigo, double valorUnitario, int qtdeEstoque) {
		super();
		this.descricao = descricao;
		this.codigo = codigo;
		this.valorUnitario = valorUnitario;
		this.qtdeEstoque = qtdeEstoque;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getQtdeEstoque() {
		return qtdeEstoque;
	}
	
	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}
	
	//metodos
	public void IncluirEstoque(int valorSerIncluido) {
		this.qtdeEstoque = qtdeEstoque + valorSerIncluido;
	}
	public void tirarEstoque(int valorComprado) {
		if(this.qtdeEstoque >= valorComprado) {
			this.qtdeEstoque = qtdeEstoque - valorComprado;
		}
		
		else {
			System.out.println("No momento não possuimos estoque para este produto.");
		}

		
	
}
}
