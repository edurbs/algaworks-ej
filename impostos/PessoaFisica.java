package impostos;

public class PessoaFisica extends Pessoa {

    private final double RECEITA_ANUAL_ISENCAO = 50000;
    private final double ALIQUOTA_IMPOSTO_RENDA = 0.20;
    private double receitaAnual;

    public PessoaFisica(String pessoa, double receitaAnual) {
        super(pessoa);
        this.receitaAnual = receitaAnual;
    }

    @Override
    public double calcularImpostos() {
        if (receitaAnual <= RECEITA_ANUAL_ISENCAO) {
            return 0;
        }
        return receitaAnual * ALIQUOTA_IMPOSTO_RENDA;

    }
}
