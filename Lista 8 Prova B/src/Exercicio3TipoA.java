import java.util.Scanner;

public class Exercicio3TipoA {
	/*
	 * Fa�a um m�todo em Java que recebe um array de inteiros e retorna um n�mero inteiro contendo a
soma dos valores �mpares contidos no array. Observe que os valores pares ser�o simplesmente
desconsiderados.
	 */
	public static void Soma(){
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		int vet[]=new int [5];
		for(int i=0;i<5;i++){
			System.out.println("Digite o numero na posi��o "+(i+1)+":");
			vet[i]=sc.nextInt();
			if(vet[i]%2!=0){
				soma+=vet[i];
			}
		}
		System.out.println("soma dos impares: " + soma);
		sc.close();
	}
	public static void main(String[] args) {
		Soma();
	}
}
