package unidad5;

import java.util.Scanner;

public class Principa_hucha {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		boolean menu=true;
		int opcion_menu=0;
		int opcion_hucha_nueva=0;
		 
		System.out.println(" -----------------------");
		System.out.println("|      HUCHA NUEVA      |");
		System.out.println(" -----------------------");
		System.out.println("| 1 | HUCHA VACIA       |");
		System.out.println("| 2 | HUCHA POR TIPOS   |");
		System.out.println("| 3 | HUCHA POR TOTAL   |");
		System.out.println("|   |                   |");
		System.out.println("|   |                   |");
		System.out.println("------------------------");
		System.out.println("| 5 | SALIR             |");
		System.out.println("------------------------");
		
		opcion_hucha_nueva=sc.nextInt();
		
		if(opcion_hucha_nueva==1) {
			Hucha hucha=new Hucha();
			while (opcion_menu!=5) {
				opcion_menu=menu();
				hucha.acciones_menu(opcion_menu);
			}
		}
		if (opcion_hucha_nueva==2) {
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
			Hucha hucha=new Hucha(uno,dos,cinco,diez,veinte,cincuenta);
			while (opcion_menu!=5) {
				opcion_menu=menu();
				hucha.acciones_menu(opcion_menu);
			}
		}
		if (opcion_hucha_nueva==3) {
			System.out.println("Total a INGRESAR: ");
			int total=sc.nextInt();
			Hucha hucha=new Hucha(total);
			while (opcion_menu!=5) {
				opcion_menu=menu();
				hucha.acciones_menu(opcion_menu);
			}
		}
		
		
		
		
	}
	
	

	public static int menu () {
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" -----------------------");
		System.out.println("|         MENU          |");
		System.out.println(" -----------------------");
		
		System.out.println("| 1 | CONSULTAR SALDO   |");
		System.out.println("| 2 | INGRESAR          |");
		System.out.println("| 3 | RETIRAR           |");
		System.out.println("| 4 | CAMBIAR CONTRASEÑA|");
		System.out.println("------------------------");
		System.out.println("| 5 | SALIR             |");
		System.out.println("------------------------");
		int opcion_menu=sc.nextInt();
		return (opcion_menu);
	}
	{
	
		
		
		
		
	}

}
