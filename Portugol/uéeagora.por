programa
{
	
	funcao inicio()
	{
		cadeia operacao
		inteiro n1, n2, resultado

		escreva("Escolha qual tipo de operação você deseja fazer, +,-, *, /: ")
		leia(operacao)
		limpa() 
		escreva("Digite um número: ")
		leia(n1)
		limpa() 
		escreva("Digite outro número: ")
		leia(n2)
		limpa()

		se(operacao == " + "){
			resultado = n1+n2	
		}

		senao se(operacao == " - "){
			resultado = n1-n2
		}

		senao se(operacao == " / "){
			resultado = n1/n2
		}

		senao se(operacao == " * "){
			resultado = n1*n2
		}

		senao{
			escreva("Temos algum problema, tente novamente.")
		}

		escreva("O resultado desta operação é ", n1, " " ,operacao, " ", n2, " = ", resultado) 

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 646; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */