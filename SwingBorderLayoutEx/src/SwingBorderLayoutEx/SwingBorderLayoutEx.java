package SwingBorderLayoutEx;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingBorderLayoutEx extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public SwingBorderLayoutEx() {
		// TODO Auto-generated constructor stub
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		// 컨텐트 팬에 BorderLayout 배치관리자 설정
		c.setLayout(new BorderLayout(30,20));

		c.add(new JButton("Calculate"), BorderLayout.CENTER);
		c.add(new JButton("Calculate"), BorderLayout.NORTH);
		c.add(new JButton("Calculate"), BorderLayout.SOUTH);
		c.add(new JButton("Calculate"), BorderLayout.EAST);
		c.add(new JButton("Calculate"), BorderLayout.WEST);
		
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingBorderLayoutEx();
	}

}
