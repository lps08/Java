package layeredLayout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import delta.calculator.CalculoDeltaListener;

public class DeltaPanel {
	
	private JPanel panel;
	
	public DeltaPanel() {
		panel = new JPanel();
		panel.setLayout(new GridLayout(8, 1));
		
		JLabel label = new JLabel("Calcula o delta dado A, B, C");
		panel.add(label);
		
		label = new JLabel("Valor de A: ");
		panel.add(label);
		
		JTextField valorA = new JTextField();
		panel.add(valorA);
		
		label = new JLabel("Valor de B: ");
		panel.add(label);
		
		JTextField valorB = new JTextField();
		panel.add(valorB);

		label = new JLabel("Valor de C: ");
		panel.add(label);
		
		JTextField valorC = new JTextField();
		panel.add(valorC);
		
		JButton button = new JButton("Calcular");
		panel.add(button);
		
		button.addActionListener(new CalculoDeltaListener(valorA, valorB, valorC));
	}
	
	public JPanel getPanel() {
		return panel;
	}

}
