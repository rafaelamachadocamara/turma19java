programa
{
	
	funcao inicio()
	{
		cadeia senha = "123"
		inteiro contador = 0
		const inteiro LIMITESENHA = 3

		escreva("Digite a senha: ")
		leia(senha)

		enquanto (senha != "123"){
			escreva("\nSenha incorreta, tente novamente ")
			leia(senha)
			
			se (contador > LIMITESENHA){
		}
			escreva("Senha bloqueada.")
		
		contador++	
		
		escreva("Programa finalizado")
		pare
	}

		
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 394; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */