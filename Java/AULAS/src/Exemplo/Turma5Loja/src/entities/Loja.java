package entities;

public class Loja extends Produto {

	private String nome;
	private String cnpj;
	
	public Loja(String descricao, String codigo, String marca, String tamanho, int qtdeEstoque, String nome,
			String cnpj) {
		super(descricao, codigo, marca, tamanho, qtdeEstoque);
		this.nome = nome;
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	
}
