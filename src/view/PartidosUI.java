package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class PartidosUI extends JInternalFrame {
	private JTextField txtPartido;
	private JTextField txtNºPartido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PartidosUI frame = new PartidosUI();
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
	public PartidosUI() {
		setTitle("Partidos");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 542, 190);
		
		JPanel jpPreencher = new JPanel();
		jpPreencher.setBorder(new TitledBorder(null, "Preencher", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton btnCancelar = new JButton("Cancelar");
		
		JButton btnSalvar = new JButton("Salvar");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnSalvar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCancelar))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(jpPreencher, GroupLayout.PREFERRED_SIZE, 502, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(36, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jpPreencher, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnSalvar))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		
		JLabel jlNomePartido = new JLabel("Nome Partido:");
		
		txtPartido = new JTextField();
		txtPartido.setColumns(10);
		
		JLabel jlNºPartido = new JLabel(" Nº Partido:");
		
		txtNºPartido = new JTextField();
		txtNºPartido.setColumns(10);
		GroupLayout gl_jpPreencher = new GroupLayout(jpPreencher);
		gl_jpPreencher.setHorizontalGroup(
			gl_jpPreencher.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpPreencher.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpPreencher.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_jpPreencher.createSequentialGroup()
							.addComponent(jlNomePartido)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtPartido, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jpPreencher.createSequentialGroup()
							.addComponent(jlNºPartido)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtNºPartido)))
					.addContainerGap(117, Short.MAX_VALUE))
		);
		gl_jpPreencher.setVerticalGroup(
			gl_jpPreencher.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpPreencher.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpPreencher.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlNomePartido)
						.addComponent(txtPartido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_jpPreencher.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlNºPartido)
						.addComponent(txtNºPartido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(223, Short.MAX_VALUE))
		);
		jpPreencher.setLayout(gl_jpPreencher);
		getContentPane().setLayout(groupLayout);

	}
}
