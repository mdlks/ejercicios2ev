package unidad4;

import java.util.Scanner;

public class Cadena3 
{

	public static void main(String[] args) 
	{
		System.out.println("introduce primera cadena: ");
		Scanner sc=new Scanner(System.in);
		String cadena_1= sc.nextLine();
		
		System.out.println("introduce la segunda cadena: ");
		String cadena_2=sc.nextLine();
		
		int repeticiones=0;
		int contador_cadena2=0;
		
		for (int i=0;i<cadena_1.length();i++)  //voy pasando por cada caracter de la primera cadena
		{
			if (cadena_1.charAt(i)==cadena_2.charAt(contador_cadena2))  //entro si coincide la posicion de cadena 1 y la posicion dada por contador de la cadena 2 
			{
				
				contador_cadena2++;
				
				if (cadena_2.length()==contador_cadena2) //controlo si llego al final de la segunda cadena, reinicio contador
				{
					repeticiones++;
					contador_cadena2=0;
				}
			
			}
			
				
			else   //en cuanto una letra no coincida, vuelvo a empezar la comparación con la segunda cadena
				{
					contador_cadena2=0;
				}
			
		}
		if (repeticiones==1)
		{
			System.out.println("la segunda cadena está contenida " + repeticiones+ " vez.");
		}
		else 
		{
			System.out.println("la segunda cadena está contenida "+ repeticiones + " veces.");
		}
	}

}
