package lista2;

import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int valor1, valor2, valor3, media;
		System.out.printf("Digite um valor: ");
		valor1 = leia.nextInt();
		System.out.printf("Digite outro valor: ");
		valor2 = leia.nextInt();
		System.out.printf("Digite mais um valor: ");
		valor3 = leia.nextInt();
		
		media = (valor1 + valor2 + valor3) / 3;
	
		if(media >= 6) {
			System.out.printf(media + "Aprovado");
		} else {
			System.out.printf(media + "Reprovado");
		}
	}

}