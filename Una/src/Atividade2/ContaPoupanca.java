package Atividade2;

public class ContaPoupanca {
	private String nome;
	private String banco;
	private double saldo;


	ContaPoupanca(String nome, String banco){
		this.nome = nome;
		this.banco = banco;
		saldo = 0.0;	
		System.out.println("Nome: " + nome + ", Banco: "+ banco );
	}

	public boolean sacar(double valor) {
		System.out.println("Sacar");
		if(saldo >= valor) {
			saldo -= valor;
			System.out.println("Valor sacado: "+ valor);
			System.out.println("Saldo Atualizado: "+ saldo);
			return true;
		} else {
			System.out.println("Valor nao sacado: "+ valor);
			System.out.println("Saldo insuficiente: "+ saldo);
			return false;
		}
	}

	public void depositar (double valor) {
		System.out.println("Depositar");
		System.out.println("Saldo anterior: "+ saldo);
		saldo += valor;
		System.out.println("Saldo Atualizado: "+ saldo);
	}
	
	public void verSaldo() {
		 System.out.println("Saldo atual: "+ saldo);
		}
	public void inserirRedimento () {
		saldo *= 1.005;
		System.out.println("Redimento de saldo: "+ saldo);
	}
}
