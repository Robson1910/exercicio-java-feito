
public class PrincipalLista7 {
	public static void main(String[] args) {
		System.out.println(" ==== PILHA ESTATICA ====");
		Lista7 pilha = new Lista7();
		pilha.inserir(0);
		pilha.inserir(1);
		pilha.inserir(2);
		pilha.inserir(3);
		pilha.inserir(4);
		pilha.inserir(5);
		System.out.print("Apos insercoes: ");
		pilha.mostrar();
		int a = pilha.remover();
		int b = pilha.remover();
		int c = pilha.remover();
		System.out.print("Apos as remocoes (" + a + "," + b + "," + c + "): ");
		pilha.mostrar();
	}
}


