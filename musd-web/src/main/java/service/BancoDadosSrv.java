package service;

import br.com.musd.administrativo.BancoDados;
import br.com.musd.administrativo.Master;
import dao.BancoDadosDAO;
import dao.MasterDAO;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by marcos on 24/06/15.
 */

@Stateless
public class BancoDadosSrv {

    @Inject
    private BancoDadosDAO bancoDadosDAO;

    public BancoDados getUm(Integer id) {
        return bancoDadosDAO.getUm(id, BancoDados.class);
    }

    public List<BancoDados> listarTodos(){
        return bancoDadosDAO.listar(BancoDados.class);
    }

    public void atualizar(BancoDados bancoDados)
    {
        bancoDadosDAO.atualizar(bancoDados);
    }

    public void salvar(BancoDados bancoDados)
    {
        bancoDadosDAO.salvar(bancoDados);
    }

}
