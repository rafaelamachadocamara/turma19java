package entities;

public class Revistas extends Produto {

	private String quadrinhos;
	private String mangás;
	private String gameShark;
	private int quantidade;
	
	public Revistas(String descricao, String codigo, double valorUnitario, int qtdeEstoque, String quadrinhos, String mangás,
			String gameShark, int quantidade) {
		super(descricao, codigo, valorUnitario, qtdeEstoque);
		this.quadrinhos = quadrinhos;
		this.mangás = mangás;
		this.gameShark = gameShark;
		this.quantidade = quantidade;
	}

	public String getQuadrinhos() {
		return quadrinhos;
	}

	public void setQuadrinhos(String quadrinhos) {
		this.quadrinhos = quadrinhos;
	}

	public String getMangás() {
		return mangás;
	}

	public void setMangás(String mangás) {
		this.mangás = mangás;
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
