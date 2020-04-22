package unidad6.excepciones;

public class ejercicio1 
{

	public static boolean IsInt (String n)  
	{
		boolean r;
		try {
			Integer.parseInt(n);
			r=true;
		}
		catch (NumberFormatException e){
			r=false;
			
		}
		return r;
	}
	
	public static boolean IsDouble (String n)  
	{
		boolean r;
		try {
			Double.parseDouble(n);
			r=true;
		}
		catch (NumberFormatException e){
			r=false;
			
		}
		return r;
	}
	
	
}
