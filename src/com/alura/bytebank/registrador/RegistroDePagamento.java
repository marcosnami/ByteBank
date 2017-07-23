package com.alura.bytebank.registrador;


import com.alura.bytebank.model.Pagamento;
import com.alura.bytebank.validator.ValidaPagamento;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 18/05/17.
 */
public class RegistroDePagamento {

    static final Logger LOG = Logger.getLogger(RegistroDePagamento.class);

    private final static List<Pagamento> PAGAMENTOS = new ArrayList<>();
    private final ValidaPagamento validaPagamento = new ValidaPagamento();

    public void registra(List<Pagamento> pagamentos) {
        for (int i = 0; i < pagamentos.size(); i++) {
            Pagamento pagamento = pagamentos.get(i);
            validaPagamento.verificaTipoPagamento(pagamento);
            salvaPagamento(pagamento);
        }
        //exibePagamentosEfetuados();
    }

    private void salvaPagamento(Pagamento pagamento) {
        PAGAMENTOS.add(pagamento);
        System.out.println("Pagamento realizado " + pagamento);
    }

    public void exibePagamentosEfetuados() {
        if (!PAGAMENTOS.isEmpty()) {
            System.out.println("Todos os pagamentos");
            for (int i = 0; i < PAGAMENTOS.size(); i++) {
                System.out.println(PAGAMENTOS.get(i));
            }
        } else {
            System.out.println("Não temos pagamentos");
        }
    }

}
