package POO;

public class PessoaJuridica extends Pessoa1 {
	private String cnpj;

	public PessoaJuridica() {
		
	}
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getNome() {
		return "Pessoa Juridica: "+super.getNome()+" CNPJ: "+this.getCnpj();
	}
}
