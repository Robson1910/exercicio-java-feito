package Atividade2;

public class Questao1 {

	public static void main(String[] args) {
		Habitante lucas = new Habitante(200.0,18);
		Habitante ana = new Habitante(100.0,17);
		Habitante julio = new Habitante(300.0,19);
		Cidade BeloHorizonte = new Cidade();
		BeloHorizonte.inseirHabitante(ana);
		BeloHorizonte.inseirHabitante(lucas);
		BeloHorizonte.inseirHabitante(julio);
		System.out.println("Maior Salario e: "+ BeloHorizonte.getMaiorSalario());
		System.out.println("Salario medio: "+ BeloHorizonte.getMediaSalario());
	}
}
