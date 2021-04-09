package DesafioFuncionarioTerceiro;

public class Terceiro extends Funcionario {
	
	private double adicional;

	public Terceiro(String matricula, String nome, int horasTrabalhadas, double valorHora, double salario,
			double adicional) {
		super(matricula, nome, horasTrabalhadas, valorHora, salario);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	public double contarSalario(double salario) {
		salario = getHorasTrabalhadas()*getValorHora() + adicional;
				return salario;
	}

}
