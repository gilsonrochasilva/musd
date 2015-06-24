package service;

import br.com.musd.administrativo.DadosConexao;
import br.com.musd.administrativo.JanelaSincronizacao;
import dao.DadosConexaoDAO;
import dao.JanelaSincronizacaoDAO;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by marcos on 24/06/15.
 */

@Stateless
public class JanelaSincronizacaoSrv {

    @Inject
    private JanelaSincronizacaoDAO janelaSincronizacaoDAO;

    public JanelaSincronizacao getUm(Integer id) {
        return janelaSincronizacaoDAO.getUm(id, JanelaSincronizacao.class);
    }

    public List<JanelaSincronizacao> listarTodos(){
        return janelaSincronizacaoDAO.listar(JanelaSincronizacao.class);
    }

    public void atualizar(JanelaSincronizacao janelaSincronizacao)
    {
        janelaSincronizacaoDAO.atualizar(janelaSincronizacao);
    }

    public void salvar(JanelaSincronizacao janelaSincronizacao)
    {
        janelaSincronizacaoDAO.salvar(janelaSincronizacao);
    }

}
