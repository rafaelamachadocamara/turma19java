programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		const inteiro HABITANTES = 2
		real salario = 0.00
		inteiro numeroFilhos = 0
		real mediaSalarios = 0.00
		real totalSalarios = 0.00
		real mediaNumeroFilhos = 0.00
		real totalNumeroFilhos = 0.00
		real maiorSalario = 0.00
		real percentualPessoasAte100 = 0.00
		inteiro totalPessoasAte100 = 0 

		para (inteiro x=1;x<=HABITANTES; x++){
			escreva("Digite o salario do habitante: ")
			leia(salario)
			escreva("Digite o numero de filhos do habitante: ")
			leia(numeroFilhos)
			totalSalarios = totalSalarios + salario
			totalNumeroFilhos = totalNumeroFilhos + numeroFilhos
			se (maiorSalario < salario){
				maiorSalario = salario
			}

			se(salario <= 100){
				totalPessoasAte100++
			}
		}

		mediaSalarios = totalSalarios / HABITANTES
		mediaNumeroFilhos = totalNumeroFilhos / HABITANTES
		percentualPessoasAte100 = (totalPessoasAte100 / HABITANTES)*100
		escreva("\nTotal de salarios R$: ", totalSalarios)
		escreva("\nMedia de salarios R$: ", Matematica.arredondar (mediaSalarios,2))
		escreva("\nPercentual de pessoas que ganham ate R$ 100.00",Matematica.arrendondar(percentualPessoasAte100,2) " % "))
		escreva("\nMaior salario R$: ", maiorSalario)
		escreva("\nTotal de filhos: ",numeroFilhos) 
		escreva("\nMedia de filhos: ",mediaNumeroFilhos)

		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1340; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */