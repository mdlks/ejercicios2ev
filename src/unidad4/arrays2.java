package unidad4;

import java.util.Scanner;

public class arrays2
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("indica el número de secuencias: ");
		int secuencias=sc.nextInt();							//indica cuantas filas tiene la matriz
		System.out.println();
		
		int[] []matriz_secuencias=new int[secuencias][];		//creo la matriz que contendrá tantas filas como secuencias se indique
		for (int i=0;i<matriz_secuencias.length;i++)			//recorre cada fila de la matriz.
		{
			System.out.println("cantidad de numeros de la secuencia "+(i+1)+": ");
			matriz_secuencias[i]=new int [sc.nextInt()];			//indica cuantas columnas tiene cada fila
			
			System.out.println("dime "+matriz_secuencias[i].length+" numeros: ");
			for (int j=0;j<matriz_secuencias[i].length;j++)		//recorre cada columna por fila
			{
				matriz_secuencias[i][j]=sc.nextInt();			//rellena de numeros enteros cada columna
			}
		}
		
		for (int i=0;i<matriz_secuencias.length;i++)			//imprime la matriz
		{
			for (int j=0;j<matriz_secuencias[i].length;j++)
			{
				System.out.print("["+matriz_secuencias[i][j]+"]");
			}
			
			System.out.println();
		}
		sc.close();
	}

}
