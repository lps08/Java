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
		setBounds(0, 50, 830, 450);
		
		tableModel = new DefaultTableModel();
		//tableModel.addColumn("idx");
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
		
		ListaContatoPanel.getInstace(frame).setVisible(true);
		AdicionaContatoJPanel.getInstace(frame).setVisible(false);
		DeletaContatoJPanel.getInstace(frame).setVisible(false);
		
	}
	
	public void addContato(String nome, String numero, String email) {
		tableModel.insertRow(posicao, new Object[] {nome, numero, email});
		posicao += 1;
	}
	
	public void deleteContato(String nome) {
		for (int i = 0; i < tableModel.getRowCount(); i++) {
			if (tableModel.getValueAt(i, 0).toString().equals(nome)) {
				tableModel.removeRow(i);
			}
		}
		posicao -= 1;
	}

}
