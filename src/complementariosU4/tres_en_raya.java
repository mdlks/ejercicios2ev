package complementariosU4;

import java.util.Scanner;

public class tres_en_raya {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		String[][] tablero=new String[3][3];  	//creo el tablero
		String jugador1="";
		String jugador2="";
		System.out.println("nombre jugador 1: ");
		jugador1=sc.next();
		System.out.println("nombre jugador 2: ");
		jugador2=sc.next();
		int fila=0;
		int columna=0;
		int turno=1;
		boolean datos_correctos=false;
		boolean gano=false;
		int volver_a_jugar=0;
		
		
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++) 
			{
				tablero[i][j]="v";
				
			}
		}
		
		while(gano==false&&turno<10)		//controla la duracion de la partida
		{
			
			
			datos_correctos=false;
			while(datos_correctos==false)		//controla que los datos de cada jugada sea correcta
			{
				if (turno%2!=0) {
					System.out.println("=====================");
					System.out.println("turno para "+jugador1);
					System.out.println("=====================");
				}
				else {
					
					System.out.println("=====================");
					System.out.println("turno para "+jugador2);
					System.out.println("=====================");

				}
				System.out.println("dime fila ");
				fila=sc.nextInt();
				System.out.println("dime columna: ");
				columna=sc.nextInt();
				if(fila<0||fila>2||columna<0||columna>2)		//que el numero de fila y columna sea correcto
				{
					System.out.println("datos incorrectos");
				}
				else {
					if(tablero[fila][columna]!="v") {			//que la fila y la columna este vacia
						System.out.println("casilla ocupada");
					}
					else {
						
						datos_correctos=true;
					}
				}
			}
			
			String caracter_a_ingresar=rellenar_tablero(tablero,fila,columna,turno);		
			gano=comprobar_tres_en_raya(tablero, fila, columna, caracter_a_ingresar, jugador1,jugador2);
			turno++;
					
			if (gano==true)					//cuando haya un ganador da la opcion de seguir jugando
				
			{
				System.out.println();
				System.out.println("quieren jugar otra partida?");
				System.out.println("pulse 1 para jugar otra partida");
				System.out.println("pulse 2 para SALIR");
				volver_a_jugar=sc.nextInt();
			}
			
			if(volver_a_jugar==1)			//reinicia tablero, turnos e invierte orden de jugadores
			{
				gano=false;
				String aux=jugador1;
				jugador1=jugador2;
				jugador2=aux;
				turno=1;
				for(int i=0;i<3;i++) 
				{
					for(int j=0;j<3;j++) 
					{
						tablero[i][j]="v";
						
					}
				}
				volver_a_jugar=0;
			
			}
		}
		System.out.println("fin partida");
		sc.close();
	}
	
	//metodo que rellena el tablero y devuelve el caracter a ingresar(x-o)
	public static String rellenar_tablero(String[][]tablero, int fila, int columna, int turno )  
	{
		String caracter_a_ingresar;
		if(turno%2!=0)
		{
			tablero[fila][columna]="x";
			caracter_a_ingresar="x";
		}
		else {
			tablero[fila][columna]="o";
			caracter_a_ingresar="o";
		}
		return caracter_a_ingresar;
	}
	
	//metodo que comprueba si hay tres en raya
	public static boolean comprobar_tres_en_raya(String[][]tablero, int fila, int columna, String caracter_a_ingresar,String jugador1,String jugador2)
	{
		int jugador =0;
		String nombre_jugador;
		if(caracter_a_ingresar=="x")
		{
			jugador=1;
			nombre_jugador=jugador1;
		}
		else
		{
			jugador=2;
			nombre_jugador=jugador2;
		}
		if(tablero[fila][0]==caracter_a_ingresar&&tablero[fila][1]==caracter_a_ingresar&&tablero[fila][2]==caracter_a_ingresar)
		{
			System.out.println("el jugador "+nombre_jugador+" gano la partida");
			return true;
		}
		if(tablero[0][columna]==caracter_a_ingresar&&tablero[1][columna]==caracter_a_ingresar&&tablero[2][columna]==caracter_a_ingresar)
		{
			System.out.println("el jugador "+nombre_jugador+" gano la partida");
			return true;
		}
		if(fila==columna)
		{
			if(tablero[0][0]==caracter_a_ingresar&&tablero[1][1]==caracter_a_ingresar&&tablero[2][2]==caracter_a_ingresar)
			{
				System.out.println("el jugador "+nombre_jugador+" gano la partida");
				return true;
			}
		}
		if(fila+columna==2)
		{
			if(tablero[0][2]==caracter_a_ingresar&&tablero[1][1]==caracter_a_ingresar&&tablero[2][0]==caracter_a_ingresar)
			{
				System.out.println("el jugador "+nombre_jugador+" gano la partida");
				return true;
			}
		}
		return false;
		
	}

}
