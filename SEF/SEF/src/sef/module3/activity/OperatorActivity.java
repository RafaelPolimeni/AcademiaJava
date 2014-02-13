package sef.module3.activity;

/**
 * @author 
 *
 */
public class OperatorActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare numbers to be operated
		int i = 8;
		int j = 5;
		
		// Subtract numbers
		int subtracao = i-j;
		
		// Print result
		System.out.println("Difference = " + subtracao);
		
		// Add numbers
		i = 10;
		
		j = 30;
		
		
		System.out.println("a diferenca é: " + (i < j ? j-i : i-j));
		
	}

}
