package unidad4;

import java.util.Random;

public class vectores1 
{

	public static void main(String[] args) 
	{
		
		
		Random numero_aleatorio=new Random();
		
		int tamanio=numero_aleatorio.nextInt(41)+10;//genero tamaño de vector 
		int [] vector_original= new int [tamanio];
		int [] vector_inverso= new int [tamanio];
		int numero_vector=0;
		int contador=0;
		
		System.out.println("vector original");
		System.out.println("================");
	
		for (int i=0;i<tamanio;i++)//repito tantas veces como tamanio para rellenar todo el vector
		{
			do {
				
				numero_vector=numero_aleatorio.nextInt(201)+(-100);//genero numero aleatorio 
				
			}while (comprobar_repetido (vector_original,numero_vector));//llamada a método y le paso parámetros
			
															//una vez el método devuelve el valor FALSE que indica que el
				vector_original[i]=numero_vector;			//número no está repetido, relleno el vector_original, sino devuelve 
															//TRUE se vuelve generar otro número 
				
				System.out.print("["+vector_original[i]+"]");
		}	
		System.out.println();
		System.out.println();
		System.out.println("vector invertido");
		System.out.println("================");
		
		
		for(int i=tamanio-1;i>=0;i--)//recorro el vector_original en sentido inverso
		{
			
			vector_inverso[contador]=vector_original[i];//añado cada dato al vector_inverso que recorro aumentando el contador
			
			
			System.out.print("["+vector_inverso[contador]+"]");
			contador++;
			
			
		}	
	}
		
	
	public static boolean comprobar_repetido(int[]vector, int num) {    //método para comprobar si un número ya se encuentra 
																	//en el vector. Recibe un vector[] y un número .
		for (int i=0;i<vector.length;i++)	
		{
			if (vector[i]==num)
			{
				return true;					//devuelve True si el número está en el vactor.
			}
			 
		}
		return false;						
	}
	
	
		
	

}
