package unidad4.colecciones;


import java.util.*;
import java.util.List;
import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		List<String> lista_de_palabras =new ArrayList<String>();
			
		String aux="";
		Integer longitud=0;
		
		int opcion=1;
		while(opcion==1)
		{
			System.out.println();
			System.out.println("ingresar texto o listar palabras");
			System.out.println("--------------------------------");
			String texto=sc.nextLine();
			texto.toLowerCase();
			String palabras[]=texto.split(" ");
			if(texto.startsWith("texto: "))
			{
				for(int i=1;i<palabras.length;i++)
				{
				lista_de_palabras.add(palabras[i]);
				}
				Collections.sort(lista_de_palabras);
			}
			
			if(texto.startsWith("lista "))
			{
				Iterator<String>iter=lista_de_palabras.iterator();
				longitud=Integer.parseInt(palabras[1]);
				if (!lista_de_palabras.isEmpty())
				{
				
					while (iter.hasNext())
					{
						aux=iter.next();
						if(aux.length()==longitud)
						{
							System.out.println(aux);
						}
						
						
					}
				}
				else System.out.println("no hay elementos en la lista");
				
			}
			System.out.println();
			System.out.println("      =====================");
			System.out.println("      1 continuar o 2 SALIR");
			System.out.println("      =====================");
			opcion=sc.nextInt();
			sc.nextLine();
		}
		
		sc.close();
	}

}
