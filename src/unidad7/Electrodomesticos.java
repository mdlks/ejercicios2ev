package unidad7;


enum Color
{
    BLANCO,ROJO, GRIS, AZUL, NEGRO;
}

public abstract class Electrodomesticos implements Comparable<Electrodomesticos>
{
	private int precioBase=100;
	private int precioFinal;
	private char consumoE='f';
	private int peso=5;
	private Color color=Color.BLANCO;
	
	public Electrodomesticos(int precio, Color color, char consumo, int peso)
	{
		this.precioBase=precio;
		this.color=color;
		this.consumoE=consumo;
		this.peso=peso;
		this.precioFinal=calcularPrecio(precioBase, consumoE, peso);
	}
	
	public Electrodomesticos(int precio, int peso)
	{
		this.precioBase=precio;
		this.peso=peso;
		this.precioFinal=calcularPrecio(precioBase, consumoE, peso);
		
	}
	
	public Electrodomesticos()
	{
		this.precioFinal=calcularPrecio(precioBase, consumoE, peso);
	}
	
	public int calcularPrecio(int base, char consumo, int peso)
	{
		int precio=base;
		int recargo1=0;
		int recargo2=0;
		switch(consumo)
		{
		case 'a':
			recargo1=(precio*30/100);
		break;
		case 'b':
			recargo1=(precio*25/100);
			break;
		case 'c':
			recargo1=(precio*20/100);
			break;
		case 'd':
			recargo1=(precio*15/100);
			break;
		case 'e':
			recargo1=(precio*10/100);
			break;
		case 'f':
			recargo1=(precio*5/100);
			break;
		default:
			break;
		}
		if (peso>=0 && peso<20)
		{
			recargo2=(precio*5/100);
		}
		if (peso>=20 && peso<50)
		{
			recargo2=(precio*10/100);
		}
		if (peso>=50 && peso<80)
		{
			recargo2=(precio*15/100);
		}
		if (peso>=80)
		{
			recargo2=(precio*20/100);
		}
		precio=precio+recargo1+recargo2;
		
		return precio;
	}
			
	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public char getConsumoE() {
		return consumoE;
	}

	public void setConsumoE(char consumoE) {
		this.consumoE = consumoE;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setPrecioFinal(int precio)
	{
		precioFinal=precio;
	}
	
	public int getPrecioFinal()
	{
		return precioFinal;
	}
	
	public String toString()
	{
		return "P.V.P:"+ precioFinal;
	}
	public int compareTo(Electrodomesticos p) 
	{
		return 0;
	}
	
}
