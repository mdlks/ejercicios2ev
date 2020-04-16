package unidad6;

import java.util.Random;

public class Mascota {
	
	private String nombre;
	private int energia=20;
	private String estado="alegria";
	private boolean comidaMal=false;
	
	public Mascota(String nombre)
	{
		this.nombre=nombre;
	}
	
	public String comprobarEstado()
	{
		if((energia>50 && energia<=55) || (energia<5 && energia>0))
		{
			estado="enfermo";
		}
		if((energia<47 && energia>8) && comidaMal==false)
		{
			estado="alegria";
		}
		if(energia<8 && energia>5 || (energia>46 && energia<51) && comidaMal==false)
		{
			estado="apatia";
		}
		if (energia<0 || energia>55)  
		{
			estado="muerto";
		}
		if (comidaMal==true)
		{
			estado="enfermo";
		}
		return estado;
		
	}
	
	public String comer() 
	{
		if(estado.equals("enfermo")) 
		{
			if(energia<11) 
			{
				energia=energia-1;
			}
			if(energia>50)    
			{
				energia=energia+1;
			}
		}
		
		else
		{
			Random num=new Random();
			if((num.nextInt(3)+1)==2) 
			{
				energia=10;
				comidaMal=true;
			}
			else 
			{
				energia=energia+5;
			}
		}
		return comprobarEstado();
	}
	
	public String dormir()
	{
		if(estado.equals("enfermo")) 
		{
			if(energia<11) 
			{
				energia=energia-1;
			}
	
			if(energia>50) 
			{
				energia=energia+1;
			}
		}
		else
		{	
			energia=energia+2;
		}
		return comprobarEstado();
	}
	
	public String ejercicio()
	{
		if(estado.equals("enfermo")) 
		{
			if(energia<11) 
			{ 
				energia=energia-1;
			}
			if(energia>50) 
			{
				energia=energia+1;
			}
		}
		
		else
		{
			energia=energia-3;
		}
		return comprobarEstado();
	}
	
	public String curar()
	{
		
		if(!estado.equals("enfermo"))
		{
			return estado;
		}
		else 
		{
			energia=20;
			estado="alegria";
			
		}
		comidaMal=false;
		return comprobarEstado();
	}
	
	
	public String getEstado() {
		return estado;
	}
	
	public int getEnergia() {
		return energia;
	}

}
