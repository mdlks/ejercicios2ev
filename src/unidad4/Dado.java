package unidad4;

import java.util.Scanner;

public class Dado 
{

	public static void main(String[] args) 
	{
		
		System.out.println("cuántas veces quieres lanzar el dado?");
		Scanner sc = new Scanner(System.in);
		
		int num_lanzamientos= sc.nextInt();
		int caras[]= new int [6];
		
		
		for (int i=0;i<num_lanzamientos;i++)
		{
			int dado= (int)(Math.random()*6+1);
			switch (dado)
			{
			case 1:
				caras[0]=caras[0]+1;
				break;
			case 2:
				caras[1]=caras[1]+1;
				break;
			case 3:
				caras[2]=caras[2]+1;
				break;
			case 4:
				caras[3]=caras[3]+1;
				break;
			case 5:
				caras[4]=caras[4]+1;
				break;
			case 6:
				caras[5]=caras[5]+1;
				break;
				
			}
				
		}
		for (int i=0;i<caras.length;i++)
		{
			System.out.printf("ha salido %d veces el número %d\n",caras[i],i+1);
		}

	}

}
