package tempConverte;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ConversaoListener implements ActionListener {
	
	JTextField fonteTexto;
	TempTransform temp;
	
	public ConversaoListener(JTextField texto) {
		this.fonteTexto = texto;
		temp = new TempTransform();
	}

	@Override
	public void actionPerformed(ActionEvent e) {	
		String fTexto = this.fonteTexto.getText();
		
		if (!fTexto.isEmpty()) {
			temp.setF(Double.parseDouble(fTexto));
			
			JOptionPane.showMessageDialog(null, "A temperatura em ceusius é: " + temp.getCeusiusTemperature());			
		}
	}

}
