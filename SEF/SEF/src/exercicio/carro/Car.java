/**
 * 
 */
package exercicio.carro;

/**
 * @author treinamento
 *
 */
public class Car {

	/**
	 * 
	 */

	private Engine engine;
	private Seat seat;
	private GasTank gasTank;
	
	public Car() {	}
	
	public Car(Engine engine, Seat seat, GasTank gastank) {
		this.engine = engine;
		this.seat = seat;
		this.gasTank = gastank;
	}
	
	
	
	public Engine getEngine() {
		return engine;
	}



	public void setEngine(Engine engine) {
		this.engine = engine;
	}



	public Seat getSeat() {
		return seat;
	}



	public void setSeat(Seat seat) {
		this.seat = seat;
	}



	public GasTank getGasTank() {
		return gasTank;
	}



	public void setGasTank(GasTank gasTank) {
		this.gasTank = gasTank;
	}




}
