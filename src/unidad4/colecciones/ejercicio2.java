package unidad4.colecciones;

import java.util.Random;
import java.util.*;

public class ejercicio2 
{

	public static void main(String[] args)
	{
		Random numero=new Random();
		
		List<Integer>lista=new ArrayList<Integer>();
		List<Integer>nueva_lista=new ArrayList<Integer>();
		List<Integer>lista_3=new ArrayList<Integer>();
		
		for (int i=0;i<100;i++)				//genero 100 numeros aleatorios y los almaceno en una lista
		{
			lista.add(numero.nextInt(101)+1);
		}
		
		//metodo 1 : Iterator
		
		Iterator<Integer>itr=lista.iterator(); 		//creo el objeto iterator
		Integer aux=0;
		
		while(itr.hasNext())						//recorro la lista original
		{
			aux=itr.next();
			if(!nueva_lista.contains(aux))			//si no esta repetido en la nueva lista, lo añado
			{
				nueva_lista.add(aux);
			}
			System.out.print(" "+aux);
		}
		System.out.println();
		
		
		//metodo 2 :bucle for mejorado
		
		for (Integer dato:nueva_lista)
		{
			System.out.print(" "+dato);
		}
		System.out.println();
		
		
		//metodo 3 : forEach
		
		lista.forEach(dato ->
		{
			if(!lista_3.contains(dato))
			{
				lista_3.add(dato);
				System.out.print(" "+dato);
			}
		});
	}

}
