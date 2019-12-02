package delta.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalculoDeltaListener implements ActionListener {
	
	JTextField a, b, c;
	
	public CalculoDeltaListener(JTextField a, JTextField b, JTextField c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String textoA = this.a.getText();
		String textoB = this.b.getText();
		String textoC = this.c.getText();
		
		if (!textoA.isEmpty() && !textoB.isEmpty() && !textoC.isEmpty()) {
			DeltaCalculator dc = new DeltaCalculator(Double.valueOf(textoA), Double.valueOf(textoB), Double.valueOf(textoC));
			JOptionPane.showMessageDialog(null, "O valor do delta é: " + dc.getDelta());
		}
	}

}
