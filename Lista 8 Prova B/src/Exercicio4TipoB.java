import java.util.Scanner;
public class Exercicio4TipoB {
	double lado;
	double area(){
		double area;
		area=2*lado;
		return area;
	}
	double perimetro(){
		double perimetro;
		perimetro= 4*lado;
		return perimetro;
	   
	}
	void construtor(){
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite numero de lados do quadrado: ");
		lado=sc.nextDouble();
		sc.close();
	}
	void imprimir(){
		System.out.println("lados do quadrado "+ lado);
		System.out.println("Area do quadrado "+ area());
		System.out.println("Perimetro do quadrado "+ perimetro());
		
	}
}
