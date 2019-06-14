package SwingClickAndDoubleClickEx;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class SwingClickAndDoubleClickEx extends JFrame {
	private static final long serialVersionUID = -273424528787663220L;

	public SwingClickAndDoubleClickEx() {
		// TODO Auto-generated constructor stub
		setTitle("Click and DoubleClick Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();

		c.addMouseListener(new MyMouseListener());
		setSize(300, 300);
		setVisible(true);
	}

	class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if (e.getClickCount() == 2) {
				int r = (int) (Math.random() * 256);
				int g = (int) (Math.random() * 256);
				int b = (int) (Math.random() * 256);

				Component c = (Component) e.getSource();
				c.setBackground(new Color(r, g, b));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingClickAndDoubleClickEx();
	}

}
