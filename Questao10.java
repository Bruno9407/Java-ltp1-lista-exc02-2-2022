package lista2;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		System.out.printf("Pense em um número...\n");
		
		System.out.printf("Esse número é maior que 4? [s/n]\n");
		
		char esco = leia.next().charAt(0);
		
		if(esco == 's') { 
			System.out.printf("Esse número é igual ou maior que 7? [s/n]\n");
			esco = leia.next().charAt(0);
			if(esco == 's') { 
				System.out.printf("Seu numero é impar? [s/n]\n");
				esco = leia.next().charAt(0);
				if(esco == 's') { 
					System.out.printf("Seu numero é 7");
				} else {
					System.out.printf("Seu numero é 8");
				}
			} else {
				System.out.printf("Seu numero é impar? [s/n]\n");
				esco = leia.next().charAt(0);
				if(esco == 's') {
					System.out.printf("Seu numero é 5");
				} else {
					System.out.printf("Seu numero é 6");
				}
			}
		} else {	
			System.out.printf("Esse número é igual ou maior que 3? [s/n]\n");
			esco = leia.next().charAt(0);
			if(esco == 's') { 
				System.out.printf("Seu numero é impar? [s/n]\n");
				esco = leia.next().charAt(0);
				if(esco == 's') { 
					System.out.printf("Seu numero é 3");
				} else {
					System.out.printf("Seu numero é 4");
				}
			} else {
				System.out.printf("Seu numero é impar? [s/n]\n");
				esco = leia.next().charAt(0);
				if(esco == 's') { 
					System.out.printf("Seu numero é 1");
				} else {
					System.out.printf("Seu numero é 2");
				}				
			}
		}
	}
}