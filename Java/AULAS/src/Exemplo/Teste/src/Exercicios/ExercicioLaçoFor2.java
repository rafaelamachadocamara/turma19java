//Ler 10 números e imprimir quantos são pares
// e quantos são ímpares. (FOR)


package Exercicios;

import java.util.Scanner;

public class ExercicioLaçoFor2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int num;
		int par = 0;
		int impar = 0;
        
        for(int i = 1; i <= 10; i++){
            System.out.println("Digite o " + i + "º número");
            num = leia.nextInt();
            
            if(num % 2 == 0){
                par++;
            }
            if(num % 2 == 1){
            	 impar++;
            }
               
	}
        System.out.print("Foram digitados " + par + " números pares \n");
        System.out.print("E " + impar + " números ímpares");



}
}
