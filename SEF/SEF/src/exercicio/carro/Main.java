/**
 * 
 */
package exercicio.carro;

import java.sql.SQLException;

/**
 * @author treinamento
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Engine engine = new Engine(1000);
		Seat seat = new Seat("Preto", true, true);
		GasTank gasTank = new GasTank(true);
		
		
		Car car = new Car();
		car.setEngine(engine);
		car.setGasTank(gasTank);
		car.setSeat(seat);
		
		System.out.println(car.getEngine().getSerial());
		System.out.println(car.getGasTank().isFlex());
		
		
		
		
		
	}

}
