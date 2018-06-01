package Atividade2;

public class Circulo {
	private double raio;
	private double area;
	private double circunferencia;
	
	Circulo(double raio){
		this.raio = raio;
		area = Math.PI * Math.pow(raio, 2);
		circunferencia = 2 * Math.PI * raio;
	}
	public double getRaio() {
		return raio;
	}
	public double getArea() {
		return area;
	}
	public double getCircunferencia() {
		return circunferencia;
	}
}
