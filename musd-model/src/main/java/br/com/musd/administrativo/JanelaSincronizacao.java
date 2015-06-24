package br.com.musd.administrativo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "janela_sincronizacao")
public class JanelaSincronizacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private Integer id;

	@Column(name = "identificacao", nullable = false, length = 50)
	private String identificacao;

	@Temporal(TemporalType.DATE)
	@Column(name = "horario", nullable = false)
	private Date horaIni;

	@Temporal(TemporalType.DATE)
	@Column(name = "horaFim", nullable = false)
	private Date horaFim;

	@Column(name = "intervalo", nullable = false)
	private int intervalo;

	@JoinColumn(name = "modeloMigracao", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private ModeloMigracao modeloMigracao;

	public JanelaSincronizacao() {
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

	public Date getHoraIni() {
		return horaIni;
	}

	public void setHoraIni(Date horaIni) {
		this.horaIni = horaIni;
	}

	public Date getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(Date horaFim) {
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
