package br.com.musd.administrativo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "janela_sincronizacao")
public class JanelaSincronizacao implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;
	@Basic(optional = false)
	@Column(name = "identificacao")
	private String identificacao;
	@Basic(optional = false)
	@Column(name = "horario")
	@Temporal(TemporalType.DATE)
	private Date horario;
	@Basic(optional = false)
	@Column(name = "horaFim")
	private String horaFim;
	@Basic(optional = false)
	@Column(name = "intervalo")
	private int intervalo;
	@JoinColumn(name = "modeloMigracao", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private ModeloMigracao modeloMigracao;

	public JanelaSincronizacao() {
	}

	public JanelaSincronizacao(Integer id) {
		this.id = id;
	}

	public JanelaSincronizacao(Integer id, String identificacao, Date horario, String horaFim, int intervalo) {
		this.id = id;
		this.identificacao = identificacao;
		this.horario = horario;
		this.horaFim = horaFim;
		this.intervalo = intervalo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public String getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(String horaFim) {
		this.horaFim = horaFim;
	}

	public int getIntervalo() {
		return intervalo;
	}

	public void setIntervalo(int intervalo) {
		this.intervalo = intervalo;
	}

	public ModeloMigracao getModeloMigracao() {
		return modeloMigracao;
	}

	public void setModeloMigracao(ModeloMigracao modeloMigracao) {
		this.modeloMigracao = modeloMigracao;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof JanelaSincronizacao)) {
			return false;
		}
		JanelaSincronizacao other = (JanelaSincronizacao) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

}
