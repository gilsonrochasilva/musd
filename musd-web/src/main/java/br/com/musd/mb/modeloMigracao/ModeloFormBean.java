package br.com.musd.mb.modeloMigracao;

import br.com.musd.administrativo.Master;
import br.com.musd.administrativo.ModeloMigracao;
import br.com.musd.administrativo.Slave;
import br.com.musd.mb.common.PaginaBean;
import br.com.musd.service.MasterSrv;
import br.com.musd.service.ModeloMigracaoSrv;
import com.ocpsoft.pretty.faces.annotation.URLAction;
import com.ocpsoft.pretty.faces.annotation.URLActions;
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
    @URLMapping(id = "modeloEditar", pattern = "/modelo/editar/#{id : modeloFormBean.id}", viewId = "/pages/modelo/modelo_form.jsf"),
    @URLMapping(id = "novoModelo", pattern = "/modelo/novo", viewId = "/pages/modelo/modelo_form.jsf")
})
public class ModeloFormBean extends PaginaBean {

    private ModeloMigracao modeloMigracao;

    private Master master;

    private List<Slave> slaves;

    private Integer id;

    @EJB private ModeloMigracaoSrv modeloMigracaoSrv;

    @EJB private MasterSrv masterSrv;

    @URLActions(actions = {
            @URLAction(mappingId = "modeloEditar", onPostback = false),
            @URLAction(mappingId = "novoModelo", onPostback = false) })
    public void init() {
        if (id != null) {
            modeloMigracao = modeloMigracaoSrv.getUm(id);
            if (modeloMigracao != null) {
                master = masterSrv.getUm(modeloMigracao);
            }
        }else{
            modeloMigracao = new ModeloMigracao();
            master = new Master();
        }
    }

    public String salvar() {
        modeloMigracaoSrv.salvar(modeloMigracao, master);
        if (id != null) {
            addInfo("Modelo alterado com sucesso!");
        }else{
            addInfo("Modelo salvo com sucesso!");
        }
        return "pretty:listaModelo";
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
