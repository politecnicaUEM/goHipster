package goHipster;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

import java.awt.FlowLayout;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
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
		setBounds(100, 100, 555, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 5, 5));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		TitledBorder title;
		title = BorderFactory.createTitledBorder("features");
		panel.setBorder(title);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Gafas pasta");
		panel_4.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Barbita");
		panel_4.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Tupé");
		panel_4.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Botón Cuello");
		panel_4.add(chckbxNewCheckBox_3);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));
		
		JPanel panel_6 = new JPanel();
		panel_6.setAlignmentX(1.0f);
		panel_5.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.Y_AXIS));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Hombre");
		panel_6.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Mujer");
		panel_6.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Otros");
		panel_6.add(rdbtnNewRadioButton_2);
		
		Component verticalGlue = Box.createVerticalGlue();
		panel_6.add(verticalGlue);
		
		JPanel panel_7 = new JPanel();
		panel_5.add(panel_7);
		panel_7.setLayout(new BoxLayout(panel_7, BoxLayout.X_AXIS));
		
		JButton btnNewButton = new JButton();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
			}
		});
		btnNewButton.setIcon(new ImageIcon(MyFrame.class
				.getResource("/icons/Male-User.png")));
		btnNewButton.setIcon(new ImageIcon(MyFrame.class
				.getResource("/icons/Annoying-Hipster.png")));
		panel_7.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton();
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnNewButton_1.setIcon(new ImageIcon(MyFrame.class
				.getResource("/icons/Male-User.png")));
		panel_7.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel_1.add(tabbedPane);
		
		JLabel lblNewLabel= new JLabel("To be a hipster");
		tabbedPane.addTab("Hipster", new ImageIcon(MyFrame.class
				.getResource("/icons/Annoying-Hipster@Low.png")), lblNewLabel, "you are");
		
		
		JLabel lblNewLabel_1 = new JLabel("Not to be a hipster");
		tabbedPane.addTab("Not hipster",new ImageIcon(MyFrame.class
				.getResource("/icons/Male-User@Low.png")), lblNewLabel_1, "you are not");
	
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane, BorderLayout.CENTER);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		textArea.setText("Añade tus comentarios...");
		scrollPane.setViewportView(textArea);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		contentPane.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(Color.GRAY);
		textArea_1.setForeground(Color.GRAY);
		textArea_1.setCaretColor(Color.GRAY);
		panel_3.add(textArea_1, BorderLayout.CENTER);
		
		
		
	}

}
