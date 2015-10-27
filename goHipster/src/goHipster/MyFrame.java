package goHipster;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import java.awt.Component;
import java.awt.Panel;

public class MyFrame extends JFrame {

	private JPanel contentPane;
	private JRadioButton rdbtnH;
	private JRadioButton rdbtnM;
	private JRadioButton rdbtnO;
	JCheckBox chckbxGafas;
	JCheckBox chckbxBarba;
	JCheckBox chckbxTupe;
	JCheckBox chckbxCuello;

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
		setTitle("go Hipster go!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "features", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1,0,0,0));
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
		
		chckbxGafas = new JCheckBox("gafas pasta");
		//chckbxGafas.setSelected(true);
		panel_4.add(chckbxGafas);
		
		chckbxBarba = new JCheckBox("barbita");
		//chckbxBarba.setSelected(true);
		panel_4.add(chckbxBarba);
		
		chckbxTupe = new JCheckBox("tupé");
		panel_4.add(chckbxTupe);
		
		chckbxCuello = new JCheckBox("botón cuello");
		panel_4.add(chckbxCuello);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));
		
		JPanel panel_6 = new JPanel();
		panel_6.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel_5.add(panel_6);	
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.Y_AXIS));
		
		ButtonGroup bg = new ButtonGroup();

		rdbtnH = new JRadioButton("Hombre");
		panel_6.add(rdbtnH);
		rdbtnH.setHorizontalAlignment(SwingConstants.LEFT);
		bg.add(rdbtnH);
		
		rdbtnM = new JRadioButton("Mujer");
		panel_6.add(rdbtnM);
		//rdbtnM.setSelected(true);
		bg.add(rdbtnM);
		
		rdbtnO = new JRadioButton("Otros");
		panel_6.add(rdbtnO);
		rdbtnO.setHorizontalAlignment(SwingConstants.CENTER);
		bg.add(rdbtnO);
		
		Component verticalGlue = Box.createVerticalGlue();
		panel_5.add(verticalGlue);		
		
		JPanel panel_7 = new JPanel();
		panel_5.add(panel_7);
		panel_7.setLayout(new BoxLayout(panel_7, BoxLayout.X_AXIS));
		
		Component horizontalGlue = Box.createHorizontalGlue();
		panel_7.add(horizontalGlue);
		
		JButton btnAnadir = new JButton("");
		panel_7.add(btnAnadir);
		btnAnadir.setIcon(new ImageIcon(MyFrame.class.getResource("/icons/Male-User.png")));
		btnAnadir.setMargin(new Insets(1,1,1,1));
		
		JButton btnReset = new JButton("");
		panel_7.add(btnReset);
		btnReset.setIcon(new ImageIcon(MyFrame.class.getResource("/icons/Annoying-Hipster.png")));
		btnReset.setMargin(new Insets(1,1,1,1));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel_1.add(tabbedPane);
		
		JLabel lblNewLabel = new JLabel("not to be a Hipster");	
		JLabel lblNewLabel_1 = new JLabel("to be a Hipster");
		
		tabbedPane.addTab("Hipster", new ImageIcon(
				MyFrame.class.getResource("/icons/Annoying-Hipster@Low.png")), lblNewLabel_1, "you are");
		tabbedPane.addTab("Non Hipster", new ImageIcon(
				MyFrame.class.getResource("/icons/Male-User@Low.png")), lblNewLabel, "you are not");
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane, BorderLayout.CENTER);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("Añade tus comentarios....");
		scrollPane.setViewportView(textArea);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new BorderLayout(0,0));
		
		JTextArea textArea2 = new JTextArea();
		textArea2.setEditable(false);
		textArea2.setBackground(new Color(120,120,120,255));
		panel_3.add(textArea2, BorderLayout.CENTER);
		
	}

}