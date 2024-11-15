package seguradora;

public class Caminhao extends VeiculoAutomotor {

    private int quantidadeEixos;

    public Caminhao(String modelo, double valorMercado, int anoFabricado, int quantidadeEixos){
        super(modelo, valorMercado, anoFabricado);
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularValorPremio() {
        double valorFinal = getValorMercado()*0.02;
        valorFinal += quantidadeEixos*50;
        return valorFinal;
    }

    @Override
    public String descrever() {
        return """
                Caminhao %s ano %d, %d eixos, avaliado em R$%,3.2f
                Prêmio: R$%,3.2f
                """.formatted(getModelo(), getAnoFabricado(), quantidadeEixos, getValorMercado(),calcularValorPremio());
    }

}
