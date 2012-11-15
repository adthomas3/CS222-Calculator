
package edu.bsu.calculator.GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;

public class ScientificFunctionFrame extends JFrame {

	private static final long serialVersionUID = 696681375664303576L;
	
	public ScientificFunctionFrame(String title){
	 
		super(title);
		GridLayout grid = new GridLayout(11, 3);
		setLayout(grid);
		setSize(300,500);
		setVisible(true);
		setResizable(false);
		 
		JButton openParentheses = new JButton("(");
		add(openParentheses);
		 
		openParentheses.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e) {
		
		 
		 
		 
		}
	
	});
	 
	JButton closeParentheses = new JButton(")");
	add(closeParentheses);
	 
	closeParentheses.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton percent = new JButton("%");
	add(percent);
	 
	percent.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton reciporical = new JButton("1/X");
	add(reciporical);
	 
	reciporical.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton squared = new JButton("x^2");
	add(squared);
	 
	squared.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton nthPowers = new JButton("x^n");
	add(nthPowers);
	 
	nthPowers.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton factorial = new JButton("%");
	add(factorial);
	 
	factorial.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton squareRoot = new JButton("square root");
	add(squareRoot);
	 
	squareRoot.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton cubeRoot = new JButton("cube root");
	add(cubeRoot);
	 
	cubeRoot.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton xRoot = new JButton("x root");
	add(xRoot);
	 
	xRoot.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton degree = new JButton("deg");
	add(degree);
	 
	degree.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton radian = new JButton("rad");
	add(radian);
	 
	   radian.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton sine = new JButton("sin");
	add(sine);
	 
	sine.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton cosine = new JButton("cos");
	add(cosine);
	 
	cosine.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton tangent = new JButton("tan");
	add(tangent);
	 
	tangent.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton cosecant = new JButton("csc");
	add(cosecant);
	 
	cosecant.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton secant = new JButton("sec");
	add(secant);
	 
	secant.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton cotangent = new JButton("cot");
	add(cotangent);
	 
	cotangent.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton arcSine = new JButton("sin^-1");
	add(arcSine);
	 
	arcSine.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton arcCosine = new JButton("cos^-1");
	add(arcCosine);
	 
	arcCosine.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton arcTangent = new JButton("tan^-1");
	add(arcTangent);
	 
	arcTangent.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton arcCosecant = new JButton("csc^-1");
	add(arcCosecant);
	 
	arcCosecant.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton arcSecant = new JButton("sec^-1");
	add(arcSecant);
	 
	arcSecant.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton arcCotangent = new JButton("cot^-1");
	add(arcCotangent);
	 
	arcCotangent.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton logBase2 = new JButton("log2");
	add(logBase2);
	 
	logBase2.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton twoRaisedToX = new JButton("2^x");
	add(twoRaisedToX);
	 
	twoRaisedToX.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton logBase10 = new JButton("log10");
	add(logBase10);
	 
	logBase10.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton tenRaisedToX = new JButton("10^x");
	add(tenRaisedToX);
	 
	tenRaisedToX.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton naturalLog = new JButton("ln");
	add(naturalLog);
	 
	naturalLog.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton eRaisedtoX = new JButton("e^x");
	add(eRaisedtoX);
	 
	eRaisedtoX.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton pi = new JButton("pi");
	add(pi);
	 
	pi.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton e = new JButton("e");
	add(e);
	 
	e.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	JButton random = new JButton("Random");
	add(random);
	 
	random.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	 
	 
	 
	}
	
	});
	 
	 
	 
	}
}

