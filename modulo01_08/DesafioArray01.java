package modulo01_08;//1) Refatore o código da classe Calendario, substuindo o switch expression
// por uma lógica usando arrays, sem usar qualquer tipo de estrutura condicional, como switch e if.

public class DesafioArray01 {

    static String obterNomeMes(int numeroMes) {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return meses[numeroMes-1];
    }

    public static void main(String[] args) {
        String mes = DesafioArray01.obterNomeMes(9);

        System.out.println(mes);
    }

}