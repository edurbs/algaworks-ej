package modulo01_08;

import java.util.Scanner;
public class DesafioEstruturaFor1 {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		for(int i = 1; i<=3 ; i++){			
			System.out.printf("Digite o n�mero #%d: ", i);
			int numero = sc.nextInt();
			if(numero % 2 == 0){
				soma += numero;
			}else{
				System.out.println("N�mero ignorado");
			}			
		}
		System.out.printf("Soma dos n�meros: %d", soma);
	}
}