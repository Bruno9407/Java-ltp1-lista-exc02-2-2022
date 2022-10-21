package lista2;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int escolha, n1, n2;
		
		System.out.printf("Digite um valor: ");
		n1 = leia.nextInt();
		
		System.out.printf("Digite outro valor: ");
		n2 = leia.nextInt();
		
		System.out.printf("1 - Somar\n");
		System.out.printf("2 - Subtrair\n");
		System.out.printf("3 - Multiplicação\n");
		System.out.printf("4 - Divisão\n");
		System.out.printf("5 - Sair\n");
		
		System.out.printf("Oque deseja fazer? ");
		escolha = leia.nextInt();
		
		System.out.printf("Resultado: ");
		
		switch(escolha) {
            case 1:
                System.out.print(n1 + n2);
                break;
            case 2:
                System.out.print(n1 - n2);
                break;
            case 3:
                System.out.print(n1 * n2);
                break;
            case 4:
                System.out.print(n1 / n2);
                break;
            case 5:
                System.out.printf("Saindo");
                break;
            default:
                System.out.printf("Não tem essa opção mula!");
	    }
    }

}