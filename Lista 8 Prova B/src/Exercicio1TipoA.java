import java.util.Scanner;
public class Exercicio1TipoA {
	/* 
	 * Fa�a uma classe em Java contendo: a) Um m�todo que recebe dois n�meros inteiros e retorna a
subtra��o do primeiro pelo segundo; b) O m�todo principal deve ler do teclado dois n�meros e
chamar o m�todo anterior passando esses dois valores como par�metro e atribuindo o retorno �
uma terceira vari�vel. O valor dessa terceira vari�vel tamb�m deve ser mostrado na tela.
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
		System.out.println("Subtra��o dos numeros: "+ num3);
		sc.close();
	}
}
