package Hipstah;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import java.awt.TextArea;

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
import javax.swing.Box;

public class hipster extends JFrame {

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
		panel.setBorder(new TitledBorder(null, "Features", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Gafas Pasta");
		chckbxNewCheckBox.setSelected(true);
		panel_4.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Barbita");
		chckbxNewCheckBox_1.setSelected(true);
		panel_4.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Tup\u00E9");
		panel_4.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Bot\u00F3n Cuello");
		panel_4.add(chckbxNewCheckBox_3);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));
		
		JPanel panel_6 = new JPanel();
		panel_6.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel_6.setAlignmentY(Component.TOP_ALIGNMENT);
		panel_5.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.Y_AXIS));
		
		JRadioButton rdbtnHombre = new JRadioButton("Hombre");
		rdbtnHombre.setSelected(true);
		panel_6.add(rdbtnHombre);
		
		JRadioButton rdbtnMujer = new JRadioButton("Mujer");
		panel_6.add(rdbtnMujer);
		
		JRadioButton rdbtnOtros = new JRadioButton("Otros");
		panel_6.add(rdbtnOtros);
		
		ButtonGroup group = new ButtonGroup();
		
		group.add(rdbtnHombre);
		group.add(rdbtnMujer);
		group.add(rdbtnOtros);
		
		Component verticalGlue = Box.createVerticalGlue();
		panel_5.add(verticalGlue);
		
		JPanel panel_7 = new JPanel();
		panel_7.setAlignmentY(Component.TOP_ALIGNMENT);
		panel_7.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel_5.add(panel_7);
		panel_7.setLayout(new BoxLayout(panel_7, BoxLayout.X_AXIS));
		
		JButton btnA = new JButton("");
		btnA.setVerticalAlignment(SwingConstants.TOP);
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnA.setIcon(new ImageIcon(hipster.class.getResource("/Icons/Annoying-Hipster@Low.png")));
		panel_7.add(btnA);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		panel_7.add(horizontalGlue);
		
		JButton btnB = new JButton("");
		btnB.setIcon(new ImageIcon(hipster.class.getResource("/Icons/Female-User@Low.png")));
		panel_7.add(btnB);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel_1.add(tabbedPane, BorderLayout.CENTER);
		
		JTextPane helloHipster = new JTextPane();
		JTextPane helloCommon = new JTextPane();

		tabbedPane.addTab("Hipster", new ImageIcon(hipster.class.getResource("/Icons/Annoying-Hipster@Low.png")), helloHipster, "You are a ...");
		tabbedPane.addTab("Not Hipster", new ImageIcon(hipster.class.getResource("/Icons/Annoying-Hipster@Low.png")), helloCommon, "You are not a ...");
		
		helloHipster.setText("Hello Mr. Hipster");
		helloCommon.setText("I don't mess up with common people");
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		TextArea textArea = new TextArea();
		panel_2.add(textArea, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
	}

}
