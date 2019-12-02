package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class HellowWorldSwing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//JOptionPane.showMessageDialog(null, "Olá meu chapa", "Notificação", JOptionPane.CLOSED_OPTION);
		
		// cria e configura a janela
		JFrame frame = new JFrame("HelloWorldSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(0, 0);
		frame.setPreferredSize(new Dimension(300, 300));
		
		frame.getContentPane().setLayout(new BorderLayout());
		
		//adiciona uma label "Hello world" ubíqua.
		JLabel label = new JLabel("Olá meu chapa");
		frame.getContentPane().add(label, BorderLayout.NORTH);
		
		//cria botao
		JButton button = new JButton("Dedada");
		button.addActionListener(new ClicarBotaoListener());
		frame.getContentPane().add(button, BorderLayout.SOUTH);

		//cria um campo de texto
		JTextField campo = new JTextField(10);
		frame.getContentPane().add(campo, BorderLayout.EAST);
		
		//cria um area para textos
		JTextArea areaTexto = new JTextArea(2, 10);
		frame.getContentPane().add(areaTexto, BorderLayout.WEST);
		
		//cria um ComboBox (parece menu drop dawn)
		String[] lista = {"um", "dois", "três"};
		JComboBox<String> combo = new JComboBox<String>(lista);
		frame.getContentPane().add(combo, BorderLayout.CENTER);
		
		//exibe a janelaE
		frame.pack();
		frame.setVisible(true);
		
		/*
		JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			System.out.println("File: " + fc.getSelectedFile());
		}
		
		fc.setVisible(true);*/
	}

}
