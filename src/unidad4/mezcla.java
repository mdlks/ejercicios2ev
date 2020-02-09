package unidad4;

import java.util.Arrays;
import java.util.Random;

public class mezcla 
{

	public static void main(String[] args)
	{
		
		Random numero_aleatorio=new Random();
		
		int []vector_1=new int [numero_aleatorio.nextInt(90)+10];		//genero vector1 de tamaño aleatorio
		int []vector_2=new int [numero_aleatorio.nextInt(90)+10];		//genero vector2 de tamaño aleatorio
		
		
		for (int i=0;i<vector_1.length;i++)						//relleno vector_1 de numeros aleatorios 
		{
			vector_1[i]=numero_aleatorio.nextInt(200)+(-1);
			
		}
		System.out.println();
		for (int j=0;j<vector_2.length;j++)						//relleno vector_2 de numeros aleatorios
		{
			vector_2[j]=numero_aleatorio.nextInt(200)+(-1);
			
		}
		System.out.println();
		
		
		int []vector_1_ordenado=(ordenados(vector_1));		//llamo al metodo "ordenados" y le paso el vector_1 como parametro
		int []vector_2_ordenado=(ordenados(vector_2));		//llamo al metodo "ordenados" y le paso el vector_2 como parametro
		int []vector_3_ordenado=(tercer_vector(vector_1_ordenado,vector_2_ordenado));//llamo al metodo tercer_vector y le paso los dos vectores anteriores como parametros
		
		
		//imprimo los vectores devueltos por los metodos, pasados a String.
		System.out.println("vector 1 ordenado: "+Arrays.toString(vector_1_ordenado));
		System.out.println("vector 2 ordenado: "+Arrays.toString(vector_2_ordenado));
		System.out.println("vector 1 + vector 2: "+Arrays.toString(vector_3_ordenado));		
	}
	
	

		
	public static int [] ordenados(int [] vector)		//ordena los vectores de menor a mayor
	{
		int a=0;
		for (int i=0;i<vector.length;i++)
		{
			for (int j=1;j<(vector.length);j++)
			{
				if (vector[j-1]>vector[j])
				{
					a=vector[j-1];
					vector[j-1]=vector[j];
					vector[j]=a;
				
				}
			}
			
		}
		return vector;
	}
	
	public static int []tercer_vector(int[]vector_1,int[]vector_2)		//junta dos vectores en uno y lo ordena de menor a mayor
	{
		int[] vector=new int [(vector_1.length+vector_2.length)];		//creo el vector del tamaño de la suma de los dos vectores recibidos
				
		for(int i=0;i<vector.length;i++)		//relleno el vector creado con los dos recibidos
		{
			if(i<vector_1.length)		//primero con los datos del vector_1
			{
				vector[i]=vector_1[i];	
				
			}
			else						
			{
				for (int j=0;j<vector_2.length;j++)   	//luego con los del vector_2
				{
					vector[i]=vector_2[j];
					i++;
				}
			}
		}
		int aux=0;
		for (int i=0;i<vector.length;i++)		//ordeno el vector resultante de menor a mayor
		{
			for (int j=1;j<vector.length;j++) 
			{
				
				if (vector[j]<vector[j-1])
				{
					aux=vector[j-1];
					vector[j-1]=vector[j];
					vector[j]=aux;
				}
			}
			
			
		}
		
		return vector;
	}

}
