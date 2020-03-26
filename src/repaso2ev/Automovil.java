package repaso2ev;

public class Automovil 
{

	String modelo;
	private float capacidad_deposito;
	private float combustible_en_deposito;
	private float consumo_por_kilometro;
	private float total_kilometros_recorridos;
	private float total_consumido;
	
	public Automovil(String modelo, float capacidad_deposito, float combustible_en_deposito, float consumo_por_kilometro) 
	{
		this.modelo=modelo;
		this.capacidad_deposito=capacidad_deposito;
		this.combustible_en_deposito=combustible_en_deposito;
		this.consumo_por_kilometro=consumo_por_kilometro;
		this.total_kilometros_recorridos=0;
		this.total_consumido=0;
	}
	
	public Automovil(String modelo, float capacidad_deposito, float consumo_por_kilometro) 
	{
		this.modelo=modelo;
		this.capacidad_deposito=capacidad_deposito;
		this.consumo_por_kilometro=consumo_por_kilometro;
		this.combustible_en_deposito=capacidad_deposito;
		this.total_kilometros_recorridos=0;
		this.total_consumido=0;
		
	}
	
	public void llenarDeposito() 
	{
		this.combustible_en_deposito=this.capacidad_deposito;
	}
	
	public float llenarDeposito(float cantidad)
	{
		float sobrante=0;
		if (cantidad+this.combustible_en_deposito<=this.capacidad_deposito) 
		{
			this.combustible_en_deposito=cantidad+this.combustible_en_deposito;
		}
		else
		{
			this.combustible_en_deposito=this.capacidad_deposito;
			sobrante=cantidad+this.combustible_en_deposito-this.capacidad_deposito;
		}
		return sobrante;
	}
	
	public float desplazarse(float distancia)
	{
		
		if(this.consumo_por_kilometro*distancia<=this.combustible_en_deposito)
		{
			this.total_kilometros_recorridos=this.total_kilometros_recorridos+distancia;
			this.total_consumido=this.total_consumido+(this.consumo_por_kilometro*distancia);
			this.combustible_en_deposito=this.combustible_en_deposito-(this.consumo_por_kilometro*distancia);
			return this.consumo_por_kilometro*distancia;
		}
		else 
		{
			return 0;
		}
		
		
	}

	public float getCombustible_en_deposito() {
		return combustible_en_deposito;
	}

	public String getModelo() {
		return modelo;
	}

	public float getTotal_kilometros_recorridos() {
		return total_kilometros_recorridos;
	}

	public float getTotal_consumido() {
		return total_consumido;
	}
}
