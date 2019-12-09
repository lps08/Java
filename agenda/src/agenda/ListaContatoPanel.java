package agenda;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListaContatoPanel extends JPanel implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private static ListaContatoPanel singleInstace = null;
	private DefaultTableModel tableModel;
	private int posicao = 0;

	private ListaContatoPanel(JFrame frame) {
		this.frame = frame;
		
		setLayout(new GridLayout(2, 1));
		setBounds(0, 50, 800, 700);
		
		tableModel = new DefaultTableModel();
		tableModel.addColumn("id");
		tableModel.addColumn("Nome");
		tableModel.addColumn("Telefone");
		tableModel.addColumn("Email");
		
		JTable table = new JTable(tableModel);
		add(table);
		
		setOpaque(true);
	}
	
	public static ListaContatoPanel getInstace(JFrame frame) {
		if (singleInstace == null) {
			synchronized (ListaContatoPanel.class) {
				singleInstace = new ListaContatoPanel(frame);
			}
		}
		return singleInstace;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getLayeredPane().moveToFront(ListaContatoPanel.getInstace(frame));
		frame.getLayeredPane().setComponentZOrder(ListaContatoPanel.getInstace(frame), 0);
	}
	
	public void addContato(String nome, String numero, String email) {
		tableModel.insertRow(posicao, new Object[] {posicao, nome, numero, email});
		posicao += 1;
	}
	
	public void deleteContatp() {
		tableModel.removeRow(posicao);
		posicao -= 1;
	}

}
