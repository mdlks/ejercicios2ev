package unidad4.colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int cant_nombres=0;
		System.out.println("cuantos nombre?: ");
		cant_nombres=sc.nextInt();
		sc.nextLine();
		List<String> nombres =new ArrayList<String>();
		for(int i=0;i<cant_nombres;i++)
		{
			System.out.println("ingresa nombre "+(i+1)+" : ");
			String nombre=sc.nextLine();
			if(!nombres.contains(nombre))
			{
				nombres.add(nombre);
			}
		}
		System.out.println(nombres.toString());
		sc.close();
	}

}
