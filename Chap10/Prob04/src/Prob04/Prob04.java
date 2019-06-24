package Prob04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Prob04 extends JFrame {
	private static final long serialVersionUID = -4079066709374455426L;

	public Prob04() {
		setTitle("Left 키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel label = new JLabel("Love Java");
		c.add(label);

		label.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					JLabel la = (JLabel) e.getSource();
					StringBuffer text = new StringBuffer(la.getText());
					la.setText(text.substring(1) + text.substring(0, 1));
				}
			}
		});
		c.add(label);
		setSize(250, 100);
		setVisible(true);

		label.setFocusable(true); // 레이블이 포커스를 받을 수 있도록 지정
		label.requestFocus(); // 레이블에 키 입력 포커스 서정
	}

	static public void main(String[] args) {
		new Prob04();
	}
}
