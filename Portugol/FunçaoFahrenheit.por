programa
{
    inclua biblioteca Matematica --> Mat

    funcao inicio()
    {
        inteiro opcao
        real celsius = 0.0
        real fahrenheit = 0.0
        escreva("Escolha qual conversão: \n")
        escreva("1 - Celsius para Fahrenheit \n2 - Fahrenheit para Celsius\n")
        escreva("Digite uma Opção: ")
        leia(opcao)
        se(opcao == 1)
        {
            escreva("Digite a temperatura em Graus celsius: ")
            leia(celsius)
            escreva(" o grau em fahrenheit é:", Mat.arredondar(Fahrenheit(celsius), 2))
        }
        senao se(opcao == 2)
        {
            escreva("Digite a temperatura em fahrenheit: ")
            leia(fahrenheit)
            escreva("O grau em Celsius é: ",Mat.arredondar(Celsius(fahrenheit),2))
        }

    }

    funcao real Fahrenheit(real celsius)
    {
        real fahrenheit
        fahrenheit = ((celsius * 1.8) + 32) 
        retorne fahrenheit
    }

    funcao real Celsius(real fahrenheit)
    {
        real celsius
        celsius = (fahrenheit - 32) / 1.8 
        retorne celsius
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1082; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */