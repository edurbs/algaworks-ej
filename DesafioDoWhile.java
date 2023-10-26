import java.util.Scanner;
public class DesafioDoWhile{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int somaImpar = 0;
		int somaPar = 0;
		boolean continua = true;
		do{
			System.out.printf("Digite um numero: ");
			int numero = sc.nextInt();
			if(numero % 2 == 0){
				somaPar += numero;
			}else{
				somaImpar += numero;
			}
			System.out.printf("Continua? 1=Sim, 2=Nao");
			int resposta = sc.nextInt();
			continua = resposta == 1;
		}while (continua);
		System.out.printf("Soma dos pares: %d.\nSoma dos impares: %d.", somaPar, somaImpar);
	}
}