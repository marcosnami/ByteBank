package com.alura.bytebank.validator;

import com.alura.bytebank.model.Pagamento;
import com.alura.bytebank.model.Tipo;

import java.util.List;

public class ValidaPagamento {

    public void verificaTipoPagamento(Pagamento pagamento) {
        if (pagamento.getTipo().equals(Tipo.CREDITO)) {
            pagamento.setValor(pagamento.getValor() * 1.02);
        }
        if (pagamento.getTipo().equals(Tipo.DEBITO)) {
            pagamento.setValor(pagamento.getValor() * 1.001);
        }
    }

    public void verificaTipoPagamento(List<Pagamento> pagamentos) {
        for (Pagamento pagamento :
             pagamentos) {
            verificaTipoPagamento(pagamento);
        }
    }
}