package goHipster;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import java.awt.GridBagLayout;

import javax.swing.JTextArea;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JFormattedTextField;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;

public class hipsterFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hipsterFrame frame = new hipsterFrame();
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
	public hipsterFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 5, 5));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "features", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
		
		JPanel panel_6 = new JPanel();
		panel_4.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.Y_AXIS));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Gafas pasta");
		panel_6.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("barbita");
		panel_6.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("tupe");
		panel_6.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("boton cuello");
		panel_6.add(chckbxNewCheckBox_3);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		panel.add(horizontalGlue);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		
		JPanel panel_7 = new JPanel();
		panel_5.add(panel_7);
		panel_7.setLayout(new BoxLayout(panel_7, BoxLayout.Y_AXIS));
		
		ButtonGroup grupo= new ButtonGroup();
		JRadioButton rdbtnNewRadioButton = new JRadioButton("hombre");
		panel_7.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("mujer");
		panel_7.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("otro");
		panel_7.add(rdbtnNewRadioButton_2);
		
		grupo.add(rdbtnNewRadioButton);
		grupo.add(rdbtnNewRadioButton_1);
		grupo.add(rdbtnNewRadioButton_2);
		
		JPanel panel_8 = new JPanel();
		panel_7.add(panel_8);
		panel_8.setLayout(new BoxLayout(panel_8, BoxLayout.X_AXIS));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(hipsterFrame.class.getResource("/icons/Annoying-Hipster.png")));
		panel_8.add(btnNewButton);
		btnNewButton.setMargin(new Insets(0, 0, 0, 0));
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(hipsterFrame.class.getResource("/icons/Male-User.png")));
		panel_8.add(btnNewButton_1);
		btnNewButton_1.setMargin(new Insets(0, 0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel_1.add(tabbedPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("to be a hipster");
		tabbedPane.addTab("hipster", new ImageIcon(hipsterFrame.class.getResource("/icons/Annoying-Hipster@Low.png")), lblNewLabel, null);
		
		JLabel lblNewLabel_1 = new JLabel("Not to be a hipster");
		tabbedPane.addTab("non hipster",new ImageIcon(hipsterFrame.class.getResource("/icons/Male-User@Low.png")) , lblNewLabel_1, null);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		JTextArea txtrAadeUnComentario = new JTextArea();
		txtrAadeUnComentario.setText("a\u00F1ade un comentario...");
		panel_2.add(txtrAadeUnComentario);
		
		JPanel panel_3 = new JPanel();
		panel_3.setForeground(Color.WHITE);
		contentPane.add(panel_3);
	}

}
