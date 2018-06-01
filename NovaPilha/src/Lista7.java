public class Lista7 {
	private Fila fila1;	
	private Fila fila2;
	private int cont;

	public Lista7 (){
		fila1 = new Fila();
		fila2 = new Fila();
		cont=0;
	}
	public void inserir(int elemento){
		fila1.inserir(elemento);
		cont++;
	}
	public int remover(){
		int retorno;
		for(int i=0;i<cont-1;i++){
			fila2.inserir(fila1.remover());
		}
		retorno = fila1.remover();
		cont--;
		Fila fila3=fila1;
		fila1=fila2;
		fila2=fila3;
		return retorno;
	}
	public void mostrar(){
		Fila fila3 = new Fila();
		int aux;
		for(int i=0;i<cont;i++){
			aux=fila1.remover();
			System.out.print(aux+" ");
			fila2.inserir(aux);
			fila3.inserir(aux);
		} 
		fila1=fila3;
		System.out.print("[ ");

		for(int i=0;i<cont;i++){
			aux=fila2.remover();
			System.out.print(aux+" ");
			fila3.inserir(aux);
		}
		System.out.println("] ");
		fila1=fila3; 
	} 	
}




