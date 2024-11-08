package modulo01_08;

import java.util.ArrayList;

public class Desafio812 {

    public static void main(String[] args) {
        Cardapio812 cardapio812 = new Cardapio812();

        ItemCardapio812 item1 = new ItemCardapio812();
        item1.descricao = "Rib Eye 500g";
        item1.preco = 95;

        ItemCardapio812 item2 = new ItemCardapio812();
        item2.descricao = "Picanha 400g";
        item2.preco = 102.5;

        ItemCardapio812 item3 = new ItemCardapio812();
        item3.descricao = "Batata frita 300g";
        item3.preco = 12;

        cardapio812.adicionarItem(item1);
        cardapio812.adicionarItem(item2);
        cardapio812.adicionarItem(item3);

        cardapio812.imprimirItensCardapio(80, 150);

        cardapio812.removerItem(0);
        System.out.println("---");

        cardapio812.imprimirItensCardapio(0, 150);
    }

}

class Cardapio812 {

    ArrayList<ItemCardapio812> itens = new ArrayList<>();

    void adicionarItem(ItemCardapio812 item) {
        itens.add(item);
    }

    void removerItem(int indice) {
        itens.remove(indice);
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        for (ItemCardapio812 item : itens) {
            if (item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
                item.imprimir();
            }
        }
    }

}

class ItemCardapio812 {

    String descricao;
    double preco;

    boolean possuiPrecoEntre(double precoMinimo, double precoMaximo) {
        return preco >= precoMinimo && preco <= precoMaximo;
    }

    void imprimir() {
        System.out.printf("%s x R$%.2f%n", descricao, preco);
    }

}