package unidad4;

import java.util.Random;

public class arrays1 
{

	public static void main(String[] args) 
	{
		
		Random numero_aleatorio= new Random();
		
		
		int filas=numero_aleatorio.nextInt(19)+2;		//genero numero de filas entre 2 y 20
		int columnas=numero_aleatorio.nextInt(19)+2;	//genero numero de columnas entre 2 y 20
		
		int [][]matriz=new int[filas][columnas];
		
		
		for(int i=0;i<matriz.length;i++)				//relleno la matriz con numeros aleatorios
		{
			for (int j=0;j<matriz[i].length;j++)
			{
				matriz[i][j]=numero_aleatorio.nextInt(11)+1;
			}
		}
		
		int []suma_f=suma_filas(matriz);			//creo un vector con lo que devuelve el metodo suma_filas
		
		int []suma_c=suma_columnas(matriz);			//creo un vector con lo que devuelve el metodo suma_columnas
		
		imprimir(matriz,suma_f,suma_c);				//llamada al metodo imprimir y le paso tres parametros
		
	}
	
	public static int[] suma_filas (int [][] matriz)		//metodo que suma los valores de cada fila, recibe una matriz como parametro
	{
		int [] suma=new int [matriz.length];
		
		for (int i=0;i<matriz.length;i++)					//recorre cada fila
		{
			for (int j=0;j<matriz[i].length;j++)			//recorre cada columna
			{
				suma [i]=suma[i]+matriz[i][j];				//suma valores de todas las columnas para cada fila
			}
		}
		return suma;
	}
	
	
	public static int[] suma_columnas (int [][] matriz)		//metodo que suma los valores de cada columna, recibe una matriz como parametro
	{
		
		int [] suma=new int [matriz[0].length];				
		
		for (int i=0;i<matriz[0].length;i++)				//recorre cada columna
		{
			for (int j=0;j<matriz.length;j++)				//recorre cada filas
			{
				suma [i]=suma[i]+matriz[j][i];				//suma valores de todas las fila para cada columna
			}
		}
		return suma;
	}
	
	public static void imprimir(int [][]matriz,int []vector_fila,int[]vector_columna) //metodo que recibe matriz y dos vectores e imprime por pantalla
	{
		for (int i=0;i<matriz.length;i++)						//recorre cada fila
		{
			for (int j=0;j<matriz[i].length;j++)				//recorre cada columna
			{
				System.out.print("["+matriz[i][j]+"]");			//imprime la matriz
			}
			System.out.print("   "+vector_fila[i]);				//imprime la suma de las filas
			System.out.println();
		}
		System.out.println();
		for (int k=0;k<vector_columna.length;k++)
		{
			System.out.print(vector_columna[k]+" ");			//imprime la suma de las columnas
		}
	}

}
