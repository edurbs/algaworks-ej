package modulo08;

/*
 * Implemente um método de uma classe para calcular a média de números do tipo double.
 * Este método deve exigir no mínimo 2 números para o cálculo, sendo ilimitada a quantidade máxima.
 * Use varargs para conseguir isso, usando as boas práticas que você aprendeu.
 */
public class VarArgs {
    public static void main(String[] args) {
        double media = calculaMedia(10,15,20,30);
        System.out.println(media);
    }

    public static double calculaMedia(double primeiro, double segundo, double... demais){
        double soma = primeiro+segundo;
        for (double valor : demais) {
            soma+=valor;
        }
        return soma/(demais.length+2);
    }
}
