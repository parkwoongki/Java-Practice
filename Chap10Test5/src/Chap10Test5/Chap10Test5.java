package Chap10Test5;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Chap10Test5 extends JFrame {
	private static final long serialVersionUID = -7833352728287365467L;

	public Chap10Test5() {
		// TODO Auto-generated constructor stub
		JButton btn = new JButton("Hello");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		btn.addActionListener(new MyActionListener("1"));
		btn.addActionListener(new MyActionListener("2"));
		btn.addActionListener(new MyActionListener("3"));
		c.add(btn);
		setSize(300, 300);
		setVisible(true);
	}

	class MyActionListener implements ActionListener {
		private String msg;

		public MyActionListener(String msg) {
			this.msg = msg;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(msg);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chap10Test5();
	}
}
