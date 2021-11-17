package HelloWorld;

import java.util.Scanner;

public class Exercicio4LacosdeDecisao {

	public static void main(String[] args) {
		/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/
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
