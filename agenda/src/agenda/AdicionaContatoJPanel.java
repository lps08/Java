package agenda;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AdicionaContatoJPanel extends JPanel implements ActionListener{
		
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private static AdicionaContatoJPanel singleInstace = null;

	private AdicionaContatoJPanel(JFrame frame) {
		this.frame = frame;
		
		setLayout(new GridLayout(8, 1));
		setBounds(0, 50, 800, 700);
		
		JLabel label =  new JLabel("Adicione um contato");
		add(label);
		
		label =  new JLabel("Nome: ");
		add(label);
		JTextField textoNome = new JTextField();
		add(textoNome);
		
		label =  new JLabel("Telefone: ");
		add(label);
		JTextField textoCell = new JTextField();
		add(textoCell);
		
		label =  new JLabel("Email: ");
		add(label);
		JTextField textoEmail = new JTextField();
		add(textoEmail);
		
		JButton buttonConfirmar = new JButton("Adicionar");
		buttonConfirmar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ListaContatoPanel.getInstace(frame).addContato(textoNome.getText().toString(), textoCell.getText().toString(), textoEmail.getText().toString());
				frame.getLayeredPane().moveToFront(ListaContatoPanel.getInstace(frame));
				frame.getLayeredPane().setComponentZOrder(ListaContatoPanel.getInstace(frame), 0);
			}
		});
		add(buttonConfirmar);
		
		setOpaque(true);
	}
	
	public static AdicionaContatoJPanel getInstace(JFrame frame) {
		if (singleInstace == null) {
			synchronized (AdicionaContatoJPanel.class) {
				singleInstace = new AdicionaContatoJPanel(frame);
			}
		}
		return singleInstace;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getLayeredPane().moveToFront(AdicionaContatoJPanel.getInstace(frame));
		frame.getLayeredPane().setComponentZOrder(AdicionaContatoJPanel.getInstace(frame), 0);
	}	
}
