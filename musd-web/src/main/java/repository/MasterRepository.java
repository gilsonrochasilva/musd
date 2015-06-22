package repository;

import br.com.musd.administrativo.Master;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//@ManagedBean
//@SessionScoped
public class MasterRepository implements Serializable{

    private List<Master> masterDB = new ArrayList<Master>();

    private static MasterRepository instance = new MasterRepository();

    public static MasterRepository getInstance(){
        return instance;
    }

    private MasterRepository() {
    }

    public void insert(Master entidade){
        masterDB.add(entidade);
    }

    public void update(Master entidade){
        for (Master master : masterDB) {
            if (master.getId().equals(entidade.getId())) {
               masterDB.remove(master);
            }
        }
        masterDB.add(entidade);
    }

    public void delete(Master entidade){
        masterDB.remove(entidade);
    }

    public List<Master> select(){
        return masterDB;
    }

}
