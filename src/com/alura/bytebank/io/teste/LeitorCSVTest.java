package com.alura.bytebank.io.teste;

import com.alura.bytebank.io.LeitorCSV;
import com.alura.bytebank.model.Pagamento;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by MarcosNami on 7/21/2017.
 */
class LeitorCSVTest {

    @Test
    void pagamentoDeAbril() throws IOException {
        LeitorCSV leitorCSV = new LeitorCSV();
        List<Pagamento> pagamentos = leitorCSV.ler(1);
        assertEquals(5, pagamentos.size());
    }

    @Test
    void pagamentoDeMaio() throws IOException {
        LeitorCSV leitorCSV = new LeitorCSV();
        List<Pagamento> pagamentos = leitorCSV.ler(3);
        assertEquals(5, pagamentos.size());
    }

    @Test
    void pagamentoDeJunho() throws IOException {
        LeitorCSV leitorCSV = new LeitorCSV();
        List<Pagamento> pagamentos = leitorCSV.ler(2);
        assertEquals(5, pagamentos.size());
    }

}