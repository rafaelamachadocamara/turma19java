programa
{
	
	funcao inicio()
	{
		real indicePoluicao

		escreva("Por favor informe o indice de poluiçao atual: " )
		leia(indicePoluicao)

		se(indicePoluicao >= 0.30 e indicePoluicao <= 0.39 ){
			escreva("Industrias do primeiro grupo suspendam suas atividades")
			
		}
		senao se(indicePoluicao > 0.30 e indicePoluicao <= 0.40){
			escreva("Industrias do primeiro e segundos grupos suspendam suas atividades")
	}
	senao se(indicePoluicao == 0.50){
		escreva("Todos os grupos suspendam suas atividades")
	}
	
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