package classes;

public class Jogos extends Produto {

	private int jogosTabuleiro;
	private int jogosCartas;
	private int jogosVideogame;
	
	public Jogos(String descricao, String codigo, double valorUnitario, int qtdeEstoque, int jogosTabuleiro,
			int jogosCartas, int jogosVideogame) {
		super(descricao, codigo, valorUnitario, qtdeEstoque);
		this.jogosTabuleiro = jogosTabuleiro;
		this.jogosCartas = jogosCartas;
		this.jogosVideogame = jogosVideogame;
	}

	public int getJogosTabuleiro() {
		return jogosTabuleiro;
	}

	public void setJogosTabuleiro(int jogosTabuleiro) {
		this.jogosTabuleiro = jogosTabuleiro;
	}

	public int getJogosCartas() {
		return jogosCartas;
	}

	public void setJogosCartas(int jogosCartas) {
		this.jogosCartas = jogosCartas;
	}

	public int getJogosVideogame() {
		return jogosVideogame;
	}

	public void setJogosVideogame(int jogosVideogame) {
		this.jogosVideogame = jogosVideogame;
	}
	
	
}
