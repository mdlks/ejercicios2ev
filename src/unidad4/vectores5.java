package unidad4;

import java.util.Random;
import java.util.Scanner;

public class vectores5 {

	public static void main(String[] args) {
		
		System.out.println("dime el tamaño del vector entre 10 y 20: ");
		
		Scanner sc = new Scanner(System.in);		//leo el tamaño del vector ingresado por teclado
		int tamanio_vector= sc.nextInt();
		
		while (tamanio_vector<10||tamanio_vector>20)			//mientras no se ingrese un numero entre los valores solicitados 
		{	
			System.out.println("tamaño incorrecto");	
			System.out.println("ingresa un valor entre 10 y 20: ");//vuelve a pedir el tamaño del vector
			tamanio_vector= sc.nextInt();
		}
		
		
		Random numero_aleatorio= new Random();
		int []vector=new int [tamanio_vector];
		
		int diferencia=0;
		int minima_diferencia=0;
		int valor_1=0;
		int valor_2=0;
		
		for (int i=0; i<tamanio_vector;i++)				//genero el vector de numeros aleatorios
		{
			vector[i]=numero_aleatorio.nextInt(100)+1;
			System.out.print("["+vector[i]+"]");
		}
		
		minima_diferencia=Math.abs(vector[1]-vector[0]);	//establezco la minima diferencia (positiva) entre las dos primeras posiciones del vector
		valor_1=vector[1];
		valor_2=vector[0];
				
		for(int i=1;i<tamanio_vector;i++)				//recorro el vector para obtener la diferencia entre valores adyacentes
		{
			diferencia=Math.abs(vector[i]-vector[i-1]); //la diferencia es el valor positivo de la resta de la posicion[i] menos la posicion[i-1]
			
			
			if (diferencia<minima_diferencia)			//si encuentro una diferencia menor a la de las primeras dos posiciones
			{
				minima_diferencia=diferencia;			//se la doy  a la variable "minima_diferencia" 
				valor_1=vector[i];						//y guardo los valores
				valor_2=vector[i-1];
			}
		}
		System.out.println();
		System.out.println("la minima diferencia se da entre "+valor_1+"-"+valor_2);
		System.out.println("el resultado es de "+ minima_diferencia+" numeros de diferencia");
	}

}
