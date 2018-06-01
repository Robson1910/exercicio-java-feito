import java.util.*;
public class aula1{
	public static void main ( String[] args){
		Scanner teclado= new Scanner(System.in);
		int a,b,c;
		System.out.println("digita a");
		a=teclado.nextInt();
		System.out.println("digita b");
		b=teclado.nextInt();
		c=a+b;
		System.out.println("Resultado "+c);
	}
}