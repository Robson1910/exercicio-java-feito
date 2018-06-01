package Atividade2;

public class ContaCorrente {
	private String nome;
	private String banco;
	private double saldo;
	private double limite;
	private double limiteEmprestimo;
	private double tarifaMensal;
	
	ContaCorrente(String nome, String banco, double limite){
		this.nome = nome;
		this.banco = banco;
		this.limite = limite;
		saldo = 0.0;
		limiteEmprestimo = limite * 5;
		tarifaMensal = limite * 0.02;
		System.out.println("Nome: " + nome + ", Banco: "+ banco + ", Limite: " + limite);
	}
	
	public boolean sacar(double valor) {
		System.out.println("Sacar");
		if(saldo >= valor) {
			saldo -= valor;
			System.out.println("Valor sacado: "+ valor);
			System.out.println("Saldo Atualizado: "+ saldo);
			return true;
		}else {
			if((saldo + limite)>=valor) {
				limite  = limite - (valor - saldo);
				saldo = 0.0;
				System.out.println("Valor sacado: "+ valor);
				System.out.println("Saldo Atualizado: "+ saldo);
				System.out.println("Limite Atualizado: "+ limite);
				return true;
			} else {
				System.out.println("Valor nao sacado: "+ valor);
				System.out.println("Saldo insuficiente: "+ saldo);
				System.out.println("Limite: "+ limite);
				return false;
			}
		}
	}
	
	public void depositar (double valor) {
		System.out.println("Depositar");
		System.out.println("Saldo anterior: "+ saldo);
		saldo += valor;
		System.out.println("Saldo Atualizado: "+ saldo);
	}
	
	public boolean solicitarEmprestimo (double valor) {
	System.out.println("Solicitar Emprestimo");
	if(limiteEmprestimo>=valor) {
		saldo +=valor;
		limiteEmprestimo -=valor;
		System.out.println("Emprestimo aprovado, novo saldo: "+ saldo);
		return true;
	}else {
		System.out.println("Emprestimo nao aprovado, saldo: "+ saldo);
		System.out.println("Limite disponivel para emprestimo: "+ limiteEmprestimo);
		return false;
	}
	}
	
	public void tarifaConta() {
		System.out.println("Tarifa Mensal");
		saldo -= tarifaMensal;
		System.out.println("Saldo Atualizado: "+ saldo);
	
	}
	
	public void verSaldo() {
	 System.out.println("Saldo atual: "+ saldo);
	}		
}
