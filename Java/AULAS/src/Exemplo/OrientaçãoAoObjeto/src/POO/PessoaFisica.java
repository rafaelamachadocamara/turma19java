package POO;

public class PessoaFisica extends Pessoa1 {
	private String cpf;

	public PessoaFisica() {
		
	}
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return "Pessoa Física: "+super.getNome()+" CPF: "+this.getCpf();
	}
}
