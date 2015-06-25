package br.com.musd.service;

import br.com.musd.administrativo.JanelaSincronizacao;
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

    public JanelaSincronizacao obterPorId(Integer id) {
        return janelaSincronizacaoDAO.getUm(id, JanelaSincronizacao.class);
    }

    public List<JanelaSincronizacao> obterTodos(){
        return janelaSincronizacaoDAO.listar(JanelaSincronizacao.class);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void atualizar(JanelaSincronizacao janelaSincronizacao)
    {
        janelaSincronizacaoDAO.atualizar(janelaSincronizacao);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void salvar(JanelaSincronizacao janelaSincronizacao) {
        salvar(janelaSincronizacao);
    }

}
