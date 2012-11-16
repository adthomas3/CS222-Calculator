/**
 * 
 * @author Andrew Thomas, Harrison Schultz, Ran An, Zach Town
 */


package edu.bsu.calculator.GUI;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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

	public SimpleCalculatorFrame(String title)
	{
		super(title);
		setSize(900, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridBagLayout gridbag = new GridBagLayout();
		setLayout(gridbag);
		
		GridBagConstraints constraints = new GridBagConstraints();
	
		constraints.fill = GridBagConstraints.BOTH;
		
        boolean selected = false;
        final JCheckBox scientific = new JCheckBox("Scientific", selected);
        add(scientific, constraints);
        
        scientific.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (scientific.isSelected() == true)
				{
					ScientificFunctionFrame frame = new ScientificFunctionFrame("Scientific Functions");
				    frame.setVisible(true);
				}
				
			    
			}

		});
        
      
        
        boolean selected2 = false;
        final JCheckBox programmer = new JCheckBox("Programmer", selected2);
        add(programmer, constraints);
        
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
        add(unitConversion, constraints);
        
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
        add(numberPad, constraints);
        
        numberPad.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (numberPad.isSelected() == true)
				{
					NumberPadFrame panel = new NumberPadFrame("Number Pad");
				    panel.setVisible(true);
				}
			}

		});
		
		constraints.ipadx = 350;
        constraints.ipady = 300;
		
		final JTextField ComputationTextfield = new JTextField();
		ComputationTextfield.setSize(350, 2);
		add(ComputationTextfield, constraints);
		
		final JTextArea OutputHistory = new JTextArea();
		OutputHistory.setSize(350, 300);
		add(OutputHistory, constraints);
	
		constraints.ipadx = 0;
		constraints.ipady = 0;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.weightx = 1;
		constraints.weighty = GridBagConstraints.BOTH;
		constraints.gridy = 2;
		constraints.gridx = 0;
		
		
		
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
		add(addition, constraints);
		
		constraints.gridx = 1;
		
		JButton subtraction = new JButton("-");
		add(subtraction, constraints);
		
		constraints.gridx = 2;
		
		JButton multiplication = new JButton("x");
		add(multiplication, constraints);
		
		constraints.gridx = 3;
		
		JButton division = new JButton("/");
		add(division, constraints);
		
		constraints.gridx = 4;
		
		JButton copy = new JButton("copy");
		add(copy, constraints);
		
		constraints.gridx = 5;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
		
        JButton clear = new JButton("clear");
		add(clear, constraints);
		
		
	}

}
