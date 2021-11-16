package HelloWorld;
import java.util.Scanner;

public class PrimeiroExercicio {

	public static void main(String[] args) {
		/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/
		Scanner leia=new Scanner(System.in);
		int anos,meses,dias,total;
		System.out.println("quantos anos voce tem");
		anos=leia.nextInt();
		System.out.println("quanto meses você tem");
		meses=leia.nextInt();
		System.out.println("quantos dias você tem tem");
		dias=leia.nextInt();
		//Um ano igual a 365 dias um mês igual a 30 dias
		total=(365*anos)+(30*meses)+dias;
		System.out.println("você tem "+total+" dias ");
		
		

	} 

}
