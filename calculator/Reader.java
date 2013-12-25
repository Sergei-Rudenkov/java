package calculator;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Reader extends JFrame {
	JButton plus, minus, multiply, sharing, clear;
	JLabel valueresult;
	JTextField valueget1, valueget2;
	int i, j;
	String a, b;
	eHandler handler = new eHandler();
	
	public Reader(String s){
		super(s);
		setLayout(new FlowLayout());
		plus = new JButton("+");
		minus = new JButton("-");
		multiply = new JButton("*");
		sharing = new JButton("/");
		valueresult = new JLabel("");
		valueget1 = new JTextField(6);
		valueget2 = new JTextField(6);

		clear = new JButton("Clear");
		add(valueget1);
		add(valueget2);
		add(plus);
		add(minus);
		add(multiply);
		add(sharing);
		add(clear); 
		add(valueresult);
		clear.addActionListener(handler);
		plus.addActionListener(handler);
		minus.addActionListener(handler);
		multiply.addActionListener(handler);
		sharing.addActionListener(handler);
	}
public class eHandler implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		try{
	//	if(e.getSource() == ok){  
	//		j = Integer.parseInt(valueget.getText());
	//		a = Integer.toString(j);
	//	    valueresult.setText(a) ;
	//	}
		if(e.getSource() == clear){
	    valueresult.setText(null);
	    valueget1.setText(null);
	    valueget2.setText(null);
	    j = 0;
		}
		if(e.getSource() == plus){
			j = Integer.parseInt(valueget1.getText());
			i = Integer.parseInt(valueget2.getText());
			a = Integer.toString(j + i);
			valueresult.setText(a);	
		}
		if(e.getSource() == minus){
			j = Integer.parseInt(valueget1.getText());
			i = Integer.parseInt(valueget2.getText());
			a = Integer.toString(j - i);
			valueresult.setText(a);	
		}
		if(e.getSource() == multiply){
			j = Integer.parseInt(valueget1.getText());
			i = Integer.parseInt(valueget2.getText());
			a = Integer.toString(j * i);
			valueresult.setText(a);	
		}
		if(e.getSource() == sharing){
			j = Integer.parseInt(valueget1.getText());
			i = Integer.parseInt(valueget2.getText());
			a = Integer.toString(j / i);
			valueresult.setText(a);	
		}
		}catch (Exception ex){ JOptionPane.showMessageDialog(null, "Ввидите в поле число");}
		}
	}
	
}
