import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;

import java.awt.FlowLayout;

import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.BoxLayout;

import java.awt.Scrollbar;

import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.TextArea;

import javax.swing.JButton;

import java.awt.Component;

import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;

import javax.swing.Box;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;




 
public class GoHipster extends JFrame {
	String TextoPoner = "";
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextPane CuadroTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GoHipster frame = new GoHipster();
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
	public GoHipster() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 391);
		getContentPane().setLayout(new GridLayout(2, 2, 0, 0));

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "features", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));

		JCheckBox chckbxGafasPasta = new JCheckBox("Gafas Pasta");
		if (chckbxGafasPasta.isSelected()){


		}
		chckbxGafasPasta.setHorizontalAlignment(SwingConstants.LEFT);
		panel_4.add(chckbxGafasPasta);

		JCheckBox chckbxBarbita = new JCheckBox("Barbita");
		chckbxBarbita.setHorizontalAlignment(SwingConstants.LEFT);
		panel_4.add(chckbxBarbita);

		JCheckBox chckbxTupe = new JCheckBox("Tupe");
		chckbxTupe.setHorizontalAlignment(SwingConstants.LEFT);
		panel_4.add(chckbxTupe);

		JCheckBox chckbxBotonCuello = new JCheckBox("Bot\u00F3n cuello");
		chckbxBotonCuello.setHorizontalAlignment(SwingConstants.LEFT);
		panel_4.add(chckbxBotonCuello);

		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));

		JPanel panel_8 = new JPanel();
		panel_5.add(panel_8, BorderLayout.NORTH);
		panel_8.setLayout(new BoxLayout(panel_8, BoxLayout.Y_AXIS));

		JRadioButton radioButtonHombre = new JRadioButton("hombre");
		buttonGroup.add(radioButtonHombre);
		panel_8.add(radioButtonHombre);
		radioButtonHombre.setSelected(true);
		radioButtonHombre.setVerticalAlignment(SwingConstants.TOP);
		radioButtonHombre.setHorizontalAlignment(SwingConstants.LEFT);

		JRadioButton radioButtonMujer = new JRadioButton("mujer");
		buttonGroup.add(radioButtonMujer);
		panel_8.add(radioButtonMujer);
		radioButtonMujer.setVerticalAlignment(SwingConstants.TOP);
		radioButtonMujer.setHorizontalAlignment(SwingConstants.LEFT);

		JRadioButton radioButtonOtros = new JRadioButton("otros");
		buttonGroup.add(radioButtonOtros);
		panel_8.add(radioButtonOtros);
		radioButtonOtros.setVerticalAlignment(SwingConstants.TOP);
		radioButtonOtros.setHorizontalAlignment(SwingConstants.LEFT);

		JPanel panel_9 = new JPanel();
		panel_5.add(panel_9, BorderLayout.SOUTH);

		JButton buttonHombre = new JButton("");

		panel_9.add(buttonHombre);
		buttonHombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonHombre.setIcon(new ImageIcon("C:\\Users\\Miguel\\Google Drive\\UEM\\Workspace\\VentanaGoHipster\\PNGs\\Annoying-Hipster.png"));
		buttonHombre.setMargin(new Insets(0, 0, 0, 0));

		JButton buttonMujer = new JButton("");
		buttonMujer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		panel_9.add(buttonMujer);
		buttonMujer.setIcon(new ImageIcon("C:\\Users\\Miguel\\Google Drive\\UEM\\Workspace\\VentanaGoHipster\\PNGs\\Male-User.png"));
		buttonMujer.setMargin(new Insets(0, 0, 0, 0));


		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel_1.add(tabbedPane);

		JPanel pestaniaHipster = new JPanel();
		tabbedPane.addTab("hipster", new ImageIcon("C:\\Users\\Miguel\\Google Drive\\UEM\\Workspace\\VentanaGoHipster\\PNGs\\Annoying-Hipster@Low.png"), pestaniaHipster, null);
		tabbedPane.setBackgroundAt(0, SystemColor.inactiveCaption);

		JLabel lblToBeA = new JLabel("To be a Hipster");
		lblToBeA.setBackground(SystemColor.activeCaption);
		GroupLayout gl_pestaniaHipster = new GroupLayout(pestaniaHipster);
		gl_pestaniaHipster.setHorizontalGroup(
				gl_pestaniaHipster.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pestaniaHipster.createSequentialGroup()
						.addGap(57)
						.addComponent(lblToBeA)
						.addContainerGap(153, Short.MAX_VALUE))
				);
		gl_pestaniaHipster.setVerticalGroup(
				gl_pestaniaHipster.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pestaniaHipster.createSequentialGroup()
						.addGap(54)
						.addComponent(lblToBeA)
						.addContainerGap(69, Short.MAX_VALUE))
				);
		pestaniaHipster.setLayout(gl_pestaniaHipster);

		JPanel pestaniaNonHipster = new JPanel();
		pestaniaNonHipster.setToolTipText("");
		tabbedPane.addTab("non hipster", new ImageIcon("C:\\Users\\Miguel\\Google Drive\\UEM\\Workspace\\VentanaGoHipster\\PNGs\\Male-User@Low.png"), pestaniaNonHipster, null);

		JLabel lblNotToBe = new JLabel("Not to be a Hipster");
		GroupLayout gl_pestaniaNonHipster = new GroupLayout(pestaniaNonHipster);
		gl_pestaniaNonHipster.setHorizontalGroup(
				gl_pestaniaNonHipster.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pestaniaNonHipster.createSequentialGroup()
						.addGap(54)
						.addComponent(lblNotToBe)
						.addContainerGap(111, Short.MAX_VALUE))
				);
		gl_pestaniaNonHipster.setVerticalGroup(
				gl_pestaniaNonHipster.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pestaniaNonHipster.createSequentialGroup()
						.addGap(59)
						.addComponent(lblNotToBe)
						.addContainerGap(64, Short.MAX_VALUE))
				);
		pestaniaNonHipster.setLayout(gl_pestaniaNonHipster);

		JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));

		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane);

		JTextArea cuadroEscribible = new JTextArea();
		cuadroEscribible.setText("Introduce un texto...\n");

		cuadroEscribible.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				cuadroEscribible.setText("");
			}


		});

		scrollPane.setViewportView(cuadroEscribible);
		String Textolibre = cuadroEscribible.getText();

		JPanel cuadroMuestraTexto = new JPanel();
		cuadroMuestraTexto.setBackground(Color.DARK_GRAY);
		getContentPane().add(cuadroMuestraTexto);
		cuadroMuestraTexto.setLayout(new GridLayout(1, 0, 0, 0));

		CuadroTexto = new JTextPane();
		CuadroTexto.setForeground(new Color(255, 255, 255));
		CuadroTexto.setBackground(Color.DARK_GRAY);
		cuadroMuestraTexto.add(CuadroTexto);

		buttonHombre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// Aqui meto el codigo del evento del click

				String Textolibre = "\n" + cuadroEscribible.getText();

				//	String TextoPoner = "";
				TextoPoner = "";

				if (chckbxGafasPasta.isSelected()){
					String Gafas ="Con sus gafitas de pasta.\n";
					TextoPoner = Gafas;

				}
				if (chckbxBarbita.isSelected()){
					String Barba = "Con su barbita arreglada.\n";
					TextoPoner = TextoPoner + Barba;

				}
				if (chckbxTupe.isSelected()){
					String Tupe = "Con su tupe de Mané.\n";
					TextoPoner = TextoPoner + Tupe;
				}
				if (chckbxBotonCuello.isSelected()){
					String Boton = "Con su boton to molon.\n";
					TextoPoner = TextoPoner + Boton;
				}

				CuadroTexto.setText(TextoPoner + Textolibre);

			}
		});
		buttonMujer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// Aqui meto el codigo del evento click del boton buttonMujer. 
				cuadroEscribible.setText("");
				CuadroTexto.setText("");

			}
		});

	}

}
