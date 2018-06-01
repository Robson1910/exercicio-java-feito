import java.util.Scanner;
public class Exercicio3TipoB {
	/*Faça um método em Java que recebe um array de inteiros e retorna um número inteiro contendo o
soma dos valores pares contidos no array. Observe que os valores ímpares serão simplesmente
desconsiderados. */
	public static void Soma(){
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		int vet[]=new int [5];
		for(int i=0;i<5;i++){
			System.out.println("Digite o numero na posição "+(i+1)+":");
			vet[i]=sc.nextInt();
			if(vet[i]%2==0){
				soma+=vet[i];
			}
		}
		System.out.println("soma dos pares: " + soma);
		sc.close();
	}
	public static void main(String[] args) {
		Soma();
	}
}
