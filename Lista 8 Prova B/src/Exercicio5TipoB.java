
public class Exercicio5TipoB {
	private Lista l;	
	private int cont;
	public Exercicio5TipoB(int tamanho) {
		l = new Lista(tamanho);
		cont=0;
	}
	public void inserir(int x){
		l.inserirFim(x);
		cont++;
	}
	public int remover(){
		int aux;
		aux = l.removerFim();
		cont--;
		return aux;
	}
	public void mostrar(){
		Lista aux = new Lista(cont);
		for(int i=0; i<cont; i++ ){
			int temp;
			temp=l.removerFim();
			aux.inserirFim(temp);
		}
		aux.mostrar();
		for(int i=0; i<cont; i++){
			int temp;
			temp=aux.removerFim();
			l.inserirFim(temp);
		}
	}
}