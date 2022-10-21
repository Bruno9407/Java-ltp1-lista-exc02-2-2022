package lista2;

import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		float salario, emprestimo;
		float porcent;
		System.out.printf("Digite um valor: ");
		salario = leia.nextFloat();
		System.out.printf("Digite outro valor: ");
		emprestimo = leia.nextFloat();
		
		porcent =   emprestimo / salario;
		
		System.out.println(porcent);
		
		if (porcent <= 0.3f) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Negado");
		}
		
		
		
	}

}