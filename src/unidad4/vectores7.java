package unidad4;

import java.util.Scanner;

public class vectores7 {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("indica el tamaño del vector: ");	//pido tamaño del vector
		int tamanio_vector=sc.nextInt();
		int [] vector= new int [tamanio_vector];
		for (int i=0;i<vector.length;i++)						//recorro vector pidiendo un numero para cada posicion
		{
			System.out.println("dime un numero para la posición "+i);
			vector[i]=sc.nextInt();
		}
		
		if(centro(vector)!=null)	//si lo que devuelve el metodo centro es NULL el vector no tiene centro
		{
		System.out.println("el centro del vector está en la posición:"+centro(vector));
		}
		else						//si el metodo centro me devuelve un valor
		{
			System.out.println("valor "+centro(vector)+", el vector no tiene centro");
		}
		sc.close();
	}
	
	public static Integer centro (int[]vector)  //método para buscar el centro de un vector devolviendo su posición
	{
		Integer resultado=null;
		int centro=0;
		int sum_izq=0;
		int sum_dcha=0;
		
		for (int e=0;e<vector.length;e++)  //comprobamos si el centro es la primera posicion,sino la segunda, la tercera... 
		{
			
			centro=e;
			sum_izq=0;
			sum_dcha=0;
			
			for (int i=0;i<centro;i++)  
			{
				sum_izq=sum_izq+(centro-i)*vector[i];//comprobamos la formula de la izquierda
			}
			for (int j=centro+1;j<vector.length;j++)
			{
				sum_dcha=sum_dcha+(j-centro)*vector[j];//comprobamos la formula de la derecha
			}
			
			if (sum_izq==sum_dcha)		//si coincide el resultado de la izquierda y la derecha existe un centro
			{
				resultado=centro;		
				break;					//y dejamos de buscar
			}
			
		}
		return(resultado);
	}
	

}
