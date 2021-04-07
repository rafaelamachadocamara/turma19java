package Aplica��es;

import java.util.Locale;
import java.util.Scanner;

import Classes.Conta;

public class TesteConta {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		Conta contaJoao = new Conta();
		
		System.out.println("Digite o numero da conta: ");
		contaJoao.numero = leia.nextInt();
		System.out.println("Digite o cpf da conta");
		contaJoao.cpf = leia.next();
		System.out.println("Digite o valor");
		double valor = leia.nextDouble();
		System.out.println("Opera��o de cr�dito ou d�bito? 1 - Cr�dito 2 - D�bito");
		char opcao = leia.next().charAt(0);
		if(opcao == '1') {
			contaJoao.credito(valor);
		}
		else if(opcao == '2') {
			contaJoao.debito(valor);
		}
		
		System.out.printf("CPF: %s \n",contaJoao.cpf);
		System.out.printf("Numero conta %d: \n",contaJoao.numero);
		System.out.printf("Saldo : %.2f \n",contaJoao.saldo);
	}

}
