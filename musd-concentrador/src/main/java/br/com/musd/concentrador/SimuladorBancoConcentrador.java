package br.com.musd.concentrador;

import br.com.musd.administrativo.Master;
import br.com.musd.administrativo.Slave;

/**
 * Created by gilson on 17/06/15.
 *
 * Simula os objetos sendo recuperados da camada de dados.
 */
public class SimuladorBancoConcentrador {

    private Slave slave;

    private Master master;

    private SimuladorBancoConcentrador simuladorBancoConcentrador;

    private SimuladorBancoConcentrador() {

    }

    public SimuladorBancoConcentrador getInstance() {
        if(simuladorBancoConcentrador == null) {
            simuladorBancoConcentrador = new SimuladorBancoConcentrador();
        }

        return simuladorBancoConcentrador;
    }
}
