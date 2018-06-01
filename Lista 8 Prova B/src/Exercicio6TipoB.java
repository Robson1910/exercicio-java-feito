public class Exercicio6TipoB {
	// O que será mostrado na tela após execução do código:
	public static void main(String[] args) {
		Lista lista = new Lista(10);
		int x1, x2, x3;
		lista.inserirInicio(1);
		lista.inserirInicio(2);
		lista.inserirFim(3);
		lista.inserirFim(4);
		lista.inserir(5, 3); // (elemento, pos)
		lista.inserir(6, 2);
		x1 = lista.removerInicio();
		x2 = lista.removerFim();
		x3 = lista.remover(2);
		System.out.print("(" + x1 + ", " + x2 + ", " + x3 + "):");
		lista.mostrar();
	}
}
