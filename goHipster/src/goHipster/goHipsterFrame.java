package goHipster;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.jws.Oneway;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Component;

import javax.swing.JTextPane;

import java.awt.Insets;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.awt.Color;

import javax.swing.border.EtchedBorder;
import javax.swing.Box;

public class goHipsterFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					goHipsterFrame frame = new goHipsterFrame();
					frame.setTitle("go Hipster Go!");
					frame.setVisible(true);
					frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public goHipsterFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 2, 2));
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.RED, null));
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		TitledBorder title;
		title = BorderFactory.createTitledBorder("features");
		panel.setBorder(title);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("gafas pasta");
		panel_4.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("barbita");
		panel_4.add(chckbxNewCheckBox_1);
		
		JCheckBox checkBox = new JCheckBox("tup\u00E9");
		panel_4.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("bot\u00F3n cuello");
		panel_4.add(checkBox_1);
		
		Component verticalGlue = Box.createVerticalGlue();
		panel_4.add(verticalGlue);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		panel.add(horizontalGlue);
		
		JPanel panel_10 = new JPanel();
		panel.add(panel_10);
		panel_10.setLayout(new BoxLayout(panel_10, BoxLayout.Y_AXIS));
		
		JPanel panel_5 = new JPanel();
		panel_5.setAlignmentY(Component.TOP_ALIGNMENT);
		panel_10.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("mujer");
		panel_5.add(rdbtnNewRadioButton);
		
		ButtonGroup group = new ButtonGroup();
		
		group.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("otros");
		panel_5.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("hombre");
		panel_5.add(rdbtnNewRadioButton_2);
		group.add(rdbtnNewRadioButton_2);
		
				JPanel panel_8 = new JPanel();
				panel_8.setAlignmentY(Component.TOP_ALIGNMENT);
				panel_8.setAlignmentX(Component.LEFT_ALIGNMENT);
				panel_10.add(panel_8);
				panel_8.setLayout(new BoxLayout(panel_8, BoxLayout.X_AXIS));
				
				JButton btnNewButton = new JButton("");
				btnNewButton.setMargin(new Insets(0, 0, 0, 0));
				btnNewButton.setIcon(new ImageIcon(goHipsterFrame.class.getResource("/icons/Annoying-Hipster@Low.png")));
				panel_8.add(btnNewButton);
				
				JButton btnNewButton_1 = new JButton("");
				btnNewButton_1.setMargin(new Insets(0, 0, 0, 0));
				btnNewButton_1.setIcon(new ImageIcon(goHipsterFrame.class.getResource("/icons/Male-User@Low.png")));
				panel_8.add(btnNewButton_1);
				
				Component verticalGlue_1 = Box.createVerticalGlue();
				panel_10.add(verticalGlue_1);
		
		
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		panel_1.add(tabbedPane, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("to be a hipster");
		tabbedPane.addTab("hipster", new ImageIcon(goHipsterFrame.class.getResource("../icons/Annoying-Hipster@Low.png")), lblNewLabel, "You are");
		
		JLabel lblNewLabel_1 = new JLabel("not to be a hipster");
		tabbedPane.addTab("not hipster",new ImageIcon(goHipsterFrame.class.getResource("../icons/Male-User@Low.png")), lblNewLabel_1, "You are not");
		
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
