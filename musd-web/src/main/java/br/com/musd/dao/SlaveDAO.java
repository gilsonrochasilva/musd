package br.com.musd.dao;

import br.com.musd.administrativo.ModeloMigracao;
import br.com.musd.administrativo.Slave;
import br.com.musd.dao.common.DAO;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by gilson on 23/06/15.
 */
public class SlaveDAO extends DAO<Slave> {

    public List<Slave> listaPorModelo(ModeloMigracao modeloMigracao){
        Query query = getEm().createQuery("select s from Slave s where s.modeloMigracao = :modelo");
        query.setParameter("modelo",modeloMigracao);

        return query.getResultList();

    }
}
