package unidad8;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		try
		{
			File f=new File("/home/m_dlks/Escritorio/DAW/3trimestre/programacion/El Quijote UTF8.txt");
			FileInputStream fi=new FileInputStream(f);
			int valor=0;
			while (valor!=-1)
			{
				valor=fi.read();
				System.out.print((char)valor);
			}
			fi.close();
			
		}
		catch (Exception e)
		{
			System.out.println("error");
		}
		*/
		/*try
		{
			File fil=new File("/home/m_dlks/Escritorio/DAW/3trimestre/programacion/El Quijote UTF8.txt");
			FileInputStream fib=new FileInputStream(fil);
			BufferedInputStream br=new BufferedInputStream(fib);
			
			
			
			
			
			int valor=0;
			while (valor!=-1)
			{
				valor=br.read();
				System.out.print((char)valor);
				
			}
			fib.close();
			
		}
		catch (Exception e)
		{
			System.out.println("error");
		}*/
		try
		{
			File fil=new File("/home/m_dlks/Escritorio/DAW/3trimestre/programacion/El Quijote UTF8.txt");
			FileReader fib=new FileReader(fil);
	
			BufferedReader br=new BufferedReader(fib);
			String linea;
			linea=br.readLine();
			while (linea!=null)
			{
				System.out.println(linea);
				linea=br.readLine();
			}
			
			
			
			
			fib.close();
			
		}
		catch (Exception e)
		{
			System.out.println("error");
		}
		
		
	}

}
