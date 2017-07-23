package com.alura.bytebank;

import com.alura.bytebank.io.LeitorCSV;
import com.alura.bytebank.io.LeitorXML;
import com.alura.bytebank.model.Pagamento;
import com.alura.bytebank.visualizador.OpcoesPagamento;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.List;

/**
 * Created by alex on 11/05/17.
 */
public class Principal {

//    static final Logger LOG = Logger.getLogger(Principal.class);

    static final Logger LOG = Logger.getLogger(Principal.class);

    public static void main(String[] args) throws IOException {
//        new OpcoesPagamento().mensagemDeBoasVindas();

        LeitorCSV leitor = new LeitorCSV();
        List<Pagamento> pagamentos = leitor.ler(1);
        for (Pagamento pagamento : pagamentos) {
            double valorBruto = pagamento.getValor();

            if (valorBruto > 100) {
                double valorComAcrescimo = valorBruto * 1.1;
                pagamento.setValor(valorComAcrescimo);
            }
            System.out.println(pagamento);
        }
    }
}
