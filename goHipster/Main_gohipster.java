package src;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

import java.awt.Cursor;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.BoxLayout;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.SwingConstants;
import javax.swing.JSplitPane;

import java.awt.Dimension;
import java.awt.Component;

import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.border.TitledBorder;
import javax.swing.JButton;

import java.awt.FlowLayout;

import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;

public class Main_gohipster extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_gohipster frame = new Main_gohipster();
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
	public Main_gohipster() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel arriba_iz = new JPanel();
		arriba_iz.setBorder(new TitledBorder(null, "features", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(arriba_iz);
		arriba_iz.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setAlignmentY(Component.TOP_ALIGNMENT);
		arriba_iz.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Gafas pasta");
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Barbita");
		panel.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("tupé");
		panel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("botón cuello");
		panel.add(chckbxNewCheckBox_3);
		
		JPanel panel_1 = new JPanel();
		arriba_iz.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setAlignmentY(Component.TOP_ALIGNMENT);
		panel_3.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel_1.add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.Y_AXIS));
		
		JRadioButton radio_hombre = new JRadioButton("Hombre");
		radio_hombre.setSelected(true);
		radio_hombre.setAlignmentY(0.0f);
		panel_3.add(radio_hombre);
		
		JRadioButton radio_mujer = new JRadioButton("Mujer");
		panel_3.add(radio_mujer);
		
		JRadioButton radio_otros = new JRadioButton("Otros");
		panel_3.add(radio_otros);
		
       	 ButtonGroup group = new ButtonGroup();
       	 
       	 group.add(radio_hombre);
       	 group.add(radio_mujer);
       	 group.add(radio_otros);

		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.setLayout(new GridLayout(1, 2, 15, 15));
		btnNewButton.setIcon(new ImageIcon(Main_gohipster.class.getResource("/img/Annoying-Hipster@High.png")));
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setIcon(new ImageIcon(Main_gohipster.class.getResource("/img/Male-User@High.png")));
		panel_2.add(btnNewButton_1);
		
		JPanel arriba_d = new JPanel();
		contentPane.add(arriba_d);
		arriba_d.setLayout(new BoxLayout(arriba_d, BoxLayout.X_AXIS));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		arriba_d.add(tabbedPane);
		
	
		JTextPane textPane_1 = new JTextPane();
		JTextPane textPane_2 = new JTextPane();
		//segundo atributo imagen
		tabbedPane.addTab("Hipster", new ImageIcon(Main_gohipster.class.getResource("/img/Annoying-Hipster@High.png")), textPane_1, null);
		tabbedPane.addTab("No Hipster", new ImageIcon(Main_gohipster.class.getResource("/img/Male-User@High.png")), textPane_2, null);
		

		
		
		
		
		
	
		
		JPanel abajo_iz = new JPanel();
		contentPane.add(abajo_iz);
		abajo_iz.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		abajo_iz.add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		textPane.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		scrollPane.setViewportView(textPane);
		
		JPanel abajo_d = new JPanel();
		contentPane.add(abajo_d);
	}

}
