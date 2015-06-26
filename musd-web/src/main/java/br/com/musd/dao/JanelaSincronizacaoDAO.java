package br.com.musd.dao;

import br.com.musd.administrativo.JanelaSincronizacao;
import br.com.musd.administrativo.ModeloMigracao;
import br.com.musd.dao.common.DAO;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by gilson on 23/06/15.
 */
public class JanelaSincronizacaoDAO extends DAO<JanelaSincronizacao> {

    public List<JanelaSincronizacao> listaPorModelo(ModeloMigracao modeloMigracao){
        Query query = getEm().createQuery("select j from JanelaSincronizacao j where j.modeloMigracao = :modelo");
        query.setParameter("modelo",modeloMigracao);

        return query.getResultList();

    }
}
