
public class Modulus {
	private double numerator;
	private double denominator;
	
	public Modulus(){
		
	}
	
	public Modulus(double num, double denom){
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
		return numerator % denominator;
	}
}
