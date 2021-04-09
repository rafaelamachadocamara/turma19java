package DesafioFuncionarioTerceiro;

public class Funcionario {
	
	private String matricula;
	private String nome;
	private int horasTrabalhadas;
	private double valorHora;
	private double salario;
	
	public Funcionario(String matricula, String nome, int horasTrabalhadas, double valorHora, double salario) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
		this.salario = salario;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
		public double contarSalario() {
			return horasTrabalhadas*valorHora;
			
		}
	
}
