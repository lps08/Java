package menu;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import tempConverte.ConversaoListener;

public class TempListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JFrame frame = new JFrame("Conversor");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300, 200));
		
		frame.getContentPane().setLayout(new GridLayout(3, 1));
		
		JLabel label = new JLabel("Digite a temp em F: ");
		frame.getContentPane().add(label);
		
		JTextField texto = new JTextField();
		frame.getContentPane().add(texto);
		
		JButton button = new JButton("Converter");
		frame.getContentPane().add(button);
		
		button.addActionListener(new ConversaoListener(texto));
		
		//exibe a janelaE
		frame.pack();
		frame.setVisible(true);
	}
}
