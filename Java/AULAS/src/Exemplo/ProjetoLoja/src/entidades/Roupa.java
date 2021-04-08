package entidades;

public class Roupa extends Produto {
		
	//atributos
	private String Marca;

	//construtor
	public Roupa(String descricao, String codigo, double valorUnitario, String marca) {
		super(descricao, codigo, valorUnitario);
		Marca = marca;
	}
	
	//encapsulamento
	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}
	
	
	
	
	
	
	//metodo
}
