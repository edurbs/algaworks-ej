package modulo10;

import java.util.Objects;

public class Participante {
    private String nome;
    private int saldoDePontosInicial;
    public Participante(String nome){
        this(nome, 10);
    }
    public Participante(String nome, int saldoDePontosInicial){
        Objects.requireNonNull(nome, "Nome não pode ser nulo");
        this.nome = nome;
        this.saldoDePontosInicial = saldoDePontosInicial;
    }
}