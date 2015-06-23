package br.com.musd.administrativo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "master")
@PrimaryKeyJoinColumn(referencedColumnName = "id")
public class Master extends Host implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "portaMinima", nullable = false)
	private int portaMin;

	@Column(name = "portaMaxima", nullable = false)
	private int portaMax;

	@Column(name = "portaOuvinte", nullable = false)
	private int portaOuvinte;

	@JoinColumn(name = "modeloMigracao", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private ModeloMigracao modeloMigracao;

	public Master() {
	}

	public int getPortaMin() {
		return portaMin;
	}

	public void setPortaMin(int portaMin) {
		this.portaMin = portaMin;
	}

	public int getPortaMax() {
		return portaMax;
	}

	public void setPortaMax(int portaMax) {
		this.portaMax = portaMax;
	}

	public int getPortaOuvinte() {
		return portaOuvinte;
	}

	public void setPortaOuvinte(int portaOuvinte) {
		this.portaOuvinte = portaOuvinte;
	}

	public ModeloMigracao getModeloMigracao() {
		return modeloMigracao;
	}

	public void setModeloMigracao(ModeloMigracao modeloMigracao) {
		this.modeloMigracao = modeloMigracao;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 19 * hash + Objects.hashCode(this.getId());
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Master other = (Master) obj;
		if (!Objects.equals(this.getId(), other.getId())) {
			return false;
		}
		return true;
	}


}
