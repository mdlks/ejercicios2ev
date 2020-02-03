package unidad4;

import java.util.Random;

public class vectores4 
{

	public static void main(String[] args) 
	{
		Random numero_aleatorio= new Random();
		int tamanio_vector=numero_aleatorio.nextInt(501)+10; //genero el tamaño del vector
		int [] vector= new int [tamanio_vector];
		
		boolean repetido=false;
		int secuencias=0;
		
		
		
		for (int i=0;i<tamanio_vector;i++)		//relleno el vector de numeros aleatorios
		{
			vector[i]=numero_aleatorio.nextInt(201)+(-100);
		}
		
		
		
		if (tamanio_vector<51)				//imprime el contenido del vector si su tamaño es menor que 51
		{
			for (int j=0;j<tamanio_vector;j++)
			{
				System.out.print("["+vector[j]+"]");
			}
		}
		else
		{
			System.out.println("el vector tiene un tamaño de "+tamanio_vector+" elementos");
		}
		
		
		
		for (int i=0;i<(tamanio_vector-1);i++)		//recorro vector  para comprobar numeros consecutivos
		{
			if (vector[i]==vector[i+1])			//cuando encuentro un numero igual al siguiente 
			{									//cambio la variable de estado y comienza una secuencia de numeros iguales
				repetido=true;
			}
			else 							//si el numero es diferente al siguiente:
			{
				if (repetido==true)				//si viene de una secuencia de numeros repetidos finaliza la secuencia.
				{
					secuencias++;				//aumento contador de secuencias y cambio la variable de estado.
					repetido=false;			
				}
			}
		}
		
		System.out.println();
		System.out.println("numero de secuencias de numeros repetidos: "+secuencias);
	}
}
