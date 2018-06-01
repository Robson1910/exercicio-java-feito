package atividade4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
//No metodo principal, crie um menu pedindo para o usuario escolher um numero de 1 a 19. O numero
//escolhido corresponde a um dos metodos abaixo solicitados. Para o numero escolhido, faca as devidas leituras
//e chame o metodo correspondente. Voce consegue colocar esse menu dentro de uma estrutura de repeticao e,
//tambem colocar o zero para sair do programa?
public class lista4 {
	// 1. Faca um metodo que receba dois numeros inteiros e retorne o primeiro elevado pelo segundo.
	public static void numerointeiro() {
		Scanner teclado = new Scanner(System.in); 
		int a,b;  
		System.out.println("\nDigite primiero numero: ");
		a=teclado.nextInt();
		System.out.println("\nDigite segundo numero: ");
		b=teclado.nextInt();
		System.out.println( Math.pow(a,b) );
	} 
	// 2. Faca um metodo que receba uma string e retorne essa string invertida. Por exemplo, se a string de entrada
	// for ABCD, a de resposta sera DCBA.
	public static void stringinvertida() throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("\nDigite um nome:");
		String palavra = br.readLine();
		for(int i=palavra.length()-1;i>=0;i--){
			System.out.print(palavra.charAt(i));
		}
		System.out.println();
	} 
	//3 Faca um metodo que receba um numero inteiro e retorne o fatorial desse numero.
	public static void fatorial() {
		Scanner teclado = new Scanner(System.in); 
		int a,fat;
		System.out.println("\nDigite um numero:");
		a=teclado.nextInt();
		fat=1;
		for(int i=1;i<=a;i++){
			fat=fat*i;	
		}
		System.out.println("Fatorial: "+fat);
	}
	// 4 Faca um metodo que recebe um array de inteiros e retorna a soma dos elementos do mesmo.
	public static void vetorsoma() {
		Scanner teclado = new Scanner(System.in);
		int n = 0,a = 0;
		int vet[] = new int [3];
		for(int i=0;i<3;i++){
			System.out.println("\nDigite numero no vetor na posição  "+(i+1)+":");
			vet[i]=teclado.nextInt();
		}
		for(int i=0;i<3;i++){
			a+=vet[i];
		}
		System.out.println("\nSoma do vetor: "+a);
	}
	// 5 Faca um metodo que recebe um array de inteiros e retorna a media dos elementos do mesmo.
	public static void vetormedia() {
		Scanner teclado = new Scanner(System.in);
		double n = 0,a = 0;
		double vet[] = new double [3];
		for(int i=0;i<3;i++){
			System.out.println("\nDigite numero no vetor na posição  "+(i+1)+":");
			vet[i]=teclado.nextDouble();
		}
		for(int i=0;i<3;i++){
			a+=vet[i];
		}
		System.out.println("\nMedia do vetor: "+a/3);
	}
	public static void main(String[] args) throws IOException{ 
		Scanner teclado= new Scanner(System.in);
		char op; 
		do{
			System.out.println("  _____________________________ ");
			System.out.println("  |                           | ");
			System.out.println("  | Menu de opções:           | ");
			System.out.println("  | 0 - Sair                  | ");
			System.out.println("  | 1 - Elevar numero inteiro | ");
			System.out.println("  | 2 - Nome invertido        | ");
			System.out.println("  | 3 - Fatorial              | ");
			System.out.println("  | 4 - soma do vetor         |  ");
			System.out.println("  | 5 - Media do vetor        | ");
			System.out.println("  | 6 - repetição de soma     | ");
			System.out.println("  |___________________________| \n");
			op= teclado.nextLine().charAt(0);
			switch( op ) {
			case '0' :
				System.out.println("Saindo");
				break;
			case'1': 
				numerointeiro();
				break;
			case '2':
				stringinvertida();
				break;
			case '3':
				fatorial();
				break;
			case '4':
				vetorsoma();
				break;
			case '5':
				vetormedia();
				break;
			case '6':
				go();
				break;
			default:
				System.out.println("Operacao invalida");
			}
		}while(op!='0');
	}
	public static void go() {
		Scanner teclado = new Scanner(System.in); 
		int a,b,resp=0; 
		System.out.println("digite numero a");
		a=teclado.nextInt();
		System.out.println("digite numero b");
		b=teclado.nextInt();
		for(int i=0;i<a;i++){
			resp+=b;
		}
		System.out.println(resp);
	}
}




