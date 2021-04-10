package classes;

public class DVDS extends Produto {

	private int filmeDeAçao;
	private int filmeDeAnimaçao;
	private int filmeDeComedia;
	private int filmeDeDrama;

		public DVDS(String descricao, String codigo, double valorUnitario, int qtdeEstoque, int filmeDeAçao,
		int filmeDeAnimaçao, int filmeDeComedia, int filmeDeDrama) {
		super(descricao, codigo, valorUnitario, qtdeEstoque);
		this.filmeDeAçao = filmeDeAçao;
		this.filmeDeAnimaçao = filmeDeAnimaçao;
		this.filmeDeComedia = filmeDeComedia;
		this.filmeDeDrama = filmeDeDrama;
	}

		public int getFilmeDeAçao() {
			return filmeDeAçao;
		}

		public void setFilmeDeAçao(int filmeDeAçao) {
			this.filmeDeAçao = filmeDeAçao;
		}

		public int getFilmeDeAnimaçao() {
			return filmeDeAnimaçao;
		}

		public void setFilmeDeAnimaçao(int filmeDeAnimaçao) {
			this.filmeDeAnimaçao = filmeDeAnimaçao;
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
