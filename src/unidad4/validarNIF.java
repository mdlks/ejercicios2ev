package unidad4;

import java.util.Scanner;

public class validarNIF 
{

	public static void main(String[] args) 
	{
		System.out.println("ingresa tu DNI completo: ");
		Scanner sc = new Scanner(System.in);
		
		String dni = sc.nextLine();//leo dni del teclado
		
		char[] letra = new char [23];
		letra [0]='t';
		letra [1]='r';
		letra [2]='w';
		letra [3]='a';
		letra [4]='g';
		letra [5]='m';
		letra [6]='y';
		letra [7]='f';
		letra [8]='p';
		letra [9]='d';
		letra [10]='x';
		letra [11]='b';
		letra [12]='n';
		letra [13]='j';
		letra [14]='z';
		letra [15]='s';
		letra [16]='q';
		letra [17]='v';
		letra [18]='h';
		letra [19]='l';
		letra [20]='c';
		letra [21]='k';
		letra [22]='e';
		
		char letra_dni = dni.charAt(dni.length()-1);//cojo la letra accediendo a la última posición del string
		int numero_dni=0;
		int parcial_dni=0;
		int resto=0;
		
				
		for(int i=0;i<dni.length()-1;i++) //recorro el string hasta la penúltima posición y cojo cada uno de los número
		{
		
			parcial_dni=Character.getNumericValue(dni.charAt(i));//cojo número como caracter y lo paso a entero
			numero_dni=(numero_dni*10)+parcial_dni;//reconstruyo dni con el número que voy cojiendo
		}
		
		resto=numero_dni%23;//saco el resto de la división por 23
		
		if (letra_dni==letra[resto]) //compruebo si coincide la letra
		{
			System.out.println("dni válido");
		}
		else 
		{
			System.out.println("dni no válido");
		}
		
		
	}

}
