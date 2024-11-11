package desafio1215;

public record Holerite (String nome, String mesAno, double Salario) {
    public void imprimir(){
        System.out.println(this.toString());
    }
}
