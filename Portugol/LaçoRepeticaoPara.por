programa
{
	
	funcao inicio()
	{
		inteiro valor
		inteiro valorUsuario
		inteiro resultado

		escreva("Entre com o valor da tabuada: ")
		leia(valorUsuario)
		limpa()

		para(valor = 1;valor <=10;valor ++)
		{
			resultado = valor * valorUsuario

			escreva("\n",valor," X ",valorUsuario,"=", resultado)
			
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 172; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */