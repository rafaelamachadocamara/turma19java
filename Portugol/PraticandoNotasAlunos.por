programa
{
	
	funcao inicio()
	{
		real nota 
		escreva("Insira a nota (use ponto em vez de vírgula): ")
		leia(nota)
		limpa()
		se(nota < 0 ou nota > 100){
			escreva("Nota inválida (",nota,")")
		}
		senao se(nota <= 40){
			escreva("O aluno foi reprovado")
		}
		senao se(nota <60){
			escreva("O aluno está de recuperação")
		}
		senao se(nota >80){
			escreva("O aluno foi aprovado com destaque.")
		}
		senao se(nota >=60){
			escreva("O aluno foi aprovado")
		}
		
		escreva("\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 155; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */