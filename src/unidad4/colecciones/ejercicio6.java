package unidad4.colecciones;

import java.util.*;

public class ejercicio6 {

	public static void main(String[] args) {
		
		System.out.println("especifique cantidad de elementos del conjunto n y del conjunto m");
		Scanner sc=new Scanner(System.in);
		
		Integer n=sc.nextInt();
		Integer m=sc.nextInt();
		
				
		Set<Integer>n_elementos=new HashSet<Integer>();
		Set<Integer>m_elementos=new HashSet<Integer>();
		Set<Integer>interseccion=new HashSet<Integer>();
		
		System.out.println("especifique los elementos de ambos conjuntos separados por espacios en blanco");
		
		for (int i=0;i<n;i++)
		{
			n_elementos.add(sc.nextInt());
		}
		
		for(int j=0;j<m;j++)
		{
			m_elementos.add(sc.nextInt());
		}
		Iterator<Integer>iter;
		
		if(n>m) 
		{
			iter= m_elementos.iterator();
			while(iter.hasNext())
			{
				Integer aux=iter.next();
				if (n_elementos.contains(aux))
				{
					interseccion.add(aux);
				}
			}
		}
		else 
		{
			iter=n_elementos.iterator();
			while(iter.hasNext())
			{
				Integer aux=iter.next();
				if (m_elementos.contains(aux))
				{
					interseccion.add(aux);
				}
			}
		}
		
		
		
		
		System.out.println( n_elementos);
		System.out.println(m_elementos);
		System.out.println(interseccion);
		
		sc.close();
	}

}
