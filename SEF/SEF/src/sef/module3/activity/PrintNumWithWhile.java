/**
 * 
 */
package sef.module3.activity;

/**
 * @author 
 *
 */
public class PrintNumWithWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// Print all even numbers less than 100
		int i = 0;
		while(i<100){
			System.out.println(i);
			i=i+2;			
		}
		
		System.out.println("---------------------------------------");
		
		i = 0;
		while(i<100){
			if (i % 2 == 0) {
				System.out.println(i);
							
			}
			
			i++;
		}
		
		System.out.println("---------------------------------------");
		// write code to Print all odd numbers less than 100
		
		
		// PRIMEIRA OPCAO
		i = 1;
		while (i <= 100) {
			
			System.out.println(i);
			i = i + 2;
		} 
		
		
		System.out.println("----------------- 2 OPCAO ----------------------");

		// SEGUNDA OPCAO
		i = 1;
		while (i <= 100) {
				
			if (i % 2 != 0) {
				System.out.println(i);
			}
			
			i++;
		}
		
		
		System.out.println("---------------------------------------");
		
		
	}

}
