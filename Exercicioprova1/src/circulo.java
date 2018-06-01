import java.util.Scanner;

public class circulo {
        double raio,area,perimetro;
        
        double area(){
        	area = Math.PI*Math.pow(raio, raio);      	
			return area;   	
        }   
        
        double perimetro(){
        	perimetro = Math.pow(Math.PI, Math.PI)*raio;
			return perimetro;	
        }
        
        void imprimir(){
            
            System.out.println("O círculo do raio: "
                    +raio+"\nÁrea: "+area()
                    +"\nPerimetro: "+perimetro());
        }
        
        void construtor(){
        	Scanner entrada = new Scanner(System.in);
            System.out.println("Informe o valor do raio do círculo:");
            raio = entrada.nextDouble();
           
        }
        
}
