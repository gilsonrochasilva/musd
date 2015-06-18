package dao;

import br.com.musd.administrativo.Master;
import repository.MasterRepository;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by correa on 17/06/15.
 */
public class MasterDAO extends AbstractDAO<Master> {

    @Inject MasterRepository repositorio;

    @Override
    public void create(Master object) {
        this.repositorio.insert(object);
    }

    @Override
    public void update(Master object) {
        this.repositorio.update(object);
    }

    @Override
    public void remove(Master object) {
        this.repositorio.delete(object);
    }

    @Override
    public List<Master> findAll() {
        return this.repositorio.select();
    }
}
