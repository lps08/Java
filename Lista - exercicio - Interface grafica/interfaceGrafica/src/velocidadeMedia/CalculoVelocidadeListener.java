package velocidadeMedia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalculoVelocidadeListener implements ActionListener {
	
	JTextField distancia, tempo;
	
	public CalculoVelocidadeListener(JTextField distancia, JTextField tempo) {
		this.distancia = distancia;
		this.tempo = tempo;
	}	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String distanciaT = this.distancia.getText();
		String tempoT = this.tempo.getText();
		
		if (!distanciaT.isEmpty() && !tempoT.isEmpty()) {
			VelocidadeMedia vm = new VelocidadeMedia(Double.valueOf(distanciaT), Double.valueOf(tempoT));
			JOptionPane.showMessageDialog(null, "A velocidade média e: " + vm.getVelocidadeMedia());
		}
	}

}
