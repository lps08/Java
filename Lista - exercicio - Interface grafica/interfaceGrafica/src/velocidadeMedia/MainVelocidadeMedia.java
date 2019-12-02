package velocidadeMedia;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainVelocidadeMedia {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Velocidade média");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300, 200));
		
		frame.getContentPane().setLayout(new GridLayout(6, 1));
		
		JLabel label = new JLabel("Calcula a velocidade média: ");
		frame.getContentPane().add(label);
		
		label = new JLabel("Tempo: ");
		frame.getContentPane().add(label);
		
		JTextField tempo = new JTextField();
		frame.getContentPane().add(tempo);
		
		label = new JLabel("Distancia: ");
		frame.getContentPane().add(label);
		
		JTextField distancia = new JTextField();
		frame.getContentPane().add(distancia);
		
		JButton button = new JButton("Converter");
		frame.getContentPane().add(button);
		
		button.addActionListener(new CalculoVelocidadeListener(distancia, tempo));
		
		//exibe a janelaE
		frame.pack();
		frame.setVisible(true);
	}

}
