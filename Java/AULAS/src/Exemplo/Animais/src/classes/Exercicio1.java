package classes;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Cachorro animal1 = new Cachorro("MAX", 9, "AU AU AU", "ZUMMM");
		Cavalo1 animal2 = new Cavalo1("ALIPIO", 11, "IRRRIINN","POCOTÓ, POCOTÓ");
		Preguiça1 animal3 = new Preguiça1("FOFO", 3, "ZzZzz", "CRECK CRECK");

		
		System.out.println("O cachorro " +animal1.nome+ " tem " +animal1.idade+" anos de idade,"+" corre assim: "+ animal1.getEmitirSom() +" e faz o barulho: "+animal1.getCorrer());
		System.out.println("O cavalo " +animal2.nome+ " tem " +animal2.idade+" anos de idade,"+" corre assim: "+ animal2.getEmitirSom() +" e faz o barulho: "+animal2.getCorrer());
		System.out.println("A Preguiça " +animal3.nome+ " tem " +animal3.idade+" anos de idade,"+" sobe na arvore assim: "+ animal3.getEmitirSom() +" e faz o barulho: "+animal3.getCorrer());



	}

}
