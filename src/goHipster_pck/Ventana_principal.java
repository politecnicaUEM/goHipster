package goHipster_pck;

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
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.ButtonGroup;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class Ventana_principal extends JFrame {

	private JPanel contentPane;
	private JCheckBox chckbxPeinado;
	private JCheckBox chckbxGafasPastas;
	private JCheckBox chckbxBigote;
	private JCheckBox chckbxBarbita;
	private JCheckBox chckbxBotnPajarita;
	private JPanel panel_sexo;
	private JRadioButton rdbtnHombre;
	private JRadioButton rdbtnMujer;
	private JRadioButton rdbtnOtro;
	private JButton btnCara_1;
	private JPanel panel_botones;
	private JButton btnCara_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTabbedPane panel_pestanias;
	private JTabbedPane tabbedPane;
	private JTabbedPane tbl_nohipster;
	private JLabel lblNoHipster;
	private JLabel lblHipster;
	private JPanel panel_features;
	// private JPanel panelBlinkHipster;
	private JTextArea txtrComentarios;
	private JTextPane Panel_Result;
	private String comments;
	private JScrollPane scrCaracteristicas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_principal frame = new Ventana_principal();
					frame.setLocationRelativeTo(null); // centrar ventana
					frame.setResizable(false); // bloquea cambio de tamaño
					frame.setVisible(true);
					frame.setTitle("goHipster");

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana_principal() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				Ventana_principal.class.getResource("/iconos/0iconFrame.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 0, 0));

		// CONTENEDOR DE CARACTERÍSTICAS - FEATURES *****************
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

		// PANEL DE COMPLEMETOS - CHECKBOXS - GridBagConstrain *****************
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

		chckbxPeinado = new JCheckBox("peinado");
		panel_checkbox.add(chckbxPeinado);

		chckbxGafasPastas = new JCheckBox("gafas pastas");
		panel_checkbox.add(chckbxGafasPastas);

		chckbxBigote = new JCheckBox("bigote");
		panel_checkbox.add(chckbxBigote);

		chckbxBarbita = new JCheckBox("barbita");
		panel_checkbox.add(chckbxBarbita);

		chckbxBotnPajarita = new JCheckBox("pajarita");
		panel_checkbox.add(chckbxBotnPajarita);

		// PANEL DE SEXO - RADIOBUTTON - GridBagConstrain - *****************
		panel_sexo = new JPanel();
		GridBagConstraints gbc_panel_sexo = new GridBagConstraints();
		gbc_panel_sexo.fill = GridBagConstraints.BOTH;
		gbc_panel_sexo.insets = new Insets(0, 0, 5, 0);
		gbc_panel_sexo.gridx = 1;
		gbc_panel_sexo.gridy = 0;
		panel_features.add(panel_sexo, gbc_panel_sexo);
		panel_sexo.setLayout(new BoxLayout(panel_sexo, BoxLayout.Y_AXIS));

		rdbtnHombre = new JRadioButton("hombre");
		rdbtnHombre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				checkGenero(); // chequea el genero para poner complemetos
				btnCara_1.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0MaleHipster@Low.png")));
				btnCara_1.setMargin(new Insets(0, 0, 0, 0));

				btnCara_2.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0Reset@Low.png")));
				btnCara_2.setMargin(new Insets(0, 0, 0, 0));

			}
		});

		buttonGroup.add(rdbtnHombre);
		panel_sexo.add(rdbtnHombre);

		rdbtnMujer = new JRadioButton("mujer");
		rdbtnMujer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				checkGenero(); // chequea el genero para poner complemetos
				btnCara_1.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0HipsterGirl@Low.png")));
				btnCara_1.setMargin(new Insets(0, 0, 0, 0));

				btnCara_2.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0Reset@Low.png")));
				btnCara_2.setMargin(new Insets(0, 0, 0, 0));

			}
		});
		buttonGroup.add(rdbtnMujer);
		panel_sexo.add(rdbtnMujer);

		rdbtnOtro = new JRadioButton("otro");
		buttonGroup.add(rdbtnOtro);
		panel_sexo.add(rdbtnOtro);

		panel_botones = new JPanel();

		// PANEL DE BOTONCARAS - ButtonFaces *****************

		GridBagConstraints gbc_panel_botones = new GridBagConstraints();
		gbc_panel_botones.fill = GridBagConstraints.BOTH;
		gbc_panel_botones.gridx = 1;
		gbc_panel_botones.gridy = 1;
		panel_features.add(panel_botones, gbc_panel_botones);

		// BOTON 1 - CONFIRMAR
		btnCara_1 = new JButton("");
		btnCara_1.setIcon(new ImageIcon(Ventana_principal.class
				.getResource("/iconos/0unknown@Low.png")));
		btnCara_1.setMargin(new Insets(0, 0, 0, 0));
		panel_botones.add(btnCara_1);
		btnCara_1.setToolTipText("Confirmar");
		btnCara_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (rdbtnHombre.isSelected() || rdbtnMujer.isSelected()
						|| rdbtnOtro.isSelected()) {

					// METODOS BOTON CONFIRMAR
					checkSelecction();
					Imprime_Panel_Result();

				} else {
					JOptionPane.showMessageDialog(rdbtnHombre,
							"Seleccione algún género por favor.");

				}

			}
		});

		// BOTON 2 - CANCELAR
		btnCara_2 = new JButton("");
		btnCara_2.setIcon(new ImageIcon(Ventana_principal.class
				.getResource("/iconos/Male-User.png")));
		btnCara_2.setMargin(new Insets(0, 0, 0, 0));
		panel_botones.add(btnCara_2);
		btnCara_2.setToolTipText("Cancelar");

		// PANEL PESTAÑAS - JTabbedPane \contentPane *****************
		panel_pestanias = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(panel_pestanias);

		lblHipster = new JLabel(new ImageIcon(
				Ventana_principal.class
						.getResource("/iconos/Annoying-Hipster@High.png")));

		panel_pestanias.addTab(
				"Hipster",
				new ImageIcon(Ventana_principal.class
						.getResource("/iconos/Male-User@Low.png")), lblHipster,
				null);

		lblNoHipster = new JLabel(new ImageIcon(
				Ventana_principal.class
						.getResource("/iconos/Male-User@High.png")));
		tbl_nohipster = new JTabbedPane(JTabbedPane.TOP);

		// Pestaña No-Hipster
		panel_pestanias.addTab(
				"non hipster",
				new ImageIcon(Ventana_principal.class
						.getResource("/iconos/Male-User@Low.png")),
				lblNoHipster, null);

		// ***************************************************

		// PANEL DE COMENTARIOS - JScrollPane\JTextArea
		// *****************
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		JScrollPane scrComentarios = new JScrollPane();
		contentPane.add(scrComentarios);
		txtrComentarios = new JTextArea();
		txtrComentarios.setText("Escribe un comentario...");
		scrComentarios.setViewportView(txtrComentarios);
		txtrComentarios.addMouseListener(new MouseAdapter() {

			// Borra textArea al hacer click
			public void mouseClicked(MouseEvent e) {
				txtrComentarios.setText("");
			}
		});

		Panel_Result = new JTextPane();
		Panel_Result.setEditable(false);
		contentPane.add(Panel_Result);

		// METODO DEL BOTON RESET <<<----------------
		btnCara_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				unCheckAll();
				Panel_Result.setText("Resultado: \n");
				txtrComentarios.setText("Escribe un comentario...");

			}
		});

	}

	// METODO IMPRIME CARACTERÍSTICAS A PANEL_RESULT
	// **********************************************************
	// Comprueba el género para mostrar nombre complemento correcto

	private void Imprime_Panel_Result() {
		String comentarios = "";

		// --------------------------------------------------
		// Bloque de control de rdbtHombre

		if (rdbtnHombre.isSelected()) {
			comentarios += rdbtnHombre.getText() + " \n";

			if (chckbxPeinado.isSelected()) {
				comentarios += "con peinado" + "\n";
			} else {
				comentarios += "";
			}
			if (chckbxGafasPastas.isSelected()) {
				comentarios += "con sus gafa pasta" + "\n";
			} else {
				comentarios += "";
			}
			if (chckbxBigote.isSelected()) {
				comentarios += "con bigote" + "\n";
			} else {
				comentarios += "";
			}
			if (chckbxBarbita.isSelected()) {
				comentarios += "con Barba" + "\n";
			} else {
				comentarios += "";
			}
			if (chckbxBotnPajarita.isSelected()) {
				comentarios += "con pajaríta" + "\n";
			} else {
				comentarios += "";
			}
			if (!txtrComentarios.getText().equals("Escribe un comentario...")) {
				comentarios += txtrComentarios.getText();
			}

			Panel_Result.setText(" Características:\n**********************\n"
					+ comentarios);

		} // <------------- FIN de control de rdbtnHombre

		// <------------- INICIO Control de rdbtnMujer

		else if (rdbtnMujer.isSelected()) {

			comentarios += rdbtnMujer.getText() + " \n";
			if (chckbxPeinado.isSelected()) {
				comentarios += "con peinado chica" + "\n";
			} else {
				comentarios += "";
			}
			if (chckbxGafasPastas.isSelected()) {
				comentarios += "con sus gafa pasta" + "\n";
			} else {
				comentarios += "";
			}
			if (chckbxBigote.isSelected()) {
				comentarios += "con lazo" + "\n";
			} else {
				comentarios += "";
			}
			if (chckbxBarbita.isSelected()) {
				comentarios += "con corbata" + "\n";
			} else {
				comentarios += "";
			}
			if (chckbxBotnPajarita.isSelected()) {
				comentarios += "con bufanda" + "\n";
			} else {
				comentarios += "";
			}
			if (!txtrComentarios.getText().equals("Escribe un comentario...")) {
				comentarios += txtrComentarios.getText();
			}

			Panel_Result.setText(" Características:\n**********************\n"
					+ comentarios);

		} // <------------- FIN de control de rdbtnMujer

	} // <------------- FIN Método Imprime_Panel_Result()

	// --------------------------------------------------
	// METODO DE DESELECCIÓN DE CARACTERÍSTICAS
	// ---------------------------------------------------
	private void unCheckAll() {

		chckbxPeinado.setSelected(false);
		chckbxGafasPastas.setSelected(false);
		chckbxBigote.setSelected(false);
		chckbxBarbita.setSelected(false);
		chckbxBotnPajarita.setSelected(false);
		buttonGroup.clearSelection();
		btnCara_1.setIcon(new ImageIcon(Ventana_principal.class
				.getResource("/iconos/0unknown@Low.png")));

	}

	// ******************************************************
	// METODO DE VERIFICACIÓN DE GÉNERO - CAMBIA NOMBRE COMPLEMENTOS
	// Si el genero es femino, cambio nombre a complementos

	private void checkGenero() {

		if (rdbtnHombre.isSelected()) {
			chckbxBigote.setText("bigote");
			chckbxBarbita.setText("barbita");
			chckbxBotnPajarita.setText("pajarita");
		} else if (rdbtnMujer.isSelected()) {
			chckbxBigote.setText("lazo");
			chckbxBarbita.setText("corbata");
			chckbxBotnPajarita.setText("bufanda");

		}

	}

	// ***************************************************
	// MÉTODO COMPROBACIÓN DE SELECCIONES - MUESTRA IMÁGEN
	// chckbxPeinado - chckbxBarbita - chckbxGafasPastas -
	// chckbxBigote - chckbxBotnPajarita

	// **************************************************
	// MUESTRA IMÁGEN SEGÚN GÉNERO
	private void checkSelecction() {

		// IMAGENES PARA HOMBRE
		if (rdbtnHombre.isSelected()) {

			// check 1 ITEM
			if (chckbxPeinado.isSelected()) {

				lblHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/1HipsterPeinado@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));

			} else if (chckbxGafasPastas.isSelected()) {

				lblHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/1HipsterGafas@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			} else if (chckbxBigote.isSelected()) {
				lblHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/1HipsterBigote@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			} else if (chckbxBarbita.isSelected()) {

				lblHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/1HipsterBarba@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));

			} else if (chckbxBotnPajarita.isSelected()) {

				lblHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/1HipsterPajarita@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));

			}

			// Check 2 ITEM - opciones con barba
			else if (chckbxBarbita.isSelected() && chckbxPeinado.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_0_1HipsterBarbaPelo@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));

			} else if (chckbxBarbita.isSelected()
					&& chckbxGafasPastas.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_0_2HipsterBarbaGafas@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));

			} else if (chckbxBarbita.isSelected() && chckbxBigote.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_0_3HipsterBarbaBigote@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			}

			// OJO cuando pongo else
			if (chckbxBarbita.isSelected() && chckbxBotnPajarita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_0_4HipsterBarbaPajarita@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			}

			// opciones con peinado
			if (chckbxPeinado.isSelected() && chckbxGafasPastas.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_1_1HipsterPeloGafas@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			} else if (chckbxPeinado.isSelected() && chckbxBigote.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_1_2HipsterPeloBigote@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			} else if (chckbxPeinado.isSelected() && chckbxBarbita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_1_3HipsterPeloBarba@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			} else if (chckbxPeinado.isSelected()
					&& chckbxBotnPajarita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_1_4HipsterPeloPajarita@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			}

			// opciones con BIGOTE
			if (chckbxBigote.isSelected() && chckbxPeinado.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_2_1HipsterBigotePelo@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			} else if (chckbxBigote.isSelected()
					&& chckbxGafasPastas.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_2_2HipsterBigoteGafas@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			} else if (chckbxBigote.isSelected() && chckbxBarbita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_2_3HipsterBigoteBarba@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			} else if (chckbxBigote.isSelected()
					&& chckbxBotnPajarita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_2_4HipsterBigotePajarita@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			}

			// opciones GAFAS
			else if (chckbxGafasPastas.isSelected()
					&& chckbxBarbita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_3_3HipsterGafasBarba@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			} else if (chckbxGafasPastas.isSelected()
					&& chckbxBotnPajarita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_3_4HipsterGafasPajarita@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			}

			// COMPRUEBA LOS DE 3 ITEMS ***********************
			// opciones con PEINADO
			if (chckbxPeinado.isSelected() && chckbxGafasPastas.isSelected()
					&& chckbxBigote.isSelected()) {
				lblHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/3_0_1PeloGafasBigote@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			} else if (chckbxPeinado.isSelected()
					&& chckbxGafasPastas.isSelected()
					&& chckbxBarbita.isSelected()) {

				lblHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/3_0_2PeloGafasBarba@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			} else if (chckbxPeinado.isSelected()
					&& chckbxGafasPastas.isSelected()
					&& chckbxBotnPajarita.isSelected()) {
				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/3_0_3PeloGafasPajarita@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			}
			// opciones con GAFAS
			if (chckbxGafasPastas.isSelected() && chckbxBigote.isSelected()
					&& chckbxBarbita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/3_1_1GafasBigoteBarba@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));

			} else if (chckbxGafasPastas.isSelected()
					&& chckbxBigote.isSelected()
					&& chckbxBotnPajarita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/3_1_3GafasBigotePajarita@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));

			}
			// chekea combis BIGOTE
			if (chckbxBigote.isSelected() && chckbxBarbita.isSelected()
					&& chckbxBotnPajarita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/3_2_1BigoteBarbaPajarita@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));

			}

			// COMPRUEBA LOS DE 4 ITEMS ***********************
			if (chckbxPeinado.isSelected() && chckbxGafasPastas.isSelected()
					&& chckbxBigote.isSelected() && chckbxBarbita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/4_1_1PeinadoGafasBigoteBarba@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));

			} else if (chckbxPeinado.isSelected()
					&& chckbxGafasPastas.isSelected()
					&& chckbxBigote.isSelected()
					&& chckbxBotnPajarita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/4_1_2PeinadoGafasBigotePajarita@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));

			} else if (chckbxPeinado.isSelected()
					&& chckbxGafasPastas.isSelected()
					&& chckbxBarbita.isSelected()
					&& chckbxBotnPajarita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/4_1_3PeinadoGafasBarbaPajarita@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));

			} else if (chckbxPeinado.isSelected() && chckbxBigote.isSelected()
					&& chckbxBarbita.isSelected()
					&& chckbxBotnPajarita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/4_1_4PeinadoBigoteBarbaPajarita@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));

			}
			if (chckbxGafasPastas.isSelected() && chckbxBigote.isSelected()
					&& chckbxBarbita.isSelected()
					&& chckbxBotnPajarita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/4_2_1GafasBigoteBarbaPajarita@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));

			}

			// COMPRUEBA LOS DE 5 ITEMS ***********************
			if (chckbxPeinado.isSelected() && chckbxGafasPastas.isSelected()
					&& chckbxBigote.isSelected() && chckbxBarbita.isSelected()
					&& chckbxBotnPajarita.isSelected()) {

				lblHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0HipsterTotal@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			}
		} // <------- FIN IMAGENES HOMBRE

		// ***************************************
		// **************************************
		// INICIO de IMAGENES MUJER
		if (rdbtnMujer.isSelected()) {

			// check 1 ITEM
			if (chckbxPeinado.isSelected()) {

				lblHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/1_1GirlHipsterPelo@Big.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0chicaHIpster.png")));

			}

			// else {
			// lblHipster.setIcon(new ImageIcon(Ventana_principal.class
			// .getResource("/iconos/Annoying-Hipster@High.png")));

			if (chckbxGafasPastas.isSelected()) {

				lblHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/1_4GirlHipsterGafas@Big.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0chicaHIpster.png")));
			}

			// else {
			// lblHipster.setIcon(new ImageIcon(Ventana_principal.class
			// .getResource("/iconos/Annoying-Hipster@High.png")));
			// }
			if (chckbxBigote.isSelected()) {
				lblHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/1_2GirlHipsterLazo@Big.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0chicaHIpster.png")));
			}
			// else {
			// lblHipster.setIcon(new ImageIcon(Ventana_principal.class
			// .getResource("/iconos/Annoying-Hipster@High.png")));
			// }
			if (chckbxBarbita.isSelected()) {

				lblHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/1_6GirlHipsterCorbata@Big.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0chicaHIpster.png")));

			}
			// else {
			// lblHipster.setIcon(new ImageIcon(Ventana_principal.class
			// .getResource("/iconos/Annoying-Hipster@High.png")));
			// }
			if (chckbxBotnPajarita.isSelected()) {

				lblHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/1_5GirlHipsterBufanda@Big.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0chicaHIpster.png")));

			}
			// else {
			// lblHipster.setIcon(new ImageIcon(Ventana_principal.class
			// .getResource("/iconos/Annoying-Hipster@High.png")));
			// }

			// Check 2 ITEM - opciones con barba /corbata
			if (chckbxBarbita.isSelected() && chckbxPeinado.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_3GirlHipsterPeloCorbata@Big.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			}

			if (chckbxBarbita.isSelected() && chckbxGafasPastas.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_2HipsterGirl_CorbataGafas@Big.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			}

			if (chckbxBarbita.isSelected() && chckbxBigote.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_0_3HipsterBarbaBigote@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			}
			// corbata y lazo
			if (chckbxBarbita.isSelected() && chckbxBotnPajarita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_3HipsterGirl_CorbataLazo@Big.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			}

			// opciones con peinado
			if (chckbxPeinado.isSelected() && chckbxGafasPastas.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_3HipsterGirl_PeloGafas@Big.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			}
			if (chckbxPeinado.isSelected() && chckbxBigote.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_4HipsterGirl_PeloLazo@Big.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			}
			if (chckbxPeinado.isSelected() && chckbxBarbita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_3GirlHipsterPeloCorbata@Big.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			}
			if (chckbxPeinado.isSelected() && chckbxBotnPajarita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_4GirlHipsterPeloBufanda@Big.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			}

			// opciones con BIGOTE /lazo
			if (chckbxBigote.isSelected() && chckbxPeinado.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_4HipsterGirl_PeloLazo@Big.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			}
			if (chckbxBigote.isSelected() && chckbxGafasPastas.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_2HipsterGirl_LazoGafas@Big.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			}
			if (chckbxBigote.isSelected() && chckbxBarbita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_3HipsterGirl_CorbataLazo@Big.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			}
			if (chckbxBigote.isSelected() && chckbxBotnPajarita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_3HipsterGirl_LazoGafas@Big.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			}

			// opciones GAFAS
			if (chckbxGafasPastas.isSelected() && chckbxBarbita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_2HipsterGirl_CorbataGafas@Big.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			}
			if (chckbxGafasPastas.isSelected()
					&& chckbxBotnPajarita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_4HipsterGirl_GafasBufanda@Big.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			}

			// COMPRUEBA LOS DE 3 ITEMS ***********************
			// opciones con PEINADO
			if (chckbxPeinado.isSelected() && chckbxGafasPastas.isSelected()
					&& chckbxBigote.isSelected()) {
				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/3_2GirlHipsterPeloLazoGafas@Big.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			}
			if (chckbxPeinado.isSelected() && chckbxGafasPastas.isSelected()
					&& chckbxBarbita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/3_4HipsterGirl_PeinadoGafasCorbata@Big.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			}
			if (chckbxPeinado.isSelected() && chckbxGafasPastas.isSelected()
					&& chckbxBotnPajarita.isSelected()) {
				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/3_2GirlHipsterPeloGafasBufanda@Big.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));
			}
			// opciones con GAFAS
			if (chckbxGafasPastas.isSelected() && chckbxBigote.isSelected()
					&& chckbxBarbita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_5HipsterGirl_LazoGafasCorbata@Big.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));

			}
			if (chckbxGafasPastas.isSelected() && chckbxBigote.isSelected()
					&& chckbxBotnPajarita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/2_5HipsterGirl_LazoGafasBufanda@Big.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0DefaultNONHipster@High.png")));

			}
			// chekea combis BIGOTE
			if (chckbxBigote.isSelected() && chckbxBarbita.isSelected()
					&& chckbxBotnPajarita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/3_3HipsterGirl_GorroGafasBufanda@Big.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0chicaHIpster.png")));

			}

			// COMPRUEBA LOS DE 4 ITEMS ***********************
			if (chckbxPeinado.isSelected() && chckbxGafasPastas.isSelected()
					&& chckbxBigote.isSelected() && chckbxBarbita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/4_2HipsterGirl_PeloLazoGafasCorbata@Big.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0chicaHIpster.png")));

			}
			if (chckbxPeinado.isSelected() && chckbxGafasPastas.isSelected()
					&& chckbxBigote.isSelected()
					&& chckbxBotnPajarita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/4_3HipsterGirl_PeinadoGafasLazoBufanda@Big.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0chicaHIpster.png")));

			}
			if (chckbxPeinado.isSelected() && chckbxGafasPastas.isSelected()
					&& chckbxBarbita.isSelected()
					&& chckbxBotnPajarita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/4_1HipsterGirl_PeloLazoGafasBufanda@Big.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0chicaHIpster.png")));

			}
			if (chckbxPeinado.isSelected() && chckbxBigote.isSelected()
					&& chckbxBarbita.isSelected()
					&& chckbxBotnPajarita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/4_1_4PeinadoBigoteBarbaPajarita@High.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0chicaHIpster.png")));

			}
			if (chckbxGafasPastas.isSelected() && chckbxBigote.isSelected()
					&& chckbxBarbita.isSelected()
					&& chckbxBotnPajarita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/4_1HipsterGirl_PeloLazoGafasBufanda@Big.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0chicaHIpster.png")));

			}

			// COMPRUEBA LOS DE 5 ITEMS ***********************
			if (chckbxPeinado.isSelected() && chckbxGafasPastas.isSelected()
					&& chckbxBigote.isSelected() && chckbxBarbita.isSelected()
					&& chckbxBotnPajarita.isSelected()) {

				lblHipster
						.setIcon(new ImageIcon(
								Ventana_principal.class
										.getResource("/iconos/4_2HipsterGirl_PeloLazoGafasCorbata@Big.png")));

				lblNoHipster.setIcon(new ImageIcon(Ventana_principal.class
						.getResource("/iconos/0chicaHIpster.png")));
			}

		} // <------ FIN IMÁGENES MUJER

	}// <------ FIN checkSelection

} // <------ FIN VentanaPrincipal

