package entities;

public class Revistas extends Produto {

	private int quadrinhos;
	private int mang�s;
	private int gameShark;
	
	public Revistas(String descricao, String codigo, double valorUnitario, int qtdeEstoque, int quadrinhos, int mang�s,
			int gameShark) {
		super(descricao, codigo, valorUnitario, qtdeEstoque);
		this.quadrinhos = quadrinhos;
		this.mang�s = mang�s;
		this.gameShark = gameShark;
	}

	public int getQuadrinhos() {
		return quadrinhos;
	}

	public void setQuadrinhos(int quadrinhos) {
		this.quadrinhos = quadrinhos;
	}

	public int getMang�s() {
		return mang�s;
	}

	public void setMang�s(int mang�s) {
		this.mang�s = mang�s;
	}

	public int getGameShark() {
		return gameShark;
	}

	public void setGameShark(int gameShark) {
		this.gameShark = gameShark;
	}
	
}
