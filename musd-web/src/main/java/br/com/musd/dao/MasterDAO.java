package br.com.musd.dao;

import br.com.musd.administrativo.Master;
import br.com.musd.administrativo.ModeloMigracao;
import br.com.musd.dao.common.DAO;

import javax.persistence.Query;

/**
 * Created by correa on 17/06/15.
 */
public class MasterDAO extends DAO<Master> {

    public Master obterMasterPorMomelo(ModeloMigracao modeloMigracao) {
        Query q = getEm()
                .createQuery(
                        "SELECT m FROM Master m WHERE m.modeloMigracao = :modeloMigracao");
        q.setParameter("modeloMigracao", modeloMigracao);
        try {
            return (Master) q.getSingleResult();
        } catch (Exception e) {
            return null;
        }

    }


}
