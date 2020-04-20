package unidad6;

public class Pokemon 
{
	private String nombre;
	private String elemento;
	public void setSalud(int salud) {
		this.salud = salud;
	}

	private int salud;

	public Pokemon(String nombre, String elemento, int salud)
	{
		this.nombre=nombre;
		this.elemento=elemento;
		this.salud=salud;
	}

	public String getNombre() {
		return nombre;
	}

	public String getElemento() {
		return elemento;
	}

	public int getSalud() {
		return salud;
	}
	
}
