package unidad5;

import java.util.Scanner;

public class Hucha {
	
	private int un_euro;
	private int dos_euros;
	private int cinco_euros;
	private int diez_euros;
	private int veinte_euros;
	private int cincuenta_euros;
	private boolean abierta;
	private String contrasenia;
	
	public Hucha () {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("crea contraseña: ");
		contrasenia=(sc.nextLine());
		 un_euro=0;
		 dos_euros=0;
		 cinco_euros=0;
		 diez_euros=0;
		 veinte_euros=0;
		 cincuenta_euros=0;
		 
		 abierta=false;
		 
	}
	
	public Hucha(int ingreso) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("crea contraseña: ");
		contrasenia=(sc.nextLine());
		
		if(ingreso>=50) {
			this.cincuenta_euros=ingreso/50;
			ingreso=ingreso-this.cincuenta_euros*50;
			System.out.println("ingreso €50: "+this.cincuenta_euros*50);
		}
		if(ingreso>=20) {
			this.veinte_euros=ingreso/20;
			ingreso=ingreso-this.veinte_euros*20;
			System.out.println("ingreso €20: "+this.veinte_euros*20);
		}
		if(ingreso>=10) {
			this.diez_euros=ingreso/10;
			ingreso=ingreso-this.diez_euros*10;
			System.out.println("ingreso €10: "+this.diez_euros*10);
		}
		if(ingreso>=5) {
			this.cinco_euros=ingreso/5;
			ingreso=ingreso-this.cinco_euros*5;
			System.out.println("ingreso €5: "+this.cinco_euros*5);
		}
		if(ingreso>=2) {
			this.dos_euros=ingreso/2;
			ingreso=ingreso-this.dos_euros*2;
			System.out.println("ingreso €2: "+this.dos_euros*2);
		}
		if(ingreso>=1) {
			this.un_euro=ingreso/1;
			System.out.println("ingreso €1: "+(this.un_euro*1));
			
		}
		
		
	}
	
	public Hucha(int un_euro, int dos_euros, int cinco_euros, int diez_euros, int veinte_euros, 
			int cincuenta_euros) {
		Scanner sc=new Scanner(System.in);
		System.out.println("crea contraseña: ");
		contrasenia=(sc.nextLine());
		
		this.un_euro=un_euro;
		this.dos_euros=dos_euros;
		this.cinco_euros=cinco_euros;
		this.diez_euros=diez_euros;
		this.veinte_euros=veinte_euros;
		this.cincuenta_euros=cincuenta_euros;
		abierta=false;
		
		
	}
	
	public void setcontrasenia() {
		Scanner sc=new Scanner(System.in);
		System.out.println("dime la conraseña antigua: ");
		if (sc.nextLine().equals(contrasenia)){
			System.out.println("correcto");
			System.out.println("dime nueva contraseña: ");
			contrasenia=sc.nextLine();
		}
		else {System.out.println("contraseña errónea.");}
		
	}
	
	public void retirar_por_moneda(int valor, int cantidad) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("dime la contraseña para retirar: ");
		if(sc.nextLine().equals(contrasenia))
		{
			abierta=true;
			switch (valor) 
			{
			case 1: 
				if(un_euro>=cantidad) 
				{
				System.out.println("retirada de 1€: "+cantidad);
				un_euro=un_euro-cantidad;
				}
				else 
				{
					System.out.println("no hay esa cantidad");
					System.out.println("te doy lo que hay.");
					un_euro=0;
				}
				break;
			case 2: 
				if(dos_euros>=cantidad) 
				{
				System.out.println("retirada de 2€: "+cantidad);
				dos_euros=dos_euros-cantidad;
				}
				else 
				{
					System.out.println("no hay esa cantidad");
					System.out.println("te doy lo que hay.");
					dos_euros=0;
				}
				break;
			case 5: 
				if(cinco_euros>=cantidad) 
				{
				System.out.println("retirada de 5€: "+cantidad);
				cinco_euros=cinco_euros-cantidad;
				}
				else 
				{
					System.out.println("no hay esa cantidad");
					System.out.println("te doy lo que hay.");
					cinco_euros=0;
				}
				break;
			case 10: 
				if(diez_euros>=cantidad) 
				{
				System.out.println("retirada de 10€: "+cantidad);
				diez_euros=diez_euros-cantidad;
				}
				else 
				{
					System.out.println("no hay esa cantidad");
					System.out.println("te doy lo que hay.");
					diez_euros=0;
				}
				break;
			case 20: 
				if(veinte_euros>=cantidad) 
				{
				System.out.println("retirada de 20€: "+cantidad);
				veinte_euros=veinte_euros-cantidad;
				}
				else 
				{
					System.out.println("no hay esa cantidad");
					System.out.println("te doy lo que hay.");
					veinte_euros=0;
				}
				break;
			case 50: 
				if(cincuenta_euros>=cantidad) 
				{
				System.out.println("retirada de 50€: "+cantidad);
				cincuenta_euros=cincuenta_euros-cantidad;
				}
				else 
				{
					System.out.println("no hay esa cantidad");
					System.out.println("te doy lo que hay.");
					cincuenta_euros=0;
				}
				break;
			default: System.out.println("ERROR");
				break;
				
			}
		}
		abierta=false;
		
	}
	
	public int saldo_total() {
		int total= (un_euro*1+dos_euros*2+cinco_euros*5+diez_euros*10+
				veinte_euros*20+cincuenta_euros*50);
		System.out.println(" -----------------------");
		System.out.println("| "+total+ "       TOTAL         ");
		System.out.println(" -----------------------");
		
		return total;
	}
	
	public void saldo_por_moneda() {
		
		System.out.println(" -----------------------");
		System.out.println("|        SALDO         |");
		System.out.println(" -----------------------");
		System.out.println("| 1€ |...."+ un_euro*1+"€"+"..."+un_euro+"uds");
		System.out.println("| 2€ |...."+ dos_euros*2+"€"+"..."+dos_euros+"uds");
		System.out.println("| 5€ |...."+ cinco_euros*5+"€"+"..."+cinco_euros+"uds");
		System.out.println("|10€ |...."+ diez_euros*10+"€"+"..."+diez_euros+"uds");
		System.out.println("|20€ |...."+ veinte_euros*20+"€"+"..."+veinte_euros+"uds");
		System.out.println("|50€ |...."+ cincuenta_euros*50+"€"+"..."+cincuenta_euros+"uds");
		System.out.println("------------------------");
		
		
	}
	
	public void retirar_cantidad(int valor) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("dime la contraseña para retirar: ");
		if(sc.nextLine().equals(this.contrasenia)) {
			abierta=true;
		}
		else {abierta=false;}
		if (abierta==true) 
		{
			if (valor>saldo_total()) 
			{
				System.out.println("te doy todo lo que tengo: "+saldo_total());
				
				un_euro=0;
				dos_euros=0;
				cinco_euros=0;
				diez_euros=0;
				veinte_euros=0;
				cincuenta_euros=0;
			}
			else {
				int numero_monedas=valor/50;
				if(numero_monedas<=cincuenta_euros) {
					cincuenta_euros=cincuenta_euros-numero_monedas;
					valor=valor-numero_monedas*50;
					System.out.println("retirada de 50€: "+ numero_monedas);
				}
				else
				{
					valor=valor-cincuenta_euros*50;
					
					//System.out.println("billetes de 50€: "+ cincuenta_euros);
					cincuenta_euros=0;
				}
				
				numero_monedas=valor/20;
				if(numero_monedas<=veinte_euros) {
					veinte_euros=veinte_euros-numero_monedas;
					valor=valor-numero_monedas*20;
					System.out.println("retirada de 20€: "+ numero_monedas);
				}
				else
				{
					valor=valor-veinte_euros*20;
					
					//System.out.println("billetes de 20€: "+ veinte_euros);
					veinte_euros=0;
				}
				
				numero_monedas=valor/10;
				if(numero_monedas<=diez_euros) {
					diez_euros=diez_euros-numero_monedas;
					valor=valor-numero_monedas*10;
					System.out.println("retirada de 10€: "+ numero_monedas);
				}
				else
				{
					valor=valor-diez_euros*10;
					
					//System.out.println("billetes de 10€: "+ diez_euros);
					diez_euros=0;
				}
				
				numero_monedas=valor/5;
				if(numero_monedas<=cinco_euros) {
					cinco_euros=cinco_euros-numero_monedas;
					valor=valor-numero_monedas*5;
					System.out.println("retirada de 5€: "+ numero_monedas);
				}
				else
				{
					valor=valor-cinco_euros*5;
					
					//System.out.println("billetes de 5€: "+ cinco_euros);
					cinco_euros=0;
				}
				
				numero_monedas=valor/2;
				if(numero_monedas<=dos_euros) {
					dos_euros=dos_euros-numero_monedas;
					valor=valor-numero_monedas*2;
					System.out.println("retirada de 2€: "+ numero_monedas);
				}
				else
				{
					valor=valor-dos_euros*2;
					
					//System.out.println("monedas de 2€: "+ dos_euros);
					dos_euros=0;
				}
				
				numero_monedas=valor/1;
				if(numero_monedas<=un_euro) {
					un_euro=un_euro-numero_monedas;
					valor=valor-numero_monedas*1;
					System.out.println("retirada de 1€: "+ numero_monedas);
				}
				else
				{
					valor=valor-un_euro*1;
					
					//System.out.println("monedas de 1€: "+ un_euro);
					un_euro=0;
				}
			}
			
		}
		else {
			System.out.println("contraseña erronea");
		}
		abierta=false;
		
	}
	
