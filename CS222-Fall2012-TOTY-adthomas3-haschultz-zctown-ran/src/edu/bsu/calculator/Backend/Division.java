package edu.bsu.calculator.Backend;
/**
 * 
 * @author Andrew Thomas, Harrison Schultz, Ran An, Zach Town
 */
public class Division {
	private static double numerator;
	private static double denominator;
	
	public Division(){
		
	}
	
	public Division(double num, double denom){
		numerator = num;
		denominator = denom;
	}
	
	public void SetNumerator(double num){
		numerator = num;
	}
	
	public void SetDenominator(double denom){
		denominator = denom;
	}
	
	public double Calculate(){
		return numerator / denominator;
	}
	public static double Calculate(double denom, double num){
		return num / denom;
	}
}
