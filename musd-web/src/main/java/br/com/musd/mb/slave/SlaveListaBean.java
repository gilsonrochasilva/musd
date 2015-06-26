package br.com.musd.mb.slave;

import br.com.musd.administrativo.ModeloMigracao;
import br.com.musd.administrativo.Slave;
import br.com.musd.service.ModeloMigracaoSrv;
import br.com.musd.service.SlaveSrv;
import com.ocpsoft.pretty.faces.annotation.URLAction;
import com.ocpsoft.pretty.faces.annotation.URLMapping;
import com.ocpsoft.pretty.faces.annotation.URLMappings;

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
        @URLMapping(id = "listaSlave", pattern = "/slave/lista", viewId = "/pages/slave/slave_grid.jsf")
})
public class SlaveListaBean {


    @EJB
    private SlaveSrv slaveSrv;

    @EJB
    private ModeloMigracaoSrv modeloMigracaoSrv;

    private List<Slave> slaves;

    private List<ModeloMigracao> modeloMigracaoList;

    private ModeloMigracao modeloMigracao;

    @URLAction(mappingId = "listaSlave")
    public void init() {
        modeloMigracaoList = modeloMigracaoSrv.listarTodos();
    }

    public void listarSlave(){
        slaves = slaveSrv.lista(modeloMigracao);
    }

    public List<Slave> getSlaves() {
        return slaves;
    }

    public void setSlaves(List<Slave> slaves) {
        this.slaves = slaves;
    }

    public ModeloMigracao getModeloMigracao() {
        return modeloMigracao;
    }

    public void setModeloMigracao(ModeloMigracao modeloMigracao) {
        this.modeloMigracao = modeloMigracao;
    }

    public List<ModeloMigracao> getModeloMigracaoList() {
        return modeloMigracaoList;
    }

    public void setModeloMigracaoList(List<ModeloMigracao> modeloMigracaoList) {
        this.modeloMigracaoList = modeloMigracaoList;
    }
}
