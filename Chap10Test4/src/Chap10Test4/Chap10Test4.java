package Chap10Test4;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class Chap10Test4 extends JFrame {
	private static final long serialVersionUID = 3445482651791655832L;

	public Chap10Test4() {
		// TODO Auto-generated constructor stub

	}

	class MyKeyListener extends KeyAdapter {
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Unicode Key Pressed");
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			System.out.println("All Key Pressed");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chap10Test4();
	}

}
