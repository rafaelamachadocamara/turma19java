programa
{
	
	funcao inicio()
	{
		cadeia times[] = {"Palmeiras", "Santos", "São Paulo", "Corinthians"}
		cadeia resultado
		inteiro pontos

		escreva("Qual foi o resultado do ", times[1], " G-ganhou, E-Empatou, P-perdeu: ")
		leia(resultado)

		se(resultado == "G") {
			pontos = 3
			escreva("O ", times [1], " ganhou 3 pontos")
			
		}
		senao se(resultado == "E" ou resultado == "e" ou resultado == "empatou: "){
			pontos = 1
			escreva("O ", times[1], " ganhou 1 ponto")
		}

		senao se(resultado == "P" ou resultado == "p" ou resultado == "perdeu: "){
			pontos = 0
			
		}
			escreva("O ", times[1], " ganhou 1 ponto")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 196; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */