 package lista2;

import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		float altura, peso, imc;
		System.out.printf("Digite sua altura: ");
		altura = leia.nextFloat();
		System.out.printf("Digite seu peso: ");
		peso = leia.nextFloat();
		
		imc = peso / (altura * altura);
		
		System.out.println(imc);
		
		if (imc < 18.5) {
			System.out.println("Magreza");
			
		} else if(imc >= 18.5 && imc <= 24.9) {
			System.out.println("Normal");
			
		} else if(imc >= 25 && imc <= 29.9) {
			System.out.println("Sobrepeso");
			
		} else if(imc >= 30 && imc <= 99.9) {
			System.out.println("Obesidade");
			
		} else {
			System.out.println("Obesidade grave");	
		}
	}

}