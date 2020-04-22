package unidad6.excepciones;

import java.util.Scanner;

public class PrincipalEjercicio1 {

	public static void main(String[] args) 
	{
		
		boolean r;
		Scanner sc = new Scanner(System.in);	
		System.out.println("ingresa numero");
		String x=sc.next();
		r= ejercicio1.IsInt(x);
		if (r==false)  
		{
			System.out.println("no es entero");
			r=ejercicio1.IsDouble(x);
			if (r==false)
			{
				System.out.println("no es double");
			}
			else 
			{
				System.out.println("es double");
			}
		}
		else
		{
			System.out.println("es entero");
		}
		sc.close();
	}

	
}
