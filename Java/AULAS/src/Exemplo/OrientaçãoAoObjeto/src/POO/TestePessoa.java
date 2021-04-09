package POO;

import teste.Coordenador;
import teste.Funcionario;
import teste.Funcionario1;
import teste.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa jessica = new Pessoa("Jessica",555, "Java");
		Funcionario pedro = new Funcionario("Pedro",222,"TI");
		Pessoa maria = new Pessoa ("Maria",333,"Informatica");
		Coordenador jose = new Coordenador ("José",444,"CC");
		
		System.out.println(jessica.getMatricula());
		System.out.println(pedro.getDepartamento());
		System.out.println(maria.getMatricula());
		System.out.println(jose.getNome());

	}

}
