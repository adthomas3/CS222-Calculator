import java.lang.Math;

public class Squareroot {
	private double number;
	
	public Squareroot(){
		
	}
	
	public void SetNumber(double n){
		number = n;
	}
	
	public double Calculate(){
		return Math.sqrt(number);
	}
}
