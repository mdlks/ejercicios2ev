package unidad5;

import java.time.LocalDate;

import java.util.Scanner;

public class Principal_animal
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Animal perro=new Animal();
		Animal gato=new Animal();
		Animal raton=new Animal("Perez");
		
		String aux_animal;
		
		int edad;
		
		do {
			System.out.println("que animal tienes? perro-gato-raton");
			aux_animal=sc.nextLine();
			
			}
		while (!aux_animal.equals("perro")&&!aux_animal.equals("gato")&&!aux_animal.equals("raton"));
		
			
			switch(aux_animal) {
			case "perro":
				System.out.println("dime el nombre de tu "+ aux_animal);
				perro.setNombre(sc.nextLine());
				System.out.println("fecha de nacimiento (YYYY-MM-DD) de "+perro.getNombre());
				perro.setFecha(LocalDate.parse(sc.nextLine()));
				edad=(LocalDate.now().compareTo(perro.getFecha()));
				System.out.println("--------------------");
				System.out.println("animal:perro "+perro.toString(edad));
				break;
				
			case "gato":
				System.out.println("dime el nombre de tu "+ aux_animal);
				gato.setNombre(sc.nextLine());
				System.out.println("fecha de nacimiento (YYYY-MM-DD)"+gato.getNombre());
				gato.setFecha(LocalDate.parse(sc.nextLine()));
				edad=(LocalDate.now().compareTo(gato.getFecha()));
				System.out.println("--------------------");
				System.out.println("animal: gato "+gato.toString(edad));
				break;
			case "raton":
				
				System.out.println("fecha de nacimiento (YYYY-MM-DD)"+raton.getNombre());
				raton.setFecha(LocalDate.parse(sc.nextLine()));
				edad=(LocalDate.now().compareTo(raton.getFecha()));
				System.out.println("--------------------");
				System.out.println("animal: raton "+raton.toString(edad));
				break;
				
			}
			aux_animal="";
				
		sc.close();
	}
	

}
