package Una;

public class professor extends funcionario {

	String titulacao;

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public professor() {
		this.codigo = 0;
		this.nome = "";
		this.titulacao = "";
	}

	public professor(int codigo, String nome, String sobrenome) {
		this.codigo = codigo;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public void mostrar() {
		System.out.println("ID:" + this.codigo + "\nNome:" + this.nome + "\nSobrenome:" + this.sobrenome + "\nTitulação:"
				+ this.titulacao);
	}
}
