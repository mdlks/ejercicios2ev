package unidad7;

import java.util.Comparator;
import java.util.Date;

public abstract class Empleados implements Pagos , Comparable<Empleados> 
{
	private String nombre;
	private String apellido;
	private String fechaContratacion; 
	private int numeroCuenta;
	
	public Empleados(String nombre,String apellido, String fechaContratacion, int numeroCuenta)
	{
		this.nombre=nombre;
		this.apellido=apellido;
		this.fechaContratacion=fechaContratacion;
		this.numeroCuenta=numeroCuenta;
	}
	
	public void realizacionPagos() 
	{
		System.out.println("Pago Nómina "+ nombre + apellido);
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getFechaContratacion() {
		return fechaContratacion;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public String toString() 
	{
		return nombre+ apellido;
	}
	
	public int compareTo(Empleados p) {
		
		return 0;
	}
	
}
