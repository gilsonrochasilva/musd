package br.com.musd.mb.janelamigracao;

import br.com.musd.mb.common.PaginaBean;
import com.ocpsoft.pretty.faces.annotation.URLMapping;
import com.ocpsoft.pretty.faces.annotation.URLMappings;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
@URLMappings(mappings = {
    @URLMapping(id = "novaJanela", pattern = "/janela", viewId = "/pages/janela/janela_form.jsf")
})
public class JanelaFormBean extends PaginaBean {


}