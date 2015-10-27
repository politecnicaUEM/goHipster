package goHipster;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Component;
import java.awt.Insets;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

import java.awt.Dimension;
import java.awt.Color;

import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.Box;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

public class MyFrame extends JFrame {

	private JPanel contentPane;
	private String txt4 = "";
	private JCheckBox check1 = new JCheckBox("gafas pasta");
	private JCheckBox check2 = new JCheckBox("barbita");
	private JCheckBox check3 = new JCheckBox("tup\u00E9");
	private JCheckBox check4 = new JCheckBox("bot\u00F3n cuello");
	private ButtonGroup grupoBoton = new ButtonGroup();
	private JRadioButton radbut1 = new JRadioButton("hombre");
	private JRadioButton radbut2 = new JRadioButton("mujer");
	private JRadioButton radbut3 = new JRadioButton("otros");
	//hola
	private JTextArea Comentario = new JTextArea();
	private JTextArea textArea = new JTextArea();
	private JButton button1 = new JButton("");
	private JButton button2 = new JButton("");
	
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
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 2, 2));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "features", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setName("");
		panel.setToolTipText("");
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
		
		panel_4.add(check1);
		panel_4.add(check2);		
		panel_4.add(check3);	
		panel_4.add(check4);
		
		Component verticalGlue = Box.createVerticalGlue();
		panel_4.add(verticalGlue);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		panel.add(horizontalGlue);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));
		
		JPanel panel_7 = new JPanel();
		panel_7.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel_5.add(panel_7);
		panel_7.setLayout(new BoxLayout(panel_7, BoxLayout.Y_AXIS));
		
		panel_7.add(radbut1);
		panel_7.add(radbut2);
		panel_7.add(radbut3);
		
		radbut1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				button1.setIcon(new ImageIcon(MyFrame.class.getResource("/icons/Annoying-Hipster.png")));
			}
			
		});		
				
		radbut2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				button1.setIcon(new ImageIcon(MyFrame.class.getResource("/icons/Female-User.png")));
			}
			
		});		
				
		radbut3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				button1.setIcon(new ImageIcon(MyFrame.class.getResource("/icons/The-Batman.png")));
			}
			
		});
		
		grupoBoton.add(radbut1);
		grupoBoton.add(radbut2);
		grupoBoton.add(radbut3);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		panel_7.add(verticalGlue_1);
		
		Component verticalStrut = Box.createVerticalStrut(10);
		panel_5.add(verticalStrut);
		
		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.X_AXIS));
		
		button1.setMargin(new Insets(1, 1, 1, 1));
		panel_6.add(button1);
		button1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		button1.setIcon(new ImageIcon(MyFrame.class.getResource("/icons/Annoying-Hipster.png")));
		
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				mostrar_eleccion();				
			}
		});
		
		button2.setMargin(new Insets(1, 1, 1, 1));
		panel_6.add(button2);
		button2.setAlignmentX(Component.CENTER_ALIGNMENT);
		button2.setIcon(new ImageIcon(MyFrame.class.getResource("/icons/Male-User.png")));
		button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(radbut1.isSelected()){
					txt4 = "Categoría: Hombre\n";
				}
				if(radbut2.isSelected()){
					txt4 = "Categoría: Mujer\n";
				}
				if(radbut3.isSelected()){
					txt4 = "Categoría: Otro\n";
				}
				textArea.setText("Nada que destacar\n" + Comentario.getText());			
			}
		});
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		panel_5.add(rigidArea);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel_1.add(tabbedPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("to be a hipster");
		tabbedPane.addTab("Hipster", new ImageIcon(MyFrame.class.getResource("/icons/Annoying-Hipster@Low.png")), lblNewLabel, null);
		JLabel lblNewLabel_1 = new JLabel("Not to be a hipster");
		tabbedPane.addTab("Non Hipster", new ImageIcon(MyFrame.class.getResource("/icons/Male-User@Low.png")), lblNewLabel_1, null);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane);
		
		Comentario.setText("Introduce un comentario");
		scrollPane.setViewportView(Comentario);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.GRAY);
		contentPane.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		textArea.setLineWrap(true);
		textArea.setCaretColor(Color.BLACK);
		textArea.setBackground(Color.LIGHT_GRAY);
		
		panel_3.add(textArea);
		
	}
	
	public void mostrar_eleccion(){			
		String txt = "", txt1 = "", txt2 = "", txt3 = "";
		if(radbut1.isSelected()){
			txt4 = "Categoría: Hombre\n";
		}
		if(radbut2.isSelected()){
			txt4 = "Categoría: Mujer\n";
		}
		if(radbut3.isSelected()){
			txt4 = "Categoría: Otro\n";
		}
		if(check1.isSelected()){txt = check1.getText() + "\n";}	
		if(check2.isSelected()){txt1 = check2.getText() + "\n";}		
		if(check3.isSelected()){txt2 = check3.getText() + "\n";}		
		if(check4.isSelected()){txt3 = check4.getText() + "\n";}		
		textArea.setText(txt4 + txt + txt1 + txt2 + txt3 + "\n" + Comentario.getText());	
	}
	
}
