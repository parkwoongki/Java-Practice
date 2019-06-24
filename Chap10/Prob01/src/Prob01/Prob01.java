package Prob01;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Prob01 extends JFrame {
	private static final long serialVersionUID = -8731374754884147096L;

	public Prob01() {
		setTitle("마우스 리스너 작성");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel btn = new JLabel("Love java");
		MyMouseListener listener = new MyMouseListener();
		btn.addMouseListener(listener);

		add(btn);
		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Prob01();
	}

}

class MyMouseListener implements MouseListener {
	public void mouseEntered(MouseEvent e) {
		JLabel btn = (JLabel) e.getSource();
		btn.setText("Love Java");
	}

	public void mouseExited(MouseEvent e) {
		JLabel btn = (JLabel) e.getSource();
		btn.setText("사랑해");
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
	}
}
