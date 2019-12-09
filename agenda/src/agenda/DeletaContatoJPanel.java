package agenda;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DeletaContatoJPanel extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private static DeletaContatoJPanel singleInstance = null;
	private JFrame frame;

	private DeletaContatoJPanel(JFrame frame) {
		this.frame = frame;
		
		setLayout(new GridLayout(4,1));
		setBounds(0, 50, 830, 400);
		
		JLabel label = new JLabel("Idx para deletar");
		add(label);
		
		JTextField position = new JTextField();
		add(position);
		
		JButton button = new JButton("Confirmar");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ListaContatoPanel.getInstace(frame).deleteContato(Integer.valueOf(position.getText().toString()));
				
				frame.getLayeredPane().moveToFront(ListaContatoPanel.getInstace(frame));
				frame.getLayeredPane().setComponentZOrder(ListaContatoPanel.getInstace(frame), 0);
				
				ListaContatoPanel.getInstace(frame).setVisible(true);
				AdicionaContatoJPanel.getInstace(frame).setVisible(false);
				DeletaContatoJPanel.getInstace(frame).setVisible(false);
			}
		});
		add(button);
		
		setOpaque(true);
		
	}
	
	public static DeletaContatoJPanel getInstace(JFrame frame) {
		if (singleInstance == null) {
			synchronized (DeletaContatoJPanel.class) {
				singleInstance = new DeletaContatoJPanel(frame);
			}
		}
		return singleInstance;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getLayeredPane().moveToFront(DeletaContatoJPanel.getInstace(frame));
		frame.getLayeredPane().setComponentZOrder(DeletaContatoJPanel.getInstace(frame), 0);
		
		DeletaContatoJPanel.getInstace(frame).setVisible(true);
		AdicionaContatoJPanel.getInstace(frame).setVisible(false);
		ListaContatoPanel.getInstace(frame).setVisible(false);
	}
	
}
