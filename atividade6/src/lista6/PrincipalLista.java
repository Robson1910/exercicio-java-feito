package lista6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Lista simples dinamica
 * @author Max do Val Machado
 * @version 2 01/2015
 */
class PrincipalLista {
	public static void main(String[] args) throws IOException {
		System.out.println("=== LISTA DINAMICA SIMPLESMENTE ENCADEADA ===");
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		Lista lista = new Lista();
		lista.inserirInicio(1);
		lista.inserirInicio(0);
		lista.inserirFim(4);
		lista.inserirFim(5);
		lista.inserir(2, 2);
		lista.inserir(3, 3);
		lista.inserir(6, 6);
		lista.inserir(-1, 0);
		lista.inserirFim(7);
		lista.inserirFim(8);
		lista.inserirFim(10);
		lista.inserirFim(11);
		lista.inserirFim(12);
		lista.inserirFim(13);
		System.out.println("Digite um numero que vai no final da lista: ");
		String palavra = br.readLine();
		lista.inserirFim(Integer.valueOf(palavra));
		System.out.println("Digite um numero que vai no inicio da lista: ");
		palavra = br.readLine();
		lista.inserirInicio(Integer.valueOf(palavra));
		
		lista.mostrar();
		System.out.println("Maior numero da lista: "+ lista.maior());
		System.out.println("Menor numero da lista: "+ lista.menor());
		System.out.println("Soma: "+ lista.soma());
		System.out.println("Media: "+ lista.media());
		System.out.println("Quantidade de pares: "+ lista.pares());
		lista.salvarArquivo();

		System.out.print("Apos insercoes: ");
		lista.mostrar();
		int x1 = lista.remover(3);
		int x2 = lista.remover(2);
		int x3 = lista.removerFim();
		int x4 = lista.removerInicio();
		int x5 = lista.remover(0);
		int x6 = lista.remover(4);
		System.out.print("Apos remocoes (" +x1+ ", " +x2+ ", " +x3+ ", " +x4+ ", " +x5+ ", " +x6+ "): ");
		lista.inserirFim(9); lista.mostrar();
	}
}
