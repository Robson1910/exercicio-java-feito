
public class PrincipalPilha {
	
		public static void main(String[] args) throws Exception {
		System.out.println(" ==== PILHA ESTATICA ====");
		Pilha pilha = new Pilha();
		pilha.inserir(0);
		pilha.inserir(1);
		pilha.inserir(2);
		pilha.inserir(3);
		pilha.inserir(4);
		pilha.inserir(5);
		System.out.print("Apos insercoes: ");
		pilha.mostrar();
		int x1 = pilha.remover();
		int x2 = pilha.remover();
		int x3 = pilha.remover();
		System.out.print("Apos as remocoes (" + x1 + "," + x2 + "," + x3 + "): ");
		pilha.mostrar();
		}
		}

