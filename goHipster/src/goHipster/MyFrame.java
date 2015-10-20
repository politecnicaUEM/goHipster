package goHipster;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Component;
import java.awt.Insets;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

import java.awt.Dimension;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.Box;

public class MyFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
					frame.setVisible(true);
					frame.setTitle("go hipster go!");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 0, 2));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "features", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setName("");
		panel.setToolTipText("");
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("gafas pasta");
		panel_4.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("barbita");
		panel_4.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("tup\u00E9");
		panel_4.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("bot\u00F3n cuello");
		panel_4.add(chckbxNewCheckBox_3);
		
		Component verticalGlue = Box.createVerticalGlue();
		panel_4.add(verticalGlue);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		panel.add(horizontalGlue);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));
		
		JPanel panel_7 = new JPanel();
		panel_7.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel_5.add(panel_7);
		panel_7.setLayout(new BoxLayout(panel_7, BoxLayout.Y_AXIS));
		
		ButtonGroup grupoBoton = new ButtonGroup();
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("hombre");
		panel_7.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("mujer");
		panel_7.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("otros");
		panel_7.add(rdbtnNewRadioButton_2);
		
		grupoBoton.add(rdbtnNewRadioButton);
		grupoBoton.add(rdbtnNewRadioButton_1);
		grupoBoton.add(rdbtnNewRadioButton_2);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		panel_7.add(verticalGlue_1);
		
		Component verticalStrut = Box.createVerticalStrut(10);
		panel_5.add(verticalStrut);
		
		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.X_AXIS));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setMargin(new Insets(1, 1, 1, 1));
		panel_6.add(btnNewButton);
		btnNewButton.setAlignmentX(Component.RIGHT_ALIGNMENT);
		btnNewButton.setIcon(new ImageIcon(MyFrame.class.getResource("/icons/Annoying-Hipster.png")));
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setMargin(new Insets(1, 1, 1, 1));
		panel_6.add(btnNewButton_1);
		btnNewButton_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_1.setIcon(new ImageIcon(MyFrame.class.getResource("/icons/Male-User.png")));
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		panel_5.add(rigidArea);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel_1.add(tabbedPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("to be a hipster");
		tabbedPane.addTab("Hipster", new ImageIcon(MyFrame.class.getResource("/icons/Annoying-Hipster@Low.png")), lblNewLabel, null);
		JLabel lblNewLabel_1 = new JLabel("Not to be a hipster");
		tabbedPane.addTab("Non Hipster", new ImageIcon(MyFrame.class.getResource("/icons/Male-User@Low.png")), lblNewLabel_1, null);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.GRAY);
		contentPane.add(panel_3);
	}

}
