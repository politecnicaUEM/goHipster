package goHipster;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JScrollBar;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Insets;
import java.awt.Dimension;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.ScrollPane;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class GoHipster extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 773, 492);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmSettings = new JMenuItem("Settings");
		mnMenu.add(mntmSettings);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Features", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("gafas pasta");
		chckbxNewCheckBox_1.setVerticalAlignment(SwingConstants.TOP);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("barbita");
		chckbxNewCheckBox_2.setVerticalAlignment(SwingConstants.TOP);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("tup\u00E9");
		chckbxNewCheckBox_3.setVerticalAlignment(SwingConstants.TOP);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("bot\u00F3n cuello");
		chckbxNewCheckBox.setVerticalAlignment(SwingConstants.TOP);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
		panel_4.add(chckbxNewCheckBox_1);
		panel_4.add(chckbxNewCheckBox_2);
		panel_4.add(chckbxNewCheckBox_3);
		panel_4.add(chckbxNewCheckBox);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));
		
		JPanel panel_6 = new JPanel();
		panel_6.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel_5.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.Y_AXIS));
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("hombre");
		panel_6.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("mujer");
		panel_6.add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("otros");
		panel_6.add(chckbxNewCheckBox_4);
		
		JSeparator separator = new JSeparator();
		panel_5.add(separator);
		
		JPanel panel_2 = new JPanel();
		panel_5.add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(GoHipster.class.getResource("/icons/Annoying-Hipster.png")));
		button.setVerticalTextPosition(SwingConstants.TOP);
		button.setVerticalAlignment(SwingConstants.TOP);
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_2.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(GoHipster.class.getResource("/icons/Male-User.png")));
		panel_2.add(button_1);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
		);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Hipster", new ImageIcon(GoHipster.class.getResource("/icons/Annoying-Hipster@Low.png")), tabbedPane_1, "");
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Non hipster", new ImageIcon(GoHipster.class.getResource("/icons/Male-User@Low.png")), tabbedPane_2, null);
		panel.setLayout(gl_panel);
		
		TextArea textArea = new TextArea();
		contentPane.add(textArea);
		
		ScrollPane panel_3 = new ScrollPane();
		contentPane.add(panel_3);
	}
}
