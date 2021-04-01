import java.util.Calendar;
import javax.swing.JOptionPane;


public class Menu {
	public static Calendar hoje = Calendar.getInstance();
	
	public static void main(String[] args)  
	{
		// TODO Auto-generated method stub
		String menuOpcao;
		String numeroConta = "";
		String cpf ="";
		double saldo = 0.0;
		String aniversario = "";
			
		numeroConta = JOptionPane.showInputDialog("Digite o numero da conta:");		
		cpf = JOptionPane.showInputDialog("Digite o cpf:");
				
		if(JOptionPane.showInternalConfirmDialog(null, "Essa conta está ativa?", "Verficação",JOptionPane.YES_NO_OPTION) == 0)
		{
			do
			{			
				menuOpcao = JOptionPane.showInputDialog("Banco Solícite - G6\n[Dedicação, flexibilidade e transparência]\nSeja bem vinde ao Banco Solícite -  G6! \nEscolha uma das operações a seguir:\n1 - CONTA POUPANÇA\n2 - CONTA CORRENTE\n3 - CONTA ESPECIAL\n4 - CONTA EMPRESARIAL\n5 - CONTA ESTUDANTIL\n6 - SAIR\nDigite o número da operação selecionada: ");
				
				if(menuOpcao.equalsIgnoreCase("1"))
				{
					aniversario = JOptionPane.showInputDialog("Digite a data de nasc.: \nexemplo: "+hoje.get(Calendar.DAY_OF_MONTH)+"/"+(hoje.get(Calendar.MONTH)+1)+"/"+hoje.get(Calendar.YEAR)+"\nData: ");
					Poupanca(numeroConta, cpf, saldo,aniversario);
				}
				else if(menuOpcao.equalsIgnoreCase("2"))
				{
					Corrente(numeroConta, cpf, saldo);
				}
				else if(menuOpcao.equalsIgnoreCase("3"))
				{
					Especial(numeroConta, cpf, saldo);
				}
				else if(menuOpcao.equalsIgnoreCase("4"))
				{
					Empresarial(numeroConta, cpf, saldo);
				}
				else if(menuOpcao.equalsIgnoreCase("5"))
				{
					Estudantil(numeroConta, cpf, saldo);
				}
				else if(menuOpcao.equalsIgnoreCase("6"))
				{
					JOptionPane.showMessageDialog(null,"Agradecemos por escolher o Banco Solícite -  G6! Tenha um ótimo dia!!!\n","Agradecimento",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Opção inválida, tente realizar outra operação.\n","Atenção",JOptionPane.ERROR_MESSAGE);
				}
								
			}while(menuOpcao.equalsIgnoreCase("6") == false);
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Está conta não é Ativa, Agradecemos tenha um bom dia!","Atenção",JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public static void Poupanca(String numeroConta, String cpf, double saldo, String diaAniversarioPoupanca)
	{
		int contador = 1;
		String movimento;
		double valorMovimento;
		String diaAtual = hoje.get(Calendar.DAY_OF_MONTH)+"/"+(hoje.get(Calendar.MONTH)+1)+"/"+hoje.get(Calendar.YEAR);
		
		if(diaAniversarioPoupanca.equals(diaAtual))
		{
			saldo = Double.parseDouble(JOptionPane.showInputDialog("Hoje é seu aniversário! Parabéns! \nFaremos o reajuste do seu Saldo\nDigite o Saldo: "));
			saldo = (saldo*0.05)+saldo;
			JOptionPane.showMessageDialog(null,"Reajuste de saldo.\nSaldo atual: R$"+saldo);			
		}
		do
		{
			do
			{
				movimento = JOptionPane.showInputDialog("CONTA [POUPANÇA]\n\nSaldo atual: R$"+saldo+"\nDigite - '1' para saques ou '2' para depósitos: ");
				if(movimento.equals("1") != true && movimento.equals("2") != true)
				{
					JOptionPane.showMessageDialog(null,"Opção inválida. Tente realizar outra operação: ");
				}
			}while(movimento.equals("1") != true && movimento.equals("2") != true);
			valorMovimento = Double.parseDouble(JOptionPane.showInputDialog("Valor da transação: R$"));
			
			if(movimento.equals("1"))
			{
				if(valorMovimento >= saldo)
				{
					JOptionPane.showMessageDialog(null,"Não é possível realizar esta operação, saldo insuficiente\n");
				}
				else
				{
					saldo = saldo - valorMovimento;
					JOptionPane.showMessageDialog(null,"Saldo atual: R$ "+ saldo);
				}
			}
			else
			{
				saldo = saldo+valorMovimento;
				JOptionPane.showMessageDialog(null,"Saldo atual: R$ "+ saldo);
			}
			
			if(JOptionPane.showInternalConfirmDialog(null, "Deseja fazer outra operação?", "Verficação",JOptionPane.YES_NO_OPTION) == 0)
			{
				if(contador < 10)
				{
					contador++;
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Limite de operações excedido.\nAgradecemos por escolher o Banco Solícite- G6! Tenha um ótimo dia!");
					contador++;
				}
			}
			else
			{
				contador = 11;
				JOptionPane.showMessageDialog(null,"Agradecemos por escolher o Banco Solícite - G6! Tenha um ótimo dia!");	
			}
		}while(contador <= 10);
	}

	//Fim Leandro
	//Nathalia
	public static void Corrente(String numeroConta, String cpf, double saldo)
	{
		int contador = 2;
		String operacao;
		double  valorMovimento = 0.00;
		int talaodeCheque = 3;
		int numeroTalao = 0;
		

		do
		{
			do	
			{		      
				operacao = JOptionPane.showInputDialog("CONTA [CORRENTE]\n\nSaldo atual: R$"+saldo+"\n1 - saques\n2 - depósitos\n3 - imprimir talão\nDigite o número da operação selecionada:");
			    if(operacao.equals("1") != true && operacao.equals("2") != true && operacao.equals("3") != true)
				{	
			    	JOptionPane.showMessageDialog(null,"Opção inválida. Tente realizar outra operação: ");
				}
	
			}while(operacao.equals("1") != true && operacao.equals("2") != true && operacao.equals("3") != true);
	
			if(operacao.equals("1") == true)
			{
				valorMovimento = Double.parseDouble(JOptionPane.showInputDialog("Valor da transação: R$"));
	            if(valorMovimento >= saldo)
				{
	            	JOptionPane.showMessageDialog(null,"Não é possível realizar esta operação, saldo insuficiente\n");
				}
				else 
				{
					saldo = saldo - valorMovimento;
					JOptionPane.showMessageDialog(null,"Saldo atual: R$ "+ saldo);
				}
			}
			else if(operacao.equals("2") == true)
			{
				valorMovimento = Double.parseDouble(JOptionPane.showInputDialog("Valor da transação: R$"));
				saldo = saldo+valorMovimento;
				JOptionPane.showMessageDialog(null,"Saldo atual: R$ "+ saldo);
			}
			else if(operacao.equals("3") == true)
			{
				if(talaodeCheque > 0)
				{
					numeroTalao = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantia de talões desejada:"));
					if(numeroTalao <= talaodeCheque)
					{
						talaodeCheque  = talaodeCheque - numeroTalao;
						JOptionPane.showMessageDialog(null,"Você adquiriu "+numeroTalao+" talões de cheque");	
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Quantia de talões solicitada não disponível\nTalões de cheque disponíveis: "+talaodeCheque);						
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Não temos talões de cheque disponíveis no momento.");	
				}
			}			
			if(JOptionPane.showInternalConfirmDialog(null, "Deseja fazer outra operação?", "Verficação",JOptionPane.YES_NO_OPTION) == 0)
			{
				if(contador < 10)
				{
					contador++;
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Limite de operações excedido.\nAgradecemos por escolher o Banco Solícite- G6! Tenha um ótimo dia!");
					contador++;
				}
			}
			else
			{
				contador = 11;
				JOptionPane.showMessageDialog(null,"Agradecemos por escolher o Banco Solícite - G6! Tenha um ótimo dia!");	
			}
		}while(contador <= 10);
	}
	//fim Nathalia

	
	//Caio
	public static void Especial(String numeroConta, String cpf, double saldo)
	{
		double limite = 1000.00;
		int opcao2;
		double valorTransacao = 0.00;
		int movimentacoes = 10;
		
			do
			{		
				do{	
					opcao2 = Integer.parseInt(JOptionPane.showInputDialog("\nCONTA [ESPECIAL]\nSaldo atual: "+ saldo+"\nLimite disponível: "+ limite+"\nEscolha uma das operações a seguir:\n'1' para débito\n'2' para crédito\nDigite o número da operação selecionada: "));
					if(opcao2 != 1 && opcao2 != 2)
					{
						JOptionPane.showMessageDialog(null,"Opção inválida. Tente realizar outra operação: ");
					}
					
				} while(opcao2 != 1 && opcao2 != 2);
				if(opcao2 == 2)
				{
					valorTransacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da transação: R$"));

					if(limite < 1000)
					{
						limite = limite + valorTransacao;
						if(limite > 1000)
						{
							saldo = saldo + limite - 1000;
							limite = 1000.00;
						}
					}
					else
					{
						saldo = saldo + valorTransacao;
						JOptionPane.showMessageDialog(null,"Seu saldo atual é de: R$"+saldo+"\nSeu limite é de: R$"+limite);
					}
				}
				else if(saldo>=0)
				{
					valorTransacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da transação: R$"));
					
					saldo = saldo - valorTransacao;
				
					if(saldo < 0 )
					{
						if((limite >= saldo*-1))
						{
							limite = limite + saldo;
							saldo = saldo - saldo;
							
							JOptionPane.showMessageDialog(null,"Você atingiu o limite do cheque especial\nSaldo atual: R$"+saldo+"\nLimite cheque especial: R$"+limite);
						}
						else
						{
							JOptionPane.showMessageDialog(null,"Não é possível realizar esta operação, limite insuficiente\n");
							
							
							saldo = saldo + valorTransacao;
						}
					}
				}					
				if(JOptionPane.showInternalConfirmDialog(null, "Deseja fazer outra operação?", "Verficação",JOptionPane.YES_NO_OPTION) == 0)
				{
					movimentacoes--;
					if(movimentacoes == 0)
					{
						JOptionPane.showMessageDialog(null,"Limite de operações atingido.\nAgradecemos por escolher o Banco Solícite - G6! Tenha um ótimo dia!");
					}
				}
				else
				{
					movimentacoes = 0;
				}
			}while(movimentacoes !=0);
			
	}
	//Fim caio
	
	//Agni
	public static void Empresarial (String numeroConta, String cpf, double saldo)
	{
		int contador = 1; 
		String operacao;
		double valorTransacao = 0.00;
		double emprestimo = 10000.00;
		double emprestimo2 = 0.00;
		do
		{
			do
			{
				operacao = JOptionPane.showInputDialog("CONTA [EMPRESARIAL]\nSaldo atual: "+ saldo+"\nEscolha uma das operações a seguir:\n'1' para saque\n'2' para depósito em conta\n'3' para empréstimo empresarial\nDigite o número da operação selecionada: ");
				if(operacao.equals("1") != true && operacao.equals("2") != true && operacao.equals("3") != true)
				{
					JOptionPane.showMessageDialog(null,"Opção inválida. Tente realizar outra operação: ");
				}
			}while(operacao.equals("1") != true && operacao.equals("2") != true && operacao.equals("3") != true);
			
			if(operacao.equals("1") == true)
			{
				valorTransacao = Double.parseDouble(JOptionPane.showInputDialog("Valor da transação: R$"));
				if(valorTransacao > saldo)
				{
					JOptionPane.showMessageDialog(null,"Não é possível realizar esta operação, saldo insuficiente\n");
				}
				else 
				{
					saldo = saldo - valorTransacao;
					JOptionPane.showMessageDialog(null,"Saldo atual: R$" +saldo+ "\nValor disponível para empréstimo: R$"+ emprestimo);			
				}
			}
			else if(operacao.equals("2") == true) 
			{ 
				valorTransacao = Double.parseDouble(JOptionPane.showInputDialog("Valor da transação: R$"));
				saldo = saldo + valorTransacao;
				JOptionPane.showMessageDialog(null,"Saldo atual: R$"+ saldo+ "\nValor disponível para empréstimo: R$"+ emprestimo);
			}	
			else if(operacao.equals("3") == true) 
			{
				if(emprestimo!=0)
				{
					do 
					{
						emprestimo2 = Double.parseDouble(JOptionPane.showInputDialog("Valor disponível para empréstimo: "+emprestimo+"\nInsira o valor desejado: "));
						if(emprestimo2 <= emprestimo)
						{
							saldo = saldo + emprestimo2;
							emprestimo = emprestimo - emprestimo2;
							emprestimo2=0.00;
							JOptionPane.showMessageDialog(null,"Saldo atual: R$"+ saldo+ "\nValor disponível para empréstimo: R$"+ emprestimo);
						}
						else
						{
							JOptionPane.showMessageDialog(null,"Valor de empréstimo não disponível.");
						}
					}while (emprestimo2 > emprestimo);	
				}
				else
				{
					JOptionPane.showMessageDialog(null,"\nSem crédito disponível.");
				}
				
			}		
			if(JOptionPane.showInternalConfirmDialog(null, "Deseja fazer outra operação?", "Verficação",JOptionPane.YES_NO_OPTION) == 0)
			{
				if(contador < 10)
				{
					contador++;
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Limite de operações excedido.\nAgradecemos por escolher o Banco Solícite- G6! Tenha um ótimo dia!");
					contador++;
				}
			}
			else
			{
				contador = 11;
				JOptionPane.showMessageDialog(null,"Agradecemos por escolher o Banco Solícite - G6! Tenha um ótimo dia!");	
			}
		}while(contador <= 10);	
	}
			
	//fim Agni

	//Rodrigo
	public static void Estudantil(String numeroConta, String cpf, double saldo)
	{
		String operacao;
		double credito;
		double limiteEstudantil=5000.0;
		int con=10;
		do
		{
			do
			{
				operacao = JOptionPane.showInputDialog("CONTA [ESTUDANTIL]\nSaldo atual: "+ saldo+"\nEscolha uma das operações a seguir:\n'1' para saque\n'2' para depósito em conta\n'3' para empréstimo estudantil\nDigite o número da operação selecionada: ");
				if(operacao.equals("1") != true && operacao.equals("2") != true && operacao.equals("3") != true)
				{
					JOptionPane.showMessageDialog(null,"Opção inválida. Tente realizar outra operação: ");			
				}			
			}while(operacao.equals("1") != true && operacao.equals("2") != true && operacao.equals("3") != true);
			if(operacao.equals("1") == true)
			{
				credito = Double.parseDouble(JOptionPane.showInputDialog("Valor da transação: R$"));
				if(credito > saldo)
				{
					JOptionPane.showMessageDialog(null,"Não é possível realizar esta operação, saldo insuficiente\n");
				}
				else 
				{
					saldo = saldo - credito;
					JOptionPane.showMessageDialog(null,"Saldo atual: R$"+ saldo+ "\nValor disponível para empréstimo: R$"+ limiteEstudantil);					
				}
			}
			else if(operacao.equals("2") == true) 
			{ 
				credito = Double.parseDouble(JOptionPane.showInputDialog("Valor da transação: R$"));
				saldo = saldo + credito;
				JOptionPane.showMessageDialog(null,"Saldo atual: R$"+ saldo+ "\nValor disponível para empréstimo: R$"+ limiteEstudantil);		
			}
			else if(operacao.equals("3") == true) 
			{
				if(limiteEstudantil != 0)
				{
					do 
					{
						credito = Double.parseDouble(JOptionPane.showInputDialog("Valor disponível para empréstimo: "+limiteEstudantil+"\nInsira o valor desejado: "));
						if(credito <= limiteEstudantil)
						{
							saldo = saldo + credito;
							limiteEstudantil = limiteEstudantil - credito;
							credito=0.00;
							JOptionPane.showMessageDialog(null,"Saldo atual: R$"+ saldo+ "\nValor disponível para empréstimo: R$"+ limiteEstudantil);
						}	
						else
						{
							JOptionPane.showMessageDialog(null,"Valor de empréstimo não disponível.");							
						}
					}while(credito > limiteEstudantil);
				}
				else 
				{
					JOptionPane.showMessageDialog(null,"Sem crédito disponível\n");							
				}
			}
			if(JOptionPane.showInternalConfirmDialog(null, "Deseja fazer outra operação?", "Verficação",JOptionPane.YES_NO_OPTION) == 0)
			{
				if(con > 1)
				{
					con--;
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Limite de operações excedido.\nAgradecemos por escolher o Banco Solícite- G6! Tenha um ótimo dia!");
					con--;
				}
			}
			else
			{
				con = 0;
				JOptionPane.showMessageDialog(null,"Agradecemos por escolher o Banco Solícite - G6! Tenha um ótimo dia!");	
			}
		}while(con >= 1);
	}

	
}
