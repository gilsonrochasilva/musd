package br.com.musd.mb.janelamigracao;

import br.com.musd.administrativo.JanelaSincronizacao;
import br.com.musd.administrativo.Slave;
import br.com.musd.mb.common.PaginaBean;
import br.com.musd.service.JanelaSincronizacaoSrv;
import br.com.musd.service.ModeloMigracaoSrv;
import com.ocpsoft.pretty.faces.annotation.URLAction;
import com.ocpsoft.pretty.faces.annotation.URLMapping;
import com.ocpsoft.pretty.faces.annotation.URLMappings;
import org.hibernate.exception.ConstraintViolationException;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
@URLMappings(mappings = {
        @URLMapping(id = "novaJanela", pattern = "/janela/novo/#{idModelo : janelaFormBean.idModelo}", viewId = "/pages/janela/janela_form.jsf"),
        @URLMapping(id = "editarJanela", pattern = "/janela/editar/#{id : janelaFormBean.id}", viewId = "/pages/janela/janela_form.jsf")
})
public class JanelaFormBean extends PaginaBean {

    @EJB
    private JanelaSincronizacaoSrv janelaSrv;

    @EJB
    private ModeloMigracaoSrv modeloMigracaoSrv;

    private Integer id;

    private Integer idModelo;

    private JanelaSincronizacao janelaSincronizacao;


    @URLAction(mappingId = "novaJanela")
    public void init() {
        if(id == null){
            janelaSincronizacao = new JanelaSincronizacao();
            janelaSincronizacao.setModeloMigracao(modeloMigracaoSrv.getUm(idModelo));
        } else {
            janelaSincronizacao = janelaSrv.getUm(id);
        }
    }

    @URLAction(mappingId = "editarJanela")
    public void editar() {
        if(id == null){
            janelaSincronizacao = new JanelaSincronizacao();
        } else {
            janelaSincronizacao = janelaSrv.getUm(id);
        }
    }

    public void salvar(){
        try {
            janelaSrv.salvar(janelaSincronizacao);
            addInfo("Janela salva com sucesso.");
        }
        catch (ConstraintViolationException cvex){
            addWarn("Erro ao salvar registro.");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public JanelaSincronizacao getJanelaSincronizacao() {
        return janelaSincronizacao;
    }

    public void setJanelaSincronizacao(JanelaSincronizacao janelaSincronizacao) {
        this.janelaSincronizacao = janelaSincronizacao;
    }

    public Integer getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(Integer idModelo) {
        this.idModelo = idModelo;
    }
}