package impostos;

public class Principal {

    public static void main(String[] args) {
        var gestorDeImpostos = new GestorDeImpostos();
        var joao = new PessoaFisica("João da Silva", 45_00);
        var maria = new PessoaFisica("Maria Souza", 180_000);

        var barDoZe = new EmpresaSimples("Bar do Zé", 250_000, 160_000);
        var codeConsultoria = new EmpresaLucroReal("Code consultoria", 8_000_000, 6_000_000);

        gestorDeImpostos.adicionar(joao);
        gestorDeImpostos.adicionar(maria);
        gestorDeImpostos.adicionar(barDoZe);
        gestorDeImpostos.adicionar(codeConsultoria);

        System.out.printf("Total de impostos: %.2f", gestorDeImpostos.getValorTotalImpostos());
    }
}
