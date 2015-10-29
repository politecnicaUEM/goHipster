package goHipster;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JScrollBar;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.Insets;
import java.awt.Dimension;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

import java.awt.FlowLayout;

import javax.swing.border.TitledBorder;

import java.awt.Panel;
import java.awt.TextArea;
import java.awt.ScrollPane;

import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.JButton;

import java.awt.Component;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.Box;
import javax.swing.JTextPane;

import java.awt.Point;

import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class GoHipster extends JFrame {

	JCheckBox chckbxNewCheckBox_1;
	JCheckBox chckbxNewCheckBox_2;
	JCheckBox chckbxNewCheckBox_3;
	JCheckBox chckbxNewCheckBox;
	TextArea addCom;
	JTextArea visorTexto;

	private JPanel contentPane;

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
		setBounds(100, 100, 773, 492);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);

		JMenuItem mntmSettings = new JMenuItem("Settings");
		mnMenu.add(mntmSettings);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Features",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);

		chckbxNewCheckBox_1 = new JCheckBox("gafas pasta");

		chckbxNewCheckBox_1.setVerticalAlignment(SwingConstants.TOP);

		chckbxNewCheckBox_2 = new JCheckBox("barbita");
		chckbxNewCheckBox_2.setVerticalAlignment(SwingConstants.TOP);

		chckbxNewCheckBox_3 = new JCheckBox("tup\u00E9");
		chckbxNewCheckBox_3.setVerticalAlignment(SwingConstants.TOP);

		chckbxNewCheckBox = new JCheckBox("bot\u00F3n cuello");
		chckbxNewCheckBox.setVerticalAlignment(SwingConstants.TOP);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
		panel_4.add(chckbxNewCheckBox_1);
		panel_4.add(chckbxNewCheckBox_2);
		panel_4.add(chckbxNewCheckBox_3);
		panel_4.add(chckbxNewCheckBox);

		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));

		JPanel panel_6 = new JPanel();
		panel_6.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel_5.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.Y_AXIS));

		JRadioButton chckbxNewCheckBox_5 = new JRadioButton("hombre");
		panel_6.add(chckbxNewCheckBox_5);

		JRadioButton chckbxNewCheckBox_6 = new JRadioButton("mujer");
		panel_6.add(chckbxNewCheckBox_6);

		JRadioButton chckbxNewCheckBox_4 = new JRadioButton("otros");
		panel_6.add(chckbxNewCheckBox_4);

		ButtonGroup sexo = new ButtonGroup();
		sexo.add(chckbxNewCheckBox_5);
		sexo.add(chckbxNewCheckBox_6);
		sexo.add(chckbxNewCheckBox_4);

		JSeparator separator = new JSeparator();
		panel_5.add(separator);

		Component verticalGlue = Box.createVerticalGlue();
		panel_5.add(verticalGlue);

		JPanel panel_2 = new JPanel();
		panel_5.add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));

		JButton button = new JButton("");
		button.setIcon(new ImageIcon(GoHipster.class
				.getResource("/icons/Annoying-Hipster.png")));
		button.setVerticalTextPosition(SwingConstants.TOP);
		button.setVerticalAlignment(SwingConstants.TOP);
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_2.add(button);

		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(GoHipster.class
				.getResource("/icons/Male-User.png")));
		panel_2.add(button_1);

		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

		JTextField textP1 = new JTextField();
		textP1.setEditable(false);
		JTextField textP2 = new JTextField();
		textP2.setEditable(false);

		textP1.setAlignmentX(CENTER_ALIGNMENT);
		textP1.setText("to be a hipster");
		textP2.setAlignmentX(CENTER_ALIGNMENT);
		textP2.setText("or not to be...");

		tabbedPane.addTab(
				"Hipster",
				new ImageIcon(GoHipster.class
						.getResource("/icons/Annoying-Hipster@Low.png")),
				textP1, "");

		tabbedPane
				.addTab("Non hipster",
						new ImageIcon(GoHipster.class
								.getResource("/icons/Male-User@Low.png")),
						textP2, null);
		panel.add(tabbedPane);

		addCom = new TextArea();
		addCom.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				addCom.setText("");
			}
		});
		addCom.setText("Add your comments...");
		contentPane.add(addCom);

		visorTexto = new JTextArea();
		visorTexto.setBackground(Color.LIGHT_GRAY);
		visorTexto.setEditable(false);
		contentPane.add(visorTexto);

		chckbxNewCheckBox_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				generaTexto();
			}
		});

		chckbxNewCheckBox_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				generaTexto();
			}
		});

		chckbxNewCheckBox_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				generaTexto();
			}
		});

		chckbxNewCheckBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				generaTexto();
			}
		});
		button_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				generaTexto();
			}
		});
		
	}

	public void generaTexto() {
		visorTexto.setText("");
		if (chckbxNewCheckBox_1.isSelected()) {
			visorTexto.setText("A lo Harry Potter \n");
		}
		if (chckbxNewCheckBox_2.isSelected()) {
			visorTexto
					.setText(visorTexto.getText()+ "Normal que elijas barbita todos quieren ser como el doctor Bacterio \n");
		}
		if (chckbxNewCheckBox_3.isSelected()) {
			visorTexto.setText(visorTexto.getText()+ "Tell me more... \n");
		}
		if (chckbxNewCheckBox.isSelected()) {
			visorTexto
					.setText(visorTexto.getText()+ "No todos pueden aguantar un botón de Hipsta... \n");
		}
		
		visorTexto.setText(visorTexto.getText()+addCom.getText());
	}
}
