package menu;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Menu {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Calculo do delta");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300, 200));
		
		frame.getContentPane().setLayout(new GridLayout(4, 1));
		
		JLabel label = new JLabel("Clique na operação desejada");
		frame.getContentPane().add(label);
		
		JButton buttonTemp = new JButton("Transform F to C");
		frame.getContentPane().add(buttonTemp);
		buttonTemp.addActionListener(new TempListener());
		
		JButton buttonDelta = new JButton("Delta calculator");
		frame.getContentPane().add(buttonDelta);
		buttonDelta.addActionListener(new DeltaListener());
		
		JButton buttonAS = new JButton("Average speed");
		frame.getContentPane().add(buttonAS);
		buttonAS.addActionListener(new AverageSpeedListener());
		
		//exibe a janelaE
		frame.pack();
		frame.setVisible(true);


	}

}
