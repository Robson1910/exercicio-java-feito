import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Gerencia {

	private static List<Aluno> lista = new ArrayList<Aluno>();
	static InputStream is = System.in;
	static InputStreamReader isr = new InputStreamReader(is);
	static BufferedReader br = new BufferedReader(isr);

	public static void inserirInicio() throws IOException{
		String dataNascimento;
		String nome;
		int matricula;
		System.out.println("\nAdicionando aluno no inicio da lista.\nDigite nome do aluno:");
		nome = br.readLine();
		System.out.println("Digite a data de nascimento:");
		dataNascimento = br.readLine();
		System.out.println("Digite a matricula do aluno:");
		matricula = Integer.parseInt(br.readLine());
		Aluno c = new Aluno(matricula,nome,dataNascimento);
		lista.add(0,c);
		System.out.println("Registrado aluno na lista!");
	}
	public static void inserirFim() throws IOException{
		String dataNascimento;
		String nome;
		int matricula;
		System.out.println("\nAdicionando aluno no fim da lista.\nDigite nome do aluno:");
		nome = br.readLine();
		System.out.println("Digite a data de nascimento:");
		dataNascimento = br.readLine();
		System.out.println("Digite a matricula do aluno:");
		matricula = Integer.parseInt(br.readLine());
		Aluno c = new Aluno(matricula,nome,dataNascimento);
		lista.add(c);
		System.out.println("Registrado aluno na lista!");
	}
	public static void removerInicio(){
		if(lista.isEmpty()){
			System.out.println("Lista de alunos está vazia nada foi removido!");
		}else{
			lista.remove(0);
			System.out.println("Primeiro aluno da lista foi removido!");
		}  
	}
	public static void removerFim(){
		if(lista.isEmpty()){
			System.out.println("Lista de alunos está vazia nada foi removido!");
		}else{
			lista.remove(lista.size()-1);
			System.out.println("Ultimo aluno da lista foi removido!");
		}  
	}
	public static void mostrarAlunos(){
		if(lista.isEmpty()){
			System.out.println("Lista de alunos vazia e nada salvo!");
		}else {
	    System.out.println("Lista de alunos salvo!");
		System.out.println("Mostrando alunos:");
		for(Aluno i:lista){
			System.out.println("Nome: " + i.getNome()+", Matricula: "+ i.getMatricula()+", Data de Nascimento: "+ i.getDataNascimento());
		}
		}
	}
	public static void salvarArquivo(){
		File arquivo = new File("Alunos.txt");
		try {
			FileWriter fileWriter = new FileWriter(arquivo);
			BufferedWriter escrever = new BufferedWriter(fileWriter);
			for(Aluno i:lista){
				escrever.write("Nome: " + i.getNome()+", Matricula: "+ i.getMatricula()+", Data de Nascimento: "+ i.getDataNascimento()+"\n");
			}
			escrever.close();
			fileWriter.close();

		} catch (IOException ex) {
			System.out.println("erro");
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner teclado= new Scanner(System.in);
		char op; 
		do{
			System.out.println("  _____________________________ ");
			System.out.println("  |                           | ");
			System.out.println("  | Cadastro de Alunos :      | ");
			System.out.println("  | 1 - Inserir Inicio        | ");
			System.out.println("  | 2 - Inserir Fim           | ");
			System.out.println("  | 3 - Remover Inicio        | ");
			System.out.println("  | 4 - Remover Fim           |  ");
			System.out.println("  | 5 - Salvar Arquivo        | ");
			System.out.println("  | 6 - Sair                  | ");
			System.out.println("  |___________________________| \n");
			op= teclado.nextLine().charAt(0);
			switch( op ) {
			case'1': 
				inserirInicio();
				break;
			case '2':
				inserirFim();
				break;
			case '3':
				removerInicio();
				break;
			case '4':
				removerFim();
				break;
			case '5':
				mostrarAlunos();
				salvarArquivo();
				break;
			case '6':
				System.out.println("Saindo do Menu");
				break;
			default:
				System.out.println("Operacao invalida");
			}
		}while(op!='6');
		teclado.close();
	}
}
