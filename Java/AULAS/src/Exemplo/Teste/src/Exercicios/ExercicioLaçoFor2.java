//Ler 10 n�meros e imprimir quantos s�o pares
// e quantos s�o �mpares. (FOR)


package Exercicios;

import java.util.Scanner;

public class ExercicioLa�oFor2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int num;
		int par = 0;
		int impar = 0;
        
        for(int i = 1; i <= 10; i++){
            System.out.println("Digite o " + i + "� n�mero");
            num = leia.nextInt();
            
            if(num % 2 == 0){
                par++;
            }
            if(num % 2 == 1){
            	 impar++;
            }
               
	}
        System.out.print("Foram digitados " + par + " n�meros pares \n");
        System.out.print("E " + impar + " n�meros �mpares");



}
}
