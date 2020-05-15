package unidad7;

public class EmpresaServicios implements Pagos , Comparable<EmpresaServicios>
{

	String nombre;
	String tipoServicio;
	int numeroCuenta;
	
	public EmpresaServicios(String nombre, String tipoServicio,  int numeroCuenta) 
	{
		this.nombre=nombre;
		this.tipoServicio=tipoServicio;
		this.numeroCuenta=numeroCuenta;
		
	}

	public void realizacionPagos() 
	{
		System.out.println("Pago por servicios. "+ nombre + tipoServicio);
		
	}

	public String getNombre() {
		return nombre;
	}

	public String getTipoServicio() {
		return tipoServicio;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	@Override
	public int compareTo(EmpresaServicios o) {
	
		return 0;
	}
	
	public String toString() 
	{
		return nombre+ tipoServicio;
	}

	
	
}
