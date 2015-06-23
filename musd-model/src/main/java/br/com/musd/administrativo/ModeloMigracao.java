package br.com.musd.administrativo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "modelo_migracao")
public class ModeloMigracao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;

	@Basic(optional = false)
	@Column(name = "nome")
	private String nome;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "modeloMigracao")
	private List<Slave> slaveList;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "modeloMigracao")
	private List<JanelaSincronizacao> janelaSincronizacaoList;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "modeloMigracao")
	private List<Master> masterList;

	public ModeloMigracao() {
	}

	public ModeloMigracao(Integer id) {
		this.id = id;
	}

	public ModeloMigracao(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Slave> getSlaveList() {
		return slaveList;
	}

	public void setSlaveList(List<Slave> slaveList) {
		this.slaveList = slaveList;
	}

	public List<JanelaSincronizacao> getJanelaSincronizacaoList() {
		return janelaSincronizacaoList;
	}

	public void setJanelaSincronizacaoList(List<JanelaSincronizacao> janelaSincronizacaoList) {
		this.janelaSincronizacaoList = janelaSincronizacaoList;
	}

	public List<Master> getMasterList() {
		return masterList;
	}

	public void setMasterList(List<Master> masterList) {
		this.masterList = masterList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof ModeloMigracao)) {
			return false;
		}
		ModeloMigracao other = (ModeloMigracao) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

}