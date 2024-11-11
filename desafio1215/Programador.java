package desafio1215;

public class Programador extends Funcionario {

    private double valorBonus;

    public Programador(String nome, double valorHora){
        super(nome, valorHora);
    }

    public double getValorBonus() {
        return valorBonus;
    }

    public void setValorBonus(double valorBonus) {
        this.valorBonus = valorBonus;
    }

    @Override
    public String toString() {
        return "Programador [valorBonus=" + valorBonus + ", getNome()=" + getNome() + ", getValorHora()="
                + getValorHora() + "]";
    }

    @Override
    public final double calcularSalario(int horasTrabalhadas){
        return super.calcularSalario(horasTrabalhadas)+valorBonus;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(valorBonus);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Programador other = (Programador) obj;
        if (Double.doubleToLongBits(valorBonus) != Double.doubleToLongBits(other.valorBonus))
            return false;
        return true;
    }

    
}
