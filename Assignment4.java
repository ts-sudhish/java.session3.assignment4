/**
 * 
 */
package sdh.java.session3;

import java.util.Scanner;

/**
 * @author Sudhish TS
 *
 */
public class Assignment4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner( System.in );
		char operator;
	    double firstNumber,secondNumber;

	    System.out.println("Enter an operator (+, -, /, *): ");
	    operator = in.next().charAt(0);
	    System.out.println("Enter two operands: ");
	    int no1=in.nextInt();
	    int no2=in.nextInt();
	    double result = 0;
	    switch(operator)
	    {
	        case '+':
	        	result = no1 + no2;
	        	System.out.println(no1 + " + " + no2 + " = " + result);
	            break;

	        case '-':
	        	result = no1 - no2;
	        	System.out.println(no1 + " - " + no2 + " = " + result);
	            break;

	        case '*':
	        	result = no1 * no2;
	        	System.out.println(no1 + " * " + no2 + " = " + result);
	            break;

	        case '/':
	        	result = no1 / no2;
	        	System.out.println(no1 + " / " + no2 + " = " + result);
	            break;

	        default:
	        	System.out.println("Error! operator is not correct");
	    }
	    
	}

}
