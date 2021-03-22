programa
{
	
	funcao inicio()
	{
		inteiro lanceDados[10]
		real media = 0.0
		inteiro maiorNumero = 0
		inteiro contador = 0

		para(inteiro x=0;x<10;x++)
		{
			escreva("Digite o Numero do Lance: ", x+1, " ")
			leia(lanceDados[x])
			media = media + lanceDados[x]
			
			se(maiorNumero < lanceDados[x]){
				media = media + lanceDados[x]
				maiorNumero = lanceDados[x]
				contador =1 
			}
			senao se(maiorNumero == lanceDados[x])
			{
				contador++
			}
		} 
		media = media/10

		para(inteiro x=0; x<10;x++)
		{
			escreva(lanceDados[x], " | ")
		}
		escreva("\nMedia: ",media,"\nMaior Numero", maiorNumero,"\nVezes que o maior numero saiu: ", contador) 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 275; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */