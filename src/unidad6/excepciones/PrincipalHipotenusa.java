package unidad6.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrincipalHipotenusa {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double a=0;
		double b=0;
		String opcion;
		double num;
		boolean seguir=true;
		
		System.out.println("> ");
		while (seguir==true)
		{
			try 
			{
				opcion=sc.next();
				
				if (opcion.equals("a"))
				{
					num=sc.nextDouble();
					if (num<=0) 
						{
							a=0;
							throw new IndexOutOfBoundsException();
						}
					else {a=num;}
					}
				if (opcion.equals("b"))
				{
					num=sc.nextDouble();
					if (num<=0) 
					{
						a=0;
						throw new IndexOutOfBoundsException();
					}
					else 
						{b=num;}
					}
				if (opcion.equals("c"))
				{
					if (a>0 && b>0)
					{
						System.out.println(Hipo(a, b));
					}
					else
					{
						throw new IllegalArgumentException();
					}
				}
				if (opcion.equals("f"))
				{
					seguir=false;
				}
				if (!opcion.equals("a")&&!opcion.equals("b")&&!opcion.equals("c")&&!opcion.equals("f"))
				{
					throw new Exception();
				}
			}
			catch (IndexOutOfBoundsException e)
			{
				System.out.println("> Error no es un numero positivo- Vuelve a introducir una secuencia correcta");
				a=0;
				b=0;
			}
			catch (InputMismatchException e)
			{
				System.out.println("> Error no es numero- Vuelve a introducir una secuencia correcta");
				a=0;
				b=0;
			}
			catch (IllegalArgumentException e)
			{
				System.out.println(" > Error faltan datos para poder calcular la hipotenusa- Vuelve a introducir una secuencia correcta");
				a=0;
				b=0;
			}
			catch(Exception e)
			{
				System.out.println("> Error comando no válido- Vuelve a introducir una secuencia correcta");
				a=0;
				b=0;
			}
		}
	}
	public static double Hipo (double a, double b) 
	{
		double h=a*a+b*b;
		
		return h;
	}
}
