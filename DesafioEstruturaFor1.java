import java.util.Scanner;
public class DesafioEstruturaFor1 {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		for(int i = 1; i<=3 ; i++){			
			System.out.printf("Digite o número #%d: ", i);
			int numero = sc.nextInt();
			if(numero % 2 == 0){
				soma += numero;
			}else{
				System.out.println("Número ignorado");
			}			
		}
		System.out.printf("Soma dos números: %d", soma);
	}
}