programa
{
    funcao inicio()
    {

    const cadeia SENHA1 = "123"
    const cadeia SENHA2 = "123"
    const cadeia SENHA3 = "123"
    const cadeia EMAIL = "rafaela@hotmail.com"
    cadeia password
    cadeia email_usuario

     escreva ("Informe o seu email: ","\n")
     leia (email_usuario)

     se (email_usuario != EMAIL)
     {
         escreva ("E-mail inválido!")
     }

     senao { 
     escreva ("Informe a sua senha: ")
     leia (password)
     
      se ((password == SENHA1) ou (password == SENHA2) ou (password == SENHA3))
          {
              escreva ("Sistema ativado!","\n")
          }
senao
{
    escreva ("Senha incorreta!")
}
    }
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 132; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */