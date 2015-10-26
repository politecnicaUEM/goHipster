package goHipster;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Rectangle;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;

import java.awt.Component;

import javax.swing.Box;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class MyFrame extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;
	private JTextArea textArea_1;
	private JPanel panel_3;
	private JCheckBox chckbxGafasPasta;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	
	private JRadioButton radioButton;
	private JRadioButton radioButton_1;
	private JRadioButton radioButton_2;

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
	{
		for (LookAndFeelInfo info : javax.swing.UIManager
				.getInstalledLookAndFeels()) {

			try {
				javax.swing.UIManager
						.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		TitledBorder title;
		title = BorderFactory.createTitledBorder("features");
		panel.setBorder(title);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
		
		JCheckBox chckbxGafasPasta = new JCheckBox("Gafas Pasta");
		panel_4.add(chckbxGafasPasta);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Barbita");
		panel_4.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Tup\u00E9");
		panel_4.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Bot\u00F3n Cuello");
		panel_4.add(chckbxNewCheckBox_2);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));
		
		JPanel panel_6 = new JPanel();
		panel_6.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel_5.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.Y_AXIS));
		
		JRadioButton radioButton_3 = new JRadioButton("Hombre");
		panel_6.add(radioButton_3);
		
		JRadioButton radioButton_1_1 = new JRadioButton("Mujer");
		panel_6.add(radioButton_1_1);
		
		JRadioButton radioButton_2_1 = new JRadioButton("Otros");
		panel_6.add(radioButton_2_1);
		
		Component verticalGlue = Box.createVerticalGlue();
		panel_5.add(verticalGlue);
		
		JPanel panel_7 = new JPanel();
		panel_5.add(panel_7);
		
		panel_7.setLayout(new BoxLayout(panel_7, BoxLayout.X_AXIS));
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setForeground(Color.WHITE);
				
			}
		});
		button.setToolTipText("change style?");
		button.setMargin(new Insets(0, 0, 0, 0));
		button.setIcon(new ImageIcon(MyFrame.class
				.getResource("/icons/Annoying-Hipster.png")));

		panel_7.add(button);
		
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setForeground(Color.LIGHT_GRAY);
			}
		});
		panel_7.add(btnNewButton_1);
		btnNewButton_1.setIcon(new ImageIcon(MyFrame.class
				.getResource("/icons/Male-User.png")));
		btnNewButton_1.setToolTipText("reset?");
		btnNewButton_1.setMargin(new Insets(0, 0, 0, 0));
		panel_7.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel_1.add(tabbedPane);
		
		JLabel lblNewLabel = new JLabel("to be a hipster");
		tabbedPane.addTab("Hipster", new ImageIcon(MyFrame.class.getResource("/icons/Annoying-Hipster@Low.png")), lblNewLabel, "you are");
		
		JLabel lblNewLabel_1 = new JLabel("not to be a hipster");
		tabbedPane.addTab("Non Hipster", new ImageIcon(MyFrame.class.getResource("/icons/Male-User@Low.png")), lblNewLabel_1, "you are not");
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);
		
		JTextArea txtTusComentarios = new JTextArea();
		txtTusComentarios.setText("Añade tus comentarios.");
		scrollPane.setViewportView(txtTusComentarios);
		
		txtTusComentarios = new JTextArea();
		txtTusComentarios.setText("Añade tus comentarios.");

		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));

		textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setBackground(new Color(120, 120, 120, 255));
		textArea_1.setForeground(Color.WHITE);
		panel_3.add(textArea_1, BorderLayout.CENTER);
	}


	}
