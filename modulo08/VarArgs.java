package modulo08;


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
