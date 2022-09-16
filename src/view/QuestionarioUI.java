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

public class QuestionarioUI extends JInternalFrame {
	private JTextField txtPesquisa;
	private JTextField txtCandidato;
	private JTextField txtCPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestionarioUI frame = new QuestionarioUI();
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
	public QuestionarioUI() {
		setTitle("Questionário");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 451, 266);
		
		JPanel jpPreencher = new JPanel();
		jpPreencher.setBorder(new TitledBorder(null, "Preencher", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton btnCancelar = new JButton("Cancelar");
		
		JButton btnSalvar = new JButton("Salvar");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(jpPreencher, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(btnSalvar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCancelar)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jpPreencher, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnSalvar))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		
		JLabel jlPesquisa = new JLabel("Pesquisa:");
		
		JLabel jlCandidato = new JLabel("Candidato:");
		
		JLabel jlCPF = new JLabel("CPF Eleitor:");
		
		txtPesquisa = new JTextField();
		txtPesquisa.setColumns(10);
		
		txtCandidato = new JTextField();
		txtCandidato.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setColumns(10);
		GroupLayout gl_jpPreencher = new GroupLayout(jpPreencher);
		gl_jpPreencher.setHorizontalGroup(
			gl_jpPreencher.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpPreencher.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpPreencher.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jpPreencher.createSequentialGroup()
							.addComponent(jlPesquisa)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtPesquisa, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jpPreencher.createSequentialGroup()
							.addComponent(jlCandidato)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtCandidato))
						.addGroup(gl_jpPreencher.createSequentialGroup()
							.addComponent(jlCPF)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtCPF)))
					.addContainerGap(68, Short.MAX_VALUE))
		);
		gl_jpPreencher.setVerticalGroup(
			gl_jpPreencher.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpPreencher.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpPreencher.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlPesquisa)
						.addComponent(txtPesquisa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_jpPreencher.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlCandidato)
						.addComponent(txtCandidato, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_jpPreencher.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlCPF)
						.addComponent(txtCPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(74, Short.MAX_VALUE))
		);
		jpPreencher.setLayout(gl_jpPreencher);
		getContentPane().setLayout(groupLayout);

	}

}
