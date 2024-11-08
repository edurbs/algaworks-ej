package modulo01_08;

public class TesteTernario {

	public static void main (String[] args){
	
		char tipoNF = 'P'; // P produto, S serviço
		
		double valorNF = 1000.10;
		
		double taxa = tipoNF == 'P' ? 0.075 : 0.15;		
		double imposto = valorNF * taxa;
		
		double valorTotalNF = valorNF + imposto;
		
		System.out.println(valorTotalNF);
	
	}
}