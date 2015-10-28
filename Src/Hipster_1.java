import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.Box;
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
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;


import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JLayeredPane;
import java.awt.Font;

public class Hipster_1 extends JFrame {
	
	JCheckBox checkgafaspasta=new JCheckBox();
	JCheckBox checkbarbita=new JCheckBox();
	JCheckBox checktupe =new JCheckBox();
	JCheckBox checkboton=new JCheckBox();
	JRadioButton hombre = new JRadioButton("Hombre");
	JRadioButton mujer = new JRadioButton("Mujer");
	JRadioButton otros = new JRadioButton("Otros");

	private JPanel contentPane;
	private JTextArea textArea;
	private JTextArea textArea_1;
	private JTextArea comentarios;
	private JLabel lblNewLabel ;
	private JLabel lblNewLabel_1 ;
	private JLabel lblNewLabel_2 ;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;


	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hipster_1 frame = new Hipster_1();
					frame.setVisible(true);
					frame.setTitle("Goooo hipster go!");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public  Hipster_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2,0,0));
		
		
		//1panel
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		TitledBorder title;
		title = BorderFactory.createTitledBorder("Features");
		panel.setBorder(title);
		
			
				JPanel panel1_1 = new JPanel();
				panel.add(panel1_1);
				panel1_1.setLayout(new BoxLayout(panel1_1,BoxLayout.Y_AXIS));
				
					 checkgafaspasta = new JCheckBox("Gafas Pasta");
					panel1_1.add(checkgafaspasta);
					
					checkbarbita = new JCheckBox("Barbita");
					panel1_1.add(checkbarbita);
					
					 checktupe = new JCheckBox("Tupé");
					panel1_1.add(checktupe);
					
					 checkboton = new JCheckBox("Boton en cuello");
					panel1_1.add(checkboton);
				
					
					
			    JPanel panel1_2 = new JPanel();
				panel.add(panel1_2);
				panel1_2.setLayout(new BoxLayout(panel1_2, BoxLayout.Y_AXIS));
					
			  
				JPanel panel1_3 = new JPanel();
				panel1_3.setAlignmentX(Component.LEFT_ALIGNMENT);
				panel1_3.setAlignmentY(0.0f);
				panel1_2.add(panel1_3);
				panel1_3.setLayout(new BoxLayout(panel1_3, BoxLayout.Y_AXIS));
					
				
				ButtonGroup grupo =  new  ButtonGroup ();

				 	hombre = new JRadioButton("Hombre");
				 	hombre.setAlignmentY(0.0f);
				 	panel1_3.add(hombre);
				 	grupo.add(hombre);
				 	
					mujer = new JRadioButton("Mujer");
				 	mujer.setAlignmentY(0.0f);
				 	panel1_3.add(mujer);
				 	grupo.add(mujer);
				 	
					otros = new JRadioButton("Otros");
					otros.setAlignmentY(0.0f);
				 	panel1_3.add(otros);
				 	grupo.add(otros);
				 	
				 Component verticalGlue = Box.createVerticalGlue();
				 panel1_2.add(verticalGlue);
				 
				 
				 JPanel panel1_4 = new JPanel();
				 panel1_2.add(panel1_4);
				 panel1_4.setLayout(new BoxLayout(panel1_4, BoxLayout.X_AXIS));
				 
			
				 
				 //añado las dos imagenes que se usen como botones
				 
				 			JButton button = new JButton("");
						 	panel1_4.add(button);
						 	button.addActionListener(new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent e) {
									textArea_1.setForeground(Color.WHITE);
									textArea_1.setText(selection2Pane() +'\n'
											+ comentarios.getText());
								}
							});
						 
						 	button.setToolTipText("change style??");
						 	button.setMargin(new Insets(0, 0, 0, 0));
						 	button.setIcon(new ImageIcon(Hipster_1.class
						 			.getResource("/icons/Annoying-Hipster.png")));
						 	
						 	
						 	
						 	
				 	
						 	JButton button1 =new JButton("");
						 	button1.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									textArea_1.setForeground(Color.LIGHT_GRAY);
									
								}
							});
						 	panel1_4.add(button1);
						 	button1.setIcon(new ImageIcon(Hipster_1.class
						 			.getResource("/icons2/Female-User.png")));
						 	button1.setToolTipText("reset?");
						 	button1.setMargin(new Insets(0, 0, 0, 0));
						 	
						 	
			JPanel panel_1 = new JPanel(); 	
			contentPane.add(panel_1);
			panel_1.setLayout(new BorderLayout(0, 0));		 	
	
				 	
			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			panel_1.add(tabbedPane);
	
		
			
		
				
				JLayeredPane layeredPane_1 = new JLayeredPane();
				tabbedPane.addTab("Hipster", new ImageIcon(Hipster_1.class.getResource("/icons/Annoying-Hipster.png")), layeredPane_1, null);
				
				JLayeredPane layeredPane = new JLayeredPane();
				tabbedPane.addTab("Nop Hipster", new ImageIcon(Hipster_1.class.getResource("/icons/Male-User.png")), layeredPane, null);
				
					lblNewLabel = new JLabel("");
					lblNewLabel.setIcon(new ImageIcon(Hipster_1.class.getResource("/icons2/antes.png")));
					lblNewLabel.setBounds(93, 16, 107, 55);
					layeredPane_1.add(lblNewLabel);
					
					
					lblNewLabel_1 = new JLabel("");
					lblNewLabel_1.setIcon(new ImageIcon(Hipster_1.class.getResource("/icons2/accesoriotupe.png")));
					lblNewLabel_1.setBounds(93, 0, 107, 97);
					layeredPane_1.add(lblNewLabel_1);
					lblNewLabel_1.setVisible(false);
					
					lblNewLabel_2 = new JLabel("");
					lblNewLabel_2.setIcon(new ImageIcon(Hipster_1.class.getResource("/icons2/accesoriobarbita.png")));
					lblNewLabel_2.setBounds(93, 20, 81, 55);
					layeredPane_1.add(lblNewLabel_2);
					lblNewLabel_2.setVisible(false);
					
					
					lblNewLabel_3 = new JLabel("");
					lblNewLabel_3.setIcon(new ImageIcon(Hipster_1.class.getResource("/icons2/accesoriogafapasta.png")));
					lblNewLabel_3.setBounds(93, 33, 96, 16);
					layeredPane_1.add(lblNewLabel_3);
					lblNewLabel_3.setVisible(false);
					
					lblNewLabel_4 = new JLabel("New label");
					lblNewLabel_4.setIcon(new ImageIcon(Hipster_1.class.getResource("/icons2/accesoriobotoncuello.png")));
					lblNewLabel_4.setBounds(93, -17, 107, 120);
					layeredPane_1.add(lblNewLabel_4);
					lblNewLabel_4.setVisible(false);

					
				
				
				//panel de abajo a la izquierda	
				JScrollPane scrollPane = new JScrollPane();
				contentPane.add(scrollPane);

				comentarios = new JTextArea();
				comentarios.setText("Añade tus comentarios...");
				scrollPane.setViewportView(comentarios);

						comentarios.addFocusListener(new FocusListener(){

							@Override
							public void focusGained(FocusEvent e) {
								// TODO Auto-generated method stub
								comentarios.setText("");
							}

							@Override
							public void focusLost(FocusEvent e) {
								// TODO Auto-generated method stub
								
							}
						
					
					
						});
	
			
			//panel de abajo a la derecha
			
			JPanel panel_3 = new JPanel();
			contentPane.add(panel_3);
			panel_3.setLayout(new BorderLayout(0, 0));
			
				textArea_1 = new JTextArea();
				textArea_1.setEditable(false);
				textArea_1.setBackground(new Color(120, 120, 120, 255));
				textArea_1.setForeground(Color.WHITE);
				panel_3.add(textArea_1, BorderLayout.CENTER);
			
			
	}
	
	
 //metodo
		
		public String selection2Pane() {
			lblNewLabel_1.setVisible(false);
			lblNewLabel_2.setVisible(false);
			lblNewLabel_3.setVisible(false);
			lblNewLabel_4.setVisible(false);
			
			
			String text = "";
			
			if (checkgafaspasta.isSelected()){
				text += "Con sus Gafitas\n";
				lblNewLabel_3.setVisible(true);
			}
			if (checkbarbita.isSelected()){
				text += "Con su Barbita\n";
				lblNewLabel_2.setVisible(true);
			}
			if (checktupe.isSelected()){
				text += "Con su Tupé\n";
				lblNewLabel_1.setVisible(true);
			}
			if (checkboton.isSelected()){
				text += "Con su botón en el cuello de moda\n";
				lblNewLabel_4.setVisible(true);
			}
			if (mujer.isSelected())
				text += "Esa mujer\n";
			if (hombre.isSelected())
				text += "Ese hombre\n";
			if (otros.isSelected())
				text += "Esa sexualidad diversa\n";
			
			return text;

		}
	}


