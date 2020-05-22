package unidad8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class Ejercicio3 {
	public static void main(String[] args) {
		
		
		try
		{
			File fil=new File("/home/m_dlks/Escritorio/DAW/3trimestre/programacion/El Quijote UTF8.txt");
			FileReader fib=new FileReader(fil);
	
			BufferedReader br=new BufferedReader(fib);
			String linea;
			linea=br.readLine();
			int cantLineas=0;
			int cantPalabras=0;
			int cantLetras=0;
			
			while (linea!=null)
				
			{
				String[]palabras=linea.split(" ");
				for (int i=0; i<palabras.length; i++)
				{
					for (int e=0;e<palabras[i].length();e++)
					{
						cantLetras++;
					}
					cantPalabras++;
				}
				System.out.println();
				linea=br.readLine();
				cantLineas++;
			}
			
			System.out.println("LINEAS: "+cantLineas);
			System.out.println("PALABRAS: "+cantPalabras);
			System.out.println("LETRAS: "+cantLetras);
			
			
			fib.close();
			
		}
		catch (Exception e)
		{
			System.out.println("error");
		}
		
		
		
	}
}
