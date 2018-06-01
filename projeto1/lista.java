import java.util.ArrayList;
public class lista{
   public static void main( String[] args){
	   ArrayList<String> cores = new ArrayList<>();
	   cores.add("Branco");  // .add adicionar na lista
	   cores.add(0,"Vermelho"); // .add vc pode colocar qual posicao vc quer que o elemento fique
	   cores.add("Amarelo");
	   cores.add("Azul");
	   System.out.println(cores.toString());
	   
	   System.out.println("Tamanho= " + cores.size()); 
	   // .size vai puxar o tamanho do vetor
	   System.out.println("Elemento 2= " + cores.get(2)); 
	   // .get puxar quem esta na pocisao daquele vetor
	   System.out.println("Indice Branco= " + cores.indexOf("Branco"));
	   // .indexOff vai puxar qual a posicao do elemento
	   
	   cores.remove("Branco"); // .remove tira da lista
	   System.out.println(cores.toString());
	   System.out.println("Removido a cor Branco");
	   
	   System.out.println("Tem a cor amarelo ? " + cores.contains("Amarelo"));
	   System.out.println("Tem a cor Preto ? " + cores.contains("Preto"));
	   // .contains ele tras um valor bolem true ou false
   }


}