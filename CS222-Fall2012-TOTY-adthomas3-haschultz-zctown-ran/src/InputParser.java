/**
 * 
 * @author Andrew Thomas, Harrison Schultz, Ran An, Zach Town
 */
import java.util.Stack;

public class InputParser {
	
	public InputParser(){
		
	};
	public double Solve(String[] input){
	    double operand1, operand2, output = 0;
	    String operator; 
	    Stack<Double> operandStack = new Stack<Double>();
	    Stack<String> operatorStack = new Stack<String>();

	    for(String currentElement: input){	           
        
	        if(isOperator(currentElement) == false /* is operand */){        	
	        	Double currentOperand = Double.parseDouble(currentElement);
	        	System.out.println(currentOperand);
	            operandStack.push(currentOperand);
	        }
	        else{
	        	if(operatorStack.isEmpty())
	                    operatorStack.push(currentElement);	
	            else{     
	                while(!operatorStack.isEmpty() && precedenceLevel(operatorStack.peek()) >=  (precedenceLevel(currentElement))){
	                            operand1 = operandStack.pop();
	                            System.out.println(operand1);
	                            operand2 = operandStack.pop();
	                            System.out.println(operand2);
	                            operator = operatorStack.pop();
	                            output = calcFunctionCaller(operand1,operand2, operator);
	                            operandStack.push(output);  
	                    }
	                if (precedenceLevel(operatorStack.peek()) < (precedenceLevel(currentElement)))
	                	operatorStack.push(currentElement);
	            	}
	            }
	        }
	    while(!operatorStack.isEmpty()){
	    operand1 = operandStack.pop();
        System.out.println(operand1);
        operand2 = operandStack.pop();
        System.out.println(operand2);
        operator = operatorStack.pop();
        output = calcFunctionCaller(operand1,operand2, operator);
        operandStack.push(output);}  
	    	return output;
	    }


	/**
	 * Determines if the value is an operator
	 * @param value
	 * @return boolean is operator or not
	 */
	public boolean isOperator(String value){

	    if(
	    		 (value.equals("+")) || (value.equals("%")) ||
	    		 (value.equals("-")) || (value.equals("^")) ||
	    		 (value.equals("*")) || (value.equals("(")) ||
	    		 (value.equals("/")) || (value.equals(")"))
	        
	       )
	    {           
	        return true;    
	    }
	    else{
	        return false;
	    }
	}
	
	public double calcFunctionCaller(double operand1, double operand2, String operator){
		if(operator.equals("+")) 
		 	return Add.Calculate(operand1, operand2);
		else if (operator.equals("%"))
			return Modulus.Calculate(operand1, operand2);					 
		else if (operator.equals("-"))
			return Subtract.Calculate(operand1, operand2);
		else if (operator.equals("^"))
			return Powers.Calculate(operand1, operand2);
		else if (operator.equals("*"))
			return Multiply.Calculate(operand1,operand2);
		else if (operator.equals("/"))
			return Division.Calculate(operand1,operand2);
		
		return -1;

	        
		
	}

	/** 
	 * Calculates a value for each operator based on it's precedence
	 * ORDER OF OPERATION FOR INFIX
	 * Parentheses
	 * Exponentiation
	 * Multiplication, division and modulus
	 * Addition and subtraction
	 * @param operand char the value being tested
	 * @return int return precedence level of operator
	 */
	public int precedenceLevel(String operand) {
	    switch (operand) {
	        case "+":
	        case "-":
	            return 0;
	        case "*":
	        case "/":
	        case "%":
	            return 1;
	        case "^":
	            return 2;
	        case "(":
	        case ")":
	            return 3;
	        default:
	            System.out.println("error! invalid operator");
	             return 0;
	    	}
	    }
	    
	   public String[] Splitter(String input){
		   String currentChar;
		   String temp = "";
		   int numberOfOperators = 0;
		   int checkOperators = 0;
		   int previousOperatorPosition = 0;
		   
		   for(int y = 0; y <= input.length() - 1; y++)
		   {
			   currentChar = Character.toString(input.charAt(y));   
			   if (isOperator(currentChar))
				   numberOfOperators++;
			  }
		   for(int i = 0; i <= input.length() - 1; i++)
		   {
			   currentChar = Character.toString(input.charAt(i));   
			   if (isOperator(currentChar)){
				   checkOperators++;
				   if (checkOperators == 1)
					   temp = "" + temp + input.substring(0, i) + "_";			  
				   else
					   temp = "" + temp + input.substring(previousOperatorPosition+1,i) + "_";
				   temp	= "" + temp + input.substring(i, i+1) + "_";   
				   if (numberOfOperators == checkOperators)
					   temp	= "" + temp + input.substring(i+1);
				   previousOperatorPosition = i;
				   
			   }   
		   }
		  return temp.split("_");
	   }
	}