package Una;

public class secretaria extends funcionario {
	String especialidade;

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public secretaria() {
		this.codigo = 0;
		this.nome = "";
		this.especialidade = "";
	}

	public secretaria(int codigo, String nome, String sobrenome) {
		this.codigo = codigo;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public void mostrar() {
		System.out.println("ID:" + this.codigo + "\nNome:" + this.nome + "\nSobrenome:" + this.sobrenome
				+ "\nEspecialidade:" + this.especialidade);
	}
}
