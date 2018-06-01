import java.util.*;
import java.util.Random;
public class desafio{
    public static void main(String[] args){
	Scanner teclado = new Scanner(System.in);
	int a;
	System.out.println("Digite seu palpite");
	a=teclado.nextInt();
	int [] dado1 = {1,2,3,4,5,6};
	int [] dado2 = {1,2,3,4,5,6};
	
	Random r = new Random();
	int indiceFace = r.nextInt(dado1.length);
	int face = dado1[indiceFace];
	int indiceNipe = r.nextInt (dado2.length);
	int nipe = dado2[indiceNipe];
	int carta = face + nipe;
    System.out.println(carta);	 
	
	 if(a==carta){
		System.out.println("Palpite certo");
	 } else{
			System.out.println("Palpite errado");
	    }
	} 
}
