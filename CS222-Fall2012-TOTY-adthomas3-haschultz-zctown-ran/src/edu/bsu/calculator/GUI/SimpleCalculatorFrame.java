/**
 * 
 * @author Andrew Thomas, Harrison Schultz, Ran An, Zach Town
 */


package edu.bsu.calculator.GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import edu.bsu.calculator.Backend.InputParser;



public class SimpleCalculatorFrame extends JFrame
{
	private static final long serialVersionUID = -6084863562874622616L;
	
	private final JTextField ComputationTextfield;
	private ScientificFunctionFrame frame;
	private NumberPadFrame frame2;
	

	public SimpleCalculatorFrame(String title)
	{
		super(title);
		setSize(488, 375);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel(new GridLayout(4,1));
		panel.setSize(138, 325);
		
        boolean selected = false;
        final JCheckBox scientific = new JCheckBox("Scientific", selected);
        add(scientific);
        
        
        scientific.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (scientific.isSelected() == true)
				{
					scientificFunctionFrameReference(frame);
					
				}
				
			    
			}

		});
        
    
        
        boolean selected2 = false;
        final JCheckBox programmer = new JCheckBox("Programmer", selected2);
        add(programmer);
        
        programmer.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				if (programmer.isSelected() == true)
				{
					ProgrammerConversionFrame frame = new ProgrammerConversionFrame("Programmer");
				    frame.setVisible(true);
				}
					
					
			}

		});
        
        
        
        boolean selected3 = false;
        final JCheckBox unitConversion = new JCheckBox("Unit Conversion", selected3);
        add(unitConversion);
        
        unitConversion.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (unitConversion.isSelected() == true)
				{
					UnitConversionFrame frame = new UnitConversionFrame("Unit Conversions");
				    frame.setVisible(true);
				}
				
					
					
			}

		});
       
        
        boolean selected4 = false;
        final JCheckBox numberPad = new JCheckBox("Number Pad", selected4);
        add(numberPad);
        
        numberPad.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (numberPad.isSelected() == true)
				{
					numberPadFrameReference(frame2);
				    
				}
			}

		});
        
        panel.add(scientific);
        panel.add(programmer);
        panel.add(unitConversion);
        panel.add(numberPad);
        add(panel);
        panel.validate();
        
        
        
		
        JPanel panel2 = new JPanel(new GridLayout());
        panel2.setSize(350, 50);
        
		ComputationTextfield = new JTextField();
		ComputationTextfield.setSize(350, 50);
		ComputationTextfield.setHorizontalAlignment(JTextField.RIGHT);
		add(ComputationTextfield);
		
		panel2.setLocation(138, 250);
		panel2.add(ComputationTextfield);
		add(panel2);
		panel2.validate();
		
		JPanel panel3 = new JPanel(new GridLayout());
		panel3.setSize(350, 250);
		
		final JTextArea OutputHistory = new JTextArea();
		OutputHistory.setSize(350, 250);
		add(OutputHistory);
		
		
		
		ComputationTextfield.addKeyListener(new KeyListener(){
			
			InputParser parser = new InputParser();
			@Override
			public void keyPressed(KeyEvent key) {
				int e = key.getKeyCode();
				if (e == KeyEvent.VK_ENTER){
					String s = ComputationTextfield.getText();
					OutputHistory.setText(OutputHistory.getText() + "\n" + parser.Solve(parser.Splitter(s)));
					OutputHistory.updateUI();
					ComputationTextfield.setText("");
				}
			}

			@Override
			public void keyReleased(KeyEvent key) {
				
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				
				
			}
		});
		
		panel3.setLocation(138, 0);
		panel3.add(OutputHistory);
		add(panel3);
		panel3.validate();
		

		JPanel panel4 = new JPanel(new GridLayout(1, 7));
		panel4.setSize(350, 50);
		
		
		
	    JButton addition = new JButton("+");
	    add(addition);
		
	    addition.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				setComputationTextfield("+");
			
			}

		});

	    
		JButton subtraction = new JButton("-");
		add(subtraction);
		
		subtraction.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				setComputationTextfield("-");
			
			}

		});
	
		
		JButton multiplication = new JButton("x");
		add(multiplication);
		
		multiplication.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				setComputationTextfield("*");
			
			}

		});
		
		
		JButton division = new JButton("/");
		add(division);
		
		division.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				setComputationTextfield("/");
			
			}

		});
	
		
		JButton copy = new JButton("copy");
		add(copy);
		
		copy.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				ComputationTextfield.copy();
			
			}

		});
		
        JButton clear = new JButton("clear");
		add(clear);
		
		clear.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				ComputationTextfield.setText(" ");
			
			}

		});
		
		
		JButton equals = new JButton("=");
		add(equals);
		
		copy.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				InputParser parser = new InputParser();
				String s = ComputationTextfield.getText();
				OutputHistory.setText(parser.Solve(parser.Splitter(s)));
				OutputHistory.updateUI();
			
			}

		});
		
		panel4.setLocation(138, 300);
		panel4.add(addition);
		panel4.add(subtraction);
		panel4.add(multiplication);
		panel4.add(division);
		panel4.add(copy);
		panel4.add(clear);
		panel4.add(equals);
	    add(panel4);
	    panel4.validate();
	    
	    
	    //used to stack below the rest of the panels to keep 
	    //the 3rd panel from stacking the buttons below
	    JPanel panel5 = new JPanel();
	    panel5.setLocation(400, 0);
	    add(panel5);
		
		
		
		
	}
	
	public void scientificFunctionFrameReference(ScientificFunctionFrame frame)
	{
		frame = new ScientificFunctionFrame("Scientific Functions", this);
	}
	
	public void numberPadFrameReference(NumberPadFrame frame2)
	{
		frame2 = new NumberPadFrame("Number Pad", this);
	}
	
	public void setComputationTextfield(String text)
	{
		ComputationTextfield.setText(ComputationTextfield.getText() + text);
		
	}
	
}





