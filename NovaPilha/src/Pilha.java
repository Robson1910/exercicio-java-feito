/**
 * Pilha dinamica
 * @author Max do Val Machado
 * @version 2 01/2015
 */
public class Pilha {
	private Celula topo;

	/**
	 * Construtor da classe que cria uma fila sem elementos.
	 */
	public Pilha() {
		topo = null;
	}


	/**
	 * Insere elemento na pilha (politica FILO).
	 * @param x int elemento a inserir.
	 */
	public void inserir(int x) {
		Celula tmp = new Celula(x);
		tmp.prox = topo;
		topo = tmp;
      tmp = null;
	}

	/**
	 * Remove elemento da pilha (politica FILO).
	 * @return Elemento removido.
	 */
	public int remover(){
		if (topo == null) {
			System.out.println("Erro ao remover!");
         System.exit(1);
		}

		int resp = topo.elemento;
      Celula tmp = topo;
		topo = topo.prox;
      tmp.prox = null;
      tmp = null;
		return resp;
	}


	/**
	 * Mostra os elementos separados por espacos, comecando do topo.
	 */
	public void mostrar() {
		System.out.print("[ ");
		
		for(Celula i = topo; i != null; i = i.prox){
			System.out.print(i.elemento + " ");
      }

		System.out.println("] ");
	}
	
}
