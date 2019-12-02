package layeredLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class DeltaSelectorListener implements ActionListener{
	
	private JFrame frame;
	
	public DeltaSelectorListener(JFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		frame.getLayeredPane().getComponent(2).setVisible(false);
		frame.getLayeredPane().getComponent(1).setVisible(false);
		frame.getLayeredPane().getComponent(0).setVisible(true);
	}
}
