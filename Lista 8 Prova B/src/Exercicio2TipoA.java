import java.util.Scanner;

public class Exercicio2TipoA {
	/* 
	 * Faça um método em Java que recebe uma String e retorna um inteiro contendo o número de vezes
que o caractere 'A' aparece na String recebida.
	 */
	public static char string(char c) {
		if (c >= 'a' && c <= 'z'){
			c = (char) (c - 32);
		}
		return c;
	}
	public static boolean letraa (char c){
		c = string(c);
		return (c == 'a' || c == 'A' );
	}
	public static int conta (String s){
		int resp = 0;
		for (int i = 0; i < s.length(); i++){
			if (letraa(s.charAt(i)) == true){
				resp++;
			}
		}
		return resp;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Escreve uma palavra: ");
		String s = sc.nextLine();
		int a = conta(s);
		System.out.println("Quantidade de A: " + a);
		sc.close();
	}
}
