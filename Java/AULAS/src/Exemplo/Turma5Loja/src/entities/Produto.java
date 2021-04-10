package entities;

public abstract class Produto {
	
	private String descricao;
	private String codigo;
	private String marca;
	private String tamanho;
	private int qtdeEstoque;
	
	public Produto(String descricao, String codigo, String marca, String tamanho, int qtdeEstoque) {
		super();
		this.descricao = descricao;
		this.codigo = codigo;
		this.marca = marca;
		this.tamanho = tamanho;
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
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public int getQtdeEstoque() {
		return qtdeEstoque;
	}
	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}
	
	
	
	
	
	
	
	

}
