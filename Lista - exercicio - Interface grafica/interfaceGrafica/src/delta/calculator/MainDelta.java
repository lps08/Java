package delta.calculator;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainDelta {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Calculo do delta");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300, 200));
		
		frame.getContentPane().setLayout(new GridLayout(8, 1));
		
		JLabel label = new JLabel("Calcula o delta dado A, B, C");
		frame.getContentPane().add(label);
		
		label = new JLabel("Valor de A: ");
		frame.getContentPane().add(label);
		
		JTextField valorA = new JTextField();
		frame.getContentPane().add(valorA);
		
		label = new JLabel("Valor de B: ");
		frame.getContentPane().add(label);
		
		JTextField valorB = new JTextField();
		frame.getContentPane().add(valorB);

		label = new JLabel("Valor de C: ");
		frame.getContentPane().add(label);
		
		JTextField valorC = new JTextField();
		frame.getContentPane().add(valorC);
		
		JButton button = new JButton("Calcular");
		frame.getContentPane().add(button);
		
		button.addActionListener(new CalculoDeltaListener(valorA, valorB, valorC));
		
		//exibe a janelaE
		frame.pack();
		frame.setVisible(true);
	}

}
