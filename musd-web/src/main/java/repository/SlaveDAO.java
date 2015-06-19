package repository;

import br.com.musd.administrativo.Slave;
import dao.AbstractDAO;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by marcos on 17/06/15.
 */
public class SlaveDAO extends AbstractDAO<Slave> {

    @Inject
    SlaveRepository repositorio;

    @Override
    public void create(Slave object) {
        this.repositorio.insert(object);
    }

    @Override
    public void update(Slave object) {
        this.repositorio.update(object);
    }

    @Override
    public void remove(Slave object) {
        this.repositorio.delete(object);
    }

    @Override
    public List<Slave> findAll() {
        return this.repositorio.select();
    }
}
