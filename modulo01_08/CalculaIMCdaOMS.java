package modulo01_08;

import java.util.Scanner;

public class CalculaIMCdaOMS {

	public static void main (String[] args){
	
		// IMC = peso / (altura x altura).
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Peso: ");
		int peso = sc.nextInt();
		
		System.out.print("Altura: ");
		float altura = sc.nextFloat();	

		sc.nextLine();
		
		System.out.print("Sexo (M/F): ");
		String sexo = sc.nextLine();
		
		float imc = peso / (altura * altura);
		
		String f1 = "Abaixo do pexo";
		String f2 = "No peso ideal";
		String f3 = "Um pouco acima do peso";
		String f4 = "Acima do peso ideal";
		String f5 = "Obsedo";
		
		String msg = "";
		
		if(sexo.equals("M")){
			if(imc<20.7){
				msg = f1;
			}else if(imc>20.7 && imc<=26.4){
				msg = f2;
			}else if(imc>26.4 && imc<=27.8){
				msg = f3;
			}else if(imc>27.8 && imc<=31.1){
				msg = f4;
			}else{
				msg = f5;
			}			
		}else if (sexo.equals("F")){			
			if(imc<19.1){
				msg = f1;
			}else if(imc>19.1 && imc<=25.8){
				msg = f2;
			}else if(imc>25.8 && imc<=27.3){
				msg = f3;
			}else if(imc>27.3 && imc<=32.3){
				msg = f4;
			}else{
				msg = f5;
			}
		}
		
		System.out.printf("IMC %.2f - condicao: %s", imc, msg);
	}
	

}