import java.util.ArrayList;
import java.util.Stack;



public class InputParser {
	
	public InputParser(){
		
	};
	public String Solve(String[] input){
	    double operand1, operand2, output;
	    String operator; 
	    boolean operand = false, notEmpty = true;
	    Stack<Double> operandStack = new Stack<Double>();
	    Stack<String> operatorStack = new Stack<String>();

	    for(String currentElement: input){	           
	        operand = isOperator(currentElement);
        
	        if(!operand/* is operand */){        	
	        	Double currentOperand = Double.parseDouble(currentElement);
	            operandStack.push(currentOperand);
	        }
	        else{

	                if(operatorStack.isEmpty()){

	                    operatorStack.push(currentElement);
	                }
	                else{

	                    if( /* stack value */ (precedenceLevel(operatorStack.peek()) >= (precedenceLevel(currentElement)) /* input value */)){

	                        do{

	                            operand1 = operandStack.pop();
	                            operand2 = operandStack.pop();
	                            operator = operatorStack.pop();
	                            output = operand2+operand1+operator;
	                            operandStack.push("" + output);   

	                            if(operatorStack.isEmpty() /* end loop if stack if empty */){                               
	                            	break;
	                            	}
	                            if(/* top of operator stack */ (precedenceLevel(operatorStack.peek().charAt(0))) <  (precedenceLevel(currentElement) /* input value */) ){
	                            	break;
	                            	}

	                        } while(notEmpty);                      
	                    }

	                    operatorStack.push(currentElement);
	                }
	        }
	    }

	    do{
	        operand1 = operandStack.pop();
	        operand2 = operandStack.pop();
	        operator = operatorStack.pop();
	        output = operand2+operand1+operator;
	        operandStack.push(output);

	        if(operatorStack.isEmpty() /* end loop if stack if empty */){                               
	        break;
	        }

	    }while(notEmpty);

	    String out = operandStack.pop();
	    return out;         
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
	
	public double calcFunctionCaller(double operand1, double operand2, String value){
		if(value.equals("+")) 
		 	return Add.Calculate(operand1, operand2);
		else if (value.equals("%"))
			return Modulus.Calculate(operand1, operand2);					 
		else if (value.equals("-"))
			return Subtract.Calulate(operand1, operand2);
		else if (value.equals("^"))
			return Powers.Calculate(operand1, operand2);
		else if (value.equals("*"))
			return Multiply.Calculate(operand1,operand2);
		else if (value.equals("/"))
			return Division.Calculate(operand1,operand2);

	        
		
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
				   System.out.println(temp);
				   if (numberOfOperators == checkOperators)
					   temp	= "" + temp + input.substring(i+1);
				   
				   System.out.println(temp);
				   previousOperatorPosition = i;
				   
			   }   
		   }
		  return temp.split("_");
	   }
	}
