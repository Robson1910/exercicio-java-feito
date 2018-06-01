import java.util.Scanner;
public class Exercicio1TipoB {
	/* Faça uma classe em java contendo: um metodo que recebe tres numeros inteiros e retorna o menor entre eles
	 * O metodo principal deve ler do teclado tres numeros e chamar o metodo anterior passando esses tres valores
	 * como parametro e atribuindo o retorno a uma quarta variavel.
	 * O valor dessa quarta variavel tambem deve ser mostrada na tela  */
	public static int comparacao(int a,int b, int c){
		int d;
		if(a<b&&a<c){
			d=a;
		}
		else if(b<a&&b<c){
			d=b;
		}
		else{d=c;}
		return d;	
	}
	public static void main(String[] args) {
		int num1,num2,num3,num4;
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite primeiro numero: ");
		num1 = sc.nextInt();
		System.out.println("Digite segundo numero: ");
		num2 = sc.nextInt();
		System.out.println("Digite terceiro numero: ");
		num3 = sc.nextInt();
		num4=comparacao(num1,num2,num3);
		System.out.println("menor: "+num4);
		sc.close();
	}
}
