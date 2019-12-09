package agenda;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class MainJFrame extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	public MainJFrame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(830, 500));
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.add(MenuPanel.getInstace(this), 0);
		layeredPane.add(DeletaContatoJPanel.getInstace(this), 1);
		layeredPane.add(AdicionaContatoJPanel.getInstace(this), 2);
		layeredPane.add(ListaContatoPanel.getInstace(this), 3);
		
		setLayeredPane(layeredPane);
		
		pack();
		setVisible(true);
	}

	public static void main (String[] a) {
		new MainJFrame();
	}

}
