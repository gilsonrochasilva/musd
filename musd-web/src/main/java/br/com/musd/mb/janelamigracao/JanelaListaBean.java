package br.com.musd.mb.janelamigracao;

import br.com.musd.administrativo.JanelaSincronizacao;
import br.com.musd.administrativo.ModeloMigracao;
import br.com.musd.administrativo.Slave;
import br.com.musd.mb.common.PaginaBean;
import br.com.musd.service.JanelaSincronizacaoSrv;
import br.com.musd.service.ModeloMigracaoSrv;
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
    @URLMapping(id = "listaJanela", pattern = "/janela/#{idModelo : janelaListaBean.idModelo}", viewId = "/pages/janela/janela_grid.jsf")
})
public class JanelaListaBean extends PaginaBean {

    @EJB
    private JanelaSincronizacaoSrv janelaSrv;

    @EJB
    private ModeloMigracaoSrv modeloMigracaoSrv;

    private Integer idModelo;

    private List<JanelaSincronizacao> janelas;

    private ModeloMigracao modeloMigracao;

    @URLAction(mappingId = "listaJanela")
    public void init() {
        modeloMigracao = modeloMigracaoSrv.getUm(idModelo);
        janelas = janelaSrv.lista(modeloMigracao);
    }

    public Integer getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(Integer idModelo) {
        this.idModelo = idModelo;
    }

    public List<JanelaSincronizacao> getJanelas() {
        return janelas;
    }

    public void setJanelas(List<JanelaSincronizacao> janelas) {
        this.janelas = janelas;
    }

    public ModeloMigracao getModeloMigracao() {
        return modeloMigracao;
    }

    public void setModeloMigracao(ModeloMigracao modeloMigracao) {
        this.modeloMigracao = modeloMigracao;
    }
}
