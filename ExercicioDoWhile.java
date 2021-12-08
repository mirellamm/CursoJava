package HelloWorld;

import java.util.Scanner;

/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE) */
public class ExercicioDoWhile  {

	public static void main(String[] args) {
		Scanner leia =new Scanner(System.in);
		int um,soma=0;
		do {
			System.out.println("digite o numero");
			um=leia.nextInt();
			soma=soma+um;
		} while(um!=0);
		System.out.println("a soma é "+soma);
	}

}
