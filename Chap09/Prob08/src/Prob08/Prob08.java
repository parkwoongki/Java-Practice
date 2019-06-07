package Prob08;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class NorthPanel extends JPanel {
	private static final long serialVersionUID = -5535909484637830101L;

	public NorthPanel() {
		// TODO Auto-generated constructor stub
		setBackground(Color.GRAY);
		setLayout(new FlowLayout());
		add(new JButton("����"));
		add(new JButton("�ݱ�"));
		add(new JButton("������"));
	}
}

class CenterPanel extends JPanel {
	private static final long serialVersionUID = -8205125920014907946L;

	public CenterPanel() {
		// TODO Auto-generated constructor stub
		setBackground(Color.WHITE);
		setLayout(null);
		for (int i = 0; i < 10; i++) {
			JLabel jl = new JLabel("*");
			int x = (int) (Math.random() * 150) + 50;
			int y = (int) (Math.random() * 150) + 50;
			jl.setLocation(x, y);
			jl.setSize(10, 10);
			jl.setForeground(Color.RED);
			setOpaque(true);
			add(jl);
		}
	}
}

class SouthPanel extends JPanel {
	private static final long serialVersionUID = -476345332930971329L;

	public SouthPanel() {
		// TODO Auto-generated constructor stub
		setBackground(Color.YELLOW);
		setLayout(new FlowLayout());
		add(new JButton("Word Input"));
		add(new JTextField(14));
	}
}

public class Prob08 extends JFrame {
	private static final long serialVersionUID = -1612551755987352551L;

	public Prob08() {
		// TODO Auto-generated constructor stub
		setTitle("���� ���� �г��� ���� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();

		setLayout(new BorderLayout());

		c.add(new NorthPanel(), BorderLayout.NORTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		c.add(new SouthPanel(), BorderLayout.SOUTH);

		setSize(300, 350);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Prob08();
	}

}