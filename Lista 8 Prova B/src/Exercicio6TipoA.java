public class Exercicio6TipoA {
	// O que será mostrado na tela após execução do código:
	public static void main(String[] args) {
		Lista lista = new Lista(10);
		int x1, x2, x3;
		lista.inserirInicio(5);
		lista.inserirInicio(3);
		lista.inserirFim(2);
		lista.inserirFim(1);
		lista.inserir(9, 3); // (elemento, pos)
		lista.inserir(8, 2);
		x1 = lista.removerInicio();
		x2 = lista.removerFim();
		x3 = lista.remover(2);
		System.out.print("(" + x1 + ", " + x2 + ", " + x3 + "):");
		lista.mostrar();
	}
}
