package repaso2ev;



import java.util.Scanner;

import java.util.TreeMap;

public class Principal_automovil {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		TreeMap<String,Automovil>listado_automoviles=new TreeMap(); 	//creo mapa donde guardo modelos(clave) y objetos de la clase
																		//Automovil (valor)
		String modelo;
		float capacidad;
		float litrosActuales;
		float consumo;
		
		int cantidad=0;
		System.out.println("numero de automoviles: ");
		cantidad=sc.nextInt();
		sc.nextLine();
		for (int i=0; i<cantidad; i++)
		{
			System.out.println("ingresa datos automovil:");
			String entrada_bruta=sc.nextLine();						//trato la entrada para separar cada dato 
			String[] entrada=entrada_bruta.split(" ");
			modelo = entrada[0];
			capacidad=Float.parseFloat(entrada[1]);					
			litrosActuales=Float.parseFloat(entrada[2]);
			consumo=Float.parseFloat(entrada[3]);
			
			listado_automoviles.put(modelo, new Automovil(modelo, capacidad, litrosActuales,consumo));//añado al mapa modelo(clave) 
		}																// e inicializo un Automovil con sus parametros(valor)
		
		
		String texto="";
		System.out.println("ingrese datos desplazamiento: ");
		texto=sc.nextLine();						//recojo los datos del desplazamiento(auto y km)
		while (!texto.equals("fin"))
		{
			String[]desplazar=texto.split(" ");
			String auto=desplazar[1];
			Float km=Float.parseFloat(desplazar[2]) ;
			float cosumido_desplazamiento=listado_automoviles.get(auto).desplazarse(km);//llamo al metodo desplazarse del objeto Automovil
																//guardado en el mapa con la clave (auto), que devuelve un valor
			if ( cosumido_desplazamiento==0)			
			{
				System.out.println("Combustible insuficiente para este desplazamiento");
			}
			else
			{
				System.out.println(auto+" "+listado_automoviles.get(auto).getCombustible_en_deposito()+" "+cosumido_desplazamiento);
			}
			System.out.println("ingrese datos desplazamiento: ");
			texto=sc.nextLine();
		}
		
		System.out.println("---------------------------------");
		for(String model: listado_automoviles.keySet())		//recorro las claves del mapa
		{
			Automovil auto=listado_automoviles.get(model);	
			System.out.println(auto.getModelo()+" "+auto.getCombustible_en_deposito()
			+" "+auto.getTotal_kilometros_recorridos()+" "+auto.getTotal_consumido());
		}
		
				
		sc.close();		
	}

}
