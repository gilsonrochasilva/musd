package br.com.musd.service;

import br.com.musd.administrativo.ModeloMigracao;
import dao.ModeloMigracaoDAO;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by marcos on 24/06/15.
 */

@Stateless
public class ModeloMigracaoSrv {

    @Inject
    private ModeloMigracaoDAO modeloMigracaoDAO;

    public ModeloMigracao getUm(Integer id) {
        return modeloMigracaoDAO.getUm(id, ModeloMigracao.class);
    }

    public List<ModeloMigracao> listarTodos(){
        return modeloMigracaoDAO.listar(ModeloMigracao.class);
    }

    public void atualizar(ModeloMigracao modeloMigracao)
    {
        modeloMigracaoDAO.atualizar(modeloMigracao);
    }

    public void salvar(ModeloMigracao modeloMigracao)
    {
        modeloMigracaoDAO.salvar(modeloMigracao);
    }

}
