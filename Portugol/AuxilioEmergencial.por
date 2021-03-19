programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro valor 

		escreva("Qual o seu nome?: ")
		leia(nome)
		escreva("Se você é chefe de familia digite 1, se não digite 2:  ")
		leia(valor)

		se(valor == 1){
			escreva("Auxilio de 1200 disponivel ")
		}
			senao se (valor == 2){
				escreva("Auxilio de 600 disponivel")
			}
			senao {
				escreva("Digitou incorretamente, auxilio bloqueado")
			}
			
		}

		
		
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 400; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */