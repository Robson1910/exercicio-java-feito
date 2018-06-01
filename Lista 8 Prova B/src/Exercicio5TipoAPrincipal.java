
public class Exercicio5TipoAPrincipal {
	/*
   Sabendo que uma FILA é uma estrutura na qual devemos garantir que o primeiro elemento que
entra é o primeiro a sair. Descreva (crie uma classe) uma fila baseada na classe lista e usando os
métodos void inserirFim(int) e int removerInicio().
	 */
	public static void main(String[] args) {
		System.out.println(" ==== PILHA ESTATICA ====");
		Exercicio5TipoA fila = new Exercicio5TipoA(10);
		fila.inserir(2);
		fila.inserir(3);
		fila.inserir(4);
		fila.inserir(5);
		System.out.print("Apos insercoes: ");
		fila.mostrar();
		int x1 = fila.remover();
		System.out.print("\n"+"Apos as remocoes (" + x1 +  "): ");
		fila.mostrar();
	}
}
