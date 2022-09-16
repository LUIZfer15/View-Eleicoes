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

public class PesquisasUI extends JInternalFrame {
	private JTextField txtPesquisa;
	private JTextField txtVaga;
	private JTextField txtCidade;
	private JTextField txtEstado;
	private JTextField txtDataPesquisa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PesquisasUI frame = new PesquisasUI();
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
	public PesquisasUI() {
		setTitle("Pesquisas");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		
		JPanel jpPreencher = new JPanel();
		jpPreencher.setBorder(new TitledBorder(null, "Preencher", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton btnCancelar = new JButton("Cancelar");
		
		JButton btnSalvar = new JButton("Salvar");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jpPreencher, GroupLayout.PREFERRED_SIZE, 412, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(12, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(254, Short.MAX_VALUE)
					.addComponent(btnSalvar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCancelar)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jpPreencher, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnSalvar))
					.addContainerGap())
		);
		
		JLabel jlPesquisa = new JLabel("Pesquisa:");
		
		JLabel jlVaga = new JLabel("Vaga:");
		
		txtPesquisa = new JTextField();
		txtPesquisa.setColumns(10);
		
		txtVaga = new JTextField();
		txtVaga.setColumns(10);
		
		JLabel jlCidade = new JLabel("Cidade:");
		
		JLabel jlEstado = new JLabel("Estado:");
		
		JLabel jlDataPesquisa = new JLabel("Data da Pesquisa:");
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		
		txtEstado = new JTextField();
		txtEstado.setColumns(10);
		
		txtDataPesquisa = new JTextField();
		txtDataPesquisa.setColumns(10);
		GroupLayout gl_jpPreencher = new GroupLayout(jpPreencher);
		gl_jpPreencher.setHorizontalGroup(
			gl_jpPreencher.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpPreencher.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpPreencher.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_jpPreencher.createSequentialGroup()
							.addComponent(jlPesquisa)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtPesquisa, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jpPreencher.createSequentialGroup()
							.addComponent(jlVaga)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtVaga))
						.addGroup(gl_jpPreencher.createSequentialGroup()
							.addComponent(jlCidade)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtCidade))
						.addGroup(gl_jpPreencher.createSequentialGroup()
							.addComponent(jlEstado)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtEstado))
						.addGroup(gl_jpPreencher.createSequentialGroup()
							.addComponent(jlDataPesquisa)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtDataPesquisa)))
					.addContainerGap(133, Short.MAX_VALUE))
		);
		gl_jpPreencher.setVerticalGroup(
			gl_jpPreencher.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpPreencher.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpPreencher.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlPesquisa)
						.addComponent(txtPesquisa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_jpPreencher.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlVaga)
						.addComponent(txtVaga, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_jpPreencher.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlCidade)
						.addComponent(txtCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_jpPreencher.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlEstado)
						.addComponent(txtEstado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_jpPreencher.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlDataPesquisa)
						.addComponent(txtDataPesquisa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(40, Short.MAX_VALUE))
		);
		jpPreencher.setLayout(gl_jpPreencher);
		getContentPane().setLayout(groupLayout);

	}

}
