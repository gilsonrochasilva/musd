package br.com.musd.mb;

import br.com.musd.mb.common.PaginaBean;
import com.ocpsoft.pretty.faces.annotation.URLMapping;
import com.ocpsoft.pretty.faces.annotation.URLMappings;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * Created by correa on 24/06/15.
 */
@ManagedBean
@ViewScoped
@URLMappings(mappings = {
    @URLMapping(id = "novoModelo", pattern = "/modelo/", viewId = "/pages/modelo_form.jsf")
})
public class ModeloFormBean extends PaginaBean {
}
