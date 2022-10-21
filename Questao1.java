package lista2;

import java.util.Scanner;

public class Questão1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int valor;
		System.out.printf("Digite um valor: ");
		valor = leia.nextInt();
		
		if(valor < 0) {
			valor = valor * -1;
			System.out.printf("Valor positivo: " + valor );
		} else {
			System.out.printf("Valor: " + valor );
		}
		
		
	}

}