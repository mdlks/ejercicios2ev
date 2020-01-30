package unidad4;

import java.util.Random;
import java.util.Scanner;

public class vectores2 
{

	public static void main(String[] args) 
	{
		System.out.println("elige cuántos elementos quieres guardar en el vector");
		System.out.println("escribe un número entre 10 y 1000000 : ");
		
		Scanner sc= new Scanner (System.in);
		Random num_aleatorio= new Random();
		
		int tamanio_vector= sc.nextInt();	//
		int [] vector= new int [tamanio_vector];
		int num_vector=0;
		int max=0;
		int min=0;
		
		long tiempo_inicio_llenar=System.currentTimeMillis();  //tomo el momento en que empieza el proceso para llenar el vector
				
		for (int i=0;i<tamanio_vector;i++) 	 //voy recorriendo el vector para ir añadiendo numeros
		{
			do 								
			{
				num_vector= num_aleatorio.nextInt(2000000)+(-999999);	//genero numero aleatorio 
				
			}while (comprobar_repetido(vector,num_vector));			//llamo a la funcion "comprobar_repetido" y le paso parametros
			
				vector[i]=num_vector;			//cuando la funcion devuelve "FALSE" ingresa el numero en el vector
												//si devuelve "TRUE" vuelve a generar otro numero aleatorio
				System.out.print("["+vector[i]+"]");
		}
		long tiempo_final_llenar=System.currentTimeMillis();  //tomo el momento en que acaba de llenar el vector
		
		float tiempo_total_llenar=(tiempo_final_llenar-tiempo_inicio_llenar)/1000.0f;	//paso a segundo el tiempo total
		
		System.out.println();
		System.out.println("el tiempo empleado en llenar el vector fue de: "+tiempo_total_llenar+" segundos");
		
		for (int i=0;i<vector.length;i++) 		//recorro el vector para encontrar maximo y minimo
		{
			if (vector[i]<min) 				
			{
				min=vector[i];
			}
			if (vector[i]>max)
			{
				max=vector[i];
			}
		}
		
		long tiempo_inicio_diferencia=System.currentTimeMillis(); 	//momento en que empieza la operacion para obtener la diferencia entre max y min
		int diferencia_max_min=max-min;								//realiza la operacion
		long tiempo_final_diferencia=System.currentTimeMillis();	//momento en que acaba 
		
		System.out.println("la diferencia entre el mayor (" + max + ") y el menor (" + min + ") es: "+diferencia_max_min);
		System.out.println("el tiempo empleado en obtener la diferencia fue de: "+(tiempo_final_diferencia-tiempo_inicio_diferencia)+" milisegundos");
	}
	
	

	public static boolean comprobar_repetido(int[]vector, int num) 		//metodo que comprueba si el numero aleatorio generado ya está en el vector 
	{    
		
		for (int i=0;i<vector.length;i++)	
		{
			if (vector[i]==num)
			{
				return true;											//si ya está, devuelve true
			}

		}
		return false;													//si no esta, devuelve false
	}
	
	


}
