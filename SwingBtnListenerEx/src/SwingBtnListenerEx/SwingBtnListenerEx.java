package SwingBtnListenerEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingBtnListenerEx extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SwingBtnListenerEx() {
		// TODO Auto-generated constructor stub
		setTitle("Action 이벤트 리스너 작성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton b = (JButton) e.getSource();
				if (b.getText().equals("Action"))
					b.setText("액션");
				else
					b.setText("Action");

				setTitle(b.getText());
			}
		});

		setSize(350, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingBtnListenerEx();
	}

}
