package Prob07;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Prob07 extends JFrame {
	private static final long serialVersionUID = -1925456090116141933L;
	JPanel jp = new JPanel();
	JLabel la = new JLabel("Love Java");

	public Prob07() {
		setTitle("마우스 휠을 굴려 폰트크기..");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(jp);

		jp.addMouseWheelListener(new MyMouseListener());
		jp.add(la);
		setSize(300, 200);
		setVisible(true);
	}

	class MyMouseListener implements MouseWheelListener {
		public void mouseWheelMoved(MouseWheelEvent e) {
			int n = e.getWheelRotation();

			if (n < 0) {
				Font f = la.getFont();
				int size = f.getSize();
				la.setFont(new Font("Arial", Font.PLAIN, size - 5));
			} else {
				Font f = la.getFont();
				int size = f.getSize();
				la.setFont(new Font("Arial", Font.PLAIN, size + 5));
			}
		}
	}

	public static void main(String[] args) {
		new Prob07();
	}
}