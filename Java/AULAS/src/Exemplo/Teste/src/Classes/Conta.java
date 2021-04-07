package Classes;

public class Conta {
	
	// atributos
	
	public int numero;
	public String cpf;
	public double saldo;
	public boolean ativa;
	
	public Conta() {
		
	}
	
	public Conta(int numero,String cpf) {
		this.numero = numero;
		this.cpf = cpf;
	}
	
	public Conta(int numero,String cpf,boolean ativa) {
		this.numero = numero;
		this.cpf = cpf;
		this.ativa = ativa;
	}
	
	// encapsulamento
	
	public String getCpf() {
		return this.cpf;
	}
	//metodo
	public void debito(double valor) {
		saldo = saldo - valor;
	}
	
	public void credito(double valor) {
		saldo = saldo + valor;
	}

}
