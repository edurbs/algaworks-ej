package banco;

import java.util.Random;
import java.util.RandomAccess;
import java.util.random.RandomGenerator;

public class Principal2 {

    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("123");
        ContaCorrente conta2 = new ContaCorrente("987");

        conta1.ativar();
        conta1.depositar(1_000);


        conta1.transferir(conta2, 500);
        conta1.transferir(conta1, 500);

        System.out.printf("Saldo da conta 1: %.2f%n", conta1.getSaldo());
        System.out.printf("Saldo da conta 2: %.2f%n", conta2.getSaldo());
    }

}
