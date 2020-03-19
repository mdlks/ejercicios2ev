package unidad5;

import java.time.LocalDate;

public class Animal {

	private String nombre;
	private LocalDate fecha;
	
	public Animal() 
	{
		nombre="sin nombre";
	}
	
	public Animal(String nombre)
	{
		this.nombre=nombre;
	}
	
	public String toString(int edad)
	{
		return("nombre: "+nombre+" edad: "+edad);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	

}
