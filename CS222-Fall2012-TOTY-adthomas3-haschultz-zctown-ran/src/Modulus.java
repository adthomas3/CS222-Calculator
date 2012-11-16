
public class Modulus {
	private static double numerator;
	private static double denominator;
	
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
	public static double Calculate(double num, double denom){
		return num % denom;
	}
}
