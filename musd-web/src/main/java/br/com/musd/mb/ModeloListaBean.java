package br.com.musd.mb;

import br.com.musd.administrativo.ModeloMigracao;
import br.com.musd.mb.common.PaginaBean;
import com.ocpsoft.pretty.faces.annotation.URLAction;
import com.ocpsoft.pretty.faces.annotation.URLMapping;
import com.ocpsoft.pretty.faces.annotation.URLMappings;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

/**
 * Created by correa on 24/06/15.
 */
@ManagedBean
@ViewScoped
@URLMappings(mappings = {
    @URLMapping(id = "listaModelo", pattern = "/modelo/lista", viewId = "/pages/index.jsf")
})
public class ModeloListaBean extends PaginaBean {

    private List<ModeloMigracao> modelosMigracao;

    @URLAction(mappingId = "listaModelo")
    public void init() {

    }
}
