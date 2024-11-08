package modulo01_08;

import java.util.Scanner;
public class DesafioWhile1{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		while (soma<100){
			System.out.printf("Digite um numero inteiro: ");
			int numero = sc.nextInt();
			soma += numero;
		}
		System.out.printf("Soma dos numeros: %s", soma);
	}
}