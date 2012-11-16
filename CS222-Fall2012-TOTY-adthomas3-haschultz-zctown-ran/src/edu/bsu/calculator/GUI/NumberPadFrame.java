package edu.bsu.calculator.GUI;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NumberPadFrame extends JFrame {

	private static final long serialVersionUID = -1060324625229121862L;

	public NumberPadFrame(String title){
		
		super(title);
		GridLayout grid = new GridLayout(5, 2);
		setLayout(grid);
		setSize(250,250);
		setVisible(true);
		setResizable(false);
		
		
		
		int i = 0;
		while (i < 10)
		{
			JButton numbers = new JButton(String.valueOf(i));
			i++;
			add(numbers);
		}
	
		
	
	}

}
