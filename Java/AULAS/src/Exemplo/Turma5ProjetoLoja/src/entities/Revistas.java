package entities;

public class Revistas extends Produto {

	private int quadrinhos;
	private int mangás;
	private int gameShark;
	
	public Revistas(String descricao, String codigo, double valorUnitario, int qtdeEstoque, int quadrinhos, int mangás,
			int gameShark) {
		super(descricao, codigo, valorUnitario, qtdeEstoque);
		this.quadrinhos = quadrinhos;
		this.mangás = mangás;
		this.gameShark = gameShark;
	}

	public int getQuadrinhos() {
		return quadrinhos;
	}

	public void setQuadrinhos(int quadrinhos) {
		this.quadrinhos = quadrinhos;
	}

	public int getMangás() {
		return mangás;
	}

	public void setMangás(int mangás) {
		this.mangás = mangás;
	}

	public int getGameShark() {
		return gameShark;
	}

	public void setGameShark(int gameShark) {
		this.gameShark = gameShark;
	}
	
}
