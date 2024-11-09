package br.com.algamilhas.pontuacao;

import java.util.Objects;

public class Participante {
    private String nome;
    private int saldoDePontosInicial;
    public Participante(String nome){
        this(nome, 10);
    }
    private Participante(String nome, int saldoDePontosInicial){
        Objects.requireNonNull(nome, "Nome não pode ser nulo");
        if(saldoDePontosInicial<0){
            throw new IllegalArgumentException("Saldo não pode ser negativo");
        }
        this.nome = nome;
        this.saldoDePontosInicial = saldoDePontosInicial;
    }

    public void creditarPontos(int pontos){
        this.saldoDePontosInicial+=pontos;
    }


}
