package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrincipalUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalUI frame = new PrincipalUI();
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
	public PrincipalUI() {
		setTitle("Sistema Eleitoral");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 410);
		
		JMenuBar jbPrincipal = new JMenuBar();
		setJMenuBar(jbPrincipal);
		
		JMenu jmCandidatos = new JMenu("Candidatos");
		jbPrincipal.add(jmCandidatos);
		
		JMenuItem jmiVisualizarCandidatos = new JMenuItem("Visualizar Candidatos");
		jmiVisualizarCandidatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CandidatosUI candidatos = new CandidatosUI();
				candidatos.setVisible(true);
				contentPane.add(candidatos, 0);
			}
		});
		jmCandidatos.add(jmiVisualizarCandidatos);
		
		JMenu jmPartidos = new JMenu("Partidos");
		jbPrincipal.add(jmPartidos);
		
		JMenuItem jmiVisualizarPartido = new JMenuItem("Visualizar Partidos");
		jmiVisualizarPartido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PartidosUI partido = new PartidosUI();
				partido.setVisible(true);
				contentPane.add(partido, 0);
			}
		});
		jmPartidos.add(jmiVisualizarPartido);
		
		JMenu jmPesquisas = new JMenu("Pesquisas");
		jbPrincipal.add(jmPesquisas);
		
		JMenuItem jmiVisualizarPesquisas = new JMenuItem("Visualizar Pesquisas");
		jmiVisualizarPesquisas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PesquisasUI pesquisa = new PesquisasUI();
				pesquisa.setVisible(true);
				contentPane.add(pesquisa, 0);
			}
		});
		jmPesquisas.add(jmiVisualizarPesquisas);
		
		JMenu jmQuestionário = new JMenu("Questionário");
		jbPrincipal.add(jmQuestionário);
		
		JMenuItem jmiVisualizarQuestionário = new JMenuItem("Visualizar Questionário");
		jmiVisualizarQuestionário.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuestionarioUI questionario = new QuestionarioUI();
				questionario.setVisible(true);
				contentPane.add(questionario, 0);
			}
		});
		jmQuestionário.add(jmiVisualizarQuestionário);
		
		JMenu jmVagas = new JMenu("Vagas");
		jbPrincipal.add(jmVagas);
		
		JMenuItem jmiPresidente = new JMenuItem("Presidente");
		jmVagas.add(jmiPresidente);
		
		JMenuItem jmiGovernador = new JMenuItem("Governador");
		jmVagas.add(jmiGovernador);
		
		JMenuItem jmiPrefeito = new JMenuItem("Prefeito");
		jmVagas.add(jmiPrefeito);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 588, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 316, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
	}

}
