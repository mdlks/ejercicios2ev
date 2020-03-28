package unidad5;

public class Naipe {

	private String palo;
	private String rango;
	private int valor;
	
	public Naipe(String palo, String rango, int valor) {
		this.palo=palo;
		this.rango=rango;
		this.valor=valor;		
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
}
