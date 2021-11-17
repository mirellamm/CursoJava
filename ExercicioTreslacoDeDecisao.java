package HelloWorld;
import java.util.Scanner;
public class ExercicioTreslacoDeDecisao {

	public static void main(String[] args) {
		//Faça um programa que receba três inteiros e diga qual deles é o maior.
		int num1,num2,num3,maior;
		Scanner leia=new Scanner (System.in);
		System.out.println("Entre com o primeiro numero");
		num1=leia.nextInt();
		System.out.println("Entre com o segundo numero");
		num2=leia.nextInt();
		System.out.println("Entre com terceiro numero");
		num3=leia.nextInt();
		maior=num1;
		if(maior<num2)
		{
			maior=num2;
		}
		if (maior<num3)
		{
			maior=num3;
		}
		System.out.println(" O maior numero é"+maior);
	}

}
