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
import javax.swing.JLayeredPane;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;

public class MyFrame extends JFrame {

	private JPanel contentPane;
	private JRadioButton rdbtnH;
	private JRadioButton rdbtnM;
	private JRadioButton rdbtnO;
	private JCheckBox chckbxGafas;
	private JCheckBox chckbxBarba;
	private JCheckBox chckbxTupe;
	private JCheckBox chckbxCuello;
	private JTextArea textResul;
	private JTextArea textComent;
	private JButton btnAnadir;
	private JButton btnReset;
	private JLabel lblNoHipster;
	private JLabel lblHipster;

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
		rdbtnH.setSelected(true);
		rdbtnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAnadir.setIcon(new ImageIcon(MyFrame.class.getResource("/icons/Male-User.png")));
			}
		});
		panel_6.add(rdbtnH);
		rdbtnH.setHorizontalAlignment(SwingConstants.LEFT);
		bg.add(rdbtnH);
		
		rdbtnM = new JRadioButton("Mujer");
		rdbtnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAnadir.setIcon(new ImageIcon(MyFrame.class.getResource("/icons/Female-User.png")));
			}
		});
		panel_6.add(rdbtnM);
		bg.add(rdbtnM);
		
		rdbtnO = new JRadioButton("Otros");
		rdbtnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAnadir.setIcon(new ImageIcon(MyFrame.class.getResource("/icons/The-Wolverine.png")));
			}
		});
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
		
		btnAnadir = new JButton("");
		/*btnAnadir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnAnadir.setIcon(new ImageIcon(MyFrame.class.getResource("/icons/The-Wolverine.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnAnadir.setIcon(new ImageIcon(MyFrame.class.getResource("/icons/Male-User.png")));
			}
		});*/
		btnAnadir.setToolTipText("Añadir estilos");
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResul.setForeground(Color.WHITE);
				textResul.setText(seleccionarEstilo()+"\n"+textComent.getText());
			}

			private String seleccionarEstilo() {
				// TODO Auto-generated method stub
				String text = "";				
				if(chckbxGafas.isSelected())
					text += "Con sus gafas\n";				
				if(chckbxBarba.isSelected())
					text += "Con su barba\n";				
				if(chckbxTupe.isSelected())
					text += "Con su tupé\n";				
				if(chckbxCuello.isSelected())
					text += "Con su cuello\n";
				if(rdbtnH.isSelected())
					text += "Que guapo!!";
				if(rdbtnM.isSelected())
					text += "Que guapa!!";
				if(rdbtnO.isSelected())
					text += "Quién eres??";
				
				return text;
			}
		});
		
		panel_7.add(btnAnadir);
		btnAnadir.setIcon(new ImageIcon(MyFrame.class.getResource("/icons/Male-User.png")));
		btnAnadir.setMargin(new Insets(1,1,1,1));
		
		btnReset = new JButton("");
		btnReset.setToolTipText("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResul.setForeground(Color.LIGHT_GRAY);
			}
		});
		
		panel_7.add(btnReset);
		btnReset.setIcon(new ImageIcon(MyFrame.class.getResource("/icons/Annoying-Hipster.png")));
		btnReset.setMargin(new Insets(1,1,1,1));
			
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel_1.add(tabbedPane);
			
		lblNoHipster = new JLabel("not to be a hipster");
		//lblNoHipster.setIcon(new ImageIcon(MyFrame.class.getResource("/icons/antes.png")));
		
		lblHipster = new JLabel("to be a hipster");
		//lblHipster.setIcon(new ImageIcon(MyFrame.class.getResource("/icons/antes.png")));
				
		tabbedPane.addTab("Hipster", new ImageIcon(
				MyFrame.class.getResource("/icons/Annoying-Hipster@Low.png")), lblHipster, "you are");
		tabbedPane.addTab("Non Hipster", new ImageIcon(
				MyFrame.class.getResource("/icons/Male-User@Low.png")), lblNoHipster, "you are not");
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane, BorderLayout.CENTER);
		
		textComent = new JTextArea();
		textComent.setText("Añade tus comentarios....");
		textComent.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				textComent.setText("");
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub				
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub				
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub				
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub			
			}			
		});
		scrollPane.setViewportView(textComent);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new BorderLayout(0,0));
		
		textResul = new JTextArea();
		textResul.setEditable(false);
		textResul.setBackground(new Color(120,120,120,255));
		panel_3.add(textResul, BorderLayout.CENTER);
		
	}

}