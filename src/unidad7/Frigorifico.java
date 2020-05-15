package unidad7;

public class Frigorifico extends Electrodomesticos
{
	private boolean nofrost=false;
	
	public Frigorifico(int precio, Color color, char consumo, int peso, boolean nofrost)
	{
		super(precio,color,consumo,peso);
		this.nofrost=nofrost;
	}
	
	public Frigorifico (int precio, int peso)
	{
		super(precio,peso);
	}
	
	public Frigorifico()
	{
		super();
	}
	
	public boolean getNofrost() {
		return nofrost;
	}

	public void setNofrost(boolean nofrost) {
		this.nofrost = nofrost;
	}
	
	
	public String toString()
	{
		return "frigorifico"+super.toString();
	}
}
