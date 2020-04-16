package unidad6;


import java.util.Scanner;
import java.util.TreeMap;

public class PrincipalMascota 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		boolean jugar=true;
		String accion="";
		String nombre="";
		
		TreeMap<String, Mascota> mascotas =new TreeMap();
		while (jugar==true) 
		{
			System.out.println("> ");
			accion=sc.next();
			
			while(!accion.equals("crear")&&!accion.equals("comer")&&!accion.equals("ejercicio")&&
					!accion.equals("dormir")&&!accion.equals("curar")&&!accion.equals("salir"))
			{
				System.out.println("error de entrada de datos");
				System.out.println("> ");
				accion=sc.next();
			}
			
			switch (accion) 
			{
			
			case "crear":
				nombre=sc.next();
				if(mascotas.containsKey(nombre)==true) {
					System.out.println("error, "+nombre+" ya existe");
				}
				else mascotas.put(nombre, new Mascota(nombre));
				break;
				
			case "comer":
				nombre=sc.next();
				if(mascotas.containsKey(nombre)==false) 
				{
					System.out.println("error, "+nombre+" no existe");
				}
				else 
				{
					if (mascotas.get(nombre).getEstado().equals("enfermo")) 
					{
						if(mascotas.get(nombre).getEnergia()>0&&mascotas.get(nombre).getEnergia()<55) 
						{
						System.out.println("deberia curarse antes.");
						mascotas.get(nombre).comer();
						System.out.println(onomatopeya(mascotas.get(nombre).getEstado()));
						System.out.println(mascotas.get(nombre).getEnergia());
						}
						else 
						{
							mascotas.remove(nombre);
							System.out.println("DEP");
						}
					}
					else
					{
						mascotas.get(nombre).comer();
						System.out.println(onomatopeya(mascotas.get(nombre).getEstado()));
						System.out.println(mascotas.get(nombre).getEnergia());
					}
				}
				break;
				
			 case "ejercicio":
				 nombre=sc.next();
				if(mascotas.containsKey(nombre)==false) 
				{
					System.out.println("error, "+nombre+" no existe");
				}
				else
				{
					String aux="";
					aux=mascotas.get(nombre).getEstado();
					if (aux.equals("enfermo")) 
					{
						if(mascotas.get(nombre).getEnergia()>0 && mascotas.get(nombre).getEnergia()<55) 
						{
						System.out.println("deberia curarse antes.");
						mascotas.get(nombre).ejercicio();
						System.out.println(onomatopeya(mascotas.get(nombre).getEstado()));
						System.out.println(mascotas.get(nombre).getEnergia());
					
						}
						else 
						{
							mascotas.remove(nombre);
							System.out.println("DEP");
						}
					}
					else 
					{
						mascotas.get(nombre).ejercicio();
						System.out.println(onomatopeya(mascotas.get(nombre).getEstado()));
						System.out.println(mascotas.get(nombre).getEnergia());
					}
				}
				break;
				
			case "dormir":
				nombre=sc.next();
				if(mascotas.containsKey(nombre)==false) 
				{
					System.out.println("error, "+nombre+" no existe");
				}
				if (mascotas.get(nombre).getEstado().equals("enfermo")) 
				{
					if(mascotas.get(nombre).getEnergia()>0 && mascotas.get(nombre).getEnergia()<55) 
					{
					System.out.println("deberia curarse antes.");
					mascotas.get(nombre).dormir();
					System.out.println(onomatopeya(mascotas.get(nombre).getEstado()));
					System.out.println(mascotas.get(nombre).getEnergia());
					}
					else
					{
						mascotas.remove(nombre);
						System.out.println("DEP");
					}
				}
				else 
				{
					mascotas.get(nombre).dormir();
					System.out.println(onomatopeya(mascotas.get(nombre).getEstado()));
					System.out.println(mascotas.get(nombre).getEnergia());
				}
				break;
				
			case "curar":
				nombre=sc.next();
				if(mascotas.containsKey(nombre)==false) 
				{
					System.out.println("error, "+nombre+" no existe");
				}
				else 
				{
					String aux=mascotas.get(nombre).getEstado();
					if(!aux.equals("enfermo"))
					{
						System.out.println(onomatopeya(mascotas.get(nombre).getEstado()));
						System.out.println("no necesitas curarte");
					}
					else 
					{
						mascotas.get(nombre).curar();
						System.out.println(onomatopeya(mascotas.get(nombre).getEstado()));
					}
				}
				break;
			
			case "salir":
				jugar=false;
				break;
			}
		}
		sc.close();
	}
	
	public static String onomatopeya (String estado)
	{
		String aux="";
		if (estado.equals("alegria")) 
		{
			aux="ronrroneo";
		}
		if (estado.equals("apatia")) 
		{
			aux="gemido";
		}
		if (estado.equals("enfermo")) 
		{
			aux="quejido";
		}
		return aux;
	}
}
