package application;

import java.util.Locale;

import entities.Biquini;
import entities.Calca;
import entities.Camisa;
import entities.Casaco;
import entities.Chinelo;
import entities.Meia;
import entities.Sandalia;
import entities.Sunga;
import entities.Tenis;

public class TesteProgramador {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Meia prod1 = new Meia("Meia Colorida", "1234", "Genner", "Unico", 10, 12.50);
		Tenis prod2 = new Tenis("Tenis Cano Baixo", "456", "Genner", "38", 10, 200.00);
		Sunga prod3 = new Sunga("Sunga Primavera Verão", "789", "Genner", "M",10, 25.00);
		Sandalia prod4 = new Sandalia("Sandalia Rasteirinha", "098","Genner","36", 10, 45.90);
		Chinelo prod5 = new Chinelo("Chinelo Personagens", "765","Genner","37",10,45.00);
		Casaco prod6 = new Casaco("Casaco Outono Inverno", "432","Genner","P",10,149.99);
		Camisa prod7 = new Camisa("Camisa Florida", "111","Genner","GG",10,39.99);
		Calca prod8 = new Calca("Calça Skinny", "222", "Genner", "42", 10,109.99);
		Biquini prod9 = new Biquini("Biquini Rosa", "333", "Genner", "38", 10,99.90);
		
		System.out.println(prod3.getDescricao()+prod3.getCodigo()+prod3.getMarca()+prod3.getTamanho()+prod3.getValorSunga());
		prod3.getQtdeEstoque();
		prod3.getValorSunga();
	}

}
