package unidad4;

import java.util.Scanner;

public class Cadenas2 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("intoduce una palabra o frase: ");
	
		String frase = sc.nextLine();
		
		frase.toLowerCase();
				
		StringBuilder invertida= new StringBuilder();
		
		
		for (int i=frase.length()-1;i>=0;i--) {
			invertida.append(frase.charAt(i));
			}
			
	System.out.println(invertida);
	}

	
	
}
