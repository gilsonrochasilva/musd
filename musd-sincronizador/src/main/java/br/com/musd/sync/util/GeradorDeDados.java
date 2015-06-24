package br.com.musd.sync.util;

import br.com.musd.sincronizacao.Pacote;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by domingos on 17/06/15.
 */
public class GeradorDeDados {

    public static List<Pacote> geradorDePacote(Integer qtd){
        List<Pacote> pacotes = new ArrayList<Pacote>();

        Random geradorNumeros = new Random();

        for(int i = 1; i < qtd; i++){
            Pacote pacote = new Pacote();
            pacote.setDados(String.valueOf(geradorNumeros.nextInt()*i));
            pacote.setChecksun(String.valueOf(geradorNumeros.nextInt() * i));

            pacotes.add(pacote);
        }

        return pacotes;
    }
}
