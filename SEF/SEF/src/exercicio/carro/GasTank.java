package exercicio.carro;

public class GasTank {

	private boolean flex;
	private boolean gasolina;
	private boolean alcool;
	
	public GasTank() { }

	public GasTank(boolean flex, boolean gasolina, boolean alcool) {
		this.flex = flex;
		this.gasolina = gasolina;
		this.alcool = alcool;
	}

	public GasTank(boolean flex) {
		this.flex = flex;
	}
	
	public boolean isFlex() {
		return flex;
	}

	public void setFlex(boolean flex) {
		this.flex = flex;
	}

	public boolean isGasolina() {
		return gasolina;
	}

	public void setGasolina(boolean gasolina) {
		this.gasolina = gasolina;
	}

	public boolean isAlcool() {
		return alcool;
	}

	public void setAlcool(boolean alcool) {
		this.alcool = alcool;
	}
	
	

}
