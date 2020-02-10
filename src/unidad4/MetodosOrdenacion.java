package unidad4;

import java.util.Arrays;
import java.util.Random;

public class MetodosOrdenacion 
{

	public static void main(String[] args) 
	{
		int []vector=new int [15];
		Random num= new Random();
		
		for(int i=0;i<15;i++)
		{
			vector[i]=num.nextInt(10)+1;
		}
		insercion_directa(vector);
		seleccion_directa(vector);
		intercambio_directo(vector);
	}
	
	public static void insercion_directa(int []vector)
	{
		
		int aux=0;
		for(int i=1;i<vector.length;i++)	//voy cogiendo cada elemento que tengo que ordenar empezando desde la posicion 1 en adelante
		{
			
			for(int j=0;j<i;j++)		//busco desde el principio del vector hasta el ultimo que tengo ordenado si por el que voy, 
				{						//el de la posicion[i] es menor que alguno de los anteriores
				
				if(vector[i]<vector[j])	//si encuentro uno menor desplazo todos los ordenados una posicion adelante
					{					//y el elemento que hay en la posicion[i] lo dejo en la posicion que corresponde[j]
					
					aux=vector[i];
					for(int k=i-1;k>=j;k--)
						{
						vector[k+1]=vector[k];
						}
					vector[j]=aux;
					
				
					
					}
					
			}
		}
		System.out.println(Arrays.toString(vector));
	}
	
	public static void seleccion_directa(int[]vector)
	{
		
		int pos_min=0;
		int aux=0;
		for(int i=0;i<vector.length;i++)	//paso por cada elemento del vector
		{
			pos_min=i;
			for (int j=i;j<vector.length;j++)	//busco desde donde estoy hasta el final la posicion donde se encuentra
			{									//el minimo y lo intercambio por el elemento por donde voy(vector[i])
				if(vector[j]<vector[pos_min])	//cuando encuentro uno menor actualizo la posicion del minimo
				{
					pos_min=j;
				}
			}
			aux=vector[i];						//realizo el intercambio de valores
			vector[i]=vector[pos_min];
			vector[pos_min]=aux;
		}
		System.out.println(Arrays.toString(vector));
	}
	
	public static void intercambio_directo(int[]vector)
	{
		
		int aux=0;
		for (int i=0;i<vector.length-1;i++)		//paso por cada elemento del vector hasta el penultimo
		{
			for(int j=0;j<vector.length-1-i;j++)//recorro el vector desde el primcipio hasta el penultimo -i (cada vez que recorro el for dejo un elemento colocado al final)
			{									// comparando un elemento con el siguiente
				if(vector[j]>vector[j+1])		//si es mayor, lo intercambio.
				{
					aux=vector[j];				
					vector[j]=vector[j+1];
					vector[j+1]=aux;
					
				}
			}
		}
		System.out.println(Arrays.toString(vector));
	}
}
