package Chap08Test;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Chap08Test extends JFrame {
	private static final long serialVersionUID = 1917840898812445040L;

	public Chap08Test() {
		// TODO Auto-generated constructor stub
		Container c = getContentPane();
		c.setLayout(null);
		JButton jb = new JButton("Click");
		jb.setLocation(50, 70);
		jb.setSize(100, 30);
		c.add(jb);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chap08Test();
	}

}
