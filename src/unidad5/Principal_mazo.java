package unidad5;

import java.util.Scanner;

public class Principal_mazo 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int numero_barajas=0;
		System.out.println("con cuantas barajas quieres jugar?: ");
		numero_barajas=sc.nextInt();
		sc.nextLine();
		Mazo mazo1=new Mazo(numero_barajas);
		
		int contador=0;
		int jugador1=0;
		int jugador2=0;
		while(mazo1.baraja.size()>2) 
		{
			Naipe aux=mazo1.remove_Naipe();
			System.out.println("Naipe: "+aux.getRango()+" de "+aux.getPalo()+" valor: "+aux.getValor());
			int j1=aux.getValor();
			contador++;
			aux=mazo1.remove_Naipe();
			System.out.println("Naipe: "+aux.getRango()+" de "+aux.getPalo()+" valor: "+aux.getValor());
			int j2=aux.getValor();
			contador++;
			if(j1>j2) 
			{
				jugador1++;
				System.out.println("un punto jugador 1 ---  TOTAL: "+jugador1);
			}
			else {
				jugador2++;
				System.out.println("un punto jugador 2 ---  TOTAL: "+jugador2);
			}
			System.out.println();
			System.out.println("PULSA INTRO");
			sc.nextLine();
			
		}
		
		System.out.println("fin del mazo");
		if (jugador1>jugador2) 
		{
			System.out.println("ha ganado el jugador 1");
		}
		else {System.out.println("ha ganado el jugador 2");}
		sc.close();
	}
}
