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
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JPanel panelSeleccion = new JPanel();
	private JPanel panel_4 = new JPanel();
	private JPanel panel_5 = new JPanel();
	private JPanel panel_3 = new JPanel();
	private JPanel panel_6 = new JPanel();
	private JPanel panel_Tab2 = new JPanel();
	private ButtonGroup group = new ButtonGroup();
	private JCheckBox chckbxGafas = new JCheckBox();
	private JCheckBox chckbxBarbas = new JCheckBox();
	private JCheckBox chckbxTupe = new JCheckBox();
	private JCheckBox chckbxCuelloBoton = new JCheckBox();
	private JRadioButton rdbtnHombre = new JRadioButton();
	private JRadioButton rdbtnMujer = new JRadioButton();
	private JRadioButton rdbtnOtros = new JRadioButton();
	private JTextArea textArea_1 = new JTextArea();
	JTextArea txtrComentarios = new JTextArea();
	JLabel lblCara = new JLabel();
	JLabel labelBarba = new JLabel();
	JLabel labelCuello = new JLabel();
	JLabel labelGafas = new JLabel();
	JLabel labelTupe = new JLabel();
	JLabel lblQueTioTan = new JLabel();
	JLabel lblCaranormal = new JLabel();
	JLabel lblTextNormal = new JLabel();
	
	private final JLayeredPane layeredPane = new JLayeredPane();
	private final JLayeredPane TabNoHipster = new JLayeredPane();

	
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
		
		
		panelSeleccion.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Features", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panelSeleccion);
		panelSeleccion.setLayout(new GridLayout(1, 2, 0, 0));
		
		
		panelSeleccion.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
		
		chckbxGafas = new JCheckBox("Gafa Pasta");
		panel_4.add(chckbxGafas);
		
		chckbxBarbas = new JCheckBox("Barba");
		panel_4.add(chckbxBarbas);
		
		chckbxTupe = new JCheckBox("Tupe");
		panel_4.add(chckbxTupe);
		
		chckbxCuelloBoton = new JCheckBox("Boton Cuello");
		panel_4.add(chckbxCuelloBoton);
		
		panelSeleccion.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));
		
		
		panel_3.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel_5.add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.Y_AXIS));
		
		
		rdbtnHombre = new JRadioButton("Hombre");
		panel_3.add(rdbtnHombre);
		group.add(rdbtnHombre);
		
		rdbtnMujer = new JRadioButton("Mujer");
		panel_3.add(rdbtnMujer);
		group.add(rdbtnMujer);
		
		rdbtnOtros = new JRadioButton("Otros");
		panel_3.add(rdbtnOtros);
		group.add(rdbtnOtros);
		
		Component verticalGlue = Box.createVerticalGlue();
		panel_5.add(verticalGlue);
		
		
		panel_5.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.X_AXIS));
		
		JButton btnButtonSinBarba = new JButton("");
		btnButtonSinBarba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setForeground(Color.WHITE);
				textArea_1.setText(seleccionadosPanel1() + '\n'
						+ txtrComentarios.getText());
				int cont= seleccionadosParaCarita();
				lblQueTioTan.setText(fraseSegunSeleccion(cont));
				
			}
		});
		btnButtonSinBarba.setIcon(new ImageIcon(Principal.class.getResource("/icon/Male-User.png")));
		btnButtonSinBarba.setMargin(new Insets(0, 0, 0, 0));
		
		panel_6.add(btnButtonSinBarba);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setForeground(Color.LIGHT_GRAY);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Principal.class.getResource("/icon/Annoying-Hipster.png")));
		btnNewButton_1.setMargin(new Insets(0, 0, 0, 0));
		
		panel_6.add(btnNewButton_1);
		
		JPanel panelTabsCaritas = new JPanel();
		contentPane.add(panelTabsCaritas);
		panelTabsCaritas.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane TabPane = new JTabbedPane(JTabbedPane.TOP);
		panelTabsCaritas.add(TabPane, BorderLayout.CENTER);
		
		TabPane.addTab("Hipster", new ImageIcon(Principal.class.getResource("/icon/Annoying-Hipster@Low.png")), layeredPane, null);
		
		lblCara = new JLabel("");
		lblCara.setIcon(new ImageIcon(Principal.class.getResource("/icon_hipster/antes.png")));
		lblCara.setBounds(93, 0, 99, 98);
		layeredPane.add(lblCara);
		lblCara.setVisible(true);
		
		labelBarba = new JLabel("");
		labelBarba.setIcon(new ImageIcon(Principal.class.getResource("/icon_hipster/accesoriobarbita.png")));
		labelBarba.setBounds(93, 0, 99, 98);
		layeredPane.add(labelBarba);
		labelBarba.setVisible(false);
		
		labelCuello = new JLabel("");
		labelCuello.setIcon(new ImageIcon(Principal.class.getResource("/icon_hipster/accesoriobotoncuello.png")));
		labelCuello.setBounds(93, 0, 99, 98);
		layeredPane.add(labelCuello);
		labelCuello.setVisible(false);
		
		labelGafas = new JLabel("");
		labelGafas.setIcon(new ImageIcon(Principal.class.getResource("/icon_hipster/accesoriogafapasta.png")));
		labelGafas.setBounds(93, 0, 99, 98);
		layeredPane.add(labelGafas);
		labelGafas.setVisible(false);
		
		labelTupe = new JLabel("");
		labelTupe.setIcon(new ImageIcon(Principal.class.getResource("/icon_hipster/accesoriotupe.png")));
		labelTupe.setBounds(93, 0, 99, 98);
		layeredPane.add(labelTupe);
		labelTupe.setVisible(false);
		
		lblQueTioTan = new JLabel("Dale al boton y veremos si eres hipster");
		lblQueTioTan.setHorizontalAlignment(SwingConstants.CENTER);
		lblQueTioTan.setBounds(6, 103, 287, 16);
		layeredPane.add(lblQueTioTan);
		lblQueTioTan.setVisible(true);
		
		lblCaranormal = new JLabel("");
		lblCaranormal.setIcon(new ImageIcon(Principal.class.getResource("/icon/Male-User@High.png")));
		lblCaranormal.setBounds(93, 0, 99, 98);
		TabNoHipster.add(lblCaranormal);
		lblCaranormal.setVisible(true);
		
		lblTextNormal = new JLabel("Así serías si dejas el rollo hipster");
		lblTextNormal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextNormal.setBounds(6, 103, 287, 16);
		TabNoHipster.add(lblTextNormal);
		lblTextNormal.setVisible(true);
		
		TabPane.addTab("No Hipster", new ImageIcon(Principal.class.getResource("/icon/Male-User@Low.png")), TabNoHipster, null);
		
		JScrollPane scrollTextoComentarios = new JScrollPane();
		contentPane.add(scrollTextoComentarios);
		
		txtrComentarios.setText("Añade tus comentarios...");
		txtrComentarios.addFocusListener(new FocusListener(){

			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				txtrComentarios.setText("");
			}

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		scrollTextoComentarios.setViewportView(txtrComentarios);
		
		
		JPanel panelResultado = new JPanel();
		contentPane.add(panelResultado);
		panelResultado.setLayout(new BorderLayout(0, 0));
		textArea_1.setEditable(false);
		
		textArea_1.setBackground(Color.GRAY);
		panelResultado.add(textArea_1, BorderLayout.CENTER);
	}
	
	public String seleccionadosPanel1() {
		String text = "";
		labelGafas.setVisible(false);
		labelBarba.setVisible(false);
		labelTupe.setVisible(false);
		labelCuello.setVisible(false);
		int cont = 0;
		if (chckbxGafas.isSelected()){
			text += "Llevas gafitas\n";
		}
		if (chckbxBarbas.isSelected()){
			text += "Llevas barbita\n";
		}
		if (chckbxTupe.isSelected()){
			text += "Llevas tupe\n";
		}
		if (chckbxCuelloBoton.isSelected()){
			text += "Llevas el botón en el cuello de moda\n";
		}
		if (rdbtnMujer.isSelected()){
			text += "Eres una mujer\n";
		}
		if (rdbtnHombre.isSelected()){
			text += "Eres un hombre\n";
		}
		if (rdbtnOtros.isSelected()){
			text += "Mmmm menuda sexualidad diversa\n";
		}
		return text;
	}
	public int seleccionadosParaCarita() {
		labelGafas.setVisible(false);
		labelBarba.setVisible(false);
		labelTupe.setVisible(false);
		labelCuello.setVisible(false);
		int cont = 0;
		if (chckbxGafas.isSelected()){
			labelGafas.setVisible(true);
			cont +=1;
		}
		if (chckbxBarbas.isSelected()){
			labelBarba.setVisible(true);
			cont +=1;
		}
		if (chckbxTupe.isSelected()){
			labelTupe.setVisible(true);
			cont +=1;
		}
		if (chckbxCuelloBoton.isSelected()){
			labelCuello.setVisible(true);
			cont +=1;
		}
		return cont;
	}
	
	public String fraseSegunSeleccion(int cont){
		String text = "";
		if(cont==0){
			text = "No eres ni un intento de Hipster";
		}
		else if(cont==1){
			text = "Te crees hipster pero no!";
		}
		else if(cont==2){
			text = "No eres tan hipster como te piensas";
		}
		else if(cont==3){
			text = "Eres un hipster del montón";
		}
		else if(cont==4){
			text = "Eres un tio muy hipster";
		}
		return text;
	}
}
