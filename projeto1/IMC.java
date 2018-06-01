import javax.swing.JOptionPane;
public class IMC{
  public static void main(String[] args){
	 String peso = JOptionPane.showInputDialog("Qual seu peso em quilograma?");
	 String altura = JOptionPane.showInputDialog("Qual sua altura em metros?");
	 
	 double pesoEmQuilogramas = Double.parseDouble(peso);
	 double alturaEmMetros = Double.parseDouble(altura);
	 double imc = pesoEmQuilogramas/(alturaEmMetros* alturaEmMetros);
	 
	 String msg = (imc >= 20 && imc <= 25) ? " peso ideal " : " fora do peso";
	 msg = "IMC = "+imc + " \n " + msg;
	 JOptionPane.showMessageDialog(null,msg); 
    }
}