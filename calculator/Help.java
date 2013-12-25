package calculator;

import javax.swing.JFrame;

public class Help {

	public static void main (String args []) {
		Reader r = new Reader("Калькулятор");
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(170,280);
		r.setResizable(true);
		r.setLocationRelativeTo(null);
	}
}
