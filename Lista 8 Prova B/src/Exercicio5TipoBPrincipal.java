public class Exercicio5TipoBPrincipal {
	/* 
	 * Sabendo que uma PILHA é uma estrutura na qual devemos garantir que o primeiro elemento que
entra é o último a sair. Descreva (crie uma classe) uma pilha baseada na classe lista e usando os
métodos void inserirFim(int) e int removerFim(). 
	 */
	public static void main(String[] args) {
		System.out.println(" ==== PILHA ESTATICA ====");
		Exercicio5TipoB pilha = new Exercicio5TipoB(10);
		pilha.inserir(2);
		pilha.inserir(3);
		pilha.inserir(4);
		pilha.inserir(5);
		System.out.print("Apos insercoes: ");
		pilha.mostrar();
		int x1 = pilha.remover();
		System.out.print("\n"+"Apos as remocoes (" + x1 +  "): ");
		pilha.mostrar();
	}
}


