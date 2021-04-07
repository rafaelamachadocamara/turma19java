package Aplicações;

import Classes.Conta;

public class TesteProgramador {

	public static void main(String[] args) {
		
		Conta exemplo1 = new Conta(1,"111.111.111-11");
		Conta exemplo2 = new Conta(100,"xxxxxxxxxxxx");
		
		exemplo1.credito(1000.55);
		exemplo1.debito(900);
		
		System.out.printf("CPF: %s \n",exemplo1.cpf);
		System.out.printf("Numero conta %d: \n",exemplo1.numero);
		System.out.printf("Saldo : %.2f \n",exemplo1.saldo);
	
	}
}
