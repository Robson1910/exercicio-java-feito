package Atividade2;

import java.util.ArrayList;
import java.util.List;

public class Cidade {
	private List<Habitante> populacao;
	double maiorSalario;

	Cidade() {
		populacao = new ArrayList<Habitante>();
		maiorSalario = 0.0;
	}

	public void inseirHabitante(Habitante pessoa) {
		populacao.add(pessoa);
		if (pessoa.getSalario() > maiorSalario) {
			maiorSalario = pessoa.getSalario();
		}
	}

	public double getMaiorSalario() {
		return maiorSalario;
	}
	
	public double getMediaSalario() {
		if(populacao.isEmpty()) {
			return 0.0;
		}
		double total = 0.0;
		for(Habitante i: populacao) {
			total += i.getSalario();
		}
		return total/populacao.size();	
	}
}