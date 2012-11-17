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

public class UnitConversionFrame extends JFrame {

	private static final long serialVersionUID = 696681375664303576L;

	public UnitConversionFrame(String title){
		
		super(title);
		GridLayout grid = new GridLayout(4, 1);
		setLayout(grid);
		setSize(300, 300);
		setVisible(true);
		setResizable(false);
		
		JComboBox<String> conversionType = new JComboBox<String>();
		add(conversionType);
		conversionType.addItem("Length");
		conversionType.addItem("Speed");
		conversionType.addItem("Temperature");
		conversionType.addItem("Time");
		conversionType.addItem("Weights and Masses");
		
		conversionType.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				/*if (conversionType.)*/
					
				/**
				 * Make it so that when a specific type of conversion is selected 
				 * only a certain jCombo box will show up with the available conversion
				 * types
				 * 
				 * if (conversionType.isSelected() == item[0])
				 * Jcombo box = area conversion
				 * 
				 * if (conversionType.isSelected() == item[1])
				 * Jcombo box = length
				 */
					
			}

		});
		
		
		JComboBox<String> areaConversion = new JComboBox<String>();
		add(areaConversion);
		areaConversion.addItem("Acres");
		areaConversion.addItem("Hectares");
		areaConversion.addItem("Square Centimeters");
		areaConversion.addItem("Square Feet");
		areaConversion.addItem("Square Inches");
		areaConversion.addItem("Square Kilometers");
		areaConversion.addItem("Square Meters");
		areaConversion.addItem("Square Miles");
		areaConversion.addItem("Square Millimeters");
		areaConversion.addItem("Square Yards");
		
		areaConversion.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				
					
					
			}

		});
		
		JLabel to = new JLabel("To:");
		add(to);
		
		
		JComboBox<String> conversionTo = new JComboBox<String>();
		add(conversionTo);
		conversionTo.addItem("Acres");
		conversionTo.addItem("Hectares");
		conversionTo.addItem("Square Centimeters");
		conversionTo.addItem("Square Feet");
		conversionTo.addItem("Square Inches");
		conversionTo.addItem("Square Kilometers");
		conversionTo.addItem("Square Meters");
		conversionTo.addItem("Square Miles");
		conversionTo.addItem("Square Millimeters");
		conversionTo.addItem("Square Yards");
		
		conversionTo.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				
					
					
			}

		});
		
		
	}
	
}