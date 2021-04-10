package entities;

public class Revistas extends Produto {

	private String quadrinhos;
	private String mang�s;
	private String gameShark;
	private int quantidade;
	
	public Revistas(String descricao, String codigo, double valorUnitario, int qtdeEstoque, String quadrinhos, String mang�s,
			String gameShark, int quantidade) {
		super(descricao, codigo, valorUnitario, qtdeEstoque);
		this.quadrinhos = quadrinhos;
		this.mang�s = mang�s;
		this.gameShark = gameShark;
		this.quantidade = quantidade;
	}

	public String getQuadrinhos() {
		return quadrinhos;
	}

	public void setQuadrinhos(String quadrinhos) {
		this.quadrinhos = quadrinhos;
	}

	public String getMang�s() {
		return mang�s;
	}

	public void setMang�s(String mang�s) {
		this.mang�s = mang�s;
	}

	public String getGameShark() {
		return gameShark;
	}

	public void setGameShark(String gameShark) {
		this.gameShark = gameShark;
	}
	public int quantidade() {
		return quantidade;
	}

	public void quantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
