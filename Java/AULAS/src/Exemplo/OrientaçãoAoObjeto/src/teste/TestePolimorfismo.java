package teste;

import POO.Pessoa1;
import POO.PessoaFisica;
import POO.PessoaJuridica;

public class TestePolimorfismo {

	public static void main(String[] args) {
		
		PessoaFisica fisica = new PessoaFisica();
		fisica.setNome("Juliana");
		fisica.setCpf("12345678902");
		
		PessoaJuridica juridica = new PessoaJuridica();
		juridica.setNome("Marcio");
		juridica.setCnpj("10000001234256789");
		
		Pessoa1[] pessoas = new Pessoa1[2];
		pessoas[0] = fisica;
		pessoas[1] = juridica;
		
		for(Pessoa1 pessoa:pessoas) {
			System.out.println(pessoa.getNome());
		}
	}

}
