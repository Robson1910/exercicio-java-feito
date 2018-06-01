package projeto;
import java.util.*;
public class Atividade3 { 
    public static void perimetro() {
	Scanner teclado = new Scanner(System.in); 
	float a,b,c;
	System.out.println("Digite perimetro do retangulo\n");  
	System.out.println("Digite altura");
	a=teclado.nextFloat();
	System.out.println("Digite base");
	b=teclado.nextFloat();
	System.out.println("Resultado: " +(c=2*(a+b))+"\n");
    } 
      public static void area(){
      Scanner teclado = new Scanner(System.in); 
      float a,b,c;
      System.out.println("Digite area do retangulo\n");  
      System.out.println("Digite altura");
      a=teclado.nextFloat();
      System.out.println("Digite base");
      b=teclado.nextFloat();
      System.out.println("Resultado: " +(c= a*b)+"\n");
      }
        public static void farenheit(){
        Scanner teclado = new Scanner(System.in); 
        int a,b;
        System.out.println("Digite temperatura em farenheit");  
        a=teclado.nextInt();
        System.out.println("Temperatura em celsius: "+(b=5*(a-32)/9));
        }
          public static void celsius(){
          Scanner teclado = new Scanner(System.in); 
          int a,b;
          System.out.println("Digite temperatura em celsius");  
          a=teclado.nextInt();
          System.out.println("Temperatura em farenheit: "+(b=(9*a/5)+32));
          }
 public static void main(String[] args){
	perimetro();
	area();
	farenheit();
	celsius();
 }
}
