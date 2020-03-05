package complementariosU4;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class oca
{

	public static void main(String[] args) 
	{
		
		int []tablero= new int [64]; //tablero. la casilla 0 es la de salida + 63 casillas del juego.
		String[]nombres_jugadores=new String[2];
		int []jugador1=new int [2];//en la posicion [0] numero de jugador y en la[1] la casilla en la que se encuentra
		int []jugador2=new int [2];
		int[]nuevos_datos1=new int[3];  //recogen datos despues de cada tirada (pos[0] nueva posicion, pos[1]turnos y pos[2] si se pierde turnos )
		int[]nuevos_datos2=new int[3];
		
		int turno=0;
		
		crear_tablero(tablero);
		pedir_nombres(nombres_jugadores);
		turno=quien_comienza(nombres_jugadores);
		int esperar_turno1=0;
		int esperar_turno2=0;
		
		while (jugador1[1]<63||jugador2[1]<63) 
		{
			if (turno%2!=0)			//el jugador 1 tira cuando el turno es impar
			{	if (esperar_turno1==0) 
				{
					jugador1[1]=jugador1[1]+tirar_dados();		//avanza la tirada de dados
					
					if (jugador1[1]==63)		//si cae en la casilla 63 gana
					{
						System.out.println(nombres_jugadores[0]+ " Has ganado la partida");
						break;
					}
					if (jugador1[1]>63)		//si se pasa, avanza hasta la posicion 63 y retrocede las casillas que correspondan
					{
						jugador1[1]=63-(jugador1[1]-63);
						System.out.println("te has pasado..");
						System.out.println("vuelves a la casilla "+ jugador1[1]);
					}
					if(jugador1[1]<63)		//continua tirando los dados
						{
						System.out.println("___________________________________");
						System.out.println(nombres_jugadores[0]+" has caido en la casilla "+jugador1[1]);
						System.out.println();
						nuevos_datos1=comprobar_casilla(tablero[jugador1[1]],jugador1[1]); //actualiza datos despues de cada tirada
						jugador1[1]=nuevos_datos1[0];
						turno=nuevos_datos1[1]+turno;
						esperar_turno1=nuevos_datos1[2];
						
						}
					else break;
				}
				else
				{
					esperar_turno1--;
				}
			}
			else		//el jugador 2 tira cuando el turno es par
			{
				if (esperar_turno2==0)
				{
					jugador2[1]=jugador2[1]+tirar_dados();
					
					if (jugador2[1]==63)
					{
						System.out.println(nombres_jugadores[1]+ " Has ganado la partida");
						break;
					}
					if (jugador2[1]>63)
					{
						jugador2[1]=63-(jugador2[1]-63);
						System.out.println("te has pasado..");
						System.out.println("vuelves a la casilla "+ jugador2[1]);
					}
					if(jugador2[1]<63)
					{
					System.out.println("___________________________________");
					System.out.println(nombres_jugadores[1]+" has caido en la casilla "+jugador2[1]);
					System.out.println();
					nuevos_datos2=comprobar_casilla( tablero[jugador2[1]],jugador2[1]);
					jugador2[1]=nuevos_datos2[0];
					turno=nuevos_datos2[1]+turno;
					esperar_turno2=nuevos_datos2[2];		
					}
					else break;
				}
				else {
					esperar_turno2--;
				}
			}
			turno++;
			
			
		}
		
		
		
	}
	
	public static void crear_tablero(int []tablero)		//se crea el tablero y se rellenan las casillas
	{
		for(int i=6;i<63;i=i+6)			//las OCAs se representa con un 1
		{
			tablero[i]=1;
		}
		
		tablero[23]=tablero[45]=2;		//los DADOS con un 2
		tablero[7]= tablero[13]=3;		//los PUENTES con un 3
		tablero[19]=4;			//la POSADA con un 4
		tablero[31]=5;			//el POZO con un 5		
		tablero[52]=6;			//la CARCEL con un 6
		tablero[58]=7;			//la MUERTE con un 7
		
		
	}
	
	public static void pedir_nombres(String[]nombres_jugadores)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("indica nombre jugador 1: ");
		nombres_jugadores[0]=sc.nextLine();
		System.out.println("indica nombre jugador 2: ");
		nombres_jugadores[1]=sc.nextLine();
		
	}
	
	public static int quien_comienza( String[]nombres_jugadores)  //empieza el jugador con la mayor tirada
	{
		boolean volver_a_tirar=true;
		int comienza=0;
		System.out.println("_____________________________________");
		System.out.println(" tirar dados para ver quien empieza.");
		System.out.println("comienza el que saque la mayor tirada");
		System.out.println("_____________________________________");
		while(volver_a_tirar==true)	
			{
			
			System.out.println("_________________________");
			System.out.println("tira "+nombres_jugadores[0]);
			System.out.println("_________________________");
			//jugador1[0]=tirar_dados();
			int lanzamiento1=tirar_dados();
			System.out.println("_________________________");
			System.out.println("tira "+nombres_jugadores[1]);
			System.out.println("_________________________");

			//jugador2[0]=tirar_dados();
			int lanzamiento2=tirar_dados();
				if (lanzamiento1>lanzamiento2)
				
				{
					System.out.println("_________________________");
					System.out.println("comienza "+ nombres_jugadores[0]);
					System.out.println("_________________________");
					volver_a_tirar=false;
					comienza= 1;
				}
				if(lanzamiento1<lanzamiento2)
				{
					System.out.println("_________________________");
					System.out.println("comienza "+ nombres_jugadores[1]);
					System.out.println("_________________________");
					volver_a_tirar=false;
					comienza=2;
				}
				if (lanzamiento1==lanzamiento2)
				{
					System.out.println("empate volver a tira");
					volver_a_tirar=true;
				}
			}
		return comienza;
	}
	
	
	public static int tirar_dados()				//genera dos numero aleatorios entre 1 y 6 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("_________________________");
		System.out.println("pulse intro para tirar dado.");
		sc.nextLine();
		Random dado=new Random();
		int dado1=dado.nextInt(6)+1;
		int dado2=dado.nextInt(6)+1;
		
		System.out.println("dado 1= "+dado1);
		System.out.println("dado 2= "+dado2);
		System.out.println();
		
		return dado1+dado2;
	}
	
	public static int[] comprobar_casilla(int casilla_tablero, int posicion) //determina que sucede cuando se cae en cada casilla 
	{
		
		int []nuevos_datos=new int[3];	//retorna en pos[0]nueva casilla  y  en pos[1]turnos y pos[3] esperar.
		nuevos_datos[0]=posicion;
		nuevos_datos[1]=nuevos_datos[1]+0;
		nuevos_datos[2]=0;
		
		switch (casilla_tablero)
		{
		case 1:
			if(casilla_tablero==1)		//en caso de caer en OCA
			{
				if(nuevos_datos[0]!=60)  //si no es la ultima OCA..
				{
					nuevos_datos[0]=posicion+6;		//avanza 6 posiciones
					nuevos_datos[1]=1;			//salta el turno del otro jugador
									
					System.out.println("OCA");
					System.out.println("avanzas hasta la siguiente OCA en la casilla "+nuevos_datos[0]);
					System.out.println("y vuelves a tirar...");
				}
				if (nuevos_datos[0]==60)	//si es la ultima OCA...
				{
					nuevos_datos[0]=63;		//avanza hasta la ultima casilla y gana
				}
				
			}
		case 2:
			if(casilla_tablero==2)		//en caso de caer en DADO
			{
				
				if(nuevos_datos[0]==45)		//si es el de la casilla 45 retrocede hasta la 23
				{
					nuevos_datos[0]=posicion-22;
				}
				else						//si es el de la casilla 23 avanza hasta la 45
				{
					nuevos_datos[0]=posicion+22;
				}
				nuevos_datos[1]=1;		//salta el turno del otro jugador
				
				System.out.println("DADO");
				System.out.println("dirígete hasta el otro DADO en la casilla "+nuevos_datos[0]);
				System.out.println("y vuelves a tirar...");
			}	
			
		
		case 3:
			if(casilla_tablero==3)
			{
				
				if(nuevos_datos[0]==7)		//si es el de la casilla 7 avanza 6 posiciones
				{
					nuevos_datos[0]=posicion+6;
				}
				else
				{
					nuevos_datos[0]=posicion-6;//si es el de la casilla 13 retrocede hasta la 7
				}
				nuevos_datos[1]=1;		//salta el turno del otro jugador
				
				System.out.println("PUENTE");
				System.out.println("dirígete hasta el otro PUENTE en la casilla "+nuevos_datos[0]);
				System.out.println("y vuelves a tirar...");

			}
			
			
		case 4:
			if(casilla_tablero==4)
			{
				System.out.println("POSADA");
				System.out.println("Has llegado a la Posada.");
				System.out.println("Pierdes 5 turnos");
				nuevos_datos[2]=5;		//pasa cuantos turnos tiene que esperar el jugador 
			}
			
		case 5:
			if(casilla_tablero==5)
			{
				System.out.println("POZO");
				System.out.println("Has caído en el pozo!!!");
				System.out.println("pierdes 5 turnos");
				nuevos_datos[2]=5;		//pasa cuantos turnos tiene que esperar el jugador
			}
			
		case 6:
			if(casilla_tablero==6)
			{
				System.out.println("CARCEL");
				System.out.println("Te pasarás 3 turnos a la sombra...");
				nuevos_datos[2]=3;		//pasa cuantos turnos tiene que esperar el jugador
			}
			
		case 7:
			if(casilla_tablero==7)
			{
				System.out.println("MUERTE");
				System.out.println("Vuelves al principio...");
				nuevos_datos[0]=0;		//devuelve al jugador a la casilla de salida
			}
		}
		return nuevos_datos;
	}

}
