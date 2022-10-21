package lista2;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		System.out.printf("Digite um valor: ");
		int valor;
		valor = leia.nextInt();
		
		if (valor >= 0 && valor <= 10) {
			System.out.printf("Valor está entre 0 e 10");
		} else {
			System.out.printf("Valor não está entre 0 e 10");
		}
		
		
		
	}

}