package interfaceGrafica;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalculaVelocidadeMedia implements ActionListener {
	
	JLabel label;
	JTextField tempo;
	JTextField distancia;
	JButton botao;
	
	public CalculaVelocidadeMedia() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300, 300));
		
		frame.getContentPane().setLayout(new GridLayout(6,1));
		
		label = new JLabel("Cálculo da velocidade média");
		frame.getContentPane().add(label);
		
		label = new JLabel("Distancia");
		frame.getContentPane().add(label);
		
		distancia = new JTextField();
		frame.getContentPane().add(distancia);
		
		label = new JLabel("Tempo");
		frame.getContentPane().add(label);
		
		tempo = new JTextField();
		frame.getContentPane().add(tempo);
		
		botao = new JButton("Calcular!");
		botao.addActionListener(this);
		frame.getContentPane().add(botao);
		
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new CalculaVelocidadeMedia();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Double valorTemp = Double.valueOf(tempo.getText());
		Double valorDistancia = Double.valueOf(distancia.getText());
		
		Double velocidadeMedia = valorDistancia / valorTemp;

		JOptionPane.showMessageDialog(null, "O delta é: " + velocidadeMedia);
	}

}
