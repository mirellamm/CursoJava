package HelloWorld;

import java.util.Scanner;

public class Exercicio4LacosdeDecisao {

	public static void main(String[] args) {
		/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/
		int num;
		double total;
		Scanner leia=new Scanner (System.in);
		System.out.println("Qual numero");
		num=leia.nextInt();
		if(num%2==0)
		{
			total=Math.sqrt(num);
			System.out.println("Resultado"+total);
		}
		else
		{
			total=Math.pow(num,2);
			System.out.println("resultado"+total);
		}
		

	}

}
