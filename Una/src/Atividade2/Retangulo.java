package Atividade2;

public class Retangulo {
	private double perimetro;
	private double area;
	private double diagonal;
	private double ladoA;
	private double ladoB;
	
	Retangulo(double ladoA,double ladoB){
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		perimetro = (2 * ladoA) + (2 * ladoB);
		area = ladoA * ladoB;
		diagonal = Math.sqrt((ladoA * ladoA) + (ladoB * ladoB));	
	}
	
	public double getPerimetro() {
		return perimetro;
	}

	public double getArea() {
		return area;
	}

	public double getDiagonal() {
		return diagonal;
	}

	public double getLadoA() {
		return ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

}
