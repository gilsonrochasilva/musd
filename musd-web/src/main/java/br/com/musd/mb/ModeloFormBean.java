package br.com.musd.mb;

import br.com.musd.administrativo.Master;
import br.com.musd.administrativo.ModeloMigracao;
import br.com.musd.administrativo.Slave;
import br.com.musd.mb.common.PaginaBean;
import br.com.musd.service.ModeloMigracaoSrv;
import com.ocpsoft.pretty.faces.annotation.URLAction;
import com.ocpsoft.pretty.faces.annotation.URLMapping;
import com.ocpsoft.pretty.faces.annotation.URLMappings;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by correa on 24/06/15.
 */
@ManagedBean
@ViewScoped
@URLMappings(mappings = {
    @URLMapping(id = "novoModelo", pattern = "/modelo/novo", viewId = "/pages/modelo_form.jsf")
})
public class ModeloFormBean extends PaginaBean {

    private ModeloMigracao modeloMigracao;

    private Master master;

    private List<Slave> slaves;

    @EJB private ModeloMigracaoSrv modeloMigracaoSrv;

    @URLAction(mappingId = "novoModelo")
    public void init() {
        modeloMigracao = new ModeloMigracao();
        master = new Master();
        slaves = new ArrayList<Slave>();
    }

    public void salvar() {
        modeloMigracaoSrv.salvar(modeloMigracao, master, slaves);
        addInfo("Modelo salvo com sucesso!");
    }

    public ModeloMigracao getModeloMigracao() {
        return modeloMigracao;
    }

    public void setModeloMigracao(ModeloMigracao modeloMigracao) {
        this.modeloMigracao = modeloMigracao;
    }

    public Master getMaster() {
        return master;
    }

    public void setMaster(Master master) {
        this.master = master;
    }

    public List<Slave> getSlaves() {
        return slaves;
    }

    public void setSlaves(List<Slave> slaves) {
        this.slaves = slaves;
    }
}
