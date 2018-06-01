import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalculadoraOperadores extends JFrame {

	JTextField Numero1 = new JTextField();
	JTextField Numero2 = new JTextField();
	JLabel mais = new JLabel(" ", SwingConstants.CENTER);
	JButton zero = new JButton("0");
	JButton mais1 = new JButton("+");
	JLabel resultado = new JLabel();
	JLabel igual = new JLabel("=", SwingConstants.CENTER);
	JButton soma = new JButton("=");
	JButton diminuir = new JButton("-");
	JButton multiplicar = new JButton("*");
	JButton dividir = new JButton("/");
	JButton Limpar = new JButton("Limpar");
	JButton um = new JButton("1");
	JButton dois = new JButton("2");
	JButton tres = new JButton("3");
	JButton quatro = new JButton("4");
	JButton cinco = new JButton("5");
	JButton seis = new JButton("6");
	JButton sete = new JButton("7");
	JButton oito = new JButton("8");
	JButton nove = new JButton("9");
	JButton fechar = new JButton("Fechar");
	JButton ponto = new JButton(",");
	JButton delete = new JButton("Apagar");
	JButton apagador = new JButton("<---");
	Font fonte = new Font("Arial", Font.BOLD, 50);
	Font fonte2 = new Font("Arial", Font.BOLD, 20);
	Font fonte3 = new Font("Arial", Font.BOLD, 30);
	boolean n1 = true;
	boolean virgula = false;
	String valor1 = "";
	String valor2 = "";

	CalculadoraOperadores() {

		diminuir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mais.setText("-");
				soma = diminuir;
				Numero2.requestFocus();
				n1 = false;
				virgula = false;
			}
		});

		mais1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mais.setText("+");
				soma = mais1;
				Numero2.requestFocus();
				n1 = false;
				virgula = false;
			}
		});

		multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mais.setText("*");
				soma = multiplicar;
				Numero2.requestFocus();
				n1 = false;
				virgula = false;
			}
		});

		dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mais.setText("/");
				soma = dividir;
				Numero2.requestFocus();
				n1 = false;
				virgula = false;
			}
		});

		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (n1) {
					valor1 += "0";
					Numero1.setText(valor1);

				} else {
					valor2 += "0";
					Numero2.setText(valor2);
				}
			}
		});

		fechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		apagador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (n1) {
					if (valor1.length() > 0) {
						String aux = valor1.substring(0, valor1.length() - 1);
						valor1 = aux;
						Numero1.setText(valor1);
					}
				} else {
					if (valor2.length() > 0) {
						String aux = valor2.substring(0, valor2.length() - 1);
						valor2 = aux;
						Numero2.setText(valor2);
					}
				}
			}
		});

		Limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Numero1.setText("");
				Numero2.setText("");
				mais.setText("");
				resultado.setText("");
				Numero1.requestFocus();
				n1 = true;
				valor1 = "";
				valor2 = "";
				virgula = false;
			}
		});

		ponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!virgula) {
					if (n1) {
						valor1 += ".";
						Numero1.setText(valor1);

					} else {
						valor2 += ".";
						Numero2.setText(valor2);
					}
					virgula = true;
				}
			}
		});

		soma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1 = Double.parseDouble(Numero1.getText());
				double n2 = Double.parseDouble(Numero2.getText());
				double a;
				if (soma == mais1) {
					a = n1 + n2;
					resultado.setText(a + "");
				}
			}
		});

		soma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1 = Double.parseDouble(Numero1.getText());
				double n2 = Double.parseDouble(Numero2.getText());
				double a;
				if (soma == diminuir) {
					a = n1 - n2;
					resultado.setText(a + "");
				}
			}
		});

		soma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1 = Double.parseDouble(Numero1.getText());
				double n2 = Double.parseDouble(Numero2.getText());
				double a;
				if (soma == multiplicar) {
					a = n1 * n2;
					resultado.setText(a + "");
				}
			}
		});

		soma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1 = Double.parseDouble(Numero1.getText());
				double n2 = Double.parseDouble(Numero2.getText());
				double a;
				if (soma == dividir) {
					a = n1 / n2;
					resultado.setText(a + "");
				}
			}
		});

		um.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (n1) {
					valor1 += "1";
					Numero1.setText(valor1);

				} else {
					valor2 += "1";
					Numero2.setText(valor2);
				}
			}
		});

		dois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (n1) {
					valor1 += "2";
					Numero1.setText(valor1);

				} else {
					valor2 += "2";
					Numero2.setText(valor2);
				}
			}
		});

		tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (n1) {
					valor1 += "3";
					Numero1.setText(valor1);

				} else {
					valor2 += "3";
					Numero2.setText(valor2);
				}
			}
		});

		quatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (n1) {
					valor1 += "4";
					Numero1.setText(valor1);

				} else {
					valor2 += "4";
					Numero2.setText(valor2);
				}
			}
		});

		cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (n1) {
					valor1 += "5";
					Numero1.setText(valor1);

				} else {
					valor2 += "5";
					Numero2.setText(valor2);
				}
			}
		});

		seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (n1) {
					valor1 += "6";
					Numero1.setText(valor1);

				} else {
					valor2 += "6";
					Numero2.setText(valor2);
				}
			}
		});

		sete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (n1) {
					valor1 += "7";
					Numero1.setText(valor1);

				} else {
					valor2 += "7";
					Numero2.setText(valor2);
				}
			}
		});

		oito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (n1) {
					valor1 += "8";
					Numero1.setText(valor1);

				} else {
					valor2 += "8";
					Numero2.setText(valor2);
				}
			}
		});

		nove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (n1) {
					valor1 += "9";
					Numero1.setText(valor1);

				} else {
					valor2 += "9";
					Numero2.setText(valor2);
				}
			}
		});

		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (n1) {
					Numero1.setText("");
					valor1 = "";
					virgula = false;
				} else {
					Numero2.setText("");
					valor2 = "";
					virgula = false;
				}
			}
		});

		setLayout(new GridLayout(5, 5));
		add(Numero1);
		Numero1.setFont(fonte);
		add(mais);
		mais.setFont(fonte);
		add(Numero2);
		Numero2.setFont(fonte);
		add(igual);
		igual.setFont(fonte);
		add(resultado);
		resultado.setFont(fonte);
		add(um);
		um.setFont(fonte3);
		add(dois);
		dois.setFont(fonte3);
		add(tres);
		tres.setFont(fonte3);
		add(Limpar);
		Limpar.setFont(fonte2);
		add(fechar);
		fechar.setFont(fonte2);
		add(quatro);
		quatro.setFont(fonte3);
		add(cinco);
		cinco.setFont(fonte3);
		add(seis);
		seis.setFont(fonte3);
		add(mais1);
		mais1.setFont(fonte);
		add(diminuir);
		diminuir.setFont(fonte);
		add(sete);
		sete.setFont(fonte3);
		add(oito);
		oito.setFont(fonte3);
		add(nove);
		nove.setFont(fonte3);
		add(multiplicar);
		multiplicar.setFont(fonte);
		add(dividir);
		dividir.setFont(fonte);
		add(ponto);
		ponto.setFont(fonte);
		add(zero);
		zero.setFont(fonte3);
		add(soma);
		soma.setFont(fonte);
		add(delete);
		delete.setFont(fonte2);
		add(apagador);
		apagador.setFont(fonte3);

		setSize(600, 400);
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String[] args) {
		new CalculadoraOperadores();

	}

}
