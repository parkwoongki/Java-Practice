package SwingFlowLayoutEx;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingFlowLayoutEx extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SwingFlowLayoutEx() {
		// TODO Auto-generated method stub
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		// 컨텐트 팬에 FlowLayout 배치관리자 설정
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculator"));
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingFlowLayoutEx();
	}

}
