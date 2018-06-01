import javax.swing.JOptionPane;
public class painel{
 public static void main(String[] args){
	 String nome = JOptionPane.showInputDialog("Qual e o seu nome");
	 // System.out.println(nome); aparecer no console o nome digitado
	 JOptionPane.showMessageDialog(null,nome);
 }
}