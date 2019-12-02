package layeredLayout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import velocidadeMedia.CalculoVelocidadeListener;

public class VelocidadePanel {
	
	JPanel panel;
	
	public VelocidadePanel() {
		panel = new JPanel();
		panel.setLayout(new GridLayout(6, 1));
		
		JLabel label = new JLabel("Calcula a velocidade média: ");
		panel.add(label);
		
		label = new JLabel("Tempo: ");
		panel.add(label);
		
		JTextField tempo = new JTextField();
		panel.add(tempo);
		
		label = new JLabel("Distancia: ");
		panel.add(label);
		
		JTextField distancia = new JTextField();
		panel.add(distancia);
		
		JButton button = new JButton("Converter");
		panel.add(button);
		
		button.addActionListener(new CalculoVelocidadeListener(distancia, tempo));
	}
	
	public JPanel getPanel() {
		return panel;
	}
}
