import java.util.Scanner;
public class DesafioEstruturaFor2 {
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro positivo: ");
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
			System.out.printf("O número %d é primo", numero);
		}else{
			System.out.printf("O número %d não é primo", numero);
		}
	}
}