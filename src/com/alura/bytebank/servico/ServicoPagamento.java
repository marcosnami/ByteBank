package com.alura.bytebank.servico;

import com.alura.bytebank.model.Pagamento;
import com.alura.bytebank.registrador.RegistroDePagamento;
import com.alura.bytebank.validator.ValidaPagamento;

import java.util.List;

/**
 * Created by MarcosNami on 7/21/2017.
 */
public class ServicoPagamento {

    RegistroDePagamento registroDePagamento = new RegistroDePagamento();

    public void registra(List<Pagamento> pagamentos) {
        ValidaPagamento validaPagamento = new ValidaPagamento();
        validaPagamento.verificaTipoPagamento(pagamentos);
        registroDePagamento.registra(pagamentos);
    }

    public void exibePagamentosEfetuados() {
        registroDePagamento.exibePagamentosEfetuados();
    }
}
