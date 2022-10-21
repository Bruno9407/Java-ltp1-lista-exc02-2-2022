package lista2;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		System.out.printf("Digite uma letra: ");
		String letra;
		letra = leia.next();
		char caso = letra.charAt(0);	
		
		switch(caso) {
			case 'a':
				System.out.printf("Vogal");
				break;
			case 'e':
				System.out.printf("Vogal");
				break;
			case 'i':
				System.out.printf("Vogal");
				break;
			case 'o':
				System.out.printf("Vogal");
				break;
			case 'u':
				System.out.printf("Vogal");
				break;
			default:
				System.out.printf("Consoante");
		}
	}

}