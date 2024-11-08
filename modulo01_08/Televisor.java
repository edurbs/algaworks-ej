package modulo01_08;

public class Televisor {
    public static void main(String[] args) {
        Tv tv = new Tv();

        // Não deveria mudar o volume e canal
        tv.mudarVolume(20);
        tv.mudarCanal(130);

        // Deveria mudar o volume e canal
        tv.mudarVolume(300);
        tv.mudarCanal(10);
    }

    public static class Tv {

        Integer canal = 130;
        Integer volume = 20;
    
        void mudarCanal(Integer novoCanal) {
            if (canal.equals(novoCanal)) {
                System.out.println("Novo canal é também o canal atual.");
            } else {
                canal = novoCanal;
                System.out.println("Canal alterado para " + canal);
            }
        }
    
        void mudarVolume(Integer novoVolume) {
            if (volume.equals(novoVolume)) {
                System.out.println("Novo volume "+novoVolume+" é também o volume atual. "+volume);
            } else {
                volume = novoVolume;
                System.out.println("Volume alterado para " + volume);
            }
        }
    }
}
