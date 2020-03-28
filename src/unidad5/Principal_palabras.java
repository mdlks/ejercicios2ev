package unidad5;


import java.util.Scanner;


public class Principal_palabras 
{

	public static void main(String[] args) 
	{
		
		Palabras lista_palabras1=new Palabras();
		boolean menu=true;
		Scanner sc=new Scanner(System.in);
		
		while(menu==true)
		{
		
			System.out.println("TEXTO-LISTA-TODAS-SALIR");
			System.out.println(">...");
			String entrada0=sc.nextLine();
			if (entrada0.contains("texto")) 
			{
				lista_palabras1.aniadir_Cadena(entrada0);
			}
			if (entrada0.contains("lista"))
			{
				lista_palabras1.buscar_Palabras(entrada0);
			}
			if (entrada0.contains("salir")) 
			{
				menu=false;
			}
			if (entrada0.contains("todas"))
			{
				lista_palabras1.listar_Palabras();
			}
		}
		sc.close();
	}
}
