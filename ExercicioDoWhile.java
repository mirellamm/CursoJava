package HelloWorld;

import java.util.Scanner;

/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
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
		System.out.println("a soma � "+soma);
	}

}
