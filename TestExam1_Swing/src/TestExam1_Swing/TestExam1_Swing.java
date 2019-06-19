package TestExam1_Swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestExam1_Swing extends JFrame {
	JLabel label = new JLabel("Hello Java");

	public TestExam1_Swing() {
		// TODO Auto-generated constructor stub
		super("Right 키로 문자열 교체");
		setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		c.addKeyListener(new MyKeyListener());
		c.setFocusable(true);
		c.requestFocus();

		add(label);
		setSize(250, 100);
		setVisible(true);
	}

	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			if (keyCode == KeyEvent.VK_RIGHT) {
				StringBuffer str = new StringBuffer(label.getText());
				label.setText(str.reverse().toString());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestExam1_Swing();
	}

}
