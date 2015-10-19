package multiPane01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.Box;

public class initGUI extends JFrame {

	private JPanel contentPane;
	private JCheckBox chckbxGafasPasta;
	private JCheckBox chckbxBarbita;
	private JCheckBox chckbxCuelloAbotonado;
	private JCheckBox chckbxTup;
	private JRadioButton rdbtnGafasPasta;
	private JRadioButton rdbtnBarba;
	private JRadioButton rdbtnTup;
	private JTextArea txtrAadeTusComentarios;
	private JTextArea textArea_1;

	/**
	 * Launch the application.
	 * @author ernesto
	 *
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					initGUI frame = new initGUI();
					frame.setVisible(true);
					frame.setTitle("go hipster go!");
					// frame.setIconImage(new
					// ImageIcon(initGUI.class.getResource("Annoying-Hipster.png")).getImage());
					// frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Sets GTK look&feel
	 */
	{
		// Set Look & Feel

		// javax.swing.UIManager.put("nimbusBase", new Color(50,50,50));
		// javax.swing.UIManager.put("nimbusBlueGrey", new Color(25,0,0));
		// javax.swing.UIManager.put("control", new Color(240,245,245));

		for (LookAndFeelInfo info : javax.swing.UIManager
				.getInstalledLookAndFeels()) {

			try {
				javax.swing.UIManager
						.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Create the frame.
	 */
	public initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 0, 0));

		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
//		panel.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1, false));
		TitledBorder title;
		title = BorderFactory.createTitledBorder("features");
		panel.setBorder(title);

		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));

		chckbxGafasPasta = new JCheckBox("gafas pasta");
		panel_4.add(chckbxGafasPasta);

		chckbxBarbita = new JCheckBox("barbita");
		panel_4.add(chckbxBarbita);

		chckbxTup = new JCheckBox("tupé");
		panel_4.add(chckbxTup);

		chckbxCuelloAbotonado = new JCheckBox("botón cuello");
		panel_4.add(chckbxCuelloAbotonado);

		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));

		JPanel panel_6 = new JPanel();
		panel_6.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel_5.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.Y_AXIS));

		ButtonGroup group = new ButtonGroup();

		rdbtnGafasPasta = new JRadioButton("hombre");
		panel_6.add(rdbtnGafasPasta);
		rdbtnGafasPasta.setHorizontalAlignment(SwingConstants.LEFT);
		group.add(rdbtnGafasPasta);

		rdbtnBarba = new JRadioButton("mujer");
		panel_6.add(rdbtnBarba);
		group.add(rdbtnBarba);

		rdbtnTup = new JRadioButton("otros");
		panel_6.add(rdbtnTup);
		rdbtnTup.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnTup.setSelected(true);
		group.add(rdbtnTup);
		
		Component verticalGlue = Box.createVerticalGlue();
		panel_5.add(verticalGlue);

		JPanel panel_2 = new JPanel();
		panel_5.add(panel_2);

		/**
		 * my writing button
		 */
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		JButton button = new JButton("");
		panel_2.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setForeground(Color.WHITE);
				textArea_1.setText(selection2Pane() + '\n'
						+ txtrAadeTusComentarios.getText());
				
			}
		});

		button.setToolTipText("change style?");
		// button.setIcon(new ImageIcon(initGUI.class
		// .getResource("/icons/Annoying-Hipster.png")));
		// button.setPreferredSize(button.getIcon().getIconWidth(),button.getIcon().getIconHeight());
		button.setMargin(new Insets(0, 0, 0, 0));
		button.setIcon(new ImageIcon(initGUI.class
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
		panel_2.add(button_1);
		button_1.setIcon(new ImageIcon(initGUI.class
				.getResource("/icons/Male-User.png")));
		button_1.setToolTipText("reset?");
		button_1.setMargin(new Insets(0, 0, 0, 0));

		JPanel panel_1 = new JPanel();
//		panel_1.setPreferredSize(new Dimension(50, 50));
//		panel_1.setMaximumSize(new Dimension(50, 50));
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel_1.add(tabbedPane);

		JLabel lblNewLabel_1 = new JLabel("to be a hipster");
		JLabel lblNewLabel = new JLabel("not to be a hipster");
		
		tabbedPane.addTab("hipster", new ImageIcon(initGUI.class
				.getResource("/icons/Annoying-Hipster@Low.png")), lblNewLabel_1, "you are");
		tabbedPane.addTab("non hipster", new ImageIcon(initGUI.class
				.getResource("/icons/Male-User@Low.png")), lblNewLabel, "you are not");

		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);

		txtrAadeTusComentarios = new JTextArea();
		txtrAadeTusComentarios.setText("añade tus comentarios...");
		scrollPane.setViewportView(txtrAadeTusComentarios);

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
		if (chckbxCuelloAbotonado.isSelected())
			text += "con su botón en el cuello de moda\n";
		if (rdbtnBarba.isSelected())
			text += "esa mujer\n";
		if (rdbtnGafasPasta.isSelected())
			text += "ese hombre\n";
		if (rdbtnTup.isSelected())
			text += "esa sexualidad diversa\n";
		return text;

	}
}
