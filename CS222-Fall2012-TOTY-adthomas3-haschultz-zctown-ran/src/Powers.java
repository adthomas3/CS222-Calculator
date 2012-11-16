
public class Powers {
	private static double exponent;
	private static double base;
	
	public Powers(){
		
	}
	
	public Powers(double b, double e){
		exponent = e;
		base = b;
	}
	
	public void setBase(double b){
		base = b;
	}
	
	public void setExponent(double e){
		exponent = e;
	}
	
	public double Calculate(){
		return Math.pow(base, exponent);
	}
	
	public double Calculate(double b, double e){
		return Math.pow(b, e);
	}
}
