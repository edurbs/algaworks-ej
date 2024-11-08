package modulo01_08;

import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Peso: ");
		double peso = scanner.nextDouble();

		System.out.print("Altura: ");
		double altura = scanner.nextDouble();

		

		scanner.nextLine();

		System.out.print("Nome: ");
		String nome = scanner.nextLine();

		double imc = peso / (altura * altura);

		System.out.printf("%s, seu IMC � %.2f", nome, imc);

	}

}