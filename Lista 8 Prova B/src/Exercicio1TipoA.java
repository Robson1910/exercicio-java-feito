import java.util.Scanner;
public class Exercicio1TipoA {
	/* 
	 * Faça uma classe em Java contendo: a) Um método que recebe dois números inteiros e retorna a
subtração do primeiro pelo segundo; b) O método principal deve ler do teclado dois números e
chamar o método anterior passando esses dois valores como parâmetro e atribuindo o retorno à
uma terceira variável. O valor dessa terceira variável também deve ser mostrado na tela.
	 */
	public static int subtrair(int a, int b){
		int c;
		c = a-b;
		return c;
	}
	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite primeiro numero: ");
		num1 = sc.nextInt();
		System.out.println("Digite segundo numero: ");
		num2 = sc.nextInt();
		num3= subtrair(num1,num2);
		System.out.println("Subtração dos numeros: "+ num3);
		sc.close();
	}
}
