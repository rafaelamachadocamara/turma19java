programa
{
	
	funcao inicio()
	{
		cadeia operacao
		real n1, n2, resultado

		escreva("+, -, * ou /? \n")
		leia(operacao)
		limpa()
		escreva("Insira os valores: \n")
		leia(n1)
		limpa()
		escreva("Insira os valores: \n")
		escreva(n1, " ", operacao, " ")
		leia(n2)
		limpa()

		se(operacao == "+"){
			resultado = n1+n2
		}
		
		senao se(operacao == " - "){
			resultado = n1-n2
		}

		senao se(operacao == " * "){
			resultado = n1*n2
		}

		senao se(operacao == " / "){
			resultado = n1/n2
			}

			senao{
				resultado = 0.0
			}
		
		escreva("Resultado: \n ", n1," ", operacao," ",n2," = ",resultado)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 33; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */