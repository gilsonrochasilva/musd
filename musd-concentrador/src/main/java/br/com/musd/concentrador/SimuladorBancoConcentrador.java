package br.com.musd.concentrador;

import br.com.musd.administrativo.Master;
import br.com.musd.administrativo.ModeloMigracao;
import br.com.musd.administrativo.Slave;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gilson on 17/06/15.
 *
 * Simula os objetos sendo recuperados da camada de dados.
 */
public class SimuladorBancoConcentrador {

    private List<ModeloMigracao> modelosMigracao;

    private static SimuladorBancoConcentrador simuladorBancoConcentrador;

//    private SimuladorBancoConcentrador() {
//        Slave slave = new Slave();
//        slave.setPorta(9000);
//        slave.setInstancia("slave");
//        slave.setIp("127.0.0.1");
//        slave.setId(1001);
//
//        List<Slave> slaves = new ArrayList<Slave>();
//        slaves.add(slave);
//
//        Master master = new Master();
//        master.setPortaMaxima(9001);
//        master.setPortaMinima(9000);
//        master.setPortaOuvinte(9000);
//        master.setId(2001);
//        master.setInstancia("master");
//        master.setIp("127.0.0.1");
//
//        ModeloMigracao modeloMigracao = new ModeloMigracao();
//        modeloMigracao.setId(30001);
//        modeloMigracao.setNome("Modelo Demostração");
//        modeloMigracao.setMaster(master);
//        modeloMigracao.setSlaves(slaves);
//
//        modelosMigracao = new ArrayList<ModeloMigracao>();
//        modelosMigracao.add(modeloMigracao);
//    }
//
//    public List<ModeloMigracao> getModelosMigracao() {
//        return modelosMigracao;
//    }
//
//    public static SimuladorBancoConcentrador getInstance() {
//        if(simuladorBancoConcentrador == null) {
//            simuladorBancoConcentrador = new SimuladorBancoConcentrador();
//        }
//
//        return simuladorBancoConcentrador;
//    }
}
