package exercicio.carro;

public class Seat {

	private String cor;
	private boolean couro;
	private boolean regulagemAutomatica;
	
	public Seat(String cor, boolean couro, boolean regulagemAutomatica) {
		this.cor = cor;
		this.couro = couro;
		this.regulagemAutomatica = regulagemAutomatica;
	}

	public Seat() {	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isCouro() {
		return couro;
	}

	public void setCouro(boolean couro) {
		this.couro = couro;
	}

	public boolean isRegulagemAutomatica() {
		return regulagemAutomatica;
	}

	public void setRegulagemAutomatica(boolean regulagemAutomatica) {
		this.regulagemAutomatica = regulagemAutomatica;
	}

	
	
	
}
