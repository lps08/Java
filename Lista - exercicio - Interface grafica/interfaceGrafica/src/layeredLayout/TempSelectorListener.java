package layeredLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class TempSelectorListener implements ActionListener {

	private JFrame frame;
	
	public TempSelectorListener(JFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		frame.getLayeredPane().getComponent(0).setVisible(false);
		frame.getLayeredPane().getComponent(2).setVisible(false);
		frame.getLayeredPane().getComponent(1).setVisible(true);
	}
}
