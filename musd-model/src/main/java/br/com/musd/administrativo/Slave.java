package br.com.musd.administrativo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "slave")
@PrimaryKeyJoinColumn(referencedColumnName = "id")
public class Slave extends Host implements Serializable {
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
	@Column(name = "porta")
	private int porta;
	@JoinColumn(name = "modeloMigracao", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private ModeloMigracao modeloMigracao;

	public Slave() {
	}

	public int getPorta() {
		return porta;
	}

	public void setPorta(int porta) {
		this.porta = porta;
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
		hash = 61 * hash + Objects.hashCode(this.getId());
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
		final Slave other = (Slave) obj;
		if (!Objects.equals(this.getId(), other.getId())) {
			return false;
		}
		return true;
	}


}
