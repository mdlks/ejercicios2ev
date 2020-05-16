package unidad8;

import java.io.File;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		System.out.println("> ");
		Scanner sc=new Scanner(System.in);
		
		File ruta= new File(sc.next());
		
		if (ruta.exists()) 
		{
			System.out.println("la ruta existe");
			if(ruta.isDirectory())
			{
				System.out.println("es un directorio");
				
			}
			if (ruta.isFile())
			{
				System.out.println("es un archivo");
				System.out.println("tiene "+ruta.length()+" bytes");
			}
			System.out.println(ruta.getName());
			if (ruta.canExecute()) {
				System.out.println("permisos de ejecucion.");
			}
			if (ruta.canRead()) {
				System.out.println("permisos de lectura");
			}
			if (ruta.canWrite()) {
				System.out.println("permisos de escritura");
			}
			
		}
		else
		{
			System.out.println("la ruta no existe");
		}

	}

}
