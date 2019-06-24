package Prob06;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Prob06 extends JFrame {
	private static final long serialVersionUID = -188205561419528719L;
	JPanel contentPane = new JPanel();
	JLabel la;

	public Prob06() {
		setTitle("Mouse ¿Ã∫•∆Æ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane);

		contentPane.setLayout(null);

		contentPane.addMouseListener(new MyMouseListener());

		la = new JLabel("c");
		la.setSize(50, 20);
		la.setLocation(100, 100);
		contentPane.add(la);
		setSize(300, 300);
		setVisible(true);

	}

	class MyMouseListener implements MouseListener {
		@Override
		public void mousePressed(MouseEvent e) {
			int X = (int) (Math.random() * 299 + 1);
			int Y = (int) (Math.random() * 299 + 1);
			la.setLocation(X, Y);
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
		}

		@Override
		public void mouseClicked(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		}

	}

	static public void main(String[] args) {
		new Prob06();
	}
}