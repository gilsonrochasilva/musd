package br.com.musd.service;

import br.com.musd.administrativo.JanelaSincronizacao;
import br.com.musd.administrativo.ModeloMigracao;
import br.com.musd.dao.JanelaSincronizacaoDAO;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class JanelaSincronizacaoSrv {

    @Inject
    private JanelaSincronizacaoDAO janelaSincronizacaoDAO;

    public JanelaSincronizacao getUm(Integer id) {
        return janelaSincronizacaoDAO.getUm(id, JanelaSincronizacao.class);
    }

    public List<JanelaSincronizacao> lista(ModeloMigracao modeloMigracao){
        return janelaSincronizacaoDAO.listaPorModelo(modeloMigracao);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void atualizar(JanelaSincronizacao janelaSincronizacao)
    {
        janelaSincronizacaoDAO.atualizar(janelaSincronizacao);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void salvar(JanelaSincronizacao janelaSincronizacao) {
        if(janelaSincronizacao.getId() == null) {
            janelaSincronizacaoDAO.salvar(janelaSincronizacao);
        } else {
            janelaSincronizacaoDAO.atualizar(janelaSincronizacao);
        }
    }

}
