programa
{
	
	funcao inicio()
	{
		cadeia pais
		inteiro idade

		escreva("Country/país? (BRA, USA, POR)\n")
		leia(pais)
		limpa()
		escreva("Qual a sua idade? ")
		leia(idade)
		limpa()

		se(pais == "BRA" e idade >= 18){
			escreva("Permitido")
		}
		senao se(pais == "USA" e idade >=21){
			escreva("Allowed")
		}
		senao se(pais == "POR"){
			escreva("Permitido")
		}
		senao{
			escreva("Não Permitido.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 415; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */