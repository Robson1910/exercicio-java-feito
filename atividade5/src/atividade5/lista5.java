package atividade5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class lista5 {
	public static void main(String[] args) {
		File arquivo = new File("arquivo.txt");
		try {
			FileWriter fileWriter = new FileWriter(arquivo);
			BufferedWriter escrever = new BufferedWriter(fileWriter);
			escrever.write("ola" + "\n" + "oi" + "\n" + "ei");
			escrever.close();
			fileWriter.close();
			FileReader ler = new FileReader(arquivo);
			BufferedReader lerb = new BufferedReader(ler);
			String linha = lerb.readLine();
			while (linha != null) {
				System.out.println(linha);
				System.out.println(linha.toUpperCase());
				linha = lerb.readLine();
			}
		} catch (IOException ex) {
			System.out.println("erro");
		}
	}
}
