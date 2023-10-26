// vitamina D
// recomendado > 20
// para grupo de risco 30 a 80

import java.util.Scanner;
public class CalculaVitaminaD {

	public static void main (String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Grupo de risco? ");
		boolean grupoRisco = sc.nextBoolean();
		
		System.out.print("Vitamina D: ");
		int nivel = sc.nextInt();
		
		boolean normal = (!grupoRisco && nivel > 20) || (grupoRisco && nivel > 30 && nivel < 80);
		
		System.out.printf("Nível normal? %b%n", normal);
	
	}

}