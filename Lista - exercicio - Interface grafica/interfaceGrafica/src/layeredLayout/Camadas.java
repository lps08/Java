package layeredLayout;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Camadas {
	
	JLayeredPane layeredPane;
	
	public Camadas() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300,400));
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu menu = new JMenu("Questões");
		JMenuItem q1 = new JMenuItem("Calcular o delta");
		q1.addActionListener(new DeltaSelectorListener(frame));
		menu.add(q1);
		
		JMenuItem q2 = new JMenuItem("Transformar fahrenheit para celsius");
		q2.addActionListener(new TempSelectorListener(frame));
		menu.add(q2);
		
		JMenuItem q3 = new JMenuItem("Calcular velocidade media");
		q3.addActionListener(new VelocidadeSelectorListener(frame));
		menu.add(q3);
		
		menuBar.add(menu);
		
		layeredPane = new JLayeredPane();
		layeredPane.add(new DeltaPanel().getPanel(), 0);
		layeredPane.add(new TempPanel().getPanel(), 1);
		layeredPane.add(new VelocidadePanel().getPanel(), 2);
		
		frame.setLayeredPane(layeredPane);
		frame.setJMenuBar(menuBar);
		
		frame.getLayeredPane().getComponent(0).setBounds(0, 30, 300, 300);
		frame.getLayeredPane().getComponent(1).setBounds(0, 30, 300, 300);
		frame.getLayeredPane().getComponent(2).setBounds(0, 30, 300, 300);
		
		frame.getLayeredPane().getComponent(0).setVisible(false);
		frame.getLayeredPane().getComponent(1).setVisible(false);
		frame.getLayeredPane().getComponent(2).setVisible(false);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] a) {
		new Camadas();
	}
	
}
