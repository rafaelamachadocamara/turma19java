package Exemplos;

import java.util.Scanner;

public class DesafioProgramador3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		String nome;
		double salarioBruto, salarioLiquido, imposto;
		String tratamento;
		int opcaoTratamento;
        String isento = " ";

		
		System.out.print("Digite o seu nome: ");
		nome = leia.next();
		System.out.print("\nComo vc desejar ser tratado: 1- Sr 2 -Sra 3-Sre : ");
		opcaoTratamento = leia.nextInt();
		System.out.print("\nDigite o seu salario bruto: ");
		salarioBruto = leia.nextDouble();
		
		if (opcaoTratamento =='1'){
			if (salarioBruto <=1200) {
				System.out.println("Sr "+ nome +" vc é isento!!");
			}
			else if (salarioBruto > 1200 && salarioBruto <=2500) {
				imposto = salarioBruto * 0.12;
						salarioLiquido = salarioBruto-imposto;
						System.out.println("\"Sr " + nome + " você vai pagar 12% de IR R$ "+ imposto + " seu salario liquido " + salarioLiquido);
				
			}
			else if (salarioBruto > 2500) {
				imposto = salarioBruto * 0.25;
				salarioLiquido = salarioBruto-imposto;
				System.out.println("Sr " + nome +" vc vai pagar 25% de IR R$ "+ imposto + " seu salrio liquido "+ salarioLiquido);
			}
				
				}
			else if (opcaoTratamento =='2') {
			if (salarioBruto <=1200) {
					
					System.out.println("Sra "+nome+" você é isenta!!");
			}
			else if (salarioBruto > 1200 && salarioBruto <=2500)
			{
				imposto = salarioBruto * 0.12;
				salarioLiquido = salarioBruto-imposto;
				System.out.println("Sra "+nome+" vc vai pagar 12% de IR R$ "+imposto+" seu salario liquido "+salarioLiquido);
			} else if (salarioBruto > 2500) {
				imposto = salarioBruto * 0.25;
				salarioLiquido = salarioBruto-imposto;
				System.out.println("\"Sra "+nome+" vc vai pagar 25% de IR R$ "+imposto+" seu salario liquido "+salarioLiquido);
			}
	}
			else if (opcaoTratamento =='3')
		{
			
			if (salarioBruto <=1200) {
	
				System.out.println("Sre "+nome+" vc é isente!!");
			}
			else if (salarioBruto > 1200 && salarioBruto <=2500)
			{
				imposto = salarioBruto * 0.12;
				salarioLiquido = salarioBruto-imposto;
				System.out.println("Sre "+nome+" vc vai pagar 12% de IR R$ "+imposto+" seu salario liquido "+salarioLiquido);
			} else if (salarioBruto > 2500) {
				imposto = salarioBruto * 0.25;
				salarioLiquido = salarioBruto-imposto;
				System.out.println("Sre "+nome+" vc vai pagar 25% de IR R$ "+imposto+" seu salario liquido "+salarioLiquido);
			}
		}
			else {
			System.out.println("Você não escolheu um tratamento.");
		}
		
	}
}


