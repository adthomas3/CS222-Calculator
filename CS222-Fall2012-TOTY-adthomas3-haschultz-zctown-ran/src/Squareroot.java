import java.lang.Math;

public class Squareroot {
	private static double number;
	
	public Squareroot(){
		
	}
	
	public void SetNumber(double n){
		number = n;
	}
	
	public double Calculate(){
		return Math.sqrt(number);
	}
	public static double Calculate(double n){
		return Math.sqrt(n);
	}
}
