package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CandidatosUI extends JInternalFrame {
	private JTextField txtNºCandidato;
	private JTextField txtPartido;
	private JTextField txtVaga;
	private JTextField txtNome;
	private JTextField txtEstado;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CandidatosUI frame = new CandidatosUI();
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
	public CandidatosUI() {
		setTitle("Candidatos");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 576, 339);
		
		JPanel jpPreencher = new JPanel();
		jpPreencher.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Preencher", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel jlNºCandidato = new JLabel("Nº Candidato:");
		
		txtNºCandidato = new JTextField();
		txtNºCandidato.setColumns(10);
		
		JLabel jlPartido = new JLabel("Partido:");
		
		txtPartido = new JTextField();
		txtPartido.setColumns(10);
		
		JLabel jlVaga = new JLabel("Vaga:");
		
		txtVaga = new JTextField();
		txtVaga.setColumns(10);
		
		JLabel jlNome = new JLabel("Nome:");
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		
		JLabel jlEstado = new JLabel("Estado:");
		
		txtEstado = new JTextField();
		txtEstado.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Cidade:");
		
		textField = new JTextField();
		textField.setColumns(10);
		GroupLayout gl_jpPreencher = new GroupLayout(jpPreencher);
		gl_jpPreencher.setHorizontalGroup(
			gl_jpPreencher.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_jpPreencher.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpPreencher.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_jpPreencher.createSequentialGroup()
							.addComponent(jlVaga)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtVaga))
						.addGroup(gl_jpPreencher.createSequentialGroup()
							.addComponent(jlPartido)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtPartido))
						.addGroup(gl_jpPreencher.createSequentialGroup()
							.addComponent(jlNºCandidato)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtNºCandidato))
						.addGroup(gl_jpPreencher.createSequentialGroup()
							.addComponent(jlNome)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 306, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jpPreencher.createSequentialGroup()
							.addComponent(jlEstado)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtEstado))
						.addGroup(gl_jpPreencher.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField)))
					.addContainerGap(360, Short.MAX_VALUE))
		);
		gl_jpPreencher.setVerticalGroup(
			gl_jpPreencher.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpPreencher.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpPreencher.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlNome)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_jpPreencher.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlNºCandidato)
						.addComponent(txtNºCandidato, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_jpPreencher.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlPartido)
						.addComponent(txtPartido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_jpPreencher.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlVaga)
						.addComponent(txtVaga, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_jpPreencher.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlEstado)
						.addComponent(txtEstado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_jpPreencher.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		jpPreencher.setLayout(gl_jpPreencher);
		
		JButton btnCancelar = new JButton("Cancelar");
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(406, Short.MAX_VALUE)
					.addComponent(btnSalvar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCancelar)
					.addContainerGap())
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(13)
					.addComponent(jpPreencher, GroupLayout.PREFERRED_SIZE, 507, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(40, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jpPreencher, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnSalvar))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
}
