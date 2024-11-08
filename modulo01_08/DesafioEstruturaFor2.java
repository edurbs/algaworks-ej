package modulo01_08;

import java.util.Scanner;
public class DesafioEstruturaFor2 {
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero inteiro positivo: ");
		int numero = sc.nextInt();
		
		boolean primo = true;
		
		if( numero == 1){
			primo = false;
		} else {
			for(int i = 2; i<numero; i++){
				if ( numero % i == 0) {				
					primo = false;
				} 
			}	
		}		
		
		if(primo){
			System.out.printf("O n�mero %d � primo", numero);
		}else{
			System.out.printf("O n�mero %d n�o � primo", numero);
		}
	}
}