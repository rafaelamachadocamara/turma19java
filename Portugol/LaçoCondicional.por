programa
{
	
	funcao inicio()
	{
		inteiro maxdigito
		escreva("Digite um numero entre 1-9: ")
		leia(maxdigito)
		para (inteiro p=0; p <=maxdigito; p++){
			se(p<=maxdigito){
				para (inteiro s=0; s<=maxdigito; s++){
					se (s<=maxdigito){
						para(inteiro t=0;t<=maxdigito; t++){
							se(t<=maxdigito){
								para(inteiro q=0;q<=maxdigito;q++){
									se((p+s+t+q)==21){
										escreva(p,s,t,q, "\n")
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 340; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */