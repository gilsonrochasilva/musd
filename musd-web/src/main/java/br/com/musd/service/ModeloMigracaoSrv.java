package br.com.musd.service;

import br.com.musd.administrativo.Host;
import br.com.musd.administrativo.Master;
import br.com.musd.administrativo.ModeloMigracao;
import br.com.musd.administrativo.Slave;
import br.com.musd.dao.MasterDAO;
import br.com.musd.dao.ModeloMigracaoDAO;
import br.com.musd.dao.SlaveDAO;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by marcos on 24/06/15.
 */

@Stateless
public class ModeloMigracaoSrv {

    @Inject
    private ModeloMigracaoDAO modeloMigracaoDAO;

    @Inject
    private MasterDAO masterDAO;

    @Inject
    private SlaveDAO slaveDAO;

    public ModeloMigracao getUm(Integer id) {
        return modeloMigracaoDAO.getUm(id, ModeloMigracao.class);
    }

    public List<ModeloMigracao> listarTodos(){
        return modeloMigracaoDAO.listar(ModeloMigracao.class);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void atualizar(ModeloMigracao modeloMigracao)
    {
        modeloMigracaoDAO.atualizar(modeloMigracao);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void salvar(ModeloMigracao modeloMigracao)
    {
        modeloMigracaoDAO.salvar(modeloMigracao);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void salvar(ModeloMigracao modeloMigracao, Host host) {
        if (modeloMigracao.getId() != null) {
           atualizar(modeloMigracao);
            if (host instanceof Master){
                ((Master) host).setModeloMigracao(modeloMigracao);
                masterDAO.atualizar((Master) host);
            }

        }else{
            salvar(modeloMigracao);
            if (host instanceof Master){
                ((Master) host).setModeloMigracao(modeloMigracao);
                masterDAO.salvar((Master) host);
            }
        }

        if(host instanceof Slave){
            ((Slave) host).setModeloMigracao(modeloMigracao);
            slaveDAO.salvar((Slave) host);
        }

    }

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void excluir(ModeloMigracao modeloMigracao){
        Master masterTemp = masterDAO.obterMasterPorMomelo(modeloMigracao);
        if (masterTemp != null) {
            masterDAO.remover(masterTemp.getId(),Master.class);
        }
        modeloMigracaoDAO.remover(modeloMigracao.getId(),ModeloMigracao.class);
    }
}
