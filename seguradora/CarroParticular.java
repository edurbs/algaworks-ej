package seguradora;

public class CarroParticular extends VeiculoAutomotor {

    public CarroParticular(String modelo, double valorMercado, int anoFabricado) {
        super(modelo, valorMercado, anoFabricado);
    }

    @Override
    public double calcularValorPremio() {
        double valorFinal = getValorMercado()*0.04;
        if(getAnoFabricado()<2000){
            valorFinal+=valorFinal*0.05;
        }
        return valorFinal;
    }

    @Override
    public String descrever() {
        return """
                Carro particular %s ano %d, avaliado em R$%,3.2f
                Prêmio: R$%,3.2f
                """.formatted(getModelo(), getAnoFabricado(), getValorMercado(), calcularValorPremio());
    }

}
