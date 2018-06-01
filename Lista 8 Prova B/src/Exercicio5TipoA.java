public class Exercicio5TipoA {
	private Lista l;	
	public Exercicio5TipoA(int tamanho) {
		l = new Lista(tamanho);
	}
	public void inserir(int x){
		l.inserirFim(x);
	}
	public int remover(){
		int aux;
		aux = l.removerInicio();
		return aux;
	}
	public void mostrar(){
		l.mostrar();
	}
}

