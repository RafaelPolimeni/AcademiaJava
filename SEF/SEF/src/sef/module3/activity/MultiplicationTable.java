/**
 * 
 */
package sef.module3.activity;

/**
 * @author
 * 
 */
public class MultiplicationTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Table from 1 to 10
		for (int i = 1; i <= 10; i++) {
			System.out.println("*** Table of " + i + " ***");
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "X" + j + " = " + i * j);
			}
		}

		System.out.println("------------------------------------------");

		// Table from 11 to 20

		// complete code. write for loop for int i

		for (int i = 11; i <= 20; i++) {

			System.out.println("*** Table of " + i + " ***");

			for (int j = 1; j <= 20; j++) {
				// complete code. write nested for loop for int j
				System.out.println(i + "X" + j + " = " + i * j);

			}
		}
		
		
		int[] numeros = {7,8,9,10,11,12,13,1,2,3,4,5,6,};
		String[] nomes = {"Andre","Luis","Alves","Costa"};
		
		for (String string : nomes) {
			System.out.println(string);
		}
		
		for (int i : numeros) {
			System.out.println(i);
		}

	}

}
