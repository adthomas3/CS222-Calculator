/**
 * 
 * @author Andrew Thomas, Harrison Schultz, Ran An, Zach Town
 */

package edu.bsu.calculator.GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class ProgrammerConversionFrame extends JFrame {

	private static final long serialVersionUID = 696681375664303576L;
	
	public ProgrammerConversionFrame(String title){
	 
	super(title);
	GridLayout grid = new GridLayout(4, 1);
	setLayout(grid);
	setSize(200,200);
	setVisible(true);
	setResizable(false);
	 
	JComboBox convert = new JComboBox();
	add(convert);
	convert.addItem("Binary");
	convert.addItem("Octal");
	convert.addItem("Decimal");
	convert.addItem("Hexadecimal");
	convert.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JLabel to = new JLabel("To:");
	add(to); 
	
	JComboBox convertTo = new JComboBox();
	add(convertTo);
	convertTo.addItem("Binary");
	convertTo.addItem("Octal");
	convertTo.addItem("Decimal");
	convertTo.addItem("Hexadecimal");
	 
	convertTo.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton conversion = new JButton("Convert");
	add(conversion);
	
	conversion.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	 
	 
	}
	 
}




