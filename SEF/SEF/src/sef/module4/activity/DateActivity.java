/**
 * 
 */
package sef.module4.activity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author treinamento
 * 
 */
public class DateActivity {

	/**
	 * @param args
	 */
	static DateActivity d = new DateActivity();

	public static void main(String[] args) {

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data formatada: " + sdf.format(date));

		System.out.println(date.toString());



	}

}
