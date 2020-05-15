package unidad7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalEmpresa {

	public static void main(String[] args) 
	{
		
		Asalariados asal1= new Asalariados(" juan ", " garcia ", " 12-10-2020 ",5673543);
		Contratistas contr1=new Contratistas(" pepe ", " romero ", " 11-08-2020 ",1234567);
		contr1.setSociedades(new SociedadAnonima(" limpia.S.A ", " limpieza "));
		EmpresaServicios empr1=new EmpresaServicios(" ktering.Servicios ", " Catering ", 7654321);
		
		ArrayList<Pagos>pagos=new ArrayList<>();
		pagos.add(asal1);
		pagos.add(empr1);
		pagos.add(contr1);
		
		for(Pagos p:pagos)
		{
			p.realizacionPagos();
		}
		
		ArrayList<Empleados>empleados=new ArrayList<>();
		empleados.add(new Asalariados(" juan ", " perez ", " 10-01-2020" ,2982345));
		empleados.add(new Asalariados(" maria ", " lopez ", " 02-03-2020" ,5375897));
		empleados.add(new Asalariados(" ana ", " villa ", " 01-02-2020" ,2982345));
		empleados.add(new Asalariados(" laura ", " martinez ", " 02-05-2020" ,5375897));
		empleados.add(new Contratistas(" pepe ", " romero ", " 11-08-2020 ",1234567));
		empleados.add(new Contratistas(" antonio ", " paz ", " 13-04-2020 ",1234567));
		empleados.add(new Contratistas(" juana ", " romeo ", " 11-02-2020 ",1234567));
		empleados.add(new Contratistas(" pepa ", " pig ", " 13-09-2020 ",1234567));
		
		//empleados.sort(null);
		Collections.sort(empleados, Empleados::compareTo);
			
		for(Empleados p:empleados)
		{
			System.out.println(p.toString());
		}
		
		
	}

}