public void ingresar() {
	Scanner sc=new Scanner(System.in);
	int uno=0;
	int dos=0;
	int cinco=0;
	int diez=0;
	int veinte=0;
	int cincuenta=0;
		
	System.out.println(" cantidad monedas de 1€: ");
	uno=sc.nextInt();
	System.out.println("cantidad monedas de 2€: ");
	dos=sc.nextInt();
	System.out.println(" cantidad billetes de 5€: ");
	cinco=sc.nextInt();
	System.out.println("cantidad billetes de 10€: ");
	diez=sc.nextInt();
	System.out.println(" cantidad billetes de 20€: ");
	veinte=sc.nextInt();
	System.out.println("cantidad billetes de 50€: ");
	cincuenta=sc.nextInt();
	
	this.un_euro=un_euro+uno;
	this.dos_euros=dos_euros+dos;
	this.cinco_euros=cinco_euros+cinco;
	this.diez_euros=diez_euros+diez;
	this.veinte_euros=veinte_euros+veinte;
	this.cincuenta_euros=cincuenta_euros+cincuenta;
	
}
	
	
public  void acciones_menu(int accion) {
		Scanner sc=new Scanner(System.in);
		switch (accion) {
		case 1: saldo_por_moneda();
				saldo_total();
				break;
		case 2: ingresar();
			break;
		case 3: 
			System.out.println(" -----------------------");
			System.out.println("|        RETIRAR        |");
			System.out.println(" -----------------------");
			System.out.println("|   |                   |");
			System.out.println("| 1 |POR TIPO Y CANTIDAD|");
			System.out.println("|   | 					|");
			System.out.println("| 2 |POR CANTIDAD TOTAL |");
			System.out.println("|   |                   |");
			System.out.println("------------------------");
			int opcion=sc.nextInt();
			if (opcion==1) {
				System.out.println("Indique moneda(1-2-5-10-20-50): ");
				int moneda=sc.nextInt();
				System.out.println("Indique cantidad: ");
				int cantidad=sc.nextInt();
				retirar_por_moneda(moneda,cantidad);
			}
			if (opcion==2) {
			System.out.println("Indique cantidad: ");
			retirar_cantidad(sc.nextInt());
			}
			break;
		case 4:setcontrasenia();
		break;
		default:System.out.println("ERROR");
		break;
		}
	}
	
	
	
	

}
