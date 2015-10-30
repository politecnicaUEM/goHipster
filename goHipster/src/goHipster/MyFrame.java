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

import javax.swing.AbstractButton;  
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
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
	private JCheckBox chckbxGafasPasta;
	private JCheckBox chckbxBarbita;
	private JCheckBox chckbxCuelloAbotonado;
	private JCheckBox chckbxTup;
	private JRadioButton rdbtnGafasPasta;
	private JRadioButton rdbtnBarba;
	private JRadioButton rdbtnTup;
	private JTextArea txtrAadeTusComentarios;
	private JTextArea textArea_1;

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
		TitledBorder title;
		title = BorderFactory.createTitledBorder("features");
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setBorder(title);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
		
		chckbxGafasPasta = new JCheckBox("Gafas pasta");
		panel_4.add(chckbxGafasPasta);
		
		chckbxBarbita = new JCheckBox("Barbita");
		panel_4.add(chckbxBarbita);
		
		chckbxTup = new JCheckBox("Tupé");
		panel_4.add(chckbxTup);
		
		chckbxCuelloAbotonado = new JCheckBox("Botón Cuello");
		panel_4.add(chckbxCuelloAbotonado);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));
		
		JPanel panel_6 = new JPanel();
		panel_6.setAlignmentX(1.0f);
		panel_5.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.Y_AXIS));
		
		ButtonGroup group = new ButtonGroup();
		
		rdbtnGafasPasta = new JRadioButton("Hombre");
		panel_6.add(rdbtnGafasPasta);
		rdbtnGafasPasta.setHorizontalAlignment(SwingConstants.LEFT);
		group.add(rdbtnGafasPasta);
		
		rdbtnBarba = new JRadioButton("Mujer");
		panel_6.add(rdbtnBarba);
		group.add(rdbtnBarba);
		
		rdbtnTup = new JRadioButton("Otros");
		panel_6.add(rdbtnTup);
		rdbtnTup.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnTup.setSelected(true);
		group.add(rdbtnTup);
		
		Component verticalGlue = Box.createVerticalGlue();
		panel_5.add(verticalGlue);
		
		JPanel panel_7 = new JPanel();
		panel_5.add(panel_7);
		panel_7.setLayout(new BoxLayout(panel_7, BoxLayout.X_AXIS));
		
		JButton btnNewButton = new JButton();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				textArea_1.setForeground(Color.WHITE);
				textArea_1.setText(selection2Pane() + '\n'
						+ txtrAadeTusComentarios.getText());
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
				textArea_1.setForeground(Color.LIGHT_GRAY);

			}
		});
		btnNewButton_1.setIcon(new ImageIcon(MyFrame.class
				.getResource("/icons/Female-User.png")));
		panel_7.add(btnNewButton_1);
		
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel_1.add(tabbedPane);
		
		JLabel lblNewLabel= new JLabel("To be a hipster");
		tabbedPane.addTab("Antes", new ImageIcon(MyFrame.class
				.getResource("/icons/Annoying-Hipster@Low.png")), lblNewLabel, "you are");
		
		
		JLabel lblNewLabel_1 = new JLabel("Not to be a hipster");
		tabbedPane.addTab("Despues",new ImageIcon(MyFrame.class
				.getResource("/icons/Male-User@Low.png")), lblNewLabel_1, "you are not");
	
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane, BorderLayout.CENTER);
		
		txtrAadeTusComentarios = new JTextArea();
		scrollPane.setViewportView(txtrAadeTusComentarios);
		txtrAadeTusComentarios.setText("Añade tus comentarios...");
		
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setBackground(Color.GRAY);
		textArea_1.setForeground(Color.WHITE);
		panel_3.add(textArea_1, BorderLayout.CENTER);
		
	}
	public String selection2Pane() {
		String text = "";
		if (chckbxGafasPasta.isSelected())
			text += "con sus gafitas\n";
		if (chckbxBarbita.isSelected())
			text += "con su barbita\n";
		if (chckbxTup.isSelected())
			text += "con su tupé\n";
		if (chckbxCuelloAbotonado.isSelected())
			text += "con su botón en el cuello de moda\n";
		if (rdbtnBarba.isSelected())
			text += "esa mujer\n";
		if (rdbtnGafasPasta.isSelected())
			text += "ese hombre\n";
		if (rdbtnTup.isSelected())
			text += "esa sexualidad diversa\n";
		return text;
				
}
}


