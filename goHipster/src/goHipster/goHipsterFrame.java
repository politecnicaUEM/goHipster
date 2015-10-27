package goHipster;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.awt.Rectangle;

import javax.jws.Oneway;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLayeredPane;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Component;

import javax.swing.JTextPane;

import java.awt.Insets;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.awt.Color;

import javax.swing.border.EtchedBorder;
import javax.swing.Box;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class goHipsterFrame extends JFrame {
	int longitud = 0;
	public JCheckBox cbGafa;
	public JCheckBox cbBarba;
	public JCheckBox cbTupe;
	public JCheckBox cbBotonCuello;
	private Component verticalGlue;
	private Component horizontalGlue;
	private JButton btnMujer;
	private JButton btnHombre;
	private Component rigidArea;
	private Component verticalGlue_1;
	private JPanel panel_1;
	private JTabbedPane tabbedPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JPanel panel_2;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JPanel panel_3;
	private JLabel imagenHipster, imgBarba, imgGafas,imgTupe,imgCuello;
	private ButtonGroup group;
	private JPanel panel_6;
	private JPanel panel_5;
	private JRadioButton rbtnMujer;
	private JRadioButton rbtnHombre;
	private JRadioButton rbtnOtros;
	private JPanel panel_7;
	private JPanel panel_4;
	private JPanel panel;
	private JPanel contentPane;
	private JTextArea lblResultado;
	public String str;
	private JLayeredPane panelHipster;
	private JLabel lbl;
	private Component verticalGlue_2;
	private Component verticalGlue_3;
	private Component verticalGlue_4;
	private Component verticalGlue_5;
	private Component verticalGlue_6;
	private Component verticalGlue_7;

	public goHipsterFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 2, 2));

		panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.RED, null));
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		TitledBorder title;
		title = BorderFactory.createTitledBorder("features");
		panel.setBorder(title);

		panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));

		cbGafa = new JCheckBox("gafas pasta");
		panel_4.add(cbGafa);
		
		verticalGlue_4 = Box.createVerticalGlue();
		panel_4.add(verticalGlue_4);

		cbBarba = new JCheckBox("barbita");
		panel_4.add(cbBarba);
		
		verticalGlue_3 = Box.createVerticalGlue();
		panel_4.add(verticalGlue_3);

		cbTupe = new JCheckBox("tup\u00E9");
		panel_4.add(cbTupe);
		
		verticalGlue_2 = Box.createVerticalGlue();
		panel_4.add(verticalGlue_2);

		cbBotonCuello = new JCheckBox("bot\u00F3n cuello");
		panel_4.add(cbBotonCuello);

		verticalGlue = Box.createVerticalGlue();
		panel_4.add(verticalGlue);

		horizontalGlue = Box.createHorizontalGlue();
		panel.add(horizontalGlue);

		panel_6 = new JPanel();
		panel.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.Y_AXIS));

		panel_5 = new JPanel();
		panel_5.setAlignmentY(Component.TOP_ALIGNMENT);
		panel_6.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));

		rbtnMujer = new JRadioButton("mujer");
		panel_5.add(rbtnMujer);

		group = new ButtonGroup();

		group.add(rbtnMujer);
		
		verticalGlue_5 = Box.createVerticalGlue();
		panel_5.add(verticalGlue_5);

		rbtnHombre = new JRadioButton("hombre");
		panel_5.add(rbtnHombre);
		group.add(rbtnHombre);
		
		verticalGlue_6 = Box.createVerticalGlue();
		panel_5.add(verticalGlue_6);

		rbtnOtros = new JRadioButton("otros");
		panel_5.add(rbtnOtros);
		group.add(rbtnOtros);
		
		verticalGlue_7 = Box.createVerticalGlue();
		panel_5.add(verticalGlue_7);

		panel_7 = new JPanel();
		panel_7.setAlignmentY(Component.TOP_ALIGNMENT);
		panel_7.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel_6.add(panel_7);
		panel_7.setLayout(new BoxLayout(panel_7, BoxLayout.X_AXIS));

		rigidArea = Box.createRigidArea(new Dimension(20, 20));
		panel_7.add(rigidArea);

		btnHombre = new JButton("");
		btnHombre.setMargin(new Insets(0, 0, 0, 0));
		btnHombre.setIcon(new ImageIcon(goHipsterFrame.class
				.getResource("/icons/Annoying-Hipster@Low.png")));
		panel_7.add(btnHombre);

		btnMujer = new JButton("");
		btnMujer.setMargin(new Insets(0, 0, 0, 0));
		btnMujer.setIcon(new ImageIcon(goHipsterFrame.class
				.getResource("/icons/Male-User@Low.png")));
		panel_7.add(btnMujer);

		verticalGlue_1 = Box.createVerticalGlue();
		panel_6.add(verticalGlue_1);

		panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		panel_1.add(tabbedPane, BorderLayout.CENTER);

		
		
		
		
		
		
		
		panelHipster = new JLayeredPane();
		panelHipster.setBounds(new Rectangle(0, 0, 120, 120));
		panelHipster.setBounds(0,0,100,100);
		imagenHipster = new JLabel();
		imagenHipster.setBounds(55, 0, 99, 102);
		panelHipster.setLayer(imagenHipster, 1);
		imagenHipster.setIcon(new ImageIcon(goHipsterFrame.class
				.getResource("../icons/antes.png")));
		
		tabbedPane.addTab(
				"hipster",
				new ImageIcon(goHipsterFrame.class
						.getResource("../icons/Annoying-Hipster@Low.png")),
				panelHipster, null);
		imgBarba= new JLabel();
		imgBarba.setBounds(55, 0, 107, 102);
		imgBarba.setVisible(false);
		imgBarba.setIcon(new ImageIcon(goHipsterFrame.class
				.getResource("../icons/accesoriobarbita.png")));
		
		imgGafas= new JLabel();
		imgGafas.setBounds(55, 0, 107, 102);
		imgGafas.setVisible(false);
		imgGafas.setIcon(new ImageIcon(goHipsterFrame.class
				.getResource("../icons/accesoriogafapasta.png")));

		imgTupe = new JLabel();
		imgTupe.setBounds(55, 0, 107, 102);
		imgTupe.setVisible(false);
		imgTupe.setIcon(new ImageIcon(goHipsterFrame.class
				.getResource("../icons/accesoriotupe.png")));
		
		imgCuello = new JLabel();
		imgCuello.setBounds(55, 0, 107, 102);
		imgCuello.setVisible(false);
		imgCuello.setIcon(new ImageIcon(goHipsterFrame.class
				.getResource("../icons/accesoriobotoncuello.png")));
		
		panelHipster.add(imagenHipster);
		panelHipster.add(imgBarba);
		panelHipster.add(imgGafas);
		panelHipster.add(imgTupe);
		panelHipster.add(imgCuello);
		
		
		
		
		
		

		lblNewLabel_1 = new JLabel("not to be a hipster");
		tabbedPane.addTab(
				"not hipster",
				new ImageIcon(goHipsterFrame.class
						.getResource("../icons/Male-User@Low.png")),
				lblNewLabel_1, "You are not");

		panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));

		scrollPane = new JScrollPane();
		panel_2.add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		panel_3 = new JPanel();
		panel_3.setBackground(Color.GRAY);
		contentPane.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		lbl = new JLabel("Peluquero! una de: ");
		panel_3.add(lbl, BorderLayout.NORTH);

		lblResultado = new JTextArea("");
		lblResultado.setEnabled(false);
		panel_3.add(lblResultado, BorderLayout.CENTER);

		// Aspecto de botón en función de elección en radioButton
		rbtnMujer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (rbtnMujer.isSelected()) {
					limpiarCampos();
					lblResultado.setText("");
					btnMujer.setVisible(true);
					btnHombre.setVisible(false);
					cbBarba.setText("flequillo hachazo");
					btnMujer.setIcon(new ImageIcon(goHipsterFrame.class
							.getResource("../icons/Female-User@Low.png")));
				}
			}
		});
		rbtnHombre.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (rbtnHombre.isSelected()) {
					limpiarCampos();
					lblResultado.setText("");
					btnMujer.setVisible(false);
					btnHombre.setVisible(true);
					cbBarba.setText("barbita");
					btnHombre.setIcon(new ImageIcon(goHipsterFrame.class
							.getResource("../icons/Annoying-Hipster@Low.png")));
				}
			}
		});

		rbtnOtros.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (rbtnOtros.isSelected()) {
					limpiarCampos();
					lblResultado.setText("");
					btnMujer.setVisible(false);
					btnHombre.setVisible(true);
					cbBarba.setText("barbita");
					btnHombre.setIcon(new ImageIcon(goHipsterFrame.class
							.getResource("../icons/Otros-User@Low.png")));
				}
			}
		});
		// add an action listener
		ActionListener actionListener = new ActionHandler();
		cbBarba.addActionListener(actionListener);
		cbBotonCuello.addActionListener(actionListener);
		cbGafa.addActionListener(actionListener);
		cbTupe.addActionListener(actionListener);

	
	}

	// code of the action listener class
	class ActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			str = lblResultado.getText();

			JCheckBox checkbox = (JCheckBox) event.getSource();

			if (longitud <= 0) {
				longitud = 0;
				lblResultado.setText("");
			}

			if (checkbox == cbBarba) {
				if (cbBarba.isSelected()) {
					longitud += checkbox.getText().length();
					lblResultado.setText(str += checkbox.getText()+"\n");
					imgBarba.setVisible(true);
					
				} else {
					longitud -= checkbox.getText().length();
					imgBarba.setVisible(false);
					lblResultado.setText(str.substring(0, longitud));
				}
			}
			if (checkbox == cbBotonCuello) {
				if (cbBotonCuello.isSelected()) {
					longitud += checkbox.getText().length();
					lblResultado.setText(str += checkbox.getText()+"\n");
					imgCuello.setVisible(true);
				} else {
					longitud -= checkbox.getText().length();
					lblResultado.setText(str.substring(0, longitud));
					imgCuello.setVisible(false);

				}
			}
			if (checkbox == cbTupe) {
				if (cbTupe.isSelected()) {
					longitud += checkbox.getText().length();
					lblResultado.setText(str += checkbox.getText()+"\n");
					imgTupe.setVisible(true);
				} else {
					longitud -= checkbox.getText().length();
					lblResultado.setText(str.substring(0, longitud));
					imgTupe.setVisible(false);

				}
			}

			if (checkbox == cbGafa) {
				if (cbGafa.isSelected()) {
					longitud += checkbox.getText().length();
					lblResultado.setText(str += checkbox.getText()+"\n");
					imgGafas.setVisible(true);
				} else {
					longitud -= checkbox.getText().length();
					lblResultado.setText(str.substring(0, longitud));
					imgGafas.setVisible(false);
				}
			}

		}
	}
	
	public void limpiarCampos(){
		longitud=0;
		cbBarba.setSelected(false);
		cbBotonCuello.setSelected(false);
		cbGafa.setSelected(false);
		cbTupe.setSelected(false);

	}
}

