programa
{
	
	funcao inicio()
	{
		cadeia op
		real n1
		real n2
		real resultado

		escreva("+, -, *, /? \n")
		leia(op)
		limpa()
		escreva("Insira os valores: \n")
		leia(n1)
		limpa()
		escreva("Insira os valores: \n")
		escreva(n1, " ", op, " ")
		leia(n2)
		limpa()

		se(op == "+"){
			resultado = n1+n2
		}
		senao se(op == "-"){
			resultado = n1-n2
		}

		senao se(op == "*"){
			resultado = n1*n2
		}

		senao se(op == "/"){
			resultado = n1/n2
		}

		senao{
			resultado = 0.0
		}
		
		escreva("Resultado: \n",n1, " ",op," ",n2, " = ", resultado)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 543; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */