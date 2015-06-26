package br.com.musd.mb.slave;

import br.com.musd.administrativo.ModeloMigracao;
import br.com.musd.administrativo.Slave;
import br.com.musd.mb.common.PaginaBean;
import br.com.musd.service.ModeloMigracaoSrv;
import br.com.musd.service.SlaveSrv;
import com.ocpsoft.pretty.faces.annotation.URLAction;
import com.ocpsoft.pretty.faces.annotation.URLMapping;
import com.ocpsoft.pretty.faces.annotation.URLMappings;
import org.hibernate.exception.ConstraintViolationException;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

/**
 * Created by domingos on 6/25/15.
 */
@ManagedBean
@ViewScoped
@URLMappings(mappings = {
    @URLMapping(id = "novoSlave", pattern = "/slave/novo", viewId = "/pages/slave/slave_form.jsf"),
    @URLMapping(id = "editarSlave", pattern = "/slave/editar/#{slaveFormBean.id}", viewId = "/pages/slave/slave_form.jsf")
})
public class SlaveFormBean extends PaginaBean{

    @EJB
    private SlaveSrv slaveSrv;

    @EJB
    private ModeloMigracaoSrv modeloMigracaoSrv;

    private Integer id;

    private List<ModeloMigracao> modeloMigracaoList;

    private ModeloMigracao modeloMigracao;

    private Slave slave;


    @URLAction(mappingId = "novoSlave")
    public void init(){

        modeloMigracaoList = modeloMigracaoSrv.listarTodos();

        if(id == null){
            slave = new Slave();
        } else {
            slave = slaveSrv.getUm(id);
        }
    }

    @URLAction(mappingId = "editarSlave")
    public void editar(){
        modeloMigracaoList = modeloMigracaoSrv.listarTodos();

        if(id == null){
            slave = new Slave();
        } else {
            slave = slaveSrv.getUm(id);
        }
    }

    public String salvar(){
        try {
            slaveSrv.salvar(slave);
        }
        catch (ConstraintViolationException cvex){
            addWarn("Erro ao salvar registro");
        }

        return "pretty:listaSlave";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<ModeloMigracao> getModeloMigracaoList() {
        return modeloMigracaoList;
    }

    public void setModeloMigracaoList(List<ModeloMigracao> modeloMigracaoList) {
        this.modeloMigracaoList = modeloMigracaoList;
    }

    public ModeloMigracao getModeloMigracao() {
        return modeloMigracao;
    }

    public void setModeloMigracao(ModeloMigracao modeloMigracao) {
        this.modeloMigracao = modeloMigracao;
    }

    public Slave getSlave() {
        return slave;
    }

    public void setSlave(Slave slave) {
        this.slave = slave;
    }
}
