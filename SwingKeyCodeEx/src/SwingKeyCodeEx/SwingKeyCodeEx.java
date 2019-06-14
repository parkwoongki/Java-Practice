package SwingKeyCodeEx;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingKeyCodeEx extends JFrame {
	private static final long serialVersionUID = -1667545321229197778L;
	private JLabel la = new JLabel();

	public SwingKeyCodeEx() {
		// TODO Auto-generated constructor stub
		setTitle("Key Code ���� : F1Ű:�ʷϻ�, % Ű �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();

		c.addKeyListener(new MyKeyListener());
		c.add(la);
		setSize(300, 150);
		setVisible(true);

		c.setFocusable(true);
		c.requestFocus();
	}

	class MyKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			Container contentPane = (Container) e.getSource();

			// la�� �Էµ� Ű�� Ű �̸� ���ڿ��� ����Ͽ� ����ڿ��� ������
			la.setText(KeyEvent.getKeyText(e.getKeyCode()) + "Ű�� �ԷµǾ���");

			if (e.getKeyChar() == '%')
				contentPane.setBackground(Color.YELLOW);
			else if (e.getKeyCode() == KeyEvent.VK_F1)
				contentPane.setBackground(Color.GREEN);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingKeyCodeEx();
	}

}
