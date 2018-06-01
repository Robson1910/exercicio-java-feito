package Atividade2;

public class Questao3 {

	public static void main(String[] args) {
		ContaCorrente corrente = new ContaCorrente("Luana", "Itau", 700.0); 
		corrente.depositar(100.0);
		corrente.sacar(300.0);
		corrente.tarifaConta();
		corrente.solicitarEmprestimo(400.0);
		corrente.verSaldo();
		System.out.println("");
		ContaPoupanca poupanca = new ContaPoupanca("Julio", "Bradesco");
		poupanca.depositar(150.0);
		poupanca.sacar(100.0);
		poupanca.verSaldo();
		poupanca.inserirRedimento();
	}
}
/* caracter�sticas elas t�m em comum: 
ambas consegue fazer mesma opera�oes como sacar e depositar
 caracter�sticas nao t�m em comum: 
 conta corrente consegue fazer mais opera�oes como solicitar emprestimo , tarifas de contra entre outros.
 conta poupanca possui redimentos .
*/
