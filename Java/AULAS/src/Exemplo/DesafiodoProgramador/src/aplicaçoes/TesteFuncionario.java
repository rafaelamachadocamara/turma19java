package aplicaçoes;

import java.util.Locale;

import DesafioFuncionarioTerceiro.Funcionario;
import DesafioFuncionarioTerceiro.Terceiro;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Funcionario func1 = new Funcionario("123", "João",25, 10.0,0.0);
		Terceiro terc1 = new Terceiro("456","Ana", 25, 10,13.0, 5.25);
		System.out.println("funcionario: "+func1.getMatricula() + " nome: " + func1.getNome() + " horas trabalhadas: "+ func1.getHorasTrabalhadas() + " valor por hora: "+ func1.getValorHora()+ " salario " + func1.contarSalario());
		System.out.println(terc1.getNome()+" salario: "+terc1.contarSalario(0));
	}

}
