programa
{
	
	funcao inicio()
	{
		real C
		real N
		real salarioTotal
		real excesso
		real salario

		escreva("Quantas horas você trabalhou? ")
		leia(N)

		excesso = N - 50
		salario = (N - excesso) * 10
		salarioTotal = salario + (excesso * 20)

		se(N > 50){
			excesso = N - 50
			salario = (N - excesso) * 10
			salarioTotal = salario + (excesso * 20)
			escreva("Você excedeu o total de ", excesso, " horas. Seu salário será de R$ ", salarioTotal, "\n")
		}
		
		senao {
		salarioTotal = N * 10
		escreva("Você excedeu o total de ", excesso, "horas. Seu salário será de R$ ", salarioTotal)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 602; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */