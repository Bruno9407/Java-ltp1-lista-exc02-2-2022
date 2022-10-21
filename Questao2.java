package lista2;

import java.util.Scanner;

public class Questão2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		System.out.printf("Digite um valor: ");
		int valor;
		valor = leia.nextInt();
		
		if (valor % 2 == 0) {
			System.out.printf("Valor é par");
		} else {
			System.out.printf("Valor é impar");
		}
		
	}

}