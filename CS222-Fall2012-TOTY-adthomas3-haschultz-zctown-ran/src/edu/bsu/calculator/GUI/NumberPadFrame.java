package edu.bsu.calculator.GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NumberPadFrame extends JFrame {

	private static final long serialVersionUID = -1060324625229121862L;
	
	private SimpleCalculatorFrame calcFrame;

	public NumberPadFrame(String title, SimpleCalculatorFrame frame2){
		
		super(title);
		GridLayout grid = new GridLayout(5, 2);
		setLayout(grid);
		setSize(250,250);
		setVisible(true);
		setResizable(false);
		
		calcFrame = frame2;
		
		
			final JButton number1 = new JButton("1");
			add(number1);
			
			number1.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					
					calcFrame.setComputationTextfield("1");
				
				}

			});
			
			final JButton number2 = new JButton("2");
			add(number2);
			
			number2.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					
					calcFrame.setComputationTextfield("2");
				
				}

			});
			
			final JButton number3 = new JButton("3");
			add(number3);
			
			number3.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					
					calcFrame.setComputationTextfield("3");
				
				}

			});
			
			final JButton number4 = new JButton("4");
			add(number4);
			
			number4.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					
					calcFrame.setComputationTextfield("4");
				
				}

			});
			
			final JButton number5 = new JButton("5");
			add(number5);
			
			number5.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					
					calcFrame.setComputationTextfield("5");
				
				}

			});
			
			final JButton number6 = new JButton("6");
			add(number6);
			
			number6.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					
					calcFrame.setComputationTextfield("6");
				
				}

			});
			
			final JButton number7 = new JButton("7");
			add(number7);
			
			number7.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					
					calcFrame.setComputationTextfield("7");
				
				}

			});
			
			final JButton number8 = new JButton("8");
			add(number8);
			
			number8.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					
					calcFrame.setComputationTextfield("8");
				
				}

			});
			
			final JButton number9 = new JButton("9");
			add(number9);
			
			number9.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					
					calcFrame.setComputationTextfield("9");
				
				}

			});
			
			final JButton number0 = new JButton("0");
			add(number0);
			
			number0.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					
					calcFrame.setComputationTextfield("0");
				
				}

			});
			
	}
	
		
	
}


