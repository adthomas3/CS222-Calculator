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
		
		final JComboBox<String> conversionType = new JComboBox<String>();
		add(conversionType);
		conversionType.addItem("Length");
		conversionType.addItem("Speed");
		conversionType.addItem("Temperature");
		conversionType.addItem("Time");
		conversionType.addItem("Weights and Masses");
		
		conversionType.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				//if (conversionType))
					
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
		
		
		final JComboBox<String> areaConversion = new JComboBox<String>();
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

				areaConversion.setVisible(false);
					
					
			}

		});
		
		JLabel to = new JLabel("To:");
		add(to);
		
		
		final JComboBox<String> conversionToArea = new JComboBox<String>();
		add(conversionToArea);
		conversionToArea.addItem("Acres");
		conversionToArea.addItem("Hectares");
		conversionToArea.addItem("Square Centimeters");
		conversionToArea.addItem("Square Feet");
		conversionToArea.addItem("Square Inches");
		conversionToArea.addItem("Square Kilometers");
		conversionToArea.addItem("Square Meters");
		conversionToArea.addItem("Square Miles");
		conversionToArea.addItem("Square Millimeters");
		conversionToArea.addItem("Square Yards");
		
		conversionToArea.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				conversionToArea.setVisible(false);
					
					
			}

		});
		
		
	}
	
}