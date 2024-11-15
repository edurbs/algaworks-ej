package seguradora;

abstract public class VeiculoAutomotor implements BemSeguravel {
    private String modelo;
    private double valorMercado;
    private int anoFabricado;

    public VeiculoAutomotor(String modelo, double valorMercado, int anoFabricado) {
        this.modelo = modelo;
        this.valorMercado = valorMercado;
        this.anoFabricado = anoFabricado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAnoFabricado() {
        return anoFabricado;
    }

    public void setAnoFabricado(int anoFabricado) {
        this.anoFabricado = anoFabricado;
    }

}
