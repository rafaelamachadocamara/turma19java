programa
{
	
	funcao inicio()
	{
		cadeia nomes[4] = {"Amanda","Renato","Agatha","Wagner"}
		real notas[4][4] = {{10.0,10.0,9.0,10.0},
						{9.0,7.0,8.0,7.0},
						{9.0,10.0,9.0,10.0},
						{2.0,5.0,6.0,4.0}}
		real medias[4]

		para(inteiro l=0; l<4; l++){
			real soma = 0.0
			para(inteiro c = 0; c<4; c++){
				soma += notas[l][c]
				
			}
			medias[l] = soma/4
		}

		inteiro aluno 
		escreva("Digite o numero do aluno: ")
		leia(aluno)
		limpa()
		cadeia aprovado
		se(medias[aluno]>=6){
			aprovado = "APROVADX"
		}
		senao{
			aprovado = "REPROVADX"
		}

		escreva("===========","\n")
		escreva("  Alunx: "+nomes[aluno],"\n")
		escreva("------------","\n")
		escreva("  1B : "+notas[aluno][0],"\n")
		escreva("  2B : "+notas[aluno][1],"\n")
		escreva("  2B : "+notas[aluno][2],"\n")
		escreva("  4B : "+notas[aluno][3],"\n")
		escreva("------------","\n")
		escreva("  Media : "+medias[aluno],"\n")
		escreva("     "+aprovado,"\n")
		escreva("===========","\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 258; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */