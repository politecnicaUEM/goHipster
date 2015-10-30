package src;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

import java.awt.Cursor;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.BoxLayout;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.SwingConstants;
import javax.swing.JSplitPane;

import java.awt.Dimension;
import java.awt.Component;

import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.border.TitledBorder;
import javax.swing.JButton;

import java.awt.FlowLayout;

import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;
import javax.swing.JTextArea;
import javax.swing.Box;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main_gohipster extends JFrame {

	private JPanel contentPane;
	private JTextPane textPane_1;
	private JTextPane textPane_2;
	private JTextPane textPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_gohipster frame = new Main_gohipster();
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
	public Main_gohipster() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel arriba_iz = new JPanel();
		arriba_iz.setBorder(new TitledBorder(null, "features", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(arriba_iz);
		arriba_iz.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setAlignmentY(Component.TOP_ALIGNMENT);
		arriba_iz.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JCheckBox cbgafas = new JCheckBox("Gafas pasta");
		panel.add(cbgafas);
		
		JCheckBox cbBarba = new JCheckBox("Barbita");
		panel.add(cbBarba);
		
		JCheckBox cbTupe = new JCheckBox("tupé");
		panel.add(cbTupe);
		
		JCheckBox cbBtonCuello = new JCheckBox("botón cuello");
		panel.add(cbBtonCuello);
		
		JPanel panel_1 = new JPanel();
		arriba_iz.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setAlignmentY(Component.TOP_ALIGNMENT);
		panel_3.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel_1.add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.Y_AXIS));
		
		JRadioButton radio_hombre = new JRadioButton("Hombre");
		radio_hombre.setSelected(true);
		radio_hombre.setAlignmentY(0.0f);
		panel_3.add(radio_hombre);
		
		JRadioButton radio_mujer = new JRadioButton("Mujer");
		panel_3.add(radio_mujer);
		
		JRadioButton radio_otros = new JRadioButton("Otros");
		panel_3.add(radio_otros);
		
       	 ButtonGroup group = new ButtonGroup();
       	 
       	 group.add(radio_hombre);
       	 group.add(radio_mujer);
       	 group.add(radio_otros);
       	 
       	 Component verticalGlue = Box.createVerticalGlue();
       	 panel_3.add(verticalGlue);

		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				String cbtotal = "";
				String cbtotaln = "";
				Boolean AllS = true;
				textPane.setText("No suficiente....");
				
				
				
				if(cbgafas.isSelected()){ 
					cbtotal = "*gafas pastas de moda de hace tiempo";
				   cbtotaln += "*gafas mainstream";
				}else{
					AllS = false;
				}
				if(cbBarba.isSelected()) {
					cbtotal += "\n *barba hermosa y abundante cual leñador";
					cbtotaln += "\n *barba mainstream";
				}else{
					AllS = false;
				}
				
				if(cbTupe.isSelected()) {
					cbtotal += "\n *tupe tupido";
					cbtotaln += "\n *tupe mainstream";
				}else{
					AllS = false;
				}
				if(cbBtonCuello.isSelected()){
					cbtotal += "\n *boton en el cuello como la gente guay";
					cbtotaln += "\n *boton de cuello mainstream";
				}else{
					AllS = false;
				}
				
				if(radio_hombre.isSelected() && AllS == true)textPane.setText("Men Full Hipster");
				if(radio_mujer.isSelected() && AllS == true)textPane.setText("Women Full Hipster");
				if(radio_otros.isSelected() && AllS == true)textPane.setText("SomeThingFull Hipster");
					
					
					
			textPane_1.setText(cbtotal);
			textPane_2.setText(cbtotaln);
				
				
				
				
			}
		});
		btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.setLayout(new GridLayout(1, 2, 15, 15));
		btnNewButton.setIcon(new ImageIcon(Main_gohipster.class.getResource("/img/Annoying-Hipster@High.png")));
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				textPane_1.setText(null);
				textPane_2.setText(null);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Main_gohipster.class.getResource("/img/Male-User@High.png")));
		panel_2.add(btnNewButton_1);
		
		JPanel arriba_d = new JPanel();
		contentPane.add(arriba_d);
		arriba_d.setLayout(new BoxLayout(arriba_d, BoxLayout.X_AXIS));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		arriba_d.add(tabbedPane);
		
	
		textPane_1 = new JTextPane();
		textPane_2 = new JTextPane();
		//segundo atributo imagen
		tabbedPane.addTab("Hipster", new ImageIcon(Main_gohipster.class.getResource("/img/Annoying-Hipster@High.png")), textPane_1, null);
		tabbedPane.addTab("No Hipster", new ImageIcon(Main_gohipster.class.getResource("/img/Male-User@High.png")), textPane_2, null);
		
		
		
		
		
		
		
	
		
		JPanel abajo_iz = new JPanel();
		contentPane.add(abajo_iz);
		abajo_iz.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		abajo_iz.add(scrollPane);
		
		textPane = new JTextPane();
		textPane.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		scrollPane.setViewportView(textPane);
		
		JPanel abajo_d = new JPanel();
		contentPane.add(abajo_d);

	}

}
