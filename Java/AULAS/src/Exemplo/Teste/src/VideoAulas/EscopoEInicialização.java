package VideoAulas;

public class EscopoEInicializa��o {

	public static void main(String[] args) {
		
		double price = 400.00;
		double discount;
		
		if(price < 200.00){
			discount = price * 0.01;
		}
		else {
			discount = 0;
		}
		
		System.out.println(discount);

	}

}
