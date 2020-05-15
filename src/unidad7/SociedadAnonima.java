package unidad7;

import java.util.TreeSet;

public class SociedadAnonima 
{
	private String nombre;
	private TreeSet<String>trabajos=new TreeSet();
	
	public SociedadAnonima(String nombre, String trabajos)
	{
		this.nombre=nombre;
		this.trabajos.add(trabajos);
	}
	
	public void setAniadirTrabajos(String trabajos) 
	{
		this.trabajos.add(trabajos);
	}
	public void setEliminarTrabajos(String trabajos) 
	{
		this.trabajos.remove(trabajos);
	}

	public String getNombre() 
	{
		return nombre;
	}

	public TreeSet<String> getTrabajos() 
	{
		return trabajos;
	}
	
	
	
}
