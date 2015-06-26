package br.com.musd.mb.janelamigracao;

import br.com.musd.administrativo.JanelaSincronizacao;
import br.com.musd.mb.common.PaginaBean;
import br.com.musd.service.JanelaSincronizacaoSrv;
import com.ocpsoft.pretty.faces.annotation.URLAction;
import com.ocpsoft.pretty.faces.annotation.URLMapping;
import com.ocpsoft.pretty.faces.annotation.URLMappings;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
@URLMappings(mappings = {
    @URLMapping(id = "novaJanela", pattern = "/janela/novo", viewId = "/pages/janela/janela_form.jsf")
})
public class JanelaFormBean extends PaginaBean {

    private JanelaSincronizacao janelaSincronizacao;
    private List<JanelaSincronizacao> listaJanelas;

    @EJB private JanelaSincronizacaoSrv janelaSincronizacaoSrv;

    public JanelaFormBean() {
    }

    @URLAction(mappingId = "novaJanela")
    public void novo() {
        this.janelaSincronizacao = new JanelaSincronizacao();
        this. listaJanelas = new ArrayList<JanelaSincronizacao>();
    }

    public void salvar() {
        janelaSincronizacaoSrv.salvar(this.janelaSincronizacao);
        addInfo("Modelo salvo com sucesso!");
    }

    public JanelaSincronizacao getJanelaSincronizacao() {
        return janelaSincronizacao;
    }

    public void setJanelaSincronizacao(JanelaSincronizacao janelaSincronizacao) {
        this.janelaSincronizacao = janelaSincronizacao;
    }

    public List<JanelaSincronizacao> getListaJanelas() {
        return listaJanelas;
    }

    public void setListaJanelas(List<JanelaSincronizacao> listaJanelas) {
        this.listaJanelas = listaJanelas;
    }
}