package HelloWorld;
import java.util.Scanner;

public class PrimeiroExercicio {

	public static void main(String[] args) {
		/*1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/
		Scanner leia=new Scanner(System.in);
		int anos,meses,dias,total;
		System.out.println("quantos anos voce tem");
		anos=leia.nextInt();
		System.out.println("quanto meses voc� tem");
		meses=leia.nextInt();
		System.out.println("quantos dias voc� tem tem");
		dias=leia.nextInt();
		//Um ano igual a 365 dias um m�s igual a 30 dias
		total=(365*anos)+(30*meses)+dias;
		System.out.println("voc� tem "+total+" dias ");
		
		

	} 

}
