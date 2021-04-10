package classes;

public class DVDS extends Produto {

	private int filmeDeA�ao;
	private int filmeDeAnima�ao;
	private int filmeDeComedia;
	private int filmeDeDrama;

		public DVDS(String descricao, String codigo, double valorUnitario, int qtdeEstoque, int filmeDeA�ao,
		int filmeDeAnima�ao, int filmeDeComedia, int filmeDeDrama) {
		super(descricao, codigo, valorUnitario, qtdeEstoque);
		this.filmeDeA�ao = filmeDeA�ao;
		this.filmeDeAnima�ao = filmeDeAnima�ao;
		this.filmeDeComedia = filmeDeComedia;
		this.filmeDeDrama = filmeDeDrama;
	}

		public int getFilmeDeA�ao() {
			return filmeDeA�ao;
		}

		public void setFilmeDeA�ao(int filmeDeA�ao) {
			this.filmeDeA�ao = filmeDeA�ao;
		}

		public int getFilmeDeAnima�ao() {
			return filmeDeAnima�ao;
		}

		public void setFilmeDeAnima�ao(int filmeDeAnima�ao) {
			this.filmeDeAnima�ao = filmeDeAnima�ao;
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
