package unidad4;

import java.util.Scanner;

public class alumnos 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("      ===========================================================");
		System.out.println("      |    INGRESAR DATOS ALUMNOS                               |");
		System.out.println("      ===========================================================");
		System.out.println();
		System.out.println("*	cuántos alumnos tienes?: ");
		int cant_alumnos= sc.nextInt();
		sc.nextLine();
		
		String [] alumnos =new String [cant_alumnos];
		int [][] notas=new int [cant_alumnos][3];
		System.out.println();
		for (int i=0;i<cant_alumnos;i++)
		{
			System.out.println("*	ingresa nombre alumno "+(i+1)+": ");
			
			alumnos[i]=sc.nextLine();
		}
		System.out.println();
		for (int i=0;i<cant_alumnos;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.println("*	ingresa nota "+ (j+1)+"ºev. de "+alumnos[i]+": ");
				notas[i][j]=sc.nextInt();
			}
		}
		
		int opcion=0;
		
		while (opcion!=7)
		{
			System.out.println();
			System.out.println("      ===========================================================");
			System.out.println("      |    MENU                                                 |");
			System.out.println("      ===========================================================");
			System.out.println("      |                                                         |");
			System.out.println("      |1_  Nota media de todos los alumnos                      |");
			System.out.println("      |2_  Nota media de un alumno                              |");
			System.out.println("      |3_  Notas por evaluación y final de cada evaluación      |");
			System.out.println("      |4_  Notas por evaluacion y final de un alumno determinado|");
			System.out.println("      |5_  Nota media del curso                                 |");
			System.out.println("      |6_  Nota más alta y más baja                             |");
			System.out.println("      |                                                         |");
			System.out.println("      |7_SALIR                                                  |");
			System.out.println("      ===========================================================");
			System.out.println();
			System.out.println("ingrese opcion: ");
			opcion=sc.nextInt();
			switch (opcion)
			{
			case 1:
				media_alumnos(alumnos,notas);
				break;
				
			case 2:
				media_alumno_det(alumnos,notas);
				break;
				
			case 3:
				notas_por_evaluacion(alumnos,notas);
				break;
				
			case 4:
				notas_por_alumno(alumnos,notas);
				break;
				
			case 5:
				nota_media_curso(notas);
				break;
				
			case 6:
				max_min(alumnos,notas);
				break;
			}
			
			
		}
		
	
	}
	
	public static void media_alumnos(String[]alumnos,int [][]notas)
	{
		
		
		for (int i=0;i<notas.length;i++)
		{
			int suma=0;
			int media=0;
			for(int j=0;j<notas[i].length;j++)
			{
				suma=notas[i][j]+suma;
				media=suma/3;
				
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("la media de "+alumnos[i]+" es: "+media);
			
		}
	}
	
	public static void media_alumno_det(String [] alumnos, int [][]vector)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("indica alumno sobre el que quiere obtener la media ");
		for(int i=0;i<alumnos.length;i++)
		{
			System.out.println("pulse "+(i+1)+" para "+alumnos[i]);
		}
		int alumno=sc.nextInt()-1;
		int suma=0;
		for (int i=0;i<3;i++)
		{
			suma=vector[alumno][i]+suma;
		}
		System.out.println("la media de "+alumnos[alumno]+" es: "+suma/3);
		
	}
	
	public static void notas_por_evaluacion(String[]alumnos,int [][]notas)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println();
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("indique sobre qué Evaluacion quiere las notas: ");
		System.out.println("Pulse 1 para Primera Evaluacion.");
		System.out.println("Pulse 2 para Segunda Evaluacion.");
		System.out.println("Pulse 3 para Tercera Evaluacion.");
		
		int evaluacion=sc.nextInt()-1;
		int suma=0;
		for (int i=0;i<notas.length;i++)
		{
			
			System.out.println("La nota de la "+(evaluacion)+" evaluacion de "+alumnos[i]+ " es: "+notas[i][evaluacion]);
			suma=suma+notas[i][evaluacion];
		}
		
		System.out.println("la media de la "+(evaluacion)+" evaluacion es: "+suma/alumnos.length);
		
	}
	
	public static void max_min(String[]nombres,int [][]notas)
	{
		int min=notas[0][0];
		int max=notas[0][0];
		int alu_max=0;
		int eva_max=0;
		int alu_min=0;
		int eva_min=0;
		
		for (int i=0;i<notas.length;i++)
		{
			for (int j=0;j<notas[0].length;j++)
			{
				if(notas[i][j]<min)
				{
					min=notas[i][j];
					alu_min=i;
					eva_min=j;
				}
				if (notas[i][j]>max)
				{
					max=notas[i][j];
					alu_max=i;
					eva_max=j;
				}
			}
		}
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("la nota máxima es un: "+max+ " y lo obtuvo "+nombres[alu_max]+" en la "+(eva_max+1)+"º evaluacion");
		System.out.println("la nota mínima es un: "+min+ " y lo obtuvo "+nombres[alu_min]+" en la "+(eva_min+1)+"º evaluacion");
	}
	
	public static void notas_por_alumno(String[]alumnos,int[][]notas)
	{
		Scanner sc= new Scanner(System.in);
		int alumno=0;
		int opcion=0;
		System.out.println();
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("sobre qué alumno quiere saber las notas?: ");
		for(int i=0;i<alumnos.length;i++)
		{
			System.out.println("pulse "+(i+1)+" si quere las notas de "+alumnos[i]);
		}
		alumno= sc.nextInt()-1;
		System.out.println("si quiere la nota final pulse 1: ");
		System.out.println("si quiere las notas por evaluacion pulse 2: ");
		opcion=sc.nextInt();
		if (opcion==1)
		{
			System.out.println("la nota final de "+alumnos[alumno]+" es un "+((notas[alumno][0]+notas[alumno][1]+notas[alumno][2])/3));
		}
		if (opcion==2)
		{
			for (int i=0;i<notas.length;i++)
			{
				System.out.println("la nota de la "+(i+1)+"º evaluacion de "+alumnos[alumno]+" es un: "+notas[alumno][i]);
			}
		}
	}
	
	public static void nota_media_curso(int[][]notas)
	{
		int suma=0;
		int media=0;
		for (int i=0;i<notas.length;i++)
		{
			for (int j=0;j<notas[i].length;j++)
			{
				suma=notas[i][j]+suma;
			}
		}
		media=suma/(notas.length*notas[0].length);
		System.out.println();
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("La media total del curso es: "+media);
	}
	
}
