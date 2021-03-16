programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro anoDeNascimento 
		inteiro anoAtual
		inteiro idade
		
		escreva("Digite o seu nome: ")
		leia (nome)
		escreva("Qual o ano do seu nascimento: ")
		leia (anoDeNascimento)

		anoAtual = 2021
		idade = (anoAtual-anoDeNascimento)

		escreva("Ola " ,nome, " \nSua idade é " , idade)	
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 341; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */