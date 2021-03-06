package entities;

public class Dvds extends Produto {

	private int filmeDeAšao;
	private int filmeDeAnimašao;
	private int filmeDeComedia;
	private int filmeDeDrama;
	
	public Dvds(String descricao, String codigo, double valorUnitario, int qtdeEstoque, int filmeDeAšao,
			int filmeDeAnimašao, int filmeDeComedia, int filmeDeDrama) {
		super(descricao, codigo, valorUnitario, qtdeEstoque);
		this.filmeDeAšao = filmeDeAšao;
		this.filmeDeAnimašao = filmeDeAnimašao;
		this.filmeDeComedia = filmeDeComedia;
		this.filmeDeDrama = filmeDeDrama;
	}

	public int getFilmeDeAšao() {
		return filmeDeAšao;
	}

	public void setFilmeDeAšao(int filmeDeAšao) {
		this.filmeDeAšao = filmeDeAšao;
	}

	public int getFilmeDeAnimašao() {
		return filmeDeAnimašao;
	}

	public void setFilmeDeAnimašao(int filmeDeAnimašao) {
		this.filmeDeAnimašao = filmeDeAnimašao;
	}

	public int getFilmeDeComedia() {
		return filmeDeComedia;
	}

	public void setFilmeDeComedia(int filmeDeComedia) {
		this.filmeDeComedia = filmeDeComedia;
	}

	public int getFilmeDeDrama() {
		return filmeDeDrama;
	}

	public void setFilmeDeDrama(int filmeDeDrama) {
		this.filmeDeDrama = filmeDeDrama;
	}
	
	
}
