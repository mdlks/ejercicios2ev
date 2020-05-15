package unidad7;

import java.util.ArrayList;

public class Contratistas extends Empleados
{
	private ArrayList<SociedadAnonima>sociedades=new ArrayList<>();
	
	public Contratistas(String nombre, String apellido, String fechaContratacion, int numeroCuenta) 
	{
		super(nombre, apellido, fechaContratacion, numeroCuenta);
		
	}

	public void setSociedades(SociedadAnonima sociedades) {
		this.sociedades.add(sociedades);
	}

	

	
	
}
