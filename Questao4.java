package lista2;

import java.util.Scanner;

	public class Questao4 {
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int valor1, valor2, valor3, maior;
		System.out.printf("Digite um valor: ");
		valor1 = leia.nextInt();
		System.out.printf("Digite outro valor: ");
		valor2 = leia.nextInt();
		System.out.printf("Digite mais um valor: ");
		valor3 = leia.nextInt();
		
		if(valor1 > valor2) {
			maior = valor1;
		} else {
			maior = valor2;
		}
		
		if (maior > valor3) {
			maior = maior;
		} else {
			maior = valor3;
		}
		
		System.out.println(maior);	
	}
}