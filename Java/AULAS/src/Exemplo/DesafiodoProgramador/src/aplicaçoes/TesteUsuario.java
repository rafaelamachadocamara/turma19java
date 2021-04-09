package aplicaçoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import DesafioFuncionarioTerceiro.Funcionario;
import DesafioFuncionarioTerceiro.Terceiro;

public class TesteUsuario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.println("cadastro de funcionarios - pagamentos");
		System.out.println("quantos funcionarios serão cadastrados");
		int qtde = leia.nextInt();
		
		for(int x=1;x<=qtde;x++) {
			System.out.printf("Funcionario %d\n",x);
			System.out.println("Digite 1 - Funcionario ou 2 = Terceiro");
			char tipo = leia.next().charAt(0);
			System.out.println("Digite a matricula: ");
			String matricula = leia.next();
			System.out.println("Digite o nome: ");
			String nome = leia.next();
			System.out.println("Digite as horas trabalhadas: ");
			int horasTrabalhadas = leia.nextInt();
			System.out.println("Digite o valor por horas: ");
			double valorHora = leia.nextDouble();
			
			if(tipo == '2') {
				System.out.println("Digite o valor do adicional: ");
				double adicional = leia.nextDouble();
				lista.add(new Terceiro(matricula,nome, horasTrabalhadas,valorHora,adicional, tipo));
			} else {
				lista.add(new Funcionario(matricula, nome, horasTrabalhadas, valorHora, tipo));
			}
		}
		System.out.println();
		System.out.println("Folha de Pagamentos");
		//for each
		for(Funcionario func: lista) {
			System.out.println(func.getNome()+" salario R$: "+func.getSalario());
		}
		System.out.println("Fim de programa.");
	}

}
