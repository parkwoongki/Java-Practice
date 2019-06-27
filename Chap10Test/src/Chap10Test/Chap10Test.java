package Chap10Test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Chap10Test extends JFrame {
	private static final long serialVersionUID = -6661794317417137745L;

	public Chap10Test() {
		// TODO Auto-generated constructor stub
		JButton btn = new JButton("Hello");

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Click");
			}
		});

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chap10Test();
	}

}
