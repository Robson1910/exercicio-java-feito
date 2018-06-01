import java.util.*;
import java.util.ArrayList;
public class while1{
   public static void main(String[] args) {
	   
	   ArrayList<String> produtos = new ArrayList<String>();
	   Scanner teclado= new Scanner (System.in);
	   System.out.println("Liste seus produtos : Para sair digite FIM");
	   String produto;	 
	   // .equals serve pra comparar o valor do produto com o FIM
	   while(!"FIM".equals(produto = teclado.nextLine())){
		   produtos.add(produto);		   
	   }
	   System.out.println(produtos.toString());
   }

}