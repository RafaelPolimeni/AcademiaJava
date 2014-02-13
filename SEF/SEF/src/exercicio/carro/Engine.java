package exercicio.carro;

public class Engine {

	private int serial;
	private int cilindradas; // exemplo: 10000, 16000
	private float cavaloMotor; // força do motor exemplo: 1.0 ou 1.6 ... 2.0 ...
	
	public Engine(int serial) { 
		
		this.serial = serial;
	}
	
	
	public Engine(int serial, int cilindradas, float cavaloMotor) {
		this.serial = serial;
		this.cilindradas = cilindradas;
		this.cavaloMotor = cavaloMotor;
	}

	

	public int getSerial() {
		return serial;
	}



	public void setSerial(int serial) {
		this.serial = serial;
	}



	public int getCilindradas() {
		return cilindradas;
	}




	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}




	public float getCavaloMotor() {
		return cavaloMotor;
	}




	public void setCavaloMotor(float cavaloMotor) {
		this.cavaloMotor = cavaloMotor;
	}






}
