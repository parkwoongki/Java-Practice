package SwingFlyingTextEx;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingFlyingTextEx extends JFrame {
	private static final long serialVersionUID = -3853505146713590985L;
	private final int FLYING_UNIT = 10;
	private JLabel la = new JLabel("HELLO");

	public SwingFlyingTextEx() {
		// TODO Auto-generated constructor stub
		setTitle("상,하,좌,우 키를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);
		c.addKeyListener(new MyKeyListener());
		la.setLocation(50, 50);
		la.setSize(100, 20);
		c.add(la);

		setSize(300, 300);
		setVisible(true);

		c.setFocusable(true);
		c.requestFocus();
	}

	// Key 리스너 구현
	class MyKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			int KeyCode = e.getKeyCode();

			// 키 코드 값에 따라 상하좌우 키를 판별하고 la의 위치를 이동시킨다
			switch (KeyCode) {
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(), la.getY() - FLYING_UNIT);
				break;
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(), la.getY() + FLYING_UNIT);
				break;
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX() - FLYING_UNIT, la.getY());
				break;
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX() + FLYING_UNIT, la.getY());
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingFlyingTextEx();
	}

}
