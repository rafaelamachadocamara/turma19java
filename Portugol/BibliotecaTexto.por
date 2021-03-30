programa
{
	inclua biblioteca Texto --> t
	
	funcao inicio()
	{
		cadeia in
		inteiro n, m=0, f=0, b=0
		caracter a
		escreva("Digite a entrada: ")
		leia(in)
		limpa()
		in = t.caixa_alta(in)
		n = t.numero_caracteres(in)
		para(inteiro i = 0; i<n; i++){
			a = t.obter_caracter(in, i)
			se(a== 'F'){
				f++
			}
			senao se(a=='M'){
				m++
			}
			senao{
				b++
			}
		}
		escreva("São " +m+" pessoas do gênero masculino, "+f+" pessoas do gênero feminino e "+b+" pessoas que não se identificam com nenhum dos dois gêneros.")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */