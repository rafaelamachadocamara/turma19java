package Exemplos;

import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		
		String operacao;
		double n1;
		double n2;
		double resultado;
		
		System.out.println("+, -, * ou / ?");
		operacao = leia.next();
		System.out.println("Digite o seu primeiro numero: ");
		n1 = leia.nextDouble();
		System.out.println("Leia o seu segundo número");
		n2 = leia.nextDouble();
		
		if(operacao == "+"){
			resultado = n1 + n2;
			
		}if(operacao == "-"){
			resultado = n1 - n2;
		
		}if(operacao == "*"){
			resultado = n1 * n2;
			
		}if(operacao == "/"){
			resultado = n1 / n2;	
			{
				
			}
			}else {
			resultado = 0.0;
		}
		
		System.out.println(resultado);
		

}
	}
	
