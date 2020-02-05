package unidad4;

import java.util.Scanner;

public class vectores6 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		String [] nombres= new String[10];
		
		for (int i=0;i<10;i++)
		{
			System.out.println("ingresa nombre: ");
			nombres[i]=sc.next();
		}
		
		for (int i=0;i<10;i++)
		{
			System.out.print("["+nombres[i]+"]");
		}
		System.out.println();
		System.out.println(mayor_longitud(nombres));
		
	}
	
	public static String mayor_longitud(String[] nombres)
	{
		int max=nombres[0].length();
		String nombre_maximo=nombres[0];
		
		for (int i=0;i<nombres.length;i++)
		{
			System.out.println("L"+nombres[i].length());
			if (nombres[i].length()>max)
			{
				max=nombres[i].length();
				nombre_maximo=nombres[i];
				
			}
		}
		return nombre_maximo;
	}
	
	

}
