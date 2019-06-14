package SwingKeyListenerEx;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingKeyListenerEx extends JFrame {
	private static final long serialVersionUID = 831529855302546140L;
	private JLabel[] keyMessage;

	public SwingKeyListenerEx() {
		// TODO Auto-generated constructor stub
		setTitle("keyListener ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());

		// ���̺� �迭�� 3�� �����ϰ� �� ���̺� ������Ʈ ����
		keyMessage = new JLabel[3];
		keyMessage[0] = new JLabel(" getKeyCode()  ");
		keyMessage[1] = new JLabel(" getKeyChar()  ");
		keyMessage[2] = new JLabel(" getKeyText()  ");

		// 3���� ���̺� ������Ʈ�� ����Ʈ �ҿ� ����
		for (int i = 0; i < keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true);
			keyMessage[i].setBackground(Color.YELLOW);
		}

		setSize(300, 150);
		setVisible(true);

		c.setFocusable(true);
		c.requestFocus();
	}

	class MyKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			keyMessage[0].setText(Integer.toString(keyCode));
			keyMessage[1].setText(Character.toString(keyChar));
			keyMessage[2].setText(KeyEvent.getKeyText(keyCode));

			if (keyCode == KeyEvent.VK_ALT) {
				System.out.println("a�Դϴ�");
			}
			System.out.println("KeyPressed");

		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			System.out.println("KeyReleased");
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			System.out.println("KeyTyped");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingKeyListenerEx();
	}

}
