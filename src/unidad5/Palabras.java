package unidad5;

import java.util.TreeSet;



public class Palabras 
{

	TreeSet<String>lista_palabras=new TreeSet<String>();
	
	
	public Palabras()
	{
		
	}
	public Palabras(String entrada) 
	{
		entrada=entrada.toLowerCase();
		String [] aux=entrada.split(" ");
		for(int i=0; i<aux.length;i++)
		{
			lista_palabras.add(aux[i]);
		}
	}
	
	public void aniadir_Cadena(String cadena)
	{
		cadena=cadena.toLowerCase();
		String [] aux=cadena.split(" ");
		for(int i=1; i<aux.length;i++)
		{
			lista_palabras.add(aux[i]);
		}
		
		
	}
	
	public void aniadir_Palabra(String palabra)
	{
		lista_palabras.add(palabra);
	}
	
	public void buscar_Palabras(String num_letras)
	{
		
		String [] aux=num_letras.split(" ");
		int num=Integer.parseInt(aux[1]);
		for(String p: lista_palabras) {
			if(p.length()==num)
			{
				System.out.println(p);
			}
		}
	}
	
	public void listar_Palabras()
	{
		for(String p: lista_palabras)
		{
			System.out.println(p);
		}
	}
	
}

