package joguinho;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class joguinho extends JFrame {
	
	ImageIcon Icontempestade = new ImageIcon (getClass().getResource("tempestade.gif"));
	
    JLabel Lfundo = new JLabel (Icontempestade);
	
	public joguinho (){
		editarJanela();
	}
	
	public void editor () {
		Lfundo.setBounds(0, 0, 800,336 );
	}
	
	 public void editarJanela(){
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setSize(800, 336);
		 setLocationRelativeTo(null);
		 setVisible(true);
		 setLayout(null);
		 add(Lfundo);
	 }

	public static void main(String[] args) {
		
           new joguinho();
	}

}
