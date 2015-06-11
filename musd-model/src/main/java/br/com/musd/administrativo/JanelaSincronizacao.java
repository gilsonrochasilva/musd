package br.com.musd.administrativo;

import java.util.Date;
import br.com.musd.sincronizacao.Sincronizador;

public class JanelaSincronizacao {

	private String id;

	private String identificacao;

	private Date horaInicio;

	private String horaFim;

	private Integer intervalo;

	private ModeloMigracao modeloMigracao;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public Date getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(String horaFim) {
		this.horaFim = horaFim;
	}

	public Integer getIntervalo() {
		return intervalo;
	}

	public void setIntervalo(Integer intervalo) {
		this.intervalo = intervalo;
	}

	public ModeloMigracao getModeloMigracao() {
		return modeloMigracao;
	}

	public void setModeloMigracao(ModeloMigracao modeloMigracao) {
		this.modeloMigracao = modeloMigracao;
	}
}