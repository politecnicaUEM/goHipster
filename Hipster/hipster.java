import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;


import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.CardLayout;
import java.awt.Component;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.Button;
import java.awt.ScrollPane;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.SelectionKey;
import java.awt.Panel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;

public class hipster extends JFrame {

	private JPanel contentPane;
	private JCheckBox chckbxba;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox  chckbxNewCheckBox_2;
	private JCheckBox chckbxNewCheckBox;
	private JTextArea textArea;
	private JTextArea txtrAadeTusComentarios;
	private JRadioButton rdbtnMujer;
	private JRadioButton rdbtnHombre;
	private JRadioButton rdbtnOtros;
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
		setBounds(100, 100, 650, 375);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmMenu = new JMenuItem("Go to Hipster");
		menuBar.add(mntmMenu);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 0, 0));

		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		TitledBorder title;
		title= BorderFactory.createTitledBorder("Features");
		panel.setBorder(title);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JCheckBox chckbxba = new JCheckBox("Gafas pasta");
		panel_1.add(chckbxba);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Tupé");
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Barbita");
		panel_1.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Boton cuello");
		panel_1.add(chckbxNewCheckBox_2);
		
		
		
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2,BoxLayout.X_AXIS));
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel_2.add(tabbedPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("To be a Hipster");
		JLabel lblNewlabel = new JLabel("not to be a Hipster");
	
		tabbedPane.addTab("Hipster", new ImageIcon(hipster.class
				.getResource("/icons/Annoying-Hipster@Low.png")), lblNewLabel_1, "you are");
		tabbedPane.addTab("Non hipster", new ImageIcon(hipster.class
				.getResource("/icons/Male-User@Low.png")), lblNewlabel, "you are not");
	
		
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3,BoxLayout.Y_AXIS));
		
		JPanel panel_4 = new JPanel();
		panel_3.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		ButtonGroup group = new ButtonGroup();
		
		rdbtnHombre = new JRadioButton("Hombre");
		panel_4.add(rdbtnHombre);
		rdbtnHombre.setHorizontalAlignment(SwingConstants.LEFT);
		group.add(rdbtnHombre);
		
		
		 rdbtnMujer = new JRadioButton("Mujer");
		panel_4.add(rdbtnMujer);
		group.add(rdbtnMujer);
		
		
		rdbtnOtros = new JRadioButton("Otros");
		panel_4.add(rdbtnOtros);
		rdbtnOtros.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnOtros.setSelected(true);
		group.add(rdbtnOtros);
		
		
		Component verticalGlue = Box.createVerticalGlue();
		panel_3.add(verticalGlue);
		
		JPanel panel_8 = new JPanel();
		panel_3.add(panel_8);
		
		
		
		
		
		panel_8.setLayout(new BoxLayout(panel_8, BoxLayout.X_AXIS));
		
		JButton btnNewButton_1 = new JButton("");
		panel_8.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setForeground(Color.WHITE);
				textArea.setText(Selection6pane()+'\n'
						+ txtrAadeTusComentarios.getText());;
				
			
			}

				
			
		});
		
		btnNewButton_1.setToolTipText("change style?");
		btnNewButton_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1.setIcon(new ImageIcon(hipster.class.
				getResource("/icons/Annoying-Hipster.png")));
		{
			
	
		
		JButton btnNewButton = new JButton("");
		panel_8.add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon(hipster.class
				.getResource("/icons/Male-User.png")));
		btnNewButton.setToolTipText("reset?");
		btnNewButton.setMargin(new Insets(0, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		panel_8.add(lblNewLabel);
	
		
		Panel panel_5 = new Panel();
		contentPane.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		
		textArea = new JTextArea();
		textArea.setText("añade tus comentarios...");
		panel_5.add(textArea);
		
		Panel panel_7 = new Panel();
		contentPane.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBackground(new Color(120,120,120,255));
		textArea.setForeground(Color.WHITE);
		panel_7.add(textArea, BorderLayout.CENTER);
		
	}
	}

	public String Selection6pane() {
		String text = "";
		if (chckbxba.isSelected())
			text += "con sus gafitas\n";
		if (chckbxNewCheckBox_1.isSelected())
			text += "con su barbita\n";
		if (chckbxNewCheckBox.isSelected())
			text += "con su tupe\n";
		if (chckbxNewCheckBox_2.isSelected())
			text += "con su botón en el cuello de moda\n";
		
		return text;
}
}
