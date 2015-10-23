package paneBuildin;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.ScrollPane;
import java.awt.TextArea;

import javax.swing.border.TitledBorder;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.Component;

import javax.swing.SwingConstants;
import javax.swing.Box;
import javax.swing.JTextArea;



import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyBuildFrame extends JFrame {

	JCheckBox chckbxGafasPasta=new JCheckBox();
	JCheckBox chckbxBarbita=new JCheckBox();
	JCheckBox chckbxTup=new JCheckBox();
	JCheckBox chckbxBotnCuello=new JCheckBox();
	JRadioButton rdbtnHombre = new JRadioButton("Hombre");
	JRadioButton rdbtnMujer = new JRadioButton("Mujer");
	JRadioButton rdbtnOtros = new JRadioButton("Otros");
	
	private JPanel contentPane;
	private JTextArea textArea_1;
	private JTextArea textArea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyBuildFrame frame = new MyBuildFrame();
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
	public MyBuildFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Features", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
		
		chckbxGafasPasta = new JCheckBox("Gafas pasta");
		panel_4.add(chckbxGafasPasta);
		
		chckbxBarbita = new JCheckBox("Barbita");
		panel_4.add(chckbxBarbita);
		
		chckbxTup = new JCheckBox("Tup\u00E9");
		panel_4.add(chckbxTup);
		
		chckbxBotnCuello = new JCheckBox("Bot\u00F3n cuello");
		panel_4.add(chckbxBotnCuello);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));
		
		JPanel panel_6 = new JPanel();
		panel_6.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel_6.setAlignmentY(0.0f);
		panel_5.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.Y_AXIS));
		
		ButtonGroup grupo =  new  ButtonGroup ();

		
		
		rdbtnHombre = new JRadioButton("Hombre");
		rdbtnHombre.setAlignmentY(0.0f);
		panel_6.add(rdbtnHombre);
		grupo.add(rdbtnHombre);
		
		
		rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.setAlignmentY(0.0f);
		panel_6.add(rdbtnMujer);
		grupo.add(rdbtnMujer);
		
		
		rdbtnOtros = new JRadioButton("Otros");
		rdbtnOtros.setAlignmentY(0.0f);
		panel_6.add(rdbtnOtros);
		grupo.add(rdbtnOtros);
		
		Component verticalGlue = Box.createVerticalGlue();
		panel_5.add(verticalGlue);
		
		JPanel panel_7 = new JPanel();
		panel_5.add(panel_7);
		panel_7.setLayout(new BoxLayout(panel_7, BoxLayout.X_AXIS));
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		
		
		
		JButton button = new JButton("");
		panel_7.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setForeground(Color.WHITE);
				textArea_1.setText(selection2Pane() +'\n'
						+ textArea.getText());
				
			}
		});
	
		button.setToolTipText("change style?");
		// button.setIcon(new ImageIcon(initGUI.class
		// .getResource("/icons/Annoying-Hipster.png")));
		// button.setPreferredSize(button.getIcon().getIconWidth(),button.getIcon().getIconHeight());
		button.setMargin(new Insets(0, 0, 0, 0));
		button.setIcon(new ImageIcon(MyBuildFrame.class
				.getResource("/icons/Annoying-Hipster.png")));

		/**
		 * my cleaning button
		 */
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				textArea_1.setText("");
				textArea_1.setForeground(Color.LIGHT_GRAY);
				;
			}
		});
		panel_7.add(button_1);
		button_1.setIcon(new ImageIcon(MyBuildFrame.class
				.getResource("/icons/Male-User.png")));
		button_1.setToolTipText("reset?");
		button_1.setMargin(new Insets(0, 0, 0, 0));
		
		
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel_1.add(tabbedPane, BorderLayout.CENTER);
		JLabel jl=new JLabel("Non hister");
		JLabel jl2=new JLabel("Non hister");
		
		tabbedPane.addTab("hipster", new ImageIcon(MyBuildFrame.class
				.getResource("/icons/Annoying-Hipster@Low.png")), jl, "you are");
		tabbedPane.addTab("non hipster", new ImageIcon(MyBuildFrame.class
				.getResource("/icons/Male-User@Low.png")), jl2, "you are not");

		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		textArea = new JTextArea();
		textArea.setText("añade tus comentarios...");
		panel_2.add(textArea);
		
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
		if (chckbxBarbita.isSelected())
			text += "con su barbita\n";
		if (chckbxTup.isSelected())
			text += "con su tupe\n";
		if (chckbxBotnCuello.isSelected())
			text += "con su botón en el cuello de moda\n";
		if (rdbtnHombre.isSelected())
			text += "esa mujer\n";
		if (rdbtnMujer.isSelected())
			text += "ese hombre\n";
		if (rdbtnOtros.isSelected())
			text += "esa sexualidad diversa\n";
		return text;

	}

	

}
