package Application;

import java.util.Locale;
import java.util.Scanner;

import Classes.Cliente;

public class Exercicio1Dia7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in); 
		
		Cliente cliente1 = new Cliente(); 
		Cliente cliente2 = new Cliente(); 

		//cliente1
		System.out.println("Digite o seu nome: ");
		cliente1.nome = leia.next();
		System.out.println("Digite o seu cpf: ");
		cliente1.cpf = leia.nextInt();
		System.out.println("Digite o ano do seu nascimento: ");
		cliente1.anoNascimento = leia.nextInt();
		
		//cliente 2
		System.out.println("Digite o seu nome: ");
		cliente2.nome = leia.next();
		System.out.println("Digite o seu cpf: ");
		cliente2.cpf = leia.nextInt();
		System.out.println("Digite o ano do seu nascimento: ");
		cliente2.anoNascimento = leia.nextInt();
		
		System.out.printf("O cliente se chama %s, tem o cpf %d e %d anos\n", cliente1.nome,cliente1.cpf,cliente1.calcularIdade());
		System.out.printf("O cliente se chama %s, tem o cpf %d e %d anos", cliente2.nome,cliente2.cpf,cliente2.calcularIdade());
		
		

		

	}

}
