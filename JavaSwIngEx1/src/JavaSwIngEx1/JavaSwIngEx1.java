package JavaSwIngEx1;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6199919911820510755L;

	public MyFrame() {
		setTitle("300x300 Ω∫¿Æ «¡∑π¿”");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ¥›»˘¥Ÿ∞Ì ¥›»˘∞Õ¿Ã æ∆¥‘! ¿Ã∑∏∞‘ «ÿæﬂ ¥›»˘∞≈¿”

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 35));

		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));

		setSize(300, 300);
		setVisible(true);
	}
}

public class JavaSwIngEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}
}
