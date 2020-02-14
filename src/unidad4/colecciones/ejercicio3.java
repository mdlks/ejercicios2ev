package unidad4.colecciones;

import java.util.*;

public class ejercicio3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String lista="";									
		List<String>lista_original=new ArrayList<String>();
		List<String>lista2=new ArrayList<String>();
		List<String>lista3=new ArrayList<String>();

		System.out.println("introduce texto: ");
		
		lista=(sc.nextLine());		//añado la entrada del teclado a una String
		
		String palabras[]=lista.split(" ");  //separo cada palabra y las meto una por una en un vector
		
		for (int i=0;i<palabras.length;i++)
		{
			lista_original.add(palabras[i]);	//paso el vector a una lista
		}
		
		
		
		Iterator<String> itr=lista_original.iterator();  	//recorro la lista
		String aux="";
		while(itr.hasNext())
		{
			aux=itr.next();
			if(!lista2.contains(aux))		//si lista2(palabras no repetidas) no contiene la palabra
			{
			lista2.add(aux);				//la añado 
			}
			else							
			{
				lista3.add(aux);			//si la contiene la añado a una tercera lista(lista3) de palabras repetidas
				lista2.remove(aux);			//y la borro de la lista2
			}
		}
		
		
		System.out.println();
		System.out.println("palabras que no se repiten");
		System.out.println("==========================");
		System.out.println(lista2.toString());
		System.out.println();
		System.out.println("palabras que se repiten");
		System.out.println("=======================");
		System.out.println(lista3.toString());
			
		
		

	}

}
