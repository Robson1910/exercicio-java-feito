package Una;

public class Una {

	public static void main(String[] args) {
		
		System.out.println("Quadro de Funcionarios:");
		
		System.out.println("\nProfessores");
		professor professor = new professor();
		professor.setCodigo(1);
		professor.setNome("Marcos");
		professor.setSobrenome("Silva");
		professor.setTitulacao("Bacharel");
		professor.mostrar();
		
		System.out.println("\nSecretarias");
		secretaria secretaria= new secretaria();
		secretaria.setCodigo(2);
		secretaria.setNome("Maria");
		secretaria.setSobrenome("Souza");
		secretaria.setEspecialidade("Auxiliar");
		secretaria.mostrar();
		
	}

}
