package Aplicações;

import java.util.Scanner;

import Classes.Pessoa;

public class CadFunc {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); // instaciar um teclado
		
		Pessoa func1 = new Pessoa(); // instanciar uma pessoa
		Pessoa func2 = new Pessoa();
		
		
		
		System.out.println("Digite o nome do funcionario 1: ");
		func1.nome = leia.next();
		System.out.println("Digite o nome do funcionario 2: ");
		func2.nome = leia.next();
		System.out.println("Digite o ano de nascimento do funcionario 1: ");
		func1.anoNascimento = leia.nextInt();
		System.out.println("Digite o ano de nascimento do funcionario 2: ");
		func2.anoNascimento = leia.nextInt();
		System.out.println("Func 1, você é 1 feminino, 2 masculino ou 3 - outre?: ");
		func1.genero = leia.next().charAt(0);
		System.out.println("Func 2, você é 1 feminino, 2 masculino ou 3 - outre?: ");
		func2.genero = leia.next().charAt(0);
		
		System.out.printf("Idade pessoa 1 - %d: \n",func1.calcularIdade());
		System.out.printf("Idade pessoa 2- %d: \n",func2.calcularIdade());
		
		if (func1.calcularIdade() < func2.calcularIdade()) {
			System.out.printf(" %s %s é a pessoa 2 é mais velha(o).", func2.tratamento(), func2.nome);
		}
		else {
			System.out.printf("%s %s 1 é mais velha(o) ou tem a mesma idade", func1.tratamento(), func1.nome);
		}
	}

}
