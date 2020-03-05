package complementariosU4;

import java.util.Random;
import java.util.Scanner;

public class barcos 
{

	public static void main(String[] args) 
	{
		int cont=0;
		boolean jugar=true;
		int [][]tablero=new int [10][10];
		Random aleatorio=new Random ();
		Scanner sc=new Scanner(System.in);
		int uno=aleatorio.nextInt(10)+0;
		int dos=aleatorio.nextInt(10)+0;
		tablero[uno][dos]=2;
		int pos1=0;
		int pos2=0;
		
		System.out.println(uno);
		System.out.println(dos);
		while(jugar==true)
		{
			
			System.out.println("dime posicion fila entre 0 y 9");
			pos1=sc.nextInt();
			System.out.println("dime posicion columna entre 0 y 9");
			pos2=sc.nextInt();
			while ((pos1 <0 || pos1>9)||(pos2<0||pos2>9))
			{
				System.out.println("dato erróneo");
				System.out.println();
				System.out.println("vuelva a intrudicir datos");
				System.out.println("dime posicion fila entre 0 y 9");
				pos1=sc.nextInt();
				System.out.println("dime posicion columna entre 0 y 9");
				pos2=sc.nextInt();
			}
			
			jugar=comprobar(tablero, pos1, pos2);
			cont++;
			
		}
		System.out.println("has necesitado "+cont+ " oportunidades");
		sc.close();
	}
	
	public static boolean comprobar(int[][]tablero, int pos1, int pos2) 
	{
		
		if (tablero[pos1][pos2]==2) 
		{
			System.out.println("hundido");
			
			return false;
		}
		else {
			System.out.println("agua");
		}
		return true;
	}

}
