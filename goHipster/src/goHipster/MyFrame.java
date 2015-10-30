package goHipster;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.Box;


public class MyFrame extends JFrame {
	
	private JPanel panel_3;
	private JPanel contentPane;
	private JTextArea textArea;
	private JTextArea textArea_1;
	private JCheckBox chckbxGafasPasta;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JRadioButton radioButton;
	private JRadioButton radioButton_1;
	private JRadioButton radioButton_2;
	private JButton button;
	private JButton btnNewButton_1;
	private JTextArea txtTusComentarios;
	private JLabel lblNewLabel_1;
	private JPanel panel_2;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;

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
	{
		for (LookAndFeelInfo info : javax.swing.UIManager
				.getInstalledLookAndFeels()) {

			try {
				javax.swing.UIManager
						.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Create the frame.
	 */

	
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
		
		chckbxGafasPasta = new JCheckBox("Gafas Puesta");
		panel_4.add(chckbxGafasPasta);
		
		chckbxNewCheckBox = new JCheckBox("Barbita");
		panel_4.add(chckbxNewCheckBox);
		
		chckbxNewCheckBox_1 = new JCheckBox("Tup\u00E9");
		panel_4.add(chckbxNewCheckBox_1);
		
		chckbxNewCheckBox_2 = new JCheckBox("Bot\u00F3n Cuello");
		panel_4.add(chckbxNewCheckBox_2);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));
		
		JPanel panel_6 = new JPanel();
		panel_6.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel_5.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.Y_AXIS));
		
		ButtonGroup group = new ButtonGroup();
		
		radioButton = new JRadioButton("Hombre");
		panel_6.add(radioButton);
		radioButton.setHorizontalAlignment(SwingConstants.LEFT);
		group.add(radioButton);
		
		radioButton_1 = new JRadioButton("Mujer");
		panel_6.add(radioButton_1);
		group.add(radioButton_1);
		
		radioButton_2 = new JRadioButton("Otros");
		panel_6.add(radioButton_2);
		radioButton_2.setHorizontalAlignment(SwingConstants.CENTER);
		radioButton_2.setSelected(true);
		group.add(radioButton_2);
		
		Component verticalGlue = Box.createVerticalGlue();
		panel_5.add(verticalGlue);
		
		JPanel panel_7 = new JPanel();
		panel_5.add(panel_7);
		
		/**
		 * my writing button
		 */
		
		panel_7.setLayout(new BoxLayout(panel_7, BoxLayout.X_AXIS));
		
		button = new JButton("");
		panel_7.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setForeground(Color.WHITE);
				textArea_1.setText(selection2Pane() + '\n'
						+ txtTusComentarios.getText());
				
			}
		});
		button.setToolTipText("change style?");
		button.setMargin(new Insets(0, 0, 0, 0));
		button.setIcon(new ImageIcon(MyFrame.class
				.getResource("/icons/Annoying-Hipster.png")));

		panel_7.add(button);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setForeground(Color.LIGHT_GRAY);
				;
			}
		});
		panel_7.add(btnNewButton_1);
		btnNewButton_1.setIcon(new ImageIcon(MyFrame.class
				.getResource("/icons/Male-User.png")));
		btnNewButton_1.setToolTipText("reset?");
		btnNewButton_1.setMargin(new Insets(0, 0, 0, 0));
		
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel_1.add(tabbedPane);
		JLabel lblNewLabel_3 = new JLabel("barba");
		JLabel lblNewLabel_4 = new JLabel("tupe");
		JLabel lblNewLabel_5 = new JLabel("btn");
		JLabel lblNewLabel_6 = new JLabel("gafas");
		
		panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		
		JLabel lblNewLabel = new JLabel("New label");
		panel_2.add(lblNewLabel);
		
		lblNewLabel_2 = new JLabel("New label");
		panel_2.add(lblNewLabel_2);
		
		lblNewLabel_7 = new JLabel("New label");
		panel_2.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("New label");
		panel_2.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("New label");
		panel_2.add(lblNewLabel_9);
		JLabel lblNewLabel_1_1 = new JLabel("Not to be a hipster");
		tabbedPane.addTab("Non Hipster", new ImageIcon(MyFrame.class.
				getResource("/icons/Male-User@Low.png")), lblNewLabel_1_1, "you are not");
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);
		
		txtTusComentarios = new JTextArea();
		txtTusComentarios.setText("Añade tus comentarios.");
		scrollPane.setViewportView(txtTusComentarios);

		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));

		textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setBackground(new Color(120, 120, 120, 255));
		textArea_1.setForeground(Color.WHITE);
		panel_3.add(textArea_1, BorderLayout.CENTER);
	}
	public String selection2Pane() {
		String text = "";
		if (chckbxGafasPasta.isSelected())
			text += "con sus gafitas\n";
		if (chckbxNewCheckBox.isSelected())
			text += "con su barbita\n";
		if (chckbxNewCheckBox_1.isSelected())
			text += "con su tupe\n";
		if (chckbxNewCheckBox_2.isSelected())
			text += "con su botÃ³n en el cuello de moda\n";
		if (radioButton.isSelected())
			text += "esa mujer\n";
		if (radioButton_1.isSelected())
			text += "ese hombre\n";
		if (radioButton_2.isSelected())
			text += "esa sexualidad diversa\n";
		return text;
		

	}
}
