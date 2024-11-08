package modulo01_08;

public class CalculadoraPesosDasCargas {

  public static void main(String[] args) {
    double pesoCarga1 = 1033.49;
    double pesoCarga2 = 849.88;

	double somaPesoCarga = pesoCarga1 + pesoCarga2;
	
    int pesoTotalCargas = (int) somaPesoCarga;

    // O resultado deve ser 1883
    System.out.println("Peso total das cargas: " + pesoTotalCargas);
  }

}