package Atividade2;

public class Habitante {
	
	private double salario;
	private int idade;
	
	Habitante(double salario,int idade){
		 this.idade = idade;
		 this.salario = salario;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}	
}
