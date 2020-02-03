package unidad4;

import java.util.Random;
import java.util.Scanner;

public class vectores3 
{

	public static void main(String[] args) 
	{
		System.out.println("dime el tamaño del vector entre 10 y 200: ");
		Scanner sc=new Scanner(System.in);
		
		int tamanio=sc.nextInt();
		int [] vector= new int [tamanio];
		Random numero_aleatorio= new Random();
		int suma_vector=0;
		int total_no_sumados=0;
		int contador_no_sumados=0;
		int suma_trece=0;
		
		for(int i=0;i<tamanio;i++)   //aqui relleno de numeros aleatorio el vector
		{
			vector[i]=numero_aleatorio.nextInt (201)+(-100);
			System.out.print("["+vector[i]+"]");
		}
		System.out.println();
		for (int i=0;i<tamanio;i++)    //recorro el vector y voy sumando sus valores
		{
			
			if (vector[i]==13)		//si hay un trece salto 13 posiciones siguientes si no suman 7 esa trece siguientes
			{
				contador_no_sumados=1;	
				
				suma_trece=0;
				for (int j=i+1;j<(14+i);j++)   //sumo las trece posiciones siguiente o hasta el final del vector para ver si suman siete
				{
					if (j>= vector.length)
					{
						break;
					}
					else 
					{
						suma_trece=vector[j]+suma_trece;
						contador_no_sumados++;
						
						
					}
				}
				
				if (suma_trece!=7)   //si no suman siete salto trece posiciones e incremento el total de numeros 
									//no sumados en 13 o hasta el final del vector(me lo marca la variable contador_no_sumados)
				{					
					i=i+13;
					total_no_sumados=total_no_sumados+contador_no_sumados;
					
				}
				
				
			}
			else 				//si no hay un trece sumo el valor de la posicion por la que voy
			{
				suma_vector=suma_vector+vector[i];
				
			}
			
		}
		//una vez recorrido el vector imprimo la informacion requerida
		System.out.println();
		System.out.println("no sumados= "+ total_no_sumados);
		System.out.println("suma vector = "+ suma_vector);
	}

}
