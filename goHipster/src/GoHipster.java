import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;

import java.awt.FlowLayout;

import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.BoxLayout;

import java.awt.Scrollbar;

import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.TextArea;

import javax.swing.JButton;

import java.awt.Component;

import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;

import javax.swing.Box;
import javax.swing.JSplitPane;


public class GoHipster extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GoHipster frame = new GoHipster();
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
	public GoHipster() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 391);
		getContentPane().setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "features", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Gafas Pasta");
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.LEFT);
		panel_4.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Barbita");
		chckbxNewCheckBox_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_4.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Tupe");
		chckbxNewCheckBox_2.setHorizontalAlignment(SwingConstants.LEFT);
		panel_4.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Bot\u00F3n cuello");
		chckbxNewCheckBox_3.setHorizontalAlignment(SwingConstants.LEFT);
		panel_4.add(chckbxNewCheckBox_3);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_5.add(panel_8, BorderLayout.NORTH);
		panel_8.setLayout(new BoxLayout(panel_8, BoxLayout.Y_AXIS));
		
		JRadioButton radioButton_2 = new JRadioButton("otros");
		panel_8.add(radioButton_2);
		radioButton_2.setVerticalAlignment(SwingConstants.TOP);
		radioButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		
		JRadioButton radioButton = new JRadioButton("hombre");
		panel_8.add(radioButton);
		radioButton.setVerticalAlignment(SwingConstants.TOP);
		radioButton.setHorizontalAlignment(SwingConstants.LEFT);
		
		JRadioButton radioButton_1 = new JRadioButton("mujer");
		panel_8.add(radioButton_1);
		radioButton_1.setVerticalAlignment(SwingConstants.TOP);
		radioButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		
		JSplitPane splitPane = new JSplitPane();
		panel_5.add(splitPane, BorderLayout.SOUTH);
		
		JButton button_1 = new JButton("");
		splitPane.setLeftComponent(button_1);
		button_1.setIcon(new ImageIcon("C:\\Users\\Miguel\\Google Drive\\UEM\\Workspace\\VentanaGoHipster\\PNGs\\Male-User.png"));
		button_1.setMargin(new Insets(0, 0, 0, 0));
		
		JButton button = new JButton("");
		splitPane.setRightComponent(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setIcon(new ImageIcon("C:\\Users\\Miguel\\Google Drive\\UEM\\Workspace\\VentanaGoHipster\\PNGs\\Annoying-Hipster.png"));
		button.setMargin(new Insets(0, 0, 0, 0));

		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel_1.add(tabbedPane);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("hipster", new ImageIcon("C:\\Users\\Miguel\\Google Drive\\UEM\\Workspace\\VentanaGoHipster\\PNGs\\Annoying-Hipster@Low.png"), panel_6, null);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.X_AXIS));
		
		JPanel panel_7 = new JPanel();
		panel_7.setToolTipText("");
		tabbedPane.addTab("non hipster", new ImageIcon("C:\\Users\\Miguel\\Google Drive\\UEM\\Workspace\\VentanaGoHipster\\PNGs\\Male-User@Low.png"), panel_7, null);
		panel_7.setLayout(new BoxLayout(panel_7, BoxLayout.X_AXIS));
		
		JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JPanel panel_3 = new JPanel();
		getContentPane().add(panel_3);
	}

}
