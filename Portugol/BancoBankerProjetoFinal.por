programa
{
	inclua biblioteca Util
	
	inteiro diaAniversario = 10 , auxDia
	cadeia cpf = " "
	inteiro numero = 0
	
	real valorMovimento = 0.0
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
				real saldo = 0.00
				caracter auxCreDeb
				cabecalho(tipo)
				escreva("Qual o dia hoje? ")
				leia(auxDia)
				
				se(auxDia == diaAniversario){
					saldo = (saldo * 0.05) + saldo
				}
					linha()
					escreva("Número da conta ",numero )
					escreva("\nCPF ", cpf)
					escreva("\nStatus da Conta: " , ativo)
					escreva("\nSaldo em Conta: R$",saldo)
					linha()
					
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
						escreva("\nValor do movimento?\nR$")
						leia(valorMovimento)
						saldo = saldo + valorMovimento
					}senao se(auxCreDeb == '2')
					
					{
							escreva("\nValor do movimento?\nR$")
						leia(valorMovimento)
						
					enquanto (valorMovimento > saldo){
							escreva("Esse valor está indisponivel na sua conta\n")
							escreva("O seu Saldo é de: ", saldo, "\n")
							escreva("Digite novamente um valor válido ou 0 para retornar ")
							leia(valorMovimento)
							
						}
							
							saldo = saldo - valorMovimento
						
						
					}senao se(auxCreDeb == '3'){

						se (auxDia == diaAniversario){
							saldo = (saldo * 0.05) + saldo
						}
							
							x = 11
							limpa()
							linha()
							escreva ("\nSEU SALDO É DE R$",saldo)
							escreva ("\nO BANCO BANKER AGRADEÇE SUA PREFERENCIA")
							escreva( "\nSORRIA SEU DINHEIRO É NOSSA ALEGRIA" )
							linha()
							Util.aguarde(7000)
							
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

				
				//Rafaela
		
				caracter auxCreDeb
				caracter auxSair
				real saldo = 0.00
				real limiteEspecial = 1000.00
				
				
					linha()
					escreva("Número da conta ",numero )
					escreva("\nCPF", cpf)
					escreva("\nStatus da Conta: " , ativo)
					escreva("\nSaldo em Conta: R$",saldo)
					linha()
					
				Util.aguarde(2000)
				para (inteiro x=1; x<=10; x++){
					escreva("\nMovimento :", x, "\n")
					escreva("\nSaldo atual: ", saldo)
					escreva("\nSaldo Especial Disponivel: R$", limiteEspecial)
					
    			    		faca {
						
						escreva("\nDigite 1 - Para Crédito, 2 - Para Débito, 3 - Sair\n")
						leia(auxCreDeb)
						se (auxCreDeb != '1' e auxCreDeb != '2' e auxCreDeb!= '3'){

							escreva("Opçao invalida, tente de novo ")
							Util.aguarde(2000)
							limpa()
						}
						 
						
					}enquanto (auxCreDeb != '1' e auxCreDeb != '2' e auxCreDeb!= '3')
					
						
						
					se (auxCreDeb == '1'){
						escreva("\nValor do movimento?\nR$")
						leia(valorMovimento)
						saldo = saldo + valorMovimento
					}senao se(auxCreDeb == '2')
					
					{
						escreva("\nValor do movimento?\nR$")
						leia(valorMovimento)

						se(saldo > valorMovimento){
								saldo = saldo - valorMovimento
							
								
							}
							
							senao se(saldo < valorMovimento e limiteEspecial > valorMovimento){
								limiteEspecial = (limiteEspecial + saldo) - valorMovimento
								
							}
						
					enquanto (saldo < valorMovimento e limiteEspecial < valorMovimento){
							escreva("O seu Saldo e o seu limite Especial não são suficientes para esta operação.\n Insira um valor valido: ")
					        	leia(valorMovimento)
							Util.aguarde(2000)
								
							
						}
							
							saldo = (saldo - valorMovimento)  +  saldo
							
						
							}senao se (auxCreDeb == '3'){
						    x = 11
							limpa()
							linha()
							escreva ("\nSEU SALDO É DE R$",saldo)
							escreva ("\nO BANCO BANKER AGRADEÇE SUA PREFERENCIA")
							escreva( "\nSORRIA SEU DINHEIRO É NOSSA ALEGRIA" )
							linha()
							Util.aguarde(7000)
					}
				
					
				}
			
			}
			
			
			senao se (opcao =='4'){
		//Matheus		
				tipo = "EMPRESA"
				caracter auxCreDeb
				real saldo = 0.00
				real saldoEmprestimo = 10000.00, valorEmprestimo
				cabecalho(tipo)
				
					linha()
					escreva("Número da conta ",numero )
					escreva("\nCPF", cpf)
					escreva("\nStatus da Conta: " , ativo)
					escreva("\nSaldo em Conta: R$",saldo)
					escreva("\nSaldo disponível para empréstimo: R$", saldoEmprestimo)
					linha()
					
				Util.aguarde(2000)
				para (inteiro x=1; x<=10; x++){
					escreva("\nMovimento :", x, "\n")
					escreva("\nSaldo atual: R$", saldo)
					escreva("\nSaldo disponível para empréstimo: R$", saldoEmprestimo)
					faca {
						
						escreva("\nDigite 1 - Para Crédito, 2 - Para Débito  3 - Para Empréstimo, 4 - SAIR   ")
						leia(auxCreDeb)
						se (auxCreDeb != '1' e auxCreDeb != '2' e auxCreDeb!= '3' e auxCreDeb!= '4'){

							escreva("Opçao invalida tente de novo ")
							Util.aguarde(2000)
							limpa()
						}
						 
						
					}enquanto (auxCreDeb != '1' e auxCreDeb != '2' e auxCreDeb!= '3' e auxCreDeb!= '4')
					
						
						
					se (auxCreDeb == '1'){
						escreva("\nValor do movimento?\nR$")
						leia(valorMovimento)
						saldo = saldo + valorMovimento
					}senao se(auxCreDeb == '2')
					
					{
							escreva("\nValor do movimento?\nR$")
						leia(valorMovimento)
						
					enquanto (valorMovimento > saldo){
							escreva("Esse valor está indisponivel na sua conta\n")
							escreva("O seu Saldo é de: ", saldo, "\n")
							escreva("Digite novamente um valor válido ou 0 para voltar e realizar um empréstimo ")
							leia(valorMovimento)
							Util.aguarde(2000)
							
						}
							
							saldo = saldo - valorMovimento
						
						
					}senao se(auxCreDeb == '3'){

						escreva("Informe o valor que deseja pegar emprestado: R$")
						leia(valorEmprestimo)
						se (valorEmprestimo>saldoEmprestimo){
							escreva("Este valor não está disponível, tente novamente: R$")
							Util.aguarde(2000)
							
						}senao se (valorEmprestimo<saldoEmprestimo){
							saldo = saldo+valorEmprestimo
							saldoEmprestimo= saldoEmprestimo-valorEmprestimo
							escreva("Seu novo saldo é de: R$",saldo)
						}
						
							
														
					}senao se (auxCreDeb == '4'){
						x = 11
							limpa()
							linha()
							escreva ("\nSEU SALDO É DE R$",saldo)
							escreva ("\nO BANCO BANKER AGRADEÇE SUA PREFERENCIA")
							escreva( "\nSORRIA SEU DINHEIRO É NOSSA ALEGRIA" )
							linha()
							Util.aguarde(7000)
					}
				
					
				}
			
			}
			
			//Hugo
			
			senao se (opcao =='5'){
				tipo = "ESTUDANTIL"
				real saldo = 0.00, saldoEmprestimo = 5000.0, valorSolicitado = 0.0
				caracter auxCreDeb
				cabecalho(tipo)
				
				
					linha()
					escreva("Número da conta ",numero )
					escreva("\nCPF ", cpf)
					escreva("\nStatus da Conta: " , ativo)
					escreva("\nSaldo em Conta: R$",saldo)
					escreva("\nSaldo disponivel para emprestimo: R$",saldoEmprestimo)
					linha()
					
				Util.aguarde(2000)
				para (inteiro x=1; x<=10; x++){
					escreva("\nMovimento :", x, "\n")
					escreva("\nSaldo atual: R$", saldo)
					faca {
						
						escreva("\nDigite 1 - Para Crédito, 2 - Para Débito  3 - EMPRESTIMO  4 - SAIR ")
						leia(auxCreDeb)
						se (auxCreDeb != '1' e auxCreDeb != '2' e auxCreDeb!= '3' e auxCreDeb!= '4'){

							escreva("Opçao invalida tente de novo ")
							Util.aguarde(2000)
							limpa()
						}
						 
						
					}enquanto (auxCreDeb != '1' e auxCreDeb != '2' e auxCreDeb!= '3' e auxCreDeb!= '4')
					
						
						
					se (auxCreDeb == '1'){
						escreva("\nValor do movimento?\nR$")
						leia(valorMovimento)
						saldo = saldo + valorMovimento
					}senao se(auxCreDeb == '2')
					
					{
							escreva("\nValor do movimento?\nR$")
						leia(valorMovimento)
						
					enquanto (valorMovimento > saldo){
							escreva("Esse valor está indisponivel na sua conta\n")
							escreva("O seu Saldo é de: ", saldo, "\n")
							escreva("Digite novamente um valor válido ou 0 para retornar ")
							leia(valorMovimento)
							
						}
							
							saldo = saldo - valorMovimento
						
						
					}senao se(auxCreDeb == '3'){

						escreva("Qual valor voce deseja solicitar? \nR$")
						leia (valorSolicitado)

						se (valorSolicitado > saldoEmprestimo){

							escreva("Voce não tem esse limite disponível, tente novamente: R$\n")
							Util.aguarde(2000)
						}

							senao se (valorSolicitado < saldoEmprestimo ){

								saldo = saldo + valorSolicitado
								saldoEmprestimo = saldoEmprestimo - saldoEmprestimo
								escreva("Seu saldo é R$",saldo)
								Util.aguarde(2000)
							}
							
							
					}senao se (auxCreDeb == '4'){

							
				
							x = 11
							limpa()
							linha()
							escreva ("\nSEU SALDO É DE R$",saldo)
							escreva ("\nO BANCO BANKER AGRADEÇE SUA PREFERENCIA")
							escreva( "\nSORRIA SEU DINHEIRO É NOSSA ALEGRIA" )
							linha()
							Util.aguarde(7000)


					}
				}
				
			
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
		
	funcao linha(){

		escreva ("\n===================================\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10749; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */