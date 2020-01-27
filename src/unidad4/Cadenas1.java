package unidad4;

import java.util.Scanner;

public class Cadenas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("introduce cadena:");
		Scanner sc = new Scanner(System.in);
		String cadena = sc.nextLine();
		cadena.toLowerCase();
		
		
		int vocal_a=-1;
		int vocal_e=-1;
		int vocal_i=-1;
		int vocal_o=-1;
		int vocal_u=-1;
		
		for (int i=0;i<cadena.length();i++) {
			//if (cadena.charAt(i)=='a') {
				//vocal_a++;
			//}
			switch (cadena.charAt(i)) {
			case 'a':
				vocal_a++;
				break;
			case 'e':
				vocal_e++;
				break;
			case 'i':
				vocal_i++;
				break;
			case 'o':
				vocal_o++;
				break;
			case 'u':
				vocal_u++;
				break;
						
			}
		}
		if (vocal_a>0) {
			System.out.println("se repite "+ vocal_a+" veces la vocal \"a\"");
			}
		if (vocal_e>0) {
			System.out.println("se repite "+ vocal_e+" veces la vocal e");
			}
		if (vocal_i>0) {
			System.out.println("se repite "+ vocal_i+" veces la vocal i");
			}
		if (vocal_o>0) {
			System.out.println("se repite "+ vocal_o+" veces la vocal o");
			}
		if (vocal_u>0) {
			System.out.println("se repite "+ vocal_u+" veces la vocal u");
			}
		
	}

}
