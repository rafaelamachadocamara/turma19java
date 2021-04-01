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
				
		if(JOptionPane.showInternalConfirmDialog(null, "Essa conta est� ativa?", "Verfica��o",JOptionPane.YES_NO_OPTION) == 0)
		{
			do
			{			
				menuOpcao = JOptionPane.showInputDialog("Banco Sol�cite - G6\n[Dedica��o, flexibilidade e transpar�ncia]\nSeja bem vinde ao Banco Sol�cite -  G6! \nEscolha uma das opera��es a seguir:\n1 - CONTA POUPAN�A\n2 - CONTA CORRENTE\n3 - CONTA ESPECIAL\n4 - CONTA EMPRESARIAL\n5 - CONTA ESTUDANTIL\n6 - SAIR\nDigite o n�mero da opera��o selecionada: ");
				
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
					JOptionPane.showMessageDialog(null,"Agradecemos por escolher o Banco Sol�cite -  G6! Tenha um �timo dia!!!\n","Agradecimento",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Op��o inv�lida, tente realizar outra opera��o.\n","Aten��o",JOptionPane.ERROR_MESSAGE);
				}
								
			}while(menuOpcao.equalsIgnoreCase("6") == false);
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Est� conta n�o � Ativa, Agradecemos tenha um bom dia!","Aten��o",JOptionPane.WARNING_MESSAGE);
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
			saldo = Double.parseDouble(JOptionPane.showInputDialog("Hoje � seu anivers�rio! Parab�ns! \nFaremos o reajuste do seu Saldo\nDigite o Saldo: "));
			saldo = (saldo*0.05)+saldo;
			JOptionPane.showMessageDialog(null,"Reajuste de saldo.\nSaldo atual: R$"+saldo);			
		}
		do
		{
			do
			{
				movimento = JOptionPane.showInputDialog("CONTA [POUPAN�A]\n\nSaldo atual: R$"+saldo+"\nDigite - '1' para saques ou '2' para dep�sitos: ");
				if(movimento.equals("1") != true && movimento.equals("2") != true)
				{
					JOptionPane.showMessageDialog(null,"Op��o inv�lida. Tente realizar outra opera��o: ");
				}
			}while(movimento.equals("1") != true && movimento.equals("2") != true);
			valorMovimento = Double.parseDouble(JOptionPane.showInputDialog("Valor da transa��o: R$"));
			
			if(movimento.equals("1"))
			{
				if(valorMovimento >= saldo)
				{
					JOptionPane.showMessageDialog(null,"N�o � poss�vel realizar esta opera��o, saldo insuficiente\n");
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
			
			if(JOptionPane.showInternalConfirmDialog(null, "Deseja fazer outra opera��o?", "Verfica��o",JOptionPane.YES_NO_OPTION) == 0)
			{
				if(contador < 10)
				{
					contador++;
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Limite de opera��es excedido.\nAgradecemos por escolher o Banco Sol�cite- G6! Tenha um �timo dia!");
					contador++;
				}
			}
			else
			{
				contador = 11;
				JOptionPane.showMessageDialog(null,"Agradecemos por escolher o Banco Sol�cite - G6! Tenha um �timo dia!");	
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
				operacao = JOptionPane.showInputDialog("CONTA [CORRENTE]\n\nSaldo atual: R$"+saldo+"\n1 - saques\n2 - dep�sitos\n3 - imprimir tal�o\nDigite o n�mero da opera��o selecionada:");
			    if(operacao.equals("1") != true && operacao.equals("2") != true && operacao.equals("3") != true)
				{	
			    	JOptionPane.showMessageDialog(null,"Op��o inv�lida. Tente realizar outra opera��o: ");
				}
	
			}while(operacao.equals("1") != true && operacao.equals("2") != true && operacao.equals("3") != true);
	
			if(operacao.equals("1") == true)
			{
				valorMovimento = Double.parseDouble(JOptionPane.showInputDialog("Valor da transa��o: R$"));
	            if(valorMovimento >= saldo)
				{
	            	JOptionPane.showMessageDialog(null,"N�o � poss�vel realizar esta opera��o, saldo insuficiente\n");
				}
				else 
				{
					saldo = saldo - valorMovimento;
					JOptionPane.showMessageDialog(null,"Saldo atual: R$ "+ saldo);
				}
			}
			else if(operacao.equals("2") == true)
			{
				valorMovimento = Double.parseDouble(JOptionPane.showInputDialog("Valor da transa��o: R$"));
				saldo = saldo+valorMovimento;
				JOptionPane.showMessageDialog(null,"Saldo atual: R$ "+ saldo);
			}
			else if(operacao.equals("3") == true)
			{
				if(talaodeCheque > 0)
				{
					numeroTalao = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantia de tal�es desejada:"));
					if(numeroTalao <= talaodeCheque)
					{
						talaodeCheque  = talaodeCheque - numeroTalao;
						JOptionPane.showMessageDialog(null,"Voc� adquiriu "+numeroTalao+" tal�es de cheque");	
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Quantia de tal�es solicitada n�o dispon�vel\nTal�es de cheque dispon�veis: "+talaodeCheque);						
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null,"N�o temos tal�es de cheque dispon�veis no momento.");	
				}
			}			
			if(JOptionPane.showInternalConfirmDialog(null, "Deseja fazer outra opera��o?", "Verfica��o",JOptionPane.YES_NO_OPTION) == 0)
			{
				if(contador < 10)
				{
					contador++;
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Limite de opera��es excedido.\nAgradecemos por escolher o Banco Sol�cite- G6! Tenha um �timo dia!");
					contador++;
				}
			}
			else
			{
				contador = 11;
				JOptionPane.showMessageDialog(null,"Agradecemos por escolher o Banco Sol�cite - G6! Tenha um �timo dia!");	
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
					opcao2 = Integer.parseInt(JOptionPane.showInputDialog("\nCONTA [ESPECIAL]\nSaldo atual: "+ saldo+"\nLimite dispon�vel: "+ limite+"\nEscolha uma das opera��es a seguir:\n'1' para d�bito\n'2' para cr�dito\nDigite o n�mero da opera��o selecionada: "));
					if(opcao2 != 1 && opcao2 != 2)
					{
						JOptionPane.showMessageDialog(null,"Op��o inv�lida. Tente realizar outra opera��o: ");
					}
					
				} while(opcao2 != 1 && opcao2 != 2);
				if(opcao2 == 2)
				{
					valorTransacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da transa��o: R$"));

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
						JOptionPane.showMessageDialog(null,"Seu saldo atual � de: R$"+saldo+"\nSeu limite � de: R$"+limite);
					}
				}
				else if(saldo>=0)
				{
					valorTransacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da transa��o: R$"));
					
					saldo = saldo - valorTransacao;
				
					if(saldo < 0 )
					{
						if((limite >= saldo*-1))
						{
							limite = limite + saldo;
							saldo = saldo - saldo;
							
							JOptionPane.showMessageDialog(null,"Voc� atingiu o limite do cheque especial\nSaldo atual: R$"+saldo+"\nLimite cheque especial: R$"+limite);
						}
						else
						{
							JOptionPane.showMessageDialog(null,"N�o � poss�vel realizar esta opera��o, limite insuficiente\n");
							
							
							saldo = saldo + valorTransacao;
						}
					}
				}					
				if(JOptionPane.showInternalConfirmDialog(null, "Deseja fazer outra opera��o?", "Verfica��o",JOptionPane.YES_NO_OPTION) == 0)
				{
					movimentacoes--;
					if(movimentacoes == 0)
					{
						JOptionPane.showMessageDialog(null,"Limite de opera��es atingido.\nAgradecemos por escolher o Banco Sol�cite - G6! Tenha um �timo dia!");
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
				operacao = JOptionPane.showInputDialog("CONTA [EMPRESARIAL]\nSaldo atual: "+ saldo+"\nEscolha uma das opera��es a seguir:\n'1' para saque\n'2' para dep�sito em conta\n'3' para empr�stimo empresarial\nDigite o n�mero da opera��o selecionada: ");
				if(operacao.equals("1") != true && operacao.equals("2") != true && operacao.equals("3") != true)
				{
					JOptionPane.showMessageDialog(null,"Op��o inv�lida. Tente realizar outra opera��o: ");
				}
			}while(operacao.equals("1") != true && operacao.equals("2") != true && operacao.equals("3") != true);
			
			if(operacao.equals("1") == true)
			{
				valorTransacao = Double.parseDouble(JOptionPane.showInputDialog("Valor da transa��o: R$"));
				if(valorTransacao > saldo)
				{
					JOptionPane.showMessageDialog(null,"N�o � poss�vel realizar esta opera��o, saldo insuficiente\n");
				}
				else 
				{
					saldo = saldo - valorTransacao;
					JOptionPane.showMessageDialog(null,"Saldo atual: R$" +saldo+ "\nValor dispon�vel para empr�stimo: R$"+ emprestimo);			
				}
			}
			else if(operacao.equals("2") == true) 
			{ 
				valorTransacao = Double.parseDouble(JOptionPane.showInputDialog("Valor da transa��o: R$"));
				saldo = saldo + valorTransacao;
				JOptionPane.showMessageDialog(null,"Saldo atual: R$"+ saldo+ "\nValor dispon�vel para empr�stimo: R$"+ emprestimo);
			}	
			else if(operacao.equals("3") == true) 
			{
				if(emprestimo!=0)
				{
					do 
					{
						emprestimo2 = Double.parseDouble(JOptionPane.showInputDialog("Valor dispon�vel para empr�stimo: "+emprestimo+"\nInsira o valor desejado: "));
						if(emprestimo2 <= emprestimo)
						{
							saldo = saldo + emprestimo2;
							emprestimo = emprestimo - emprestimo2;
							emprestimo2=0.00;
							JOptionPane.showMessageDialog(null,"Saldo atual: R$"+ saldo+ "\nValor dispon�vel para empr�stimo: R$"+ emprestimo);
						}
						else
						{
							JOptionPane.showMessageDialog(null,"Valor de empr�stimo n�o dispon�vel.");
						}
					}while (emprestimo2 > emprestimo);	
				}
				else
				{
					JOptionPane.showMessageDialog(null,"\nSem cr�dito dispon�vel.");
				}
				
			}		
			if(JOptionPane.showInternalConfirmDialog(null, "Deseja fazer outra opera��o?", "Verfica��o",JOptionPane.YES_NO_OPTION) == 0)
			{
				if(contador < 10)
				{
					contador++;
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Limite de opera��es excedido.\nAgradecemos por escolher o Banco Sol�cite- G6! Tenha um �timo dia!");
					contador++;
				}
			}
			else
			{
				contador = 11;
				JOptionPane.showMessageDialog(null,"Agradecemos por escolher o Banco Sol�cite - G6! Tenha um �timo dia!");	
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
				operacao = JOptionPane.showInputDialog("CONTA [ESTUDANTIL]\nSaldo atual: "+ saldo+"\nEscolha uma das opera��es a seguir:\n'1' para saque\n'2' para dep�sito em conta\n'3' para empr�stimo estudantil\nDigite o n�mero da opera��o selecionada: ");
				if(operacao.equals("1") != true && operacao.equals("2") != true && operacao.equals("3") != true)
				{
					JOptionPane.showMessageDialog(null,"Op��o inv�lida. Tente realizar outra opera��o: ");			
				}			
			}while(operacao.equals("1") != true && operacao.equals("2") != true && operacao.equals("3") != true);
			if(operacao.equals("1") == true)
			{
				credito = Double.parseDouble(JOptionPane.showInputDialog("Valor da transa��o: R$"));
				if(credito > saldo)
				{
					JOptionPane.showMessageDialog(null,"N�o � poss�vel realizar esta opera��o, saldo insuficiente\n");
				}
				else 
				{
					saldo = saldo - credito;
					JOptionPane.showMessageDialog(null,"Saldo atual: R$"+ saldo+ "\nValor dispon�vel para empr�stimo: R$"+ limiteEstudantil);					
				}
			}
			else if(operacao.equals("2") == true) 
			{ 
				credito = Double.parseDouble(JOptionPane.showInputDialog("Valor da transa��o: R$"));
				saldo = saldo + credito;
				JOptionPane.showMessageDialog(null,"Saldo atual: R$"+ saldo+ "\nValor dispon�vel para empr�stimo: R$"+ limiteEstudantil);		
			}
			else if(operacao.equals("3") == true) 
			{
				if(limiteEstudantil != 0)
				{
					do 
					{
						credito = Double.parseDouble(JOptionPane.showInputDialog("Valor dispon�vel para empr�stimo: "+limiteEstudantil+"\nInsira o valor desejado: "));
						if(credito <= limiteEstudantil)
						{
							saldo = saldo + credito;
							limiteEstudantil = limiteEstudantil - credito;
							credito=0.00;
							JOptionPane.showMessageDialog(null,"Saldo atual: R$"+ saldo+ "\nValor dispon�vel para empr�stimo: R$"+ limiteEstudantil);
						}	
						else
						{
							JOptionPane.showMessageDialog(null,"Valor de empr�stimo n�o dispon�vel.");							
						}
					}while(credito > limiteEstudantil);
				}
				else 
				{
					JOptionPane.showMessageDialog(null,"Sem cr�dito dispon�vel\n");							
				}
			}
			if(JOptionPane.showInternalConfirmDialog(null, "Deseja fazer outra opera��o?", "Verfica��o",JOptionPane.YES_NO_OPTION) == 0)
			{
				if(con > 1)
				{
					con--;
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Limite de opera��es excedido.\nAgradecemos por escolher o Banco Sol�cite- G6! Tenha um �timo dia!");
					con--;
				}
			}
			else
			{
				con = 0;
				JOptionPane.showMessageDialog(null,"Agradecemos por escolher o Banco Sol�cite - G6! Tenha um �timo dia!");	
			}
		}while(con >= 1);
	}

	
}
