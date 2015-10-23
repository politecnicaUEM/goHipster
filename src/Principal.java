import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Features", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
		
		JCheckBox chckbxGafas = new JCheckBox("Gafa Pasta");
		panel_4.add(chckbxGafas);
		
		JCheckBox chckbxBarbas = new JCheckBox("Barba");
		panel_4.add(chckbxBarbas);
		
		JCheckBox chckbxTupe = new JCheckBox("Tupe");
		panel_4.add(chckbxTupe);
		
		JCheckBox chckbxCuelloBoton = new JCheckBox("Boton Cuello");
		panel_4.add(chckbxCuelloBoton);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));
		
		JPanel panel_3 = new JPanel();
		panel_3.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel_5.add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.Y_AXIS));
		
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton rdbtnHombre = new JRadioButton("Hombre");
		panel_3.add(rdbtnHombre);
		group.add(rdbtnHombre);
		
		JRadioButton rdbtnMujer = new JRadioButton("Mujer");
		panel_3.add(rdbtnMujer);
		group.add(rdbtnMujer);
		
		JRadioButton rdbtnOtros = new JRadioButton("Otros");
		panel_3.add(rdbtnOtros);
		group.add(rdbtnOtros);
		
		Component verticalGlue = Box.createVerticalGlue();
		panel_3.add(verticalGlue);
		
		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.X_AXIS));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setIcon(new ImageIcon(Principal.class.getResource("/icon/Male-User.png")));
		btnNewButton.setMargin(new Insets(0, 0, 0, 0));
		
		panel_6.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Principal.class.getResource("/icon/Annoying-Hipster.png")));
		btnNewButton_1.setMargin(new Insets(0, 0, 0, 0));
		
		panel_6.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane TabPane = new JTabbedPane(JTabbedPane.TOP);
		panel_1.add(TabPane, BorderLayout.CENTER);
		JLabel label1 = new JLabel("To be a Hipster");
		TabPane.addTab("Hipster", new ImageIcon(Principal.class.getResource("/icon/Annoying-Hipster.png")), label1, null);
		JLabel label2 = new JLabel("Not to be a Hipster");
		TabPane.addTab("No Hipster", new ImageIcon(Principal.class.getResource("/icon/Male-User.png")), label2, null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		contentPane.add(scrollPane_1);
		
		JTextArea txtrAadeTusComentarios = new JTextArea();
		txtrAadeTusComentarios.setText("Añade tus comentarios...");
		scrollPane_1.setViewportView(txtrAadeTusComentarios);
		
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(Color.GRAY);
		panel_2.add(textArea_1, BorderLayout.CENTER);
	}

}
