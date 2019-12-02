package interfaceGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ClicarBotaoListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton fonte = (JButton)e.getSource();

		
		Long tempo = e.getWhen();
		JOptionPane.showMessageDialog(null, "fonte" + fonte + " tempo " + tempo);
	}

}