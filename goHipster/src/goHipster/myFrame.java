package goHipster;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import java.awt.Color;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JButton;






import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.border.LineBorder;
import javax.swing.Box;


public class myFrame extends JFrame {

	private JPanel contentPane;

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
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("gafas pasta");
		chckbxNewCheckBox.setSelected(true);
		panel_4.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("barbita");
		chckbxNewCheckBox_1.setSelected(true);
		panel_4.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("tup\u00E8");
		panel_4.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("bot\u00F2n cuello");
		panel_4.add(chckbxNewCheckBox_3);
		
		Component verticalGlue = Box.createVerticalGlue();
		panel_4.add(verticalGlue);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("hombre");
		panel_5.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("mujer");
		rdbtnNewRadioButton_2.setSelected(true);
		panel_5.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("otros");
		panel_5.add(rdbtnNewRadioButton_1);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		panel_5.add(verticalGlue_1);
		
		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6);
		
		JButton btnNewButton = new JButton();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
		
		JTextArea textArea = new JTextArea();
		panel_2.add(textArea);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.X_AXIS));
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(Color.GRAY);
		panel_3.add(textArea_1);
	}

}
