package com.algaworks.financeiro;

import java.io.Serializable;

public class ContaPagar implements Serializable {
    private String descricao;
    private double valor;
    private String dataVencimento;
    private boolean pago;
    private Fornecedor fornecedor;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isPago() {
        return pago;
    }

    public boolean isPendente(){
        return !isPago();
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public void pagar() {
        if (isPago()) {
            throw new RuntimeException("Conta já está paga.");
        }
        this.pago = true;
    }

    public void cancelarPagamento() {
        if (isPendente()) {
            throw new RuntimeException("Conta não está paga");
        }
        this.pago = false;
    }

}
