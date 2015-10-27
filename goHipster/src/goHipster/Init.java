package goHipster;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Init extends JFrame {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					goHipsterFrame frame = new goHipsterFrame();
					frame.setTitle("go Hipster Go!");
					frame.setVisible(true);
					frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		//Aspecto de botón en función de elección en radioButton
		
	}
}
