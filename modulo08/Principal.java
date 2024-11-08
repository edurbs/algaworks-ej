package modulo08;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Cardapio cardapio812 = new Cardapio();

        ItemCardapio item1 = new ItemCardapio();
        item1.descricao = "Rib Eye 500g";
        item1.preco = 95;

        ItemCardapio item2 = new ItemCardapio();
        item2.descricao = "Picanha 400g";
        item2.preco = 102.5;

        ItemCardapio item3 = new ItemCardapio();
        item3.descricao = "Batata frita 300g";
        item3.preco = 12;

//        cardapio812.adicionarItem(item1);
//        cardapio812.adicionarItem(item2);
//        cardapio812.adicionarItem(item3);

        cardapio812.imprimirItensCardapio(80, 150);

        //cardapio812.removerItem(0);
        System.out.println("---");

        cardapio812.imprimirItensCardapio(0, 150);
    }

}

class Cardapio {

    ArrayList<ItemCardapio> itens = new ArrayList<>();

    void adicionarItem(ItemCardapio item) {
        itens.add(item);
    }

    void removerItem(int indice) {
        itens.remove(indice);
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        ArrayList<ItemCardapio> itensEncontrados = consultarItensPorPreco(precoMinimo, precoMaximo);
        for (ItemCardapio item : itens) {
            item.imprimir();
        }
    }

    private ArrayList<ItemCardapio> consultarItensPorPreco(double precoMinimo, double precoMaximo) {
        ArrayList<ItemCardapio> itensEncontrados = new ArrayList<>();
        for(ItemCardapio item: itens){
            if(item.possuiPrecoEntre(precoMinimo, precoMaximo)){
                itensEncontrados.add((item));
            }
        }
        return itensEncontrados;
    }

}

class ItemCardapio {

    String descricao;
    double preco;

    boolean possuiPrecoEntre(double precoMinimo, double precoMaximo) {
        return preco >= precoMinimo && preco <= precoMaximo;
    }

    void imprimir() {
        System.out.printf("%s x R$%.2f%n", descricao, preco);
    }

}