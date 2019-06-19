package TestExam2_Swing;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestExam2_Swing extends JFrame {
	private static final long serialVersionUID = -6609852711504002946L;

	public TestExam2_Swing() {
		// TODO Auto-generated constructor stub

		// 6번 문제
		// Container c = getContentPane();
		// c.setBackground(Color.BLUE);
		// setSize(300, 300);
		// setVisible(true);

		// 7번 문제
		super("마우스 올리기 내리기 연습");
		setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("Love Java");

		// label 컴포넌트에 마우스 리스터를 추가한다.
		MouseAdapter ma = new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				// super.mouseEntered(e);
				label.setText("Love Java");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				// super.mouseExited(e);
				label.setText("사랑해");
			}
		};
		label.addMouseListener(ma);

		add(label);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestExam2_Swing();
	}
}
