programa
{
	
	funcao inicio()
	{
		inteiro idadeDias
		inteiro anos
		inteiro meses
		inteiro dias

		escreva("Digite a idade em dias totais") 
		leia(idadeDias)

		anos = (idadeDias / 365)
		meses = (idadeDias % 365) / 30
		dias = (idadeDias %365) % 30

		escreva("Anos: ",anos)
		escreva("\nMeses: ", meses)
		escreva("\nDias: "dias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 347; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */