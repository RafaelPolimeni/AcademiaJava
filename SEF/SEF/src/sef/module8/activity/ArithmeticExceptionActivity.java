package sef.module8.activity;

// Needs to be completed
public class ArithmeticExceptionActivity {
	// 1 - Type main method and call catchMe with 10 and 0

	public static void main(String[] args) {

		ArithmeticExceptionActivity a = new ArithmeticExceptionActivity();

		// try {
		a.catchMe(10, 0);

		// } catch (ArithmeticException e) {
		//
		// System.err.println("Na divis�o, qualquer n�mero dividido por zero � imposs�vel de ser calculado.");
		//
		// } finally {
		//
		// System.out.println("Thank you for using this program.");
		// }

	}

	void catchMe(int num1, int num2) {
		// The following code results in an Exception.
		// 2 - Identify the exception and write code to handle this exception.

		if (num2 == 0) {
			System.err.println("Denominador � igual a zero.\n");
		} else {
			int result = num1 / num2;
			System.out.println("The result is :" + result);

		}

		System.out.println("Thank you for using this program.");
		// 3 - After handling the exception, write a finally block which
		// prints a message "Thank you for using this program."

		// 4- try to call catchMe with 10 and 2 now and see which messages get
		// printed.

		
	}

}
