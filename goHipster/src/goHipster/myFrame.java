package goHipster;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


public class myFrame extends JFrame {

	private JPanel contentPane;
	private JCheckBox chckbxGafasPasta;
	private JCheckBox chckbxBarbita;
	private JCheckBox chckbxCuelloAbotonado;
	private JCheckBox chckbxTup;
	private JRadioButton rdbtnGafasPasta;
	private JRadioButton rdbtnBarba;
	private JRadioButton rdbtnTup;
	private JTextArea textArea;
	private JTextArea textArea_1;
	private JButton btnNewButton;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myFrame frame = new myFrame();
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
	public myFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 3, 3));
		
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JPanel panel_4 = new JPanel();
		panel_4.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
		
		chckbxGafasPasta = new JCheckBox("gafas pasta");
		chckbxGafasPasta.setSelected(true);
		panel_4.add(chckbxGafasPasta);
		
		chckbxBarbita = new JCheckBox("barbita");
		chckbxBarbita.setSelected(true);
		panel_4.add(chckbxBarbita);
		
		chckbxTup= new JCheckBox("tup\u00E8");
		panel_4.add(chckbxTup);
		
		chckbxCuelloAbotonado = new JCheckBox("bot\u00F2n cuello");
		panel_4.add(chckbxCuelloAbotonado);
		
		Component verticalGlue = Box.createVerticalGlue();
		panel_4.add(verticalGlue);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));
		
		rdbtnNewRadioButton = new JRadioButton("hombre");
		panel_5.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_2 = new JRadioButton("mujer");
		rdbtnNewRadioButton_2.setSelected(true);
		panel_5.add(rdbtnNewRadioButton_2);
		
		rdbtnNewRadioButton_1 = new JRadioButton("otros");
		panel_5.add(rdbtnNewRadioButton_1);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		panel_5.add(verticalGlue_1);
		
		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6);
		
		btnNewButton = new JButton();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea_1.setForeground(Color.WHITE);
				textArea_1.setText(selection2Pane() + '\n'
						+ textArea.getText());
			}
		});
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.X_AXIS));
		btnNewButton.setIcon(new ImageIcon(myFrame.class.getResource("/icons/Annoying-Hipster@Low.png")));
		panel_6.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton();
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(myFrame.class.getResource("/icons/Male-User@Low.png")));
		panel_6.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel_1.add(tabbedPane);

		JLabel lblNewLabel_1 = new JLabel("to be a hipster");
		JLabel lblNewLabel = new JLabel("not to be a hipster");
		
		tabbedPane.addTab("hipster", new ImageIcon(myFrame.class
				.getResource("/icons/Annoying-Hipster@Low.png")), lblNewLabel_1, "you are");
		tabbedPane.addTab("non hipster", new ImageIcon(myFrame.class
				.getResource("/icons/Male-User@Low.png")), lblNewLabel, "you are not");

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		 textArea = new JTextArea();
		panel_2.add(textArea);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.X_AXIS));
		
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
		if (chckbxBarbita.isSelected())
			text += "con su barbita\n";
		if (chckbxTup.isSelected())
			text += "con su tupe\n";
		if (chckbxCuelloAbotonado.isSelected())
			text += "con su botón en el cuello de moda\n";
		if (rdbtnNewRadioButton_2.isSelected())
			text += "esa mujer\n";
		if (rdbtnNewRadioButton.isSelected())
			text += "ese hombre\n";
		if (rdbtnNewRadioButton_1.isSelected())
			text += "esa sexualidad diversa\n";
		return text;

	}
}
