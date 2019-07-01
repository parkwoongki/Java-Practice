package Chap10Test2;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Chap10Test2 extends JFrame {
	private static final long serialVersionUID = 6749719561226879451L;

	public Chap10Test2() {
		// TODO Auto-generated constructor stub
		JButton btn = new JButton("Hello");
		btn.addKeyListener(new MyKeyListener());
	}

	class MyKeyListener implements KeyListener {

		@Override
		public void keyPressed(KeyEvent arg0) {}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("Key Released");
		}

		@Override
		public void keyTyped(KeyEvent arg0) {}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chap10Test2();
	}

}
