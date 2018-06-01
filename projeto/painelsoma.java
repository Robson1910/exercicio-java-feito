import javax.swing.JOptionPane;
public class painelsoma{
	public static void main(String[] args){
		String entrada = JOptionPane.showInputDialog("valor a");
		String saida = JOptionPane.showInputDialog("valor b");
		float a = Float.parseFloat(entrada);
		float b = Float.parseFloat(saida);
		float c = a+b;
		JOptionPane.showMessageDialog(null,c);
	}
}

  