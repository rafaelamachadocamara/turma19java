programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real distri
		real impostos
		real custodeFabrica
		real custodoConsumidor

		escreva("Qual o curso de fábrica do carro? ")
		leia(custodeFabrica)
		distri = (custodeFabrica * 0.28)
		impostos = (custodeFabrica * 0.45)
		custodoConsumidor = custodeFabrica + distri + impostos
		escreva("O valor total do consumidor é: ",custodoConsumidor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 396; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */