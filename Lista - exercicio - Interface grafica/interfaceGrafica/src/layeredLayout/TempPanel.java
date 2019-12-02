package layeredLayout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import tempConverte.ConversaoListener;

public class TempPanel {
	
	private JPanel panel;
	
	public TempPanel() {
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(3, 1));
		
		JLabel label = new JLabel("Digite a temp em F: ");
		panel.add(label);
		
		JTextField texto = new JTextField();
		panel.add(texto);
		
		JButton button = new JButton("Converter");
		panel.add(button);
		
		button.addActionListener(new ConversaoListener(texto));
	}
	
	public JPanel getPanel() {
		return panel;
	}
}
