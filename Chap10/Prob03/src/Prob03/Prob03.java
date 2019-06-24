package Prob03;

import javax.swing.*;
import java.awt.event.*;

public class Prob03 extends JFrame {
	private static final long serialVersionUID = -3130500629663509724L;
	JPanel contentPane = new JPanel();
	JLabel la = new JLabel("Love Java");

	public Prob03() {
		setTitle("Love Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane);

		contentPane.addKeyListener(new MyKeyListener());
		contentPane.add(la);

		setSize(200, 100);
		setVisible(true);
		contentPane.requestFocus();
	}

	public static void main(String[] args) {
		new Prob03();
	}

	public class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			StringBuffer a = new StringBuffer(la.getText());
			int keyCode = e.getKeyCode();
			if (keyCode == KeyEvent.VK_LEFT)
				la.setText("" + a.reverse());
		}
	}
}