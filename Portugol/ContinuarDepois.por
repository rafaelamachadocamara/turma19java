//uestão: Preciso criar um algoritmo que tenha 3 senhas no sistema (Constantes) e um email também.
// O usuário precisa primeiro inserir o E-mail. Se o e-mail estiver no sistema...
// ele irá pedir a senha do usuário em seguida se não... 
// O programa finaliza nessa parte, nem chega a pedir os outros dados
// Se a senha do usuário não for nenhuma das 3 do sistema ele informará, que senha é inválida
//e o programa finaliza. 
// Caso for aparecerá mensagem, "Sistema Ativado".


programa
{
	
	funcao inicio()
	{
		const cadeia senha1 = 123
		const cadeia senha2 = 321
		const cadeia senha3 = 453
		const cadeia email = "joao@hotmail.com"
		cadeia password
		cadeia emailUsuario 

		escreva("Informe o seu email: ")
		leia("\n emailusuario")

		se(emailUsuario != email){
		escreva("Email invalido!")
		
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 802; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */