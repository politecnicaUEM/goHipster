package goHipster;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
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
import javax.swing.plaf.TextUI;
import javax.swing.JFormattedTextField;

import java.awt.Color;
import java.awt.Component;

import javax.swing.Box;
import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.Action;

public class hipsterFrame extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();
	JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("mujer");
	JButton btnNewButton = new JButton("");
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	JLabel lblNewLabel = new JLabel("");
	JLabel lblNewLabel_1 = new JLabel("Not to be a hipster");
	private final Action action_1 = new SwingAction_1();
	JRadioButton rdbtnNewRadioButton = new JRadioButton("hombre");
	private final Action action_2 = new SwingAction_2();
	JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("otro");
	private final Action action_3 = new SwingAction_3();
	private final Action action_4 = new SwingAction_4();
	private final Action action_5 = new SwingAction_5();
	private final Action action_6 = new SwingAction_6();
	JLabel lblNewLabel_3 = new JLabel("barba");
	JLabel lblNewLabel_4 = new JLabel("tupe");
	JLabel lblNewLabel_5 = new JLabel("btn");
	JLabel lblNewLabel_6 = new JLabel("gafas");
	JCheckBox chckbxNewCheckBox = new JCheckBox("Gafas pasta");
	JCheckBox chckbxNewCheckBox_1 = new JCheckBox("barbita");
	JCheckBox chckbxNewCheckBox_2 = new JCheckBox("tupe");
	JCheckBox chckbxNewCheckBox_3 = new JCheckBox("boton cuello");

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
		
		
		chckbxNewCheckBox.setAction(action_3);
		panel_6.add(chckbxNewCheckBox);
		
		
		chckbxNewCheckBox_1.setAction(action_4);
		panel_6.add(chckbxNewCheckBox_1);
		
		
		chckbxNewCheckBox_2.setAction(action_5);
		panel_6.add(chckbxNewCheckBox_2);
		
		
		chckbxNewCheckBox_3.setAction(action_6);
		panel_6.add(chckbxNewCheckBox_3);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		panel.add(horizontalGlue);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		
		JPanel panel_7 = new JPanel();
		panel_5.add(panel_7);
		panel_7.setLayout(new BoxLayout(panel_7, BoxLayout.Y_AXIS));
		
		ButtonGroup grupo= new ButtonGroup();
		
		rdbtnNewRadioButton.setAction(action_1);
		panel_7.add(rdbtnNewRadioButton);
		
		
		rdbtnNewRadioButton_1.setAction(action);
		panel_7.add(rdbtnNewRadioButton_1);
		
		
		rdbtnNewRadioButton_2.setAction(action_2);
		panel_7.add(rdbtnNewRadioButton_2);
		
		grupo.add(rdbtnNewRadioButton);
		grupo.add(rdbtnNewRadioButton_1);
		grupo.add(rdbtnNewRadioButton_2);
		
		
		
		JPanel panel_8 = new JPanel();
		panel_7.add(panel_8);
		panel_8.setLayout(new BoxLayout(panel_8, BoxLayout.X_AXIS));
		
		
		btnNewButton.setIcon(new ImageIcon(hipsterFrame.class.getResource("/icons/Annoying-Hipster.png")));
		
		panel_8.add(btnNewButton);
		btnNewButton.setMargin(new Insets(0, 0, 0, 0));
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(hipsterFrame.class.getResource("/icons/Male-User.png")));
		panel_8.add(btnNewButton_1);
		btnNewButton_1.setMargin(new Insets(0, 0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setBackground(new Color(240, 240, 240));
		
		panel_1.setLayout(null);
		tabbedPane.setBounds(0, 0, 309, 161);
		
		
		panel_1.add(tabbedPane);
		
		
		
		
		
		
		
		JPanel panel_9 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_9, null);
		
		tabbedPane.addTab("hipster",new ImageIcon(hipsterFrame.class.getResource("/icons/Male-User@Low.png")) , panel_9, null);
		panel_9.setLayout(null);
		tabbedPane.addTab("non hipster", new ImageIcon(hipsterFrame.class.getResource("/icons/Annoying-Hipster@Low.png")), lblNewLabel_1, null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(50, 27, 80, 62);
		panel_9.add(lblNewLabel_2);
		
		lblNewLabel_2.setIcon(new ImageIcon(hipsterFrame.class.getResource("/icons/antes.png")));
		
		
		lblNewLabel_3.setBounds(50, 29, 72, 64);
		panel_9.add(lblNewLabel_3);
		lblNewLabel_3.setVisible(false);
		lblNewLabel_3.setIcon(new ImageIcon(hipsterFrame.class.getResource("/icons/accesoriobarbita.png")));
		
		
		lblNewLabel_4.setBounds(50, 0, 92, 113);
		panel_9.add(lblNewLabel_4);
		lblNewLabel_4.setVisible(false);
		lblNewLabel_4.setIcon(new ImageIcon(hipsterFrame.class.getResource("/icons/accesoriotupe.png")));
		
		
		lblNewLabel_5.setBounds(53, 11, 72, 100);
		panel_9.add(lblNewLabel_5);
		lblNewLabel_5.setVisible(false);
		lblNewLabel_5.setIcon(new ImageIcon(hipsterFrame.class.getResource("/icons/accesoriobotoncuello.png")));
		
		
		lblNewLabel_6.setVisible(false);
		lblNewLabel_6.setIcon(new ImageIcon(hipsterFrame.class.getResource("/icons/accesoriogafapasta.png")));
		lblNewLabel_6.setBounds(50, 43, 92, 27);
		panel_9.add(lblNewLabel_6);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		JTextArea txtrAadeUnComentario = new JTextArea();
		txtrAadeUnComentario.setText("Añade un comentario...");
		
		panel_2.add(txtrAadeUnComentario);
		
		JPanel panel_3 = new JPanel();
		panel_3.setForeground(Color.WHITE);
		contentPane.add(panel_3);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "mujer");
			
		}
		public void actionPerformed(ActionEvent e) {
			if(rdbtnNewRadioButton_1.isSelected()){
				btnNewButton.setIcon(new ImageIcon(hipsterFrame.class.getResource("/icons/Female-User.png")));
				tabbedPane.addTab("non hipster",new ImageIcon(hipsterFrame.class.getResource("/icons/Female-User@Low.png")) , lblNewLabel_1, null);
			}
			
			else {
				btnNewButton.setIcon(new ImageIcon(hipsterFrame.class.getResource("/icons/Annoying-Hipster.png")));
				tabbedPane.addTab("non hipster",new ImageIcon(hipsterFrame.class.getResource("/icons/Male-User@Low.png")) , lblNewLabel_1, null);
				
			}
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "hombre");
		}
		public void actionPerformed(ActionEvent e) {
			if(rdbtnNewRadioButton.isSelected()){
				btnNewButton.setIcon(new ImageIcon(hipsterFrame.class.getResource("/icons/Annoying-Hipster.png")));
				tabbedPane.addTab("non hipster",new ImageIcon(hipsterFrame.class.getResource("/icons/Annoying-Hipster@Low.png")) , lblNewLabel_1, null);
				
				
			}
		}
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "otro");
		}
		public void actionPerformed(ActionEvent e) {
			if(rdbtnNewRadioButton_2.isSelected()){
				btnNewButton.setIcon(new ImageIcon(hipsterFrame.class.getResource("/icons/The-Wolverine.png")));
				tabbedPane.addTab("non hipster",new ImageIcon(hipsterFrame.class.getResource("/icons/The-Wolverine@Low.png")) , lblNewLabel_1, null);
				
				
			}
		}
	}
	private class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
			putValue(NAME, "Gafas Pasta");
			
		}
		public void actionPerformed(ActionEvent e) {
			if(chckbxNewCheckBox.isSelected())
				lblNewLabel_6.setVisible(true);
			else
				lblNewLabel_6.setVisible(false);
		}
	}
	private class SwingAction_4 extends AbstractAction {
		public SwingAction_4() {
			putValue(NAME, "Barbita");
			
		}
		public void actionPerformed(ActionEvent e) {
			if(chckbxNewCheckBox_1.isSelected())
				lblNewLabel_3.setVisible(true);
			else
				lblNewLabel_3.setVisible(false);
		}
	}
	private class SwingAction_5 extends AbstractAction {
		public SwingAction_5() {
			putValue(NAME, "Tupe");
			
		}
		public void actionPerformed(ActionEvent e) {
			if(chckbxNewCheckBox_2.isSelected())
				lblNewLabel_4.setVisible(true);
			else
				lblNewLabel_4.setVisible(false);
		}
	}
	private class SwingAction_6 extends AbstractAction {
		public SwingAction_6() {
			putValue(NAME, "Boton Cuello");
		}
		public void actionPerformed(ActionEvent e) {
			if(chckbxNewCheckBox_3.isSelected())
				lblNewLabel_5.setVisible(true);
			else
				lblNewLabel_5.setVisible(false);
		}
	}
}
