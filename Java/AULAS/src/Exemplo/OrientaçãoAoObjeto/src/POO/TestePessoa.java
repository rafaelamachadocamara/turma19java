package POO;

import teste.Coordenador;
import teste.Funcionario;
import teste.Funcionario1;
import teste.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa jessica = new Pessoa("Jessica",555);
		Funcionario1 pedro = new Funcionario("Pedro",222,"TI");
		Pessoa maria = new Funcionario ("Maria",333,"Informatica");
		Pessoa jose = new Coordenador ("Jos�",444,"CC");
		
		System.out.println(jessica.getMatricula());
		System.out.println(pedro.getDepartamento());
		System.out.println(maria.getMatricula());
		System.out.println(jose.getNome());

	}

}
