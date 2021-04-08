package classes;

public class Animal{
	 
	String nome;
	 int idade;
	protected String emitirSom;
	protected String correr;
	 
	 public Animal(String nome, int idade, String correr, String emitirSom) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.correr = correr;
		this.emitirSom = emitirSom;

	
		
}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmitirSom() {
		return emitirSom;
	}

	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
}
