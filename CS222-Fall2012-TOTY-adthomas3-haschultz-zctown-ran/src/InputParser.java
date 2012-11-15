import java.util.ArrayList;
import java.util.Stack;



public class InputParser {
	
	public InputParser(){
		
	};
	public String Solve(String input){

	    char arr[] = input.toCharArray() ; 
	    String value, operand1, operand2,operator, output;
	  
	    boolean operand = false, notEmpty = true;
	    Stack<String> operandStack = new Stack<String>();
	    Stack<String> operatorStack = new Stack<String>();

	    for(char c: arr){

	        value = Character.toString(c);        
	        operand = isOperator(value);

	        
	        if(!operand/* is operand */){

	            operandStack.push(value);

	        }
	        else{

	                if(operatorStack.isEmpty()){

	                    operatorStack.push(value);
	                }
	                else{

	                    if( /* stack value */ (precedenceLevel(operatorStack.peek().charAt(0))) >= (precedenceLevel(c) /* input value */) ){

	                        do{

	                            operand1 = operandStack.pop();
	                            operand2 = operandStack.pop();
	                            operator = operatorStack.pop();
	                            output = operand2+operand1+operator;
	                            operandStack.push("" + output);   

	                            if(operatorStack.isEmpty() /* end loop if stack if empty */){                               
	                            	break;
	                            	}
	                            if(/* top of operator stack */ (precedenceLevel(operatorStack.peek().charAt(0))) <  (precedenceLevel(c) /* input value */) ){
	                            	break;
	                            	}

	                        } while(notEmpty);                      
	                    }

	                    operatorStack.push(value);
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
	public int precedenceLevel(char operand) {
	    switch (operand) {
	        case '+':
	        case '-':
	            return 0;
	        case '*':
	        case '/':
	        case '%':
	            return 1;
	        case '^':
	            return 2;
	        case '(':
	        case ')':
	            return 3;
	        default:
	            System.out.println("error! invalid operator");
	                return 0;
	    	}
	    }
	    
	   public String Splitter(String input){
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
		  return temp;
	   }
	}
