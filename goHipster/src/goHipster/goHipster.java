package goHipster;
import java.awt.BorderLayout;
import java.awt.EventQueue;
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


public class goHipster extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					goHipster frame = new goHipster();
					frame.setVisible(true);
					frame.setTitle("go Hipster go!");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public goHipster() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Features", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.Y_AXIS));
		
		JCheckBox cbgafas = new JCheckBox("Gafas pasta");
		panel_3.add(cbgafas);
		
		JCheckBox cbbarba = new JCheckBox("Barbita");
		panel_3.add(cbbarba);
		
		JCheckBox cbtupe = new JCheckBox("Tupe");
		panel_3.add(cbtupe);
		
		JCheckBox cbcuello = new JCheckBox("Boton cuello");
		panel_3.add(cbcuello);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
		
		JPanel panel_5 = new JPanel();
		panel_5.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel_4.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));
		
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton rdbtnhombre = new JRadioButton("hombre");
		rdbtnhombre.setHorizontalAlignment(SwingConstants.LEFT);
		panel_5.add(rdbtnhombre);
		group.add(rdbtnhombre);
		
		JRadioButton rdbtnmujer = new JRadioButton("mujer");
		panel_5.add(rdbtnmujer);
		group.add(rdbtnmujer);
		
		
		JRadioButton rdbtnotros = new JRadioButton("otros");
		rdbtnotros.setSelected(true);
		rdbtnotros.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(rdbtnotros);
		group.add(rdbtnotros);
		
		Component verticalGlue = Box.createVerticalGlue();
		panel_4.add(verticalGlue);
		
		JPanel panel_6 = new JPanel();
		panel_4.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.X_AXIS));
		
		JButton btn = new JButton("");
		panel_6.add(btn);
		
		btn.setMargin(new Insets(0, 0, 0, 0));
		btn.setIcon(new ImageIcon(goHipster.class
				.getResource("/icons/Annoying-Hipster.png")));
		
		JButton btn1 = new JButton("");
		panel_6.add(btn1);
		
		btn1.setIcon(new ImageIcon(goHipster.class
				.getResource("/icons/Male-User.png")));
		btn1.setToolTipText("reset?");
		btn1.setMargin(new Insets(0, 0, 0, 0));

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel_1.add(tabbedPane, BorderLayout.CENTER);
		
		JLabel lbl = new JLabel("To be a hipster");
		JLabel lbl1 = new JLabel("Not to be a hipster");
		
		tabbedPane.addTab("hipster", new ImageIcon(goHipster.class
				.getResource("/icons/Annoying-Hipster@Low.png")), lbl, "you are");
		tabbedPane.addTab("non hipster", new ImageIcon(goHipster.class
				.getResource("/icons/Male-User@Low.png")), lbl1, "you are not");
		
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);
		
		JTextArea txtAcoments = new JTextArea();
		txtAcoments.setText("añade tus comentarios...");
		scrollPane.setViewportView(txtAcoments);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JTextArea txtA1 = new JTextArea();
		txtA1.setEditable(false);
		txtA1.setBackground(new Color(120, 120, 120, 255));
		txtA1.setForeground(Color.WHITE);
		panel_2.add(txtA1, BorderLayout.CENTER);
	}

}
