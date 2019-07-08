package Chap10Test6;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Chap10Test6 extends JFrame {
	private static final long serialVersionUID = -4634629849985067297L;

	public Chap10Test6() {
		// TODO Auto-generated constructor stub
		setTitle("keyListener ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		// c.addMouseListener(new MyMouseListener());
		// c.addMouseMotionListener(new MyMouseListener());

		MyMouseListener ml = new MyMouseListener();
		c.addMouseListener(ml);
		c.addMouseMotionListener(ml);

		setSize(300, 150);
		setVisible(true);

		// c.setFocusable(true);
		// c.requestFocus();
	}

	class MyMouseListener extends MouseAdapter {
		private int count = 0;

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			count++;
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println(count);
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			count++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chap10Test6();
	}
}
