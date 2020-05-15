package unidad7;

public class Television extends Electrodomesticos
{
	private int tamanio=20;
	private String sintonizador="DVB-T";
	
	public Television(int precio, Color color, char consumo, int peso,int tamanio, String sintonizador)
	{
		super(precio,color,consumo,peso);
		this.tamanio=tamanio;
		this.sintonizador=sintonizador;
	}
	
	public Television(int precio, int peso)
	{
		super(precio,peso);
	}
	
	public Television() 
	{
		super();
	}
	
	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public String getSintonizador() {
		return sintonizador;
	}

	public void setSintonizador(String sintonizador) {
		this.sintonizador = sintonizador;
	}

	public String toString()
	{
		return "television"+super.toString();
	}

}
