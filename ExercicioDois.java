package HelloWorld;
import java.util.Scanner;
public class ExercicioDois {

	public static void main(String[] args) {
		Scanner leia=new Scanner (System.in);
		int idade,anos,meses,dias;
		System.out.println("qual � a sua idade em dias");
		idade=leia.nextInt();
		anos=idade/365;
		meses=(idade%365)/30;
		dias=(idade%365)%30;
		System.out.println("Voc� tem"+anos+"anos");
		System.out.println("voc� tem"+meses+"meses");
		System.out.println("voc� tem"+dias+"dias");
		
				
		
		
	
	} 
	/*2. Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
	expressa em anos, meses e dias.*/
	
	

	

}
