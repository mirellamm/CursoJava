package HelloWorld;
import java.util.Scanner;
public class ExercicioDois {

	public static void main(String[] args) {
		Scanner leia=new Scanner (System.in);
		int idade,anos,meses,dias;
		System.out.println("qual é a sua idade em dias");
		idade=leia.nextInt();
		anos=idade/365;
		meses=(idade%365)/30;
		dias=(idade%365)%30;
		System.out.println("Você tem"+anos+"anos");
		System.out.println("você tem"+meses+"meses");
		System.out.println("você tem"+dias+"dias");
		
				
		
		
	
	} 
	/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
	expressa em anos, meses e dias.*/
	
	

	

}
