package unidad7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class PrincipalElectrodomesticos {

	public static void main(String[] args) {
		
		
		TreeSet<Electrodomesticos>lista=new TreeSet<>();
		
		lista.add(new Lavadora());
		lista.add(new Frigorifico());
		lista.add(new Television());
		
		
		
		for (Electrodomesticos electrodomestico :lista)
			System.out.println(electrodomestico.toString());
			
		
				

	}

}
