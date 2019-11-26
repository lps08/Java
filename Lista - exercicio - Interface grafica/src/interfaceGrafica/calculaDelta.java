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

public class calculaDelta implements ActionListener{
	
	JLabel label;
	JTextField campoA;
	JTextField campoB;
	JTextField campoC;
	JButton botao;
	
	public calculaDelta() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300,300));
		
		frame.getContentPane().setLayout(new GridLayout(5,1));
		
		// Adiciona uma label "Hello World" ubíqua.
		label = new JLabel("Calculo do delta:");
		frame.getContentPane().add(label);
		
		campoA = new JTextField();
		frame.getContentPane().add(campoA);
		
		campoB = new JTextField();
		frame.getContentPane().add(campoB);
		
		campoC= new JTextField();
		frame.getContentPane().add(campoC);
		
		botao = new JButton("Calcular!");
		botao.addActionListener(this);
		frame.getContentPane().add(botao);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new calculaDelta();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Double valorA = Double.valueOf(campoA.getText());
		Double valorB = Double.valueOf(campoB.getText());
		Double valorC = Double.valueOf(campoC.getText());
		
		Double delta = (valorB * valorB) - 4 * (valorA * valorC);

		JOptionPane.showMessageDialog(null, "O delta é: " + delta);
	}

}
