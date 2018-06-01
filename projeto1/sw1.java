import java.util.*;
public class sw1 {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
float n1,n2, resultado;
char op;

System.out.println("  _________________________        ");
System.out.println("  |                       |       ");
System.out.println("  | Escolha a operacao    |       ");
System.out.println("  | Soma [ + ]            |        ");
System.out.println("  | Subtrair [ - ]        |        ");
System.out.println("  | Dividir [ / ]         |        ");
System.out.println("  | Multiplicar [ * ]     |       ");
System.out.println("  |_______________________| \n       ");

op= sc.nextLine().charAt(0);

System.out.println("\nEscreva o primeiro numero:");
n1=sc.nextFloat();
System.out.println("Escreva o segundo numero:");
n2=sc.nextFloat();


switch( op )
{
	case'+': 
resultado=n1+n2;
System.out.println("A soma dos dois numeros sera: "+resultado);
	break;
	
	case'-':
resultado=n1-n2;
System.out.println("A subtracao dos dois numeros sera: "+resultado);
break;

	case'*':
resultado=n1*n2;
System.out.println("A multiplicacao dos dois numeros sera: "+resultado);
break;

    case'/':
resultado=n1/n2;
System.out.println("A divisão dos dois numeros sera: " + resultado);
break;
    default:
    System.out.println("Operacao invalida");
}
   
	
	}}