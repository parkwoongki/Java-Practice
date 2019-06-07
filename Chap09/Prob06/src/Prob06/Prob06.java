package Prob06;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Prob06 extends JFrame {
	private static final long serialVersionUID = 3281539416848779902L;

	public Prob06() {
		// TODO Auto-generated constructor stub
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		for (int i = 0; i < 20; i++) {
			JLabel label = new JLabel(Integer.toString(i));
			int x = (int) (Math.random() * 200) + 50;
			int y = (int) (Math.random() * 200) + 50;
			label.setBackground(Color.BLUE);
			label.setLocation(x, y);
			label.setSize(10, 10);
			label.setOpaque(true);
			c.add(label);
		}

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Prob06();
	}

}