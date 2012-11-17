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
		setSize(900, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(5,2);
		setLayout(grid);
		
        boolean selected = false;
        final JCheckBox scientific = new JCheckBox("Scientific", selected);
        add(scientific);
        
        
        scientific.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (scientific.isSelected() == true)
				{
					scientificFunctionFrameReference(frame);
					frame.setVisible(true);
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
				    frame2.setVisible(true);
				}
			}

		});
		
		
		ComputationTextfield = new JTextField();
		ComputationTextfield.setSize(350, 2);
		ComputationTextfield.setHorizontalAlignment(JTextField.RIGHT);
		add(ComputationTextfield);
		
		final JTextArea OutputHistory = new JTextArea();
		OutputHistory.setSize(350, 300);
		//OutputHistory.setAlignmentX(RIGHT_ALIGNMENT);
		//OutputHistory.setAlignmentY(BOTTOM_ALIGNMENT);
		add(OutputHistory);
		
		
		
		ComputationTextfield.addKeyListener(new KeyListener(){
			
			InputParser parser = new InputParser();
			@Override
			public void keyPressed(KeyEvent key) {
				int e = key.getKeyCode();
				if (e == KeyEvent.VK_ENTER){
					String s = ComputationTextfield.getText();
					OutputHistory.setText(parser.Solve(parser.Splitter(s)));
					OutputHistory.updateUI();
				}
			}

			@Override
			public void keyReleased(KeyEvent key) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
			
		
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

				setComputationTextfield("");
			
			}

		});
		
		
		
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
		ComputationTextfield.setText(text);
		
	}

}






