package br.com.musd.service;

import br.com.musd.administrativo.DadosConexao;
import br.com.musd.dao.DadosConexaoDAO;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by marcos on 24/06/15.
 */

@Stateless
public class DadosConexaoSrv {

    @Inject
    private DadosConexaoDAO dadosConexaoDAO;

    public DadosConexao getUm(Integer id) {
        return dadosConexaoDAO.getUm(id, DadosConexao.class);
    }

    public List<DadosConexao> listarTodos(){
        return dadosConexaoDAO.listar(DadosConexao.class);
    }

    public void atualizar(DadosConexao dadosConexao)
    {
        dadosConexaoDAO.atualizar(dadosConexao);
    }

    public void salvar(DadosConexao dadosConexao)
    {
        dadosConexaoDAO.salvar(dadosConexao);
    }

}
