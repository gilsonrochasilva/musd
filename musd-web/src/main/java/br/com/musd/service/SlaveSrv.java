package br.com.musd.service;

import br.com.musd.administrativo.ModeloMigracao;
import br.com.musd.administrativo.Slave;
import br.com.musd.dao.SlaveDAO;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class SlaveSrv {

    @Inject
    private SlaveDAO slaveDAO;


    public List<Slave> lista(){
        return slaveDAO.listar(Slave.class);
    }

    public List<Slave> lista(ModeloMigracao modeloMigracao){
        return slaveDAO.listaPorModelo(modeloMigracao);
    }





}
