package modulo01_08;

import java.util.Scanner;

public class VerificaAnoBissexto {

	public static void main (String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o ano: ");
		int ano = sc.nextInt();
	
		boolean bissexto = ano % 400 == 0 
			|| ( ano % 4 == 0 && ano % 100 != 0);
				
		System.out.printf("O ano %s � bissexto? %b", ano, bissexto);
	
	}

}