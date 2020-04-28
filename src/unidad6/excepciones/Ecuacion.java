package unidad6.excepciones;

public class Ecuacion {
	private double a;
	private double b;
	private double c;
	
	public Ecuacion(double a, double b, double c) 
	{
		this.a=a;
		this.b=b;
		this.c=c;
		
		
	}
	
	public double [] Solucion(double a, double b, double c) 
	{
		double [] solucion=new double[3];
		try 
		{
			
			if(a==0) 
				{
					throw new IllegalArgumentException();
				}
			
			
			double discriminante=((b*b)-4*a*c);
			if (discriminante>=0)
			{
				solucion [0]=(-b+Math.sqrt((b*b)-4*a*c))/2*a;
				solucion [1]=(-b-Math.sqrt((b*b)-4*a*c))/2*a;
				
			}
			else
			{
				throw new ArithmeticException();
			}
		}
		catch (IllegalArgumentException e)
		{
			solucion[2]=1;
		}
		catch(ArithmeticException e)
		{
			solucion[2]=2;
		}
	
		return solucion;
		
	}
	public double sol(double a, double b, double c)
	{
		
		double s=Math.sqrt((b*b)-4*a*c);
		System.out.println(s);
		return s;
		
	}

}
