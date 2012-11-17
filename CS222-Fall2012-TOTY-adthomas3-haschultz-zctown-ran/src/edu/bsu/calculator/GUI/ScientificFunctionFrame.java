/**
 * 
 * @author Andrew Thomas, Harrison Schultz, Ran An, Zach Town
 */

package edu.bsu.calculator.GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;

public class ScientificFunctionFrame extends JFrame {

	private static final long serialVersionUID = 696681375664303576L;
	
	private SimpleCalculatorFrame calcFrame;

	public ScientificFunctionFrame(String title, SimpleCalculatorFrame frame){
		
		super(title);
		GridLayout grid = new GridLayout(10, 4);
		setLayout(grid);
		setSize(300,500);
		setVisible(true);
		setResizable(false);
		
		calcFrame = frame;
		JButton openParentheses = new JButton("(");
		add(openParentheses);
		
		openParentheses.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("(");
					
					
			}

		});
		
		JButton closeParentheses = new JButton(")");
		add(closeParentheses);
		
		closeParentheses.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield(")");
					
					
			}

		});
		
		JButton percent = new JButton("%");
		add(percent);
		
		percent.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("%");
					
					
			}

		});
		
		JButton reciporical = new JButton("1/X");
		add(reciporical);
		
		reciporical.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("1/X");
					
					
			}

		});
		
		JButton squared = new JButton("x^2");
		add(squared);
		
		squared.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("x^2");
					
					
			}

		});
		
		JButton nthPowers = new JButton("x^n");
		add(nthPowers);
		
		nthPowers.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("x^n");
					
					
			}

		});
		
		JButton factorial = new JButton("!");
		add(factorial);
		
		factorial.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("!");
					
					
			}

		});
		
		JButton squareRoot = new JButton("square root");
		add(squareRoot);
		
		squareRoot.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("sqrt");
					
					
			}

		});
		
		JButton cubeRoot = new JButton("cube root");
		add(cubeRoot);
		
		cubeRoot.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("cbrt");
					
					
			}

		});
		
		JButton xRoot = new JButton("x root");
		add(xRoot);
		
		xRoot.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("xrt");
					
					
			}

		});
		
		JButton degree = new JButton("deg");
		add(degree);
		
		degree.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				//should be used to switch between degrees and radians
				
				calcFrame.setComputationTextfield("deg");
				
					
			}

		});
		
		JButton radian = new JButton("rad");
		add(radian);
		
	    radian.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				//should be used to switch between degrees and radians
				
				calcFrame.setComputationTextfield("rad");
					
					
			}

		});
		
		JButton sine = new JButton("sin");
		add(sine);
		
		sine.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("sin");
					
					
			}

		});
		
		JButton cosine = new JButton("cos");
		add(cosine);
		
		cosine.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("cos");
					
					
			}

		});
		
		JButton tangent = new JButton("tan");
		add(tangent);
		
		tangent.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("tan");
					
					
			}

		});
		
		JButton cosecant = new JButton("csc");
		add(cosecant);
		
		cosecant.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("csc");
					
					
			}

		});
		
		JButton secant = new JButton("sec");
		add(secant);
		
		secant.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("sec");
					
					
			}

		});
		
		JButton cotangent = new JButton("cot");
		add(cotangent);
		
		cotangent.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("cot");
				
			}

		});
		
		JButton sinh = new JButton("sinh");
		add(sinh);
		
		sinh.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("sinh");
				
			}

		});
		
		JButton cosh = new JButton("cosh");
		add(cosh);
		
		cosh.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("cosh");
				
			}

		});
		
		JButton tanh = new JButton("tanh");
		add(tanh);
		
		tanh.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("tanh");
				
			}

		});
		
		JButton csch = new JButton("csch");
		add(csch);
		
		csch.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("csch");
				
			}

		});
		
		JButton sech = new JButton("sech");
		add(sech);
		
		sech.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("sech");
				
			}

		});
		
		JButton coth = new JButton("coth");
		add(coth);
		
		coth.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("coth");
				
			}

		});
		
		JButton arcSine = new JButton("sin^-1");
		add(arcSine);
		
		arcSine.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("sin^-1");
					
					
			}

		});
		
		JButton arcCosine = new JButton("cos^-1");
		add(arcCosine);
		
		arcCosine.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("cos^-1");
					
					
			}

		});
		
		JButton arcTangent = new JButton("tan^-1");
		add(arcTangent);
		
		arcTangent.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("tan^-1");
					
					
			}

		});
		
		JButton arcCosecant = new JButton("csc^-1");
		add(arcCosecant);
		
		arcCosecant.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("csc^-1");
					
					
			}

		});
		
		JButton arcSecant = new JButton("sec^-1");
		add(arcSecant);
		
		arcSecant.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("sec^-1");
					
					
			}

		});
		
		JButton arcCotangent = new JButton("cot^-1");
		add(arcCotangent);
		
		arcCotangent.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("cot^-1");
					
					
			}

		});
		
		JButton logBase2 = new JButton("log2");
		add(logBase2);
		
		logBase2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("log2");
					
					
			}

		});
		
		JButton twoRaisedToX = new JButton("2^x");
		add(twoRaisedToX);
		
		twoRaisedToX.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("2^x");
					
					
			}

		});
		
		JButton logBase10 = new JButton("log10");
		add(logBase10);
		
		logBase10.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("log10");
					
					
			}

		});
		
		JButton tenRaisedToX = new JButton("10^x");
		add(tenRaisedToX);
		
		tenRaisedToX.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("10^x");
					
					
			}

		});
		
		JButton naturalLog = new JButton("ln");
		add(naturalLog);
		
		naturalLog.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("ln");
					
					
			}

		});
		
		JButton eRaisedtoX = new JButton("e^x");
		add(eRaisedtoX);
		
		eRaisedtoX.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield("e^x");
					
					
			}

		});
		
		JButton pi = new JButton("pi");
		add(pi);
		
		pi.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield(Math.PI + "");
					
					
			}

		});
		
		JButton e = new JButton("e");
		add(e);
		
		e.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield(Math.E + "");
					
					
			}

		});
	
		JButton random = new JButton("Random");
		add(random);
		
		random.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				calcFrame.setComputationTextfield(Math.random() + "");
				
			}

		});
		
		
		
	}
}

