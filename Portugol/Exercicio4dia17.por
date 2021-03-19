programa
{
	
	funcao inicio()
	{
		inteiro numero

		escreva("Digite o numero desejado: ")
		leia(numero)

		se(numero == 0) {
			escreva("O numero é neutro")

		}

		senao se (numero < 0){
			escreva("Numero negativo,impossivel calcular")
			
		}
		senao se ((numero % 2) == 0){
			escreva("Seu numero é par")

	}

			senao {
				escreva ("O numero é impar") 
		}

		se(numero >0){
			escreva("\nEste é um numero positivo.")
		}
		senao {
			escreva("\nEsté é um numero negativo.")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 480; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */