package desafio12_15;

public record Holerite (String nome, String mesAno, double Salario) {
    public void imprimir(){
        System.out.println(this.toString());
    }
}
