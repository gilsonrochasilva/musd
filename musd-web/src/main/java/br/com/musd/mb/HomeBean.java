package br.com.musd.mb;

import br.com.musd.mb.common.PaginaBean;
import com.ocpsoft.pretty.faces.annotation.URLMapping;
import com.ocpsoft.pretty.faces.annotation.URLMappings;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
@URLMappings(mappings = {
    @URLMapping(id = "home", pattern = "/", viewId = "/pages/index.jsf")
})
public class HomeBean extends PaginaBean {



}
