public class Subtract {
	
	private double n1;
	private double n2;
	
	public Subtract(){
		
	}
	
	public Subtract(double num1, double num2){
		n1 = num1;
		n2 = num2;
	}
	
	public void SetNums(double num1, double num2){
		n1 = num1;
		n2 = num2;
	}
	
	public void SetFirstNum(double num1){
		n1 = num1;
	}
	
	public void SetSecondNum(double num2){
		n2 = num2;
	}
	
	public double Calculate(){
		return n1 - n2;
	}
}
