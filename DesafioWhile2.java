import java.util.Scanner;
public class DesafioWhile2{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.printf("Digite um numero");
		int numero = sc.nextInt();
		int numeroInvertido=0;
		while (numero != 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }
		System.out.printf("Numero invertido: %d",numeroInvertido);
        
	}
}