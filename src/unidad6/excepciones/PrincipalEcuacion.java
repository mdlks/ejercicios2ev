package unidad6.excepciones;

import java.util.Scanner;

public class PrincipalEcuacion
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		
		double[] s;
		s=new Ecuacion(a,b,c).Solucion(a, b, c);
		if (s[2]==1)
		{
			System.out.println("no es de segundo grado");
		}
		else
		{
			if (s[2]==2)
			{
				System.out.println("la ecuacion no tiene solucion real");
			}
			else
			{
			System.out.println(s[0]);
			System.out.println(s[1]);
			}
		}
	}

}
