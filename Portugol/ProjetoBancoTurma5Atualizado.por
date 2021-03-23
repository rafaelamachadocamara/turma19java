programa
{
	inclua biblioteca Util
	
	cadeia cpf = " "
	inteiro numero = 0
	real saldo = 0
	real valorMovimento = 0
	logico ativo = verdadeiro //ativa ou inativa
	funcao inicio()
	{
		//variaveis
		caracter opcao
		cadeia tipo

		//entrada
		faca
		{	
			limpa()
			escreva ("Bem vindo ao Banco Banker")
			escreva("\nVOCÊ COM MAIS SEGURANÇA!")
			escreva("\n")
			escreva("\n1 - CONTA POUPANÇA")
			escreva("\n2 - CONTA CORRENTE")
			escreva("\n3 - CONTA ESPECIAL")
			escreva("\n4 - CONTA EMPRESA")
			escreva("\n5 - CONTA ESTUDANTIL")
			escreva("\n6 - SAIR")
			escreva("\nDigite uma das opções acima: ")
			leia(opcao)
			se (opcao =='1'){
				tipo = "POUPANÇA"
				inteiro diaAniversario, auxDia
				caracter auxCreDeb
				cabecalho(tipo)
				escreva("Digite o dia do seu aniversário: ")
				leia(diaAniversario)
				escreva("Qual o dia hoje? ")
				leia(auxDia)
				escreva ("Digite seu saldo")
				leia (saldo)
				se(auxDia == diaAniversario){
					saldo = (saldo * 0.05) + saldo
				}
					escreva("Número da conta ",numero )
					escreva("\nCPF", cpf)
					escreva("\nAtivo", ativo)
					escreva("\nData Aniversario", diaAniversario)
					escreva("\nSaldo em Conta: R$ ",saldo)
				
					
				Util.aguarde(2000)
				para (inteiro x=1; x<=10; x++){
					escreva("\nMovimento :", x, "\n")
					escreva("\nSaldo atual: R$", saldo)
					faca {
						
						escreva("\nDigite 1 - Para Crédito, 2 - Para Débito  3 - SAIR   ")
						leia(auxCreDeb)
						se (auxCreDeb != '1' e auxCreDeb != '2' e auxCreDeb!= '3'){

							escreva("Opçao invalida tente de novo ")
							Util.aguarde(2000)
							limpa()
						}
						 
						
					}enquanto (auxCreDeb != '1' e auxCreDeb != '2' e auxCreDeb!= '3')
					
						
						
					se (auxCreDeb == '1'){
						escreva("\nValor do movimento? R$\n")
						leia(valorMovimento)
						saldo = saldo + valorMovimento
					}senao se(auxCreDeb == '2')
					{
							escreva("\nValor do movimento? R$\n")
						leia(valorMovimento)
						
					enquanto (valorMovimento > saldo){
							escreva("Esse valor está indisponivel na sua conta\n")
							escreva("O seu Saldo é de: ", saldo, "\n")
							escreva("Digite novamente um valor válido  ")
							leia(valorMovimento)
							
						}
							
							saldo = saldo - valorMovimento
						
						
					}senao se(auxCreDeb == '3'){
							
							x = 11

							escreva( " Tchau " )
							Util.aguarde(1000)
							
							
					}
				
					
				}
				
			} senao se (opcao =='2'){
				tipo = "CORRENTE"
				cabecalho(tipo)
				Util.aguarde(2000)
			}
			senao se (opcao =='3'){
				tipo = "ESPECIAL"
				cabecalho(tipo)
				Util.aguarde(2000)
			}
			senao se (opcao =='4'){
				tipo = "EMPRESA"
				cabecalho(tipo)
				Util.aguarde(2000)
			}
			senao se (opcao =='5'){
				tipo = "ESTUDANTIL"
				cabecalho(tipo)
				Util.aguarde(2000)
			}senao se (opcao =='6'){
				escreva ("\nVocê escolheu SAIR. Obrigado e volte sempre")
				Util.aguarde(2000)
				pare
			}
			senao{
				escreva("Você não selecionou um número entre 1 e 6\n")
				escreva("Tente de novo: ")
				leia(opcao)
				
			}
		}enquanto (opcao !='6')

			
		escreva("Fim de Programa. Obrigado e volte sempre")
		
		
		}
			
	funcao cabecalho(cadeia tipo){
		caracter aux
		limpa()
			escreva ("Bem vindo ao Banco Banker")
			escreva("\nVOCÊ COM MAIS SEGURANÇA!")
			escreva("\n")
			escreva ("\nCONTA ",tipo, "\n")
			escreva("Digite seu CPF: ")
			leia(cpf)
			escreva(" 1 - Ativo ou 2 - Inativo: ")
			leia(aux)
			se (aux == '1'){
				ativo = verdadeiro
			}
			senao{
				ativo = falso
			}

			
								
	}
		
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3576; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */