public class Aluno {
	//atributos, privados:
	private int matricula;
	private String nome;
	private String dataNascimento;
	//construtor. 
	public Aluno(int matricula, String nome, String dataNascimento){
		this.matricula = matricula;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	//Neste metodo, podemos trocar a data de nascimento de um aluno.
	public void setDataNascimento(String dataNascimento){
		this.dataNascimento = dataNascimento;
	}
	//retornamos a data de nascimento do aluno
	public String getDataNascimento(){
		return this.dataNascimento;
	}
	//Metodo pra gente alterar a matricula de algum aluno.
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}	
	//Metodo pra retornar a matricula.
	public int getMatricula(){
		return this.matricula;
	}
	//Metodo pra gente alterar a nome do aluno.
	public void setNome(String nome){
		this.nome = nome;
	}
	//Metodo pra retornar a nome.
	public String getNome(){
		return this.nome;
	}
}