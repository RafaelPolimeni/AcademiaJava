/**
 * 
 */
package sef.module3.activity;

import javax.swing.JOptionPane;

/**
 * @author 
 *
 */
public class NumToWordsUsingMethod {

		/**
		 * @param args
		 */
	
		public static void main(String[] args) {
			
			NumToWordsUsingMethod mtwum = new NumToWordsUsingMethod();
			
//			mtwum.printMyWord(8);
//			mtwum.printMyWord(9);
//			mtwum.printMyWord(10);
			
			NumToWords ntw = new NumToWords();
			ntw.retornaString(Integer.parseInt(JOptionPane.showInputDialog("Informe o valor")));
			

		}

		private void printMyWord(int i) {
			
			final String numText;
			
			switch(i) {
			case 1:
				numText = "ONE";break;
			case 2:
				numText = "TWO";break;
			case 3:
				numText = "THREE";break;
			case 4:
				numText = "FOUR";break;
			case 5:
				numText = "FIVE";break;
			case 6:
				numText = "SIX";break;
			case 7:
				numText = "SEVEN";break;
			case 8:
				numText = "EIGHT";break;
			case 9:
				numText = "NINE";break;
			case 10:
				numText = "TEN";break;
			default:
				numText = "NUMBER " + i;
			}
			
			System.out.println(numText);
			
		}


		

	}
