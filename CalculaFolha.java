import java.util.Scanner;

public class CalculaFolha {

	public static void main (String[] args){
	
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Valor por hora: ");
		double valorHora = sc.nextDouble();
		
		System.out.print("Horas trabalhadas: ");
		int horasTrabalhadas = sc.nextInt();
		
		System.out.print("Descontos: ");
		double descontos = sc.nextDouble();
		
		double salarioBruto = valorHora * horasTrabalhadas;
		double salarioLiquido = salarioBruto - descontos;
		
		System.out.println("Folha de pagamento de "+nome);
		System.out.printf("%s horas x R$%.2f = R$%.2f%n", horasTrabalhadas, valorHora, salarioBruto );
		System.out.printf("Descontos: R$%.2f%n", descontos);
		System.out.printf("Total devido: R$%.2f%n", salarioLiquido);
	
	}

}