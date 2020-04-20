package unidad6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class PrincipalPokemon
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		boolean jugar=true;
		String entrada=" ";
		boolean torneo=false;


		TreeMap<String ,Set<Pokemon>> jugadores=new TreeMap<String, Set<Pokemon>>();    	//creo mapa de nombre jugador y pokemons
		TreeMap<String, Integer >insignias=new TreeMap<String, Integer>();			//creo mapa de nombre jugador e insignias que gana


		while (jugar==true)
		{
			entrada=sc.nextLine();
			String []entradaR=entrada.split(" ");				

			if (entradaR.length==4) 					
			{
				try 			//Integer.parseInt puede producir una excepcion 
				{
					Pokemon pok=new Pokemon(entradaR[1],entradaR[2],Integer.parseInt(entradaR[3]));  //creo un objeto Pokemon
					if (!jugadores.containsKey(entradaR[0]))	
					{
						Set<Pokemon> conj=new HashSet<Pokemon>();		//creo conjunto de objetos Pokemon y añado el Pokemon
						conj.add(pok);							
						jugadores.put(entradaR[0], conj);		//añado el conjunto al mapa de jugadores
						insignias.put(entradaR[0], 0);			//añado el jugador al mapa de insignias
					}
					else
					{
						jugadores.get(entradaR[0]).add(pok); 	//si el jugador ya existe, añado el Pokemon
					}
					continue;		//vuelvo a leer la entrada de datos	
				}
				catch(NumberFormatException e)		//captura la excepcion NumberFormatException si se produce
				{
					System.out.println("Error, el ultimo dato no es numerico");
				}
				catch (Exception e)			//captura cualquier otra excepcion que pudiera producirse
				{
					System.out.println("Se ha producido un error en la entrada");
				}
			}

			if (entradaR.length==1 && torneo==false) 		
			{
				if (entradaR[0].equals("torneo"))			//si la entrada es correcta comienza el torneo
				{
					torneo = true;
				}
				else
				{
					if (entradaR[0].equals("fin"))		//finaliza el torneo y salgo del programa
					{
						jugar=false;
						continue;			//vuelvo a leer la entrada de datos
					}
					else
					{
					System.out.println("entrada incorrecta");  
					}
				}
				continue;		//vuelvo a leer la entrada de datos
			}

			if (entradaR.length!=4 && torneo==false) 		//posible entrada incorrecta
			{
				System.out.println("entrada incorrecta2");
				continue;
			}

			if ((entradaR.length!=1) && torneo==true)		//posible entrada incorrecta
			{
				System.out.println("entrada incorrecta3");
				continue;
			}

			if (entradaR.length==1 && torneo==true && entradaR[0].equals("fin")) 	//cuando acaba el torneo busco al ganador
			{
				int max=-1;
				String entrenador_gano="";
				for(String entrenad: insignias.keySet())   //recorremos los entrenadores de insignias
				{
					if (insignias.get(entrenad)>max)
					{
						entrenador_gano=entrenad;
						max=insignias.get(entrenad);
					}
				}

				System.out.println("el vencedor es "+entrenador_gano+ " con "+insignias.get(entrenador_gano)
								+" insignias y "+jugadores.get(entrenador_gano).size()+" pokemons");
				jugar = false;
				continue;
			}

			if (entradaR.length==1 && torneo==true) // comparo el elemento con los elementos de los Pokemons
			{
				for(String entrenad: jugadores.keySet())  //voy cojiendo cada entrenador
				{
					boolean tieneElemento=false;
					Set<Pokemon> pokemons = jugadores.get(entrenad);   //saco su coleccion de pokemons
					for(Pokemon pok: pokemons)			//recorro sus pokemons
					{
						if (pok.getElemento().equals(entradaR[0]))    //si tiene el elemento
						{
							insignias.replace(entrenad, insignias.get(entrenad)+1);
							tieneElemento=true;
							break;
						}
					}
					if (tieneElemento==false)   //si no lo tiene
					{

						for(Pokemon pok: pokemons)  //recorro sus pokemons
						{
							pok.setSalud(pok.getSalud()-10);
							if (pok.getSalud()<=0)
							{
								pokemons.remove(pok);
							}
						}
					}
				}
			}

		}
	sc.close();
	}
}