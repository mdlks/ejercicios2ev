package unidad4.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class ejercicio5 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		TreeMap<String,Set<Integer>>agenda= new TreeMap<>(); //crea un mapa que contiene nombres(string)y numeros(conjunto de enteros)
		
		boolean opcion=true;
		while (opcion==true) 
		{
			System.out.print("> ");
			String texto=sc.nextLine();			
			String[]palabras=texto.split(":");		//separa el string a partir de ":" y guarda los valores en un vector
			switch (palabras[0])
			{
			case "buscar":
				buscar(agenda,palabras);
				break;
				
			case "eliminar":
				eliminar(agenda,palabras);
				break;
				
			case "contactos":
				
				System.out.println(agenda.toString());
				break;
				
			case "salir":
				opcion=false;
				break;
				
			default:
				
				if(palabras.length!=2)
				{
					System.out.println("comando no valido");
				}
				else 
				{
					aniadir_telefonos(agenda,palabras);
				}
												
				break;
			}
			
			
		}
		
	sc.close();	
	}
	
	public static void aniadir_telefonos(Map<String,Set<Integer>>agenda,String[]palabras)
	{
		String nombre=palabras[0];
		Integer numero_tlf=Integer.parseInt(palabras[1]);
		Set<Integer> telefono=new HashSet<Integer>();
		if (!agenda.containsKey(nombre))
		{
			telefono.add(numero_tlf);
			agenda.put(nombre, telefono);
			System.out.println("numero guardado");
		}
		else
		{
			if(agenda.get(nombre).contains(numero_tlf))
			{
				System.out.println("numero ya existe");
			}
			else
			{
			agenda.get(nombre).add(numero_tlf);
			System.out.println("numero guardado");
			}
		}
		
	}
	
	public static void buscar(Map<String,Set<Integer>>agenda,String[]palabras)
	{
		if (agenda.containsKey(palabras[1]))
		{
			System.out.println(agenda.get(palabras[1].toString()));
		}
		else System.out.println("no existe contacto");
	}
	
	public static void eliminar(Map<String,Set<Integer>>agenda,String[]palabras)
	{
		Scanner sc=new Scanner(System.in);
		if (!agenda.containsKey(palabras[1]))
		{
			System.out.println("el contacto no existe");
		}
		else
		{
			System.out.println("pulse 1 para eliminarlo");
			if (sc.nextInt()==1)
				sc.nextLine();
			{
				agenda.remove(palabras[1]);
				System.out.println("contacto eliminado");
			}
		}
		sc.close();
	}

}
