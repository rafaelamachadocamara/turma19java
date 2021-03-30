programa
{
	inclua biblioteca Tipos
	inclua biblioteca Arquivos --> arq
	
	inteiro vagas[20]

	const cadeia CAMINHO = "./park.text"

	funcao abrir(){
		se(arq.arquivo_existe(CAMINHO)){
			inteiro arquivo = arq.abrir_arquivo(CAMINHO,arq.MODO_LEITURA)
			cadeia linha
			para(inteiro i = 0; i < 20; i++){
				linha = arq.ler_linha(arquivo)
				se(linha == ""){
					pare
				}
				senao{
					vagas[i] = Tipos.cadeia_para_inteiro(linha, 10)
				}
			}
			arq.fechar_arquivo(arquivo)
		}
	}

	funcao salvar(){
		inteiro arquivo = arq.abrir_arquivo(CAMINHO, arq.MODO_ESCRITA)
		cadeia linha
		para(inteiro i = 0; i <30; i++){
			linha = Tipos.inteiro_para_cadeia(vagas[i], 10)
			arq.escrever_linha(linha, arquivo)
		}
		arq.fechar_arquivo(arquivo)
	}
	
	funcao espere(){
		cadeia _
		escreva("\n\nPressione enter para continuar.")
		leia(_)
	}
	funcao logico vagaOcupada(inteiro vaga){
		se(vagas[vaga-1]==1){
			retorne verdadeiro
		}senao{
			retorne falso
	}
		}
	funcao registrarEntrada(){
		abrir()
		inteiro vaga
		escreva("Digite o número da vaga para a qual você deseja registrar uma entrada.\n")
		leia(vaga)
		se(vagaOcupada(vaga)){
			escreva("Vaga ocupada.")
		}
		senao{
			vagas[vaga-1] = 1
			salvar()
			
			escreva("Sucesso.")
		}
	}
	funcao registrarSaida(){
		abrir()
		inteiro vaga
		escreva("Digite o número da vaga para a qual você deseja registrar uma saída.\n")
		leia(vaga)
		se(vagaOcupada(vaga)){
			vagas[vaga-1] = 0
			salvar()
			escreva("Sucesso.")
		}
		senao{
			escreva("Não há nenhum veiculo estacionado nessa vaga")
		}
	}
	funcao listarVagas(){
		abrir()
		escreva("As vagas serão listadas abaixo. Dois pontos indicam área ocupada, enquanto números indicam vaga disponivel.\n")
		escreva(" -------------------------- \n")
		para(inteiro i = 1;i<=20;i++){
			se(vagaOcupada(i)){
				escreva("|..")
			}
			senao{
				escreva("|"+i)
			}
		}
	escreva("|\n------------------------ ")
	}
	
	
	funcao inicio()
	{
		inteiro opcao
		logico continuar = verdadeiro 
		enquanto(continuar){
			escreva("SISTEMA DE GESTÃO DE ESTACIONAMENTOS\n\n")
			escreva("Escolha uma opção\n")
			escreva("1. Registrar entrada\t3. Listar registros\n2. Registar Saida\t4. Fechar\n")
			leia(opcao)
			limpa()
			escolha(opcao){
				caso 1:
				registrarEntrada()
				espere()
				pare
				caso 2:
				registrarSaida()
				espere()
				pare
				caso 3:
				listarVagas()
				espere()
				pare
				caso contrario:
				continuar = falso
			}
			limpa()
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1218; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */