import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MiniCalculadora extends JFrame {
	JTextField Numero1 = new JTextField();
	JTextField Numero2 = new JTextField();
	JLabel mais = new JLabel("+", SwingConstants.CENTER);
	JLabel resultado = new JLabel();
	JButton soma = new JButton("=");

	JTextField Numero3 = new JTextField();
	JTextField Numero4 = new JTextField();
	JLabel menos = new JLabel("-", SwingConstants.CENTER);
	JLabel resultado1 = new JLabel();
	JButton subtrair = new JButton("=");

	JTextField Numero5 = new JTextField();
	JTextField Numero6 = new JTextField();
	JLabel multiplicacao = new JLabel("*", SwingConstants.CENTER);
	JLabel resultado2 = new JLabel();
	JButton multiplicar = new JButton("=");

	JTextField Numero7 = new JTextField();
	JTextField Numero8 = new JTextField();
	JLabel divisao = new JLabel("/", SwingConstants.CENTER);
	JLabel resultado3 = new JLabel();
	JButton dividir = new JButton("=");

	Font fonte = new Font("Arial", Font.BOLD, 50);

	MiniCalculadora() {
		soma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1 = Double.parseDouble(Numero1.getText());
				double n2 = Double.parseDouble(Numero2.getText());
				double soma = n1 + n2;
				resultado.setText(soma + "");
			}
		});

		subtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1 = Double.parseDouble(Numero3.getText());
				double n2 = Double.parseDouble(Numero4.getText());
				double subtrair = n1 - n2;
				resultado1.setText(subtrair + "");
			}
		});

		multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1 = Double.parseDouble(Numero5.getText());
				double n2 = Double.parseDouble(Numero6.getText());
				double multiplicar = n1 * n2;
				resultado2.setText(multiplicar + "");
			}
		});

		dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1 = Double.parseDouble(Numero7.getText());
				double n2 = Double.parseDouble(Numero8.getText());
				double dividir = n1 / n2;
				resultado3.setText(dividir + "");
			}
		});

		setLayout(new GridLayout(4, 5));
		add(Numero1);
		Numero1.setFont(fonte);
		add(mais);
		mais.setFont(fonte);
		add(Numero2);
		Numero2.setFont(fonte);
		add(soma);
		soma.setFont(fonte);
		add(resultado);
		resultado.setFont(fonte);

		add(Numero3);
		Numero3.setFont(fonte);
		add(menos);
		menos.setFont(fonte);
		add(Numero4);
		Numero4.setFont(fonte);
		add(subtrair);
		subtrair.setFont(fonte);
		add(resultado1);
		resultado1.setFont(fonte);

		add(Numero5);
		Numero5.setFont(fonte);
		add(multiplicacao);
		multiplicacao.setFont(fonte);
		add(Numero6);
		Numero6.setFont(fonte);
		add(multiplicar);
		multiplicar.setFont(fonte);
		add(resultado2);
		resultado2.setFont(fonte);

		add(Numero7);
		Numero7.setFont(fonte);
		add(divisao);
		divisao.setFont(fonte);
		add(Numero8);
		Numero8.setFont(fonte);
		add(dividir);
		dividir.setFont(fonte);
		add(resultado3);
		resultado3.setFont(fonte);

		setSize(650, 300);
		setTitle("Mini Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MiniCalculadora();
	}
}
