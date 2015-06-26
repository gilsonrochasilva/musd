package br.com.musd.mb.modeloMigracao;

import br.com.musd.administrativo.ModeloMigracao;
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
    @URLMapping(id = "listaModelo", pattern = "/modelo/lista", viewId = "/pages/modelo/modelo_lista.jsf")
})
public class ModeloListaBean extends PaginaBean {

    private List<ModeloMigracao> modelosMigracao = new ArrayList<ModeloMigracao>();

    @EJB
    private ModeloMigracaoSrv modeloMigracaoSrv;

    @URLAction(mappingId = "listaModelo")
    public void init() {
        modelosMigracao = modeloMigracaoSrv.listarTodos();
    }

    public List<ModeloMigracao> getModelosMigracao() {
        return modelosMigracao;
    }

    public void setModelosMigracao(List<ModeloMigracao> modelosMigracao) {
        this.modelosMigracao = modelosMigracao;
    }

    public void excluir(ModeloMigracao modeloMigracao){
        modeloMigracaoSrv.excluir(modeloMigracao);
    }
}
