package seguradora;

public class ImovelResidencial implements BemSeguravel {

    private double valorMercado;
    private int areaConstruida;

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(int areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    public ImovelResidencial(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    @Override
    public double calcularValorPremio() {
        return valorMercado * 0.001 + areaConstruida*0.03;
    }

    @Override
    public String descrever() {
        return """
                Imóvel residencial com %dm² de área construída, avalidado em R$%,3.2f
                Prêmio: R$%,3.2f
                """.formatted(areaConstruida, valorMercado, calcularValorPremio());
    }
}
