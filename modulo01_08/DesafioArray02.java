package modulo01_08;

import java.util.Arrays;

public class DesafioArray02 {

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
        //cardapio812.imprimirItensCardapio();
        System.out.println("---");

        cardapio812.imprimirItensCardapio(80, 150);

        cardapio812.removerItem(0);
        System.out.println("---");

        cardapio812.imprimirItensCardapio(0, 150);
    }

}

class Cardapio {

    ItemCardapio812[] itens;

    void adicionarItem(ItemCardapio812 item) {
        if(itens==null){
            itens = new ItemCardapio812[1];
            itens[0]=item;
        }else {
            ItemCardapio812[] copy = Arrays.copyOf(itens, itens.length + 1);
            copy[copy.length - 1] = item;
            itens = copy;
        }
    }

    void removerItem(int indice) {
        ItemCardapio812[] copy = new ItemCardapio812[itens.length-1];
        System.arraycopy(itens, indice+1, copy, 0, itens.length-1);
        itens = copy;
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        for(ItemCardapio812 item : itens){
            if(item.preco>=precoMinimo & item.preco<=precoMaximo){
                System.out.println(item);
            }
        }
    }

    void imprimirItensCardapio(){
        for(ItemCardapio812 itemCardapio812 : itens){
            System.out.println(itemCardapio812.toString());
        }
    }

}

class ItemCardapio {

    String descricao;
    double preco;

    @Override
    public String toString() {
        return "ItemCardapio812{" +
                "descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}