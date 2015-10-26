import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import javax.swing.Icon;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Vista {

	private JFrame frame;
	private JRadioButton rbtn3;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	Modelo mod = new Modelo();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				for (LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
					try {
						 UIManager.setLookAndFeel(
						            UIManager.getCrossPlatformLookAndFeelClassName());
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				try {
					Vista window = new Vista();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Vista() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(
				Toolkit.getDefaultToolkit().getImage(Vista.class.getResource("/icons/Annoying-Hipster@High.png")));
		frame.setBounds(100, 100, 687, 444);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(2, 2, 0, 0));

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Features", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));

		JCheckBox chkbox1 = new JCheckBox("gafas pasta");
		panel_4.add(chkbox1);

		JCheckBox chkbox2 = new JCheckBox("barba");
		panel_4.add(chkbox2);

		JCheckBox chkbox3 = new JCheckBox("tupé");
		panel_4.add(chkbox3);

		JCheckBox chkbox4 = new JCheckBox("botón cuello");
		panel_4.add(chkbox4);

		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new GridLayout(2, 1, 0, 0));

		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.Y_AXIS));

		JRadioButton rbt1 = new JRadioButton("Hombre");

		buttonGroup.add(rbt1);
		panel_6.add(rbt1);

		JRadioButton rbn2 = new JRadioButton("Mujer");
		buttonGroup.add(rbn2);
		panel_6.add(rbn2);

		rbtn3 = new JRadioButton("Otros");
		buttonGroup.add(rbtn3);
		panel_6.add(rbtn3);

		JPanel panel_7 = new JPanel();
		panel_5.add(panel_7);
		panel_7.setLayout(null);

		JButton btn1 = new JButton("");
		btn1.setIcon(new ImageIcon(Vista.class.getResource("/icons/Annoying-Hipster.png")));
		btn1.setBounds(12, 38, 50, 50);
		panel_7.add(btn1);

		Component verticalGlue = Box.createVerticalGlue();
		verticalGlue.setBounds(27, 0, 12, 43);
		panel_7.add(verticalGlue);

		JButton btn2 = new JButton("");
		btn2.setIcon(new ImageIcon(Vista.class.getResource("/icons/Male-User.png")));
		btn2.setBounds(87, 38, 50, 50);
		panel_7.add(btn2);

		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel_1.add(tabbedPane);

		JPanel hipster = new JPanel();
		tabbedPane.addTab("Hipster", new ImageIcon(Vista.class.getResource("/icons/Annoying-Hipster@Low.png")), hipster,
				null);

		JPanel non_hipster = new JPanel();
		tabbedPane.addTab("Non Hipster", new ImageIcon(Vista.class.getResource("/icons/Male-User@Low.png")),
				non_hipster, null);

		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.Y_AXIS));

		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane);

		JTextArea txtAreaEntrada = new JTextArea();
		scrollPane.setViewportView(txtAreaEntrada);

		JPanel panel_3 = new JPanel();
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));

		JTextArea txtAreaResults = new JTextArea();
		txtAreaResults.setBackground(Color.LIGHT_GRAY);
		txtAreaResults.setEditable(false);
		panel_3.add(txtAreaResults, BorderLayout.CENTER);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.desktop);
		frame.setJMenuBar(menuBar);

		JMenu mnSettings = new JMenu("Settings");
		mnSettings.setBackground(Color.LIGHT_GRAY);
		menuBar.add(mnSettings);

		JMenuItem menuit1 = new JMenuItem("Config");
		menuit1.setForeground(SystemColor.desktop);
		menuit1.setBackground(SystemColor.desktop);
		mnSettings.add(menuit1);

		JMenuItem menuit2 = new JMenuItem("Save");
		menuit2.setBackground(SystemColor.desktop);
		menuit2.setForeground(SystemColor.desktop);
		mnSettings.add(menuit2);

		JMenu mnRecientes = new JMenu("recientes");
		mnRecientes.setForeground(SystemColor.desktop);
		mnSettings.add(mnRecientes);

		JMenuItem mntmHipstah = new JMenuItem("Hipstah1");
		mntmHipstah.setBackground(SystemColor.desktop);
		mntmHipstah.setForeground(SystemColor.desktop);
		mnRecientes.add(mntmHipstah);

		JMenuItem mntmHipstah_1 = new JMenuItem("Hipstah2");
		mntmHipstah_1.setForeground(SystemColor.desktop);
		mnRecientes.add(mntmHipstah_1);

		JMenuItem mntmOtro = new JMenuItem("otro...");
		mntmOtro.setForeground(SystemColor.desktop);
		mnRecientes.add(mntmOtro);

		JMenuItem menuit3 = new JMenuItem("Exit");
		menuit3.setForeground(SystemColor.desktop);
		mnSettings.add(menuit3);

		rbt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon male = new ImageIcon("src/icons/Male-User.png");
				if (rbt1.isSelected())
					btn2.setIcon(male);

			}
		});

		rbn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon male = new ImageIcon("src/icons/Female-User.png");
				if (rbn2.isSelected()) {
					btn2.setIcon(male);
					
				}
			}
		});
	}

}
