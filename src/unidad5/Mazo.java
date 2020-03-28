package unidad5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mazo {
	
	public List<Naipe>baraja=new ArrayList();
	
	public Mazo() {
		crear_baraja(baraja);
	}
	
	public Mazo(int veces) {
		for(int i =0; i<veces;i++) {
			crear_baraja(baraja);
		}
	}
	
	public Naipe getCarta() {
		Random num=new Random();
		
		int aux=num.nextInt(baraja.size())+1;
		
		return baraja.get(aux);
	}
	
	public Naipe remove_Naipe() 
	{
		
		Random num=new Random();
		int aux=num.nextInt(baraja.size()-1)+1;
		return baraja.remove(aux);
		
	}
	
	public void add_Naipe()
	{
		baraja.add(getCarta());
	}
	
	public void add_All(List<Naipe> naipes)
	{
		baraja.addAll(naipes);
	}
		
	public void crear_baraja(List<Naipe>baraja) 
	{
		
		baraja.add(new Naipe("treboles","2",2));
		baraja.add(new Naipe("treboles","3",3));
		baraja.add(new Naipe("treboles","4",4));
		baraja.add(new Naipe("treboles","5",5));
		baraja.add(new Naipe("treboles","6",6));
		baraja.add(new Naipe("treboles","7",7));
		baraja.add(new Naipe("treboles","8",8));
		baraja.add(new Naipe("treboles","9",9));
		baraja.add(new Naipe("treboles","10",10));
		baraja.add(new Naipe("treboles","J",11));
		baraja.add(new Naipe("treboles","Q",12));
		baraja.add(new Naipe("treboles","K",13));
		baraja.add(new Naipe("treboles","A",14));
		
		baraja.add(new Naipe("diamantes","2",2));
		baraja.add(new Naipe("diamantes","3",3));
		baraja.add(new Naipe("diamantes","4",4));
		baraja.add(new Naipe("diamantes","5",5));
		baraja.add(new Naipe("diamantes","6",6));
		baraja.add(new Naipe("diamantes","7",7));
		baraja.add(new Naipe("diamantes","8",8));
		baraja.add(new Naipe("diamantes","9",9));
		baraja.add(new Naipe("diamantes","10",10));
		baraja.add(new Naipe("diamantes","J",11));
		baraja.add(new Naipe("diamantes","Q",12));
		baraja.add(new Naipe("diamantes","K",13));
		baraja.add(new Naipe("diamantes","A",14));
		
		baraja.add(new Naipe("corazones","2",2));
		baraja.add(new Naipe("corazones","3",3));
		baraja.add(new Naipe("corazones","4",4));
		baraja.add(new Naipe("corazones","5",5));
		baraja.add(new Naipe("corazones","6",6));
		baraja.add(new Naipe("corazones","7",7));
		baraja.add(new Naipe("corazones","8",8));
		baraja.add(new Naipe("corazones","9",9));
		baraja.add(new Naipe("corazones","10",10));
		baraja.add(new Naipe("corazones","J",11));
		baraja.add(new Naipe("corazones","Q",12));
		baraja.add(new Naipe("corazones","K",13));
		baraja.add(new Naipe("corazones","A",14));
		
		baraja.add(new Naipe("picas","2",2));
		baraja.add(new Naipe("picas","3",3));
		baraja.add(new Naipe("picas","4",4));
		baraja.add(new Naipe("picas","5",5));
		baraja.add(new Naipe("picas","6",6));
		baraja.add(new Naipe("picas","7",7));
		baraja.add(new Naipe("picas","8",8));
		baraja.add(new Naipe("picas","9",9));
		baraja.add(new Naipe("picas","10",10));
		baraja.add(new Naipe("picas","J",11));
		baraja.add(new Naipe("picas","Q",12));
		baraja.add(new Naipe("picas","K",13));
		baraja.add(new Naipe("picas","A",14));
	}
	
	
	
}