package agenda;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	private static MenuPanel singleInstace = null;
	
	private MenuPanel(JFrame frame) {
		
		setLayout(new FlowLayout());
		setBounds(0, 0, 830, 500);
		
		JLabel label = new JLabel("Agenda");
		add(label);
		
		JButton buttonAddContato = new JButton("Adicionar contato");
		buttonAddContato.addActionListener(AdicionaContatoJPanel.getInstace(frame));
		add(buttonAddContato);
		
		JButton buttonExcluirContato = new JButton("Excluir contato");
		buttonExcluirContato.addActionListener(DeletaContatoJPanel.getInstace(frame));
		add(buttonExcluirContato);
		
		JButton buttonListaContato = new JButton("Ver lista de contato");
		buttonListaContato.addActionListener(ListaContatoPanel.getInstace(frame));
		add(buttonListaContato);
		
		JButton buttonSairContato = new JButton("Sair");
		buttonSairContato.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		add(buttonSairContato);
		
		AdicionaContatoJPanel.getInstace(frame).setVisible(false);
		DeletaContatoJPanel.getInstace(frame).setVisible(false);
		ListaContatoPanel.getInstace(frame).setVisible(false);
		
		setVisible(true);
		setOpaque(true);
	}
	
	public static MenuPanel getInstace(JFrame frame) {
		if (singleInstace == null) {
			synchronized (MenuPanel.class) {
				singleInstace = new MenuPanel(frame);
			}
		}
		return singleInstace;
	}

}
