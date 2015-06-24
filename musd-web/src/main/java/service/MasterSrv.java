package service;

import br.com.musd.administrativo.Master;
import dao.MasterDAO;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class MasterSrv {

    @Inject
    private MasterDAO masterDAO;

    public Master getUm(Integer id) {
        return masterDAO.getUm(id, Master.class);
    }

    public List<Master> listarTodos(){
        return masterDAO.listar(Master.class);
    }

    public void atualizar(Master master)
    {
        masterDAO.atualizar(master);
    }

    public void salvar(Master master)
    {
        masterDAO.salvar(master);
    }

}
