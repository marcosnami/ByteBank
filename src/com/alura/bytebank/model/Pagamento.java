package com.alura.bytebank.model;

import java.time.LocalDate;

/**
 * Created by alex on 18/05/17.
 */
public class Pagamento {

    private String descricao;
    private Tipo tipo;
    private double valor;
    private LocalDate data;

    public Pagamento(Tipo tipo, double valor, String descricao) {
        this.tipo = tipo;
        this.valor = valor;
        this.descricao = descricao;
        this.data = LocalDate.now();
    }

    public Tipo getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "descricao='" + descricao + '\'' +
                ", tipo=" + tipo +
                ", valor=" + valor +
                ", data=" + data +
                '}';
    }
}
