package repository;

import br.com.musd.administrativo.Slave;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marcos on 17/06/15.
 */

//@ManagedBean
//@SessionScoped
public class SlaveRepository {

    private List<Slave> slaveDB = new ArrayList<Slave>();

    private static SlaveRepository instance = new SlaveRepository();

    public static SlaveRepository getInstance(){
        return instance;
    }

    private SlaveRepository() {
    }

    public void insert(Slave entidade){
        slaveDB.add(entidade);
    }

    public void update(Slave entidade){
        slaveDB.add(entidade);
    }

    public void delete(Slave entidade){
        slaveDB.add(entidade);
    }

    public List<Slave> select(){
        return slaveDB;
    }


}
