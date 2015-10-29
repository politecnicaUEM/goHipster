package Hipstah;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.border.TitledBorder;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.JTabbedPane;
import javax.swing.JButton;

import java.awt.Component;

import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.Box;
import javax.swing.JTextArea;

import java.awt.Color;

public class hipster extends JFrame {

	public static final String T_7 = "Y no se lo que eres\n";
	public static final String T_6 = "Y pareces una dama\n";
	public static final String T_5 = "Y se te ve muy varonil\n";
	public static final String T_4 = "Con su boton en el cuello\n";
	public static final String T_3 = "Con su tupe\n";
	public static final String T_2 = "Con su barbita\n";
	public static final String T_1 = "Con sus gafas de pasta\n";
	JRadioButton rdbtnHombre;
	JRadioButton rdbtnMujer;
	JRadioButton rdbtnOtros;
	JCheckBox chckbxNewCheckBox;
	JCheckBox chckbxNewCheckBox_1;
	JCheckBox chckbxNewCheckBox_2;
	JCheckBox chckbxNewCheckBox_3;
	JTextArea textArea;
	JTextArea textArea_1;
	JButton btnA;
	JButton btnB;
	ButtonGroup group ;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hipster frame = new hipster();
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

	public hipster() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 327);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 0, 0));

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Features",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));

		chckbxNewCheckBox = new JCheckBox("Gafas Pasta");
		panel_4.add(chckbxNewCheckBox);

		chckbxNewCheckBox_1 = new JCheckBox("Barbita");
		panel_4.add(chckbxNewCheckBox_1);

		chckbxNewCheckBox_2 = new JCheckBox("Tupe");
		panel_4.add(chckbxNewCheckBox_2);

		chckbxNewCheckBox_3 = new JCheckBox("Boton Cuello");
		panel_4.add(chckbxNewCheckBox_3);

		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));

		JPanel panel_6 = new JPanel();
		panel_6.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel_6.setAlignmentY(Component.TOP_ALIGNMENT);
		panel_5.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.Y_AXIS));

		rdbtnHombre = new JRadioButton("Hombre");
		panel_6.add(rdbtnHombre);

		rdbtnMujer = new JRadioButton("Mujer");
		panel_6.add(rdbtnMujer);

		rdbtnOtros = new JRadioButton("Otros");
		panel_6.add(rdbtnOtros);

		group = new ButtonGroup();
		group.add(rdbtnHombre);
		group.add(rdbtnMujer);
		group.add(rdbtnOtros);
		
		rdbtnHombre.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				btnA.setIcon(new ImageIcon(hipster.class
						.getResource("/Icons/Annoying-Hipster@Low.png")));
			}

			public void focusLost(FocusEvent arg0) {
			}
		});
		
		rdbtnMujer.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				btnA.setIcon(new ImageIcon(hipster.class
						.getResource("/Icons/Female-User@Low.png")));
			}

			public void focusLost(FocusEvent arg0) {
			}
		});
		
		rdbtnOtros.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				btnA.setIcon(new ImageIcon(hipster.class
						.getResource("/Icons/Hazard@Low.png")));
			}

			public void focusLost(FocusEvent arg0) {
			}
		});
		

		Component verticalGlue = Box.createVerticalGlue();
		panel_5.add(verticalGlue);

		JPanel panel_7 = new JPanel();
		panel_7.setAlignmentY(Component.TOP_ALIGNMENT);
		panel_7.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel_5.add(panel_7);
		panel_7.setLayout(new BoxLayout(panel_7, BoxLayout.X_AXIS));

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel_1.add(tabbedPane, BorderLayout.CENTER);

		JTextPane helloHipster = new JTextPane();
		JTextPane helloCommon = new JTextPane();

		tabbedPane.addTab(
				"Hipster",
				new ImageIcon(hipster.class
						.getResource("/Icons/Annoying-Hipster@Low.png")),
				helloHipster, "You are a ...");
		tabbedPane.addTab(
				"Not Hipster",
				new ImageIcon(hipster.class
						.getResource("/Icons/Annoying-Hipster@Low.png")),
				helloCommon, "You are not a ...");

		helloHipster.setText("\n\nHello Mr. Hipster");
		helloCommon.setText("\n\nI don't mess up with common people");

		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));

		textArea = new JTextArea();
		panel_2.add(textArea, BorderLayout.CENTER);
		textArea.setText("Insert your thoughts here!");
		textArea.setForeground(Color.LIGHT_GRAY);
		textArea.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				textArea.setText("");
				textArea.setForeground(Color.BLACK);
			}

			public void focusLost(FocusEvent arg0) {

			}
		});

		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.Y_AXIS));

		textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setForeground(Color.WHITE);
		textArea_1.setBackground(Color.DARK_GRAY);
		panel_3.add(textArea_1);

		btnA = new JButton("");
		btnA.setVerticalAlignment(SwingConstants.TOP);
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea_1.setForeground(Color.WHITE);
				getCBox();

			}
		});

		btnA.setIcon(new ImageIcon(hipster.class
				.getResource("/Icons/Annoying-Hipster@Low.png")));

		panel_7.add(btnA);

		Component horizontalGlue = Box.createHorizontalGlue();
		panel_7.add(horizontalGlue);

		btnB = new JButton("");
		btnB.setIcon(new ImageIcon(hipster.class
				.getResource("/Icons/Trash-Can@Low.png")));
		panel_7.add(btnB);
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea_1.setText("");
				textArea.setForeground(Color.LIGHT_GRAY);
				textArea.setText("Insert your thoughts here!");
				chckbxNewCheckBox.setSelected(false);
				chckbxNewCheckBox_1.setSelected(false);
				chckbxNewCheckBox_2.setSelected(false);
				chckbxNewCheckBox_3.setSelected(false);
				group.clearSelection();
				
			}

		});

	}

	public void getCBox() {
		textArea_1.setText("");
		if (chckbxNewCheckBox.isSelected()) {
			textArea_1.setText(T_1);
		}
		if (chckbxNewCheckBox_1.isSelected()) {
			textArea_1.setText(textArea_1.getText() + T_2);
		}
		if (chckbxNewCheckBox_2.isSelected()) {
			textArea_1.setText(textArea_1.getText() + T_3);
		}
		if (chckbxNewCheckBox_3.isSelected()) {
			textArea_1.setText(textArea_1.getText() + T_4);
		}
		if (rdbtnHombre.isSelected()) {
			textArea_1.setText(textArea_1.getText() + T_5);
		}
		if (rdbtnMujer.isSelected()) {
			textArea_1.setText(textArea_1.getText() + T_6);
		}
		if (rdbtnOtros.isSelected()) {
			textArea_1.setText(textArea_1.getText() + T_7);
		}
		if (!chckbxNewCheckBox.isSelected()
				&& !chckbxNewCheckBox_1.isSelected()
				&& !chckbxNewCheckBox_2.isSelected()
				&& !chckbxNewCheckBox_3.isSelected()) {
			textArea_1.setText("");
		} else {
			textArea_1
					.setText(textArea_1.getText() + "\n" + textArea.getText());
		}

	}
	
}
