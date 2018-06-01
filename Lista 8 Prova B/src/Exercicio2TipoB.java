import java.util.Scanner;
public class Exercicio2TipoB {
	// Faça um método em Java que recebe uma String e retorna um inteiro contendo o número de vezes
	// que o caractere 'B' aparece na String recebida.
	public static char string(char c) {
		if (c >= 'a' && c <= 'z'){
			c = (char) (c - 32);
		}
		return c;
	}
	public static boolean letrab (char c){
		c = string(c);
		return (c == 'b' || c == 'B' );
	}
	public static int contb (String s){
		int resp = 0;
		for (int i = 0; i < s.length(); i++){
			if (letrab(s.charAt(i)) == true){
				resp++;
			}
		}
		return resp;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Escreve uma palavra: ");
		String s = sc.nextLine();
		int b = contb(s);
		System.out.println("Quantidade de B: " + b);
		sc.close();
	}
}