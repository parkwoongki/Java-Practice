package Prob02;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Prob02 extends JFrame {
	private static final long serialVersionUID = -7181027820892158831L;
	JPanel contentPane = new JPanel(); // contentPane ����

	public Prob02() {
		setTitle("�巡�뵿�� YELLO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane); // contentPane ����

		contentPane.addMouseMotionListener(new motionListener());
		contentPane.setBackground(Color.green);
		setSize(250, 250);
		setVisible(true);
	}

	public class motionListener implements MouseMotionListener {
		public void mouseDragged(MouseEvent e) {
			contentPane = (JPanel) e.getSource();
			contentPane.setBackground(Color.yellow);
		}

		public void mouseMoved(MouseEvent e) {
			contentPane = (JPanel) e.getSource();
			contentPane.setBackground(Color.GREEN);
		}
	}

	public static void main(String[] args) {
		new Prob02();
	}
}