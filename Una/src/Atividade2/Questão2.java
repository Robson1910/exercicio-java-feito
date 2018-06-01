package Atividade2;

public class Questão2 {

	public static void main(String[] args) {
		Circulo circulo = new Circulo(12.0);
		Retangulo retangulo = new Retangulo(6.0,8.0);

		System.out.println("Area do circulo: " + circulo.getArea() + ", Circunferencia: " + circulo.getCircunferencia());
		System.out.println("Area do retangulo: " + retangulo.getArea() + ", Perimetro: " + retangulo.getPerimetro() + ", Diagonal: " + retangulo.getDiagonal());

	}
	/* características elas têm em comum: 
		A area e o unico atributo em comum dessas figuras geometricas.
	    Outros atributos sao diferentes mas parecidos como circuferencia e o perimetro.
	*/
}
