package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class VagasUI extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VagasUI frame = new VagasUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VagasUI() {
		setBounds(100, 100, 450, 300);

	}

}
