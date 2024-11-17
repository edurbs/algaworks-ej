package seguradora;

public class Principal {

    public static void main(String[] args) {

        var servicoPropostaSeguro = new ServicoPropostaSeguro();

        var carro = new CarroParticular("HR-V", 150_000, 2022);
        var caminhao = new Caminhao("Actros", 780_000, 2021, 4);
        var imovel = new ImovelResidencial(2_300_000, 320);

        servicoPropostaSeguro.emitir(carro);
        servicoPropostaSeguro.emitir(caminhao);
        servicoPropostaSeguro.emitir(imovel);
    }

}
