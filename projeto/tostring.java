import java.util.Arrays;
public class tostring{
  public static void main(String [] args){
	String[] paises = {"Brasil","Russia","India","China"};  
	System.out.println(Arrays.toString(paises));  
	// toString recebe um parametro () e recebe o vetor que vc quer apresentar 
    int posicao = Arrays.binarySearch(paises,"Rusia");
	System.out.println(posicao);
	// Array.binarySearch() pesquisa dentro do vetor 
	Arrays.sort(paises,0,paises.length);
	// Arrays.sort() ordenar o vetor ; .length ate a ultima posicao
	System.out.println(Arrays.toString(paises));
	Double[] valores = {1.2,2.8,4.8,5.7,6.3};
	System.out.println(valores[0].doubleValue());
	// acessar a posicao diretamente dentro do vetor
	} 
}