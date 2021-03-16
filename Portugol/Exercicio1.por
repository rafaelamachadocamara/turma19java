programa
{
	inclua biblioteca Calendario
	
	funcao inicio()
	{
		inteiro idade
		inteiro mes
		inteiro dia
		inteiro diasAtuais
		inteiro diasVida

		escreva("Digite sua idade: ")
		leia(idade)
		escreva("Digite quantos meses: ")
		leia(mes)
		escreva("Digite os dias: ")
		leia(dia)

		diasVida=((idade*365)+(mes*30)+dia)
		escreva("Você tem ", diasVida," dias vividos")
		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 95; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */