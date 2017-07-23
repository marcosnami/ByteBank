package com.alura.bytebank.io;

import com.alura.bytebank.model.Pagamento;

import java.io.IOException;
import java.util.List;

/**
 * Created by MarcosNami on 7/21/2017.
 */
public class LeitorXML extends Leitor implements LeitorPagamento {
    @Override
    public List<Pagamento> ler(int codigo) throws IOException {
        return null;
    }
}
