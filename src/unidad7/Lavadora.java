package unidad7;




public class Lavadora extends Electrodomesticos
{
	private int carga=5;
	
	public Lavadora(int precio, Color color, char consumo, int peso, int carga)
	{
		super(precio,color,consumo,peso);
		this.carga=carga;
	}
	
	public Lavadora(int precio, int peso)
	{
		super(precio,peso);
	}
	
	public Lavadora()
	{
		super();
	
	}
	
	public int precioLavadora(int carga)
	{
		if(carga>8)
		{
			int p=getPrecioFinal();
			p=p*10/100;
			setPrecioFinal(p);
		}
		return getPrecioFinal();
	}
	
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public String toString()
	{
		return "lavadora"+super.toString();
	}
}
