package paquete_principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.JSplitPane;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import javax.swing.JTabbedPane;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Label;

public class Ventana_Principal extends JFrame {

	private JPanel contentPane;
	private JCheckBox chckbxBotnCuello;
	private JCheckBox chckbxTup;
	private JCheckBox chckbxGafasPastas;
	private JCheckBox chckbxBarbita;
	private JPanel panel_sexo;
	private JRadioButton rdbtnHombre;
	private JRadioButton rdbtnMujer;
	private JRadioButton rdbtnOtro;
	private JButton btnCara_1;
	private JPanel panel_botones;
	private JButton btnCara_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTabbedPane panel_pestañas;
	private JTabbedPane tabbedPane;
	private JTabbedPane tbl_nohipster;
	private JPanel panel_features;
	private JMenuBar menuBar;
	private JMenu mnMenu;
	private JMenuItem mntmItemIMenu;
	private JPanel panel_hipster;
	private JPanel panel_nonHipster;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_Principal frame = new Ventana_Principal();
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
	public Ventana_Principal() {
		setTitle("go Hipster go");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 371);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnMenu = new JMenu("Menu 1");
		menuBar.add(mnMenu);

		mntmItemIMenu = new JMenuItem("Item i Menu 1");
		mnMenu.add(mntmItemIMenu);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 0, 0));

		panel_features = new JPanel();
		panel_features.setBorder(new TitledBorder(null, "features",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_features);
		GridBagLayout gbl_panel_features = new GridBagLayout();
		gbl_panel_features.columnWidths = new int[] { 2 };
		gbl_panel_features.rowHeights = new int[] { 2 };
		gbl_panel_features.columnWeights = new double[] { 0.0, 0.0 };
		gbl_panel_features.rowWeights = new double[] { 0.0, 0.0 };
		panel_features.setLayout(gbl_panel_features);

		JPanel panel_checkbox = new JPanel();
		GridBagConstraints gbc_panel_checkbox = new GridBagConstraints();
		gbc_panel_checkbox.gridheight = 2;
		gbc_panel_checkbox.fill = GridBagConstraints.BOTH;
		gbc_panel_checkbox.insets = new Insets(0, 0, 5, 5);
		gbc_panel_checkbox.gridx = 0;
		gbc_panel_checkbox.gridy = 0;
		panel_features.add(panel_checkbox, gbc_panel_checkbox);
		panel_checkbox
				.setLayout(new BoxLayout(panel_checkbox, BoxLayout.Y_AXIS));

		chckbxBarbita = new JCheckBox("barbita");
		panel_checkbox.add(chckbxBarbita);

		chckbxGafasPastas = new JCheckBox("gafas pastas");
		panel_checkbox.add(chckbxGafasPastas);

		chckbxTup = new JCheckBox("tupé");
		panel_checkbox.add(chckbxTup);

		chckbxBotnCuello = new JCheckBox("botón cuello");
		panel_checkbox.add(chckbxBotnCuello);

		panel_sexo = new JPanel();
		GridBagConstraints gbc_panel_sexo = new GridBagConstraints();
		gbc_panel_sexo.fill = GridBagConstraints.BOTH;
		gbc_panel_sexo.insets = new Insets(0, 0, 5, 0);
		gbc_panel_sexo.gridx = 1;
		gbc_panel_sexo.gridy = 0;
		panel_features.add(panel_sexo, gbc_panel_sexo);
		panel_sexo.setLayout(new BoxLayout(panel_sexo, BoxLayout.Y_AXIS));

		rdbtnHombre = new JRadioButton("hombre");
		buttonGroup.add(rdbtnHombre);
		panel_sexo.add(rdbtnHombre);

		rdbtnMujer = new JRadioButton("mujer");
		buttonGroup.add(rdbtnMujer);
		panel_sexo.add(rdbtnMujer);

		rdbtnOtro = new JRadioButton("otro");
		buttonGroup.add(rdbtnOtro);
		panel_sexo.add(rdbtnOtro);

		panel_botones = new JPanel();
		GridBagConstraints gbc_panel_botones = new GridBagConstraints();
		gbc_panel_botones.fill = GridBagConstraints.BOTH;
		gbc_panel_botones.gridx = 1;
		gbc_panel_botones.gridy = 1;
		panel_features.add(panel_botones, gbc_panel_botones);

		btnCara_1 = new JButton("");
		panel_botones.add(btnCara_1);
		btnCara_1.setIcon(new ImageIcon(Ventana_Principal.class
				.getResource("/iconos/Annoying-Hipster.png")));
		btnCara_1.setMargin(new Insets(0, 0, 0, 0));

		btnCara_2 = new JButton("");
		btnCara_2.setIcon(new ImageIcon(Ventana_Principal.class
				.getResource("/iconos/Male-User.png")));
		btnCara_2.setMargin(new Insets(0, 0, 0, 0));
		panel_botones.add(btnCara_2);

		panel_pestañas = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(panel_pestañas);
		
		panel_hipster = new JPanel();
		panel_pestañas.addTab("hipster", new ImageIcon(Ventana_Principal.class.getResource("/iconos/Annoying-Hipster@Low.png")), panel_hipster, null);
		
		JLabel lblToBeA = new JLabel("to be a hipster");
		GroupLayout gl_panel_hipster = new GroupLayout(panel_hipster);
		gl_panel_hipster.setHorizontalGroup(
			gl_panel_hipster.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_hipster.createSequentialGroup()
					.addGap(77)
					.addComponent(lblToBeA)
					.addContainerGap(88, Short.MAX_VALUE))
		);
		gl_panel_hipster.setVerticalGroup(
			gl_panel_hipster.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_hipster.createSequentialGroup()
					.addContainerGap(56, Short.MAX_VALUE)
					.addComponent(lblToBeA)
					.addGap(48))
		);
		panel_hipster.setLayout(gl_panel_hipster);
		
		panel_nonHipster = new JPanel();
		panel_pestañas.addTab("No Hipster", new ImageIcon(Ventana_Principal.class.getResource("/iconos/Male-User@Low.png")), panel_nonHipster, null);
		
		JLabel lblNotToBe = new JLabel("not to be a hipster");
		GroupLayout gl_panel_nonHipster = new GroupLayout(panel_nonHipster);
		gl_panel_nonHipster.setHorizontalGroup(
			gl_panel_nonHipster.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_nonHipster.createSequentialGroup()
					.addGap(66)
					.addComponent(lblNotToBe)
					.addContainerGap(71, Short.MAX_VALUE))
		);
		gl_panel_nonHipster.setVerticalGroup(
			gl_panel_nonHipster.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_nonHipster.createSequentialGroup()
					.addGap(40)
					.addComponent(lblNotToBe)
					.addContainerGap(64, Short.MAX_VALUE))
		);
		panel_nonHipster.setLayout(gl_panel_nonHipster);

		tbl_nohipster = new JTabbedPane(JTabbedPane.TOP);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);
		JTextArea txtrEscribeAlgunComentario = new JTextArea();
		txtrEscribeAlgunComentario.setText("Escribe algun comentario");
		scrollPane.setViewportView(txtrEscribeAlgunComentario);
	}
}
