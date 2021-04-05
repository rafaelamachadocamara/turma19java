package Exemplos;

public class LaçoRepeticao {

	public static void main(String[] args) {

		int x;
		int soma = 0;
		
		for(x = 1;x<=10;x++) {
			System.out.printf("\n %d",x);
			soma = soma +x;
		}
		System.out.printf(" Soma total: %d", soma);
	}

}
