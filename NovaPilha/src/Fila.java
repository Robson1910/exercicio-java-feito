/**
 * Fila dinamica
 * @author Max do Val Machado
 * @version 2 01/2015
 */
public class Fila {
	private Celula primeiro;
	private Celula ultimo;


	/**
	 * Construtor da classe que cria uma fila sem elementos (somente no cabeca).
	 */
	public Fila() {
		primeiro = new Celula();
		ultimo = primeiro;
	}


	/**
	 * Insere elemento na fila (politica FIFO).
	 * @param x int elemento a inserir.
	 */
	public void inserir(int x) {
		ultimo.prox = new Celula(x);
		ultimo = ultimo.prox;
	}


	/**
	 * Remove elemento da fila (politica FIFO).
	 * @return Elemento removido.
	 */
	public int remover(){
		if (primeiro == ultimo) {
			System.out.println("Erro ao remover!");
         System.exit(1);
		}

      Celula tmp = primeiro;
		primeiro = primeiro.prox;
		int resp = primeiro.elemento;
      tmp.prox = null;
      tmp = null;
		return resp;
	}


	/**
	 * Mostra os elementos separados por espacos.
	 */
	public void mostrar() {
		System.out.print("[ ");
		
		for(Celula i = primeiro.prox; i != null; i = i.prox) {
			System.out.print(i.elemento + " ");
		}
		
		System.out.println("] ");
	}
}
