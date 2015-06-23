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

	@Basic(optional = false)
	@Column(name = "portaMinima")
	private int portaMinima;

	@Basic(optional = false)
	@Column(name = "portaMaxima")
	private int portaMaxima;

	@Basic(optional = false)
	@Column(name = "portaOuvinte")
	private int portaOuvinte;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "masterID")
	private List<BancoDados> bancoDadosList;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "masterID")
	private List<DadosConexao> dadosConexaoList;

	@JoinColumn(name = "modeloMigracao", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private ModeloMigracao modeloMigracao;

	public Master() {
	}

	public Master(Integer id) {

	}

	public Master(int portaMinima, int portaMaxima, int portaOuvinte) {
		this.portaMinima = portaMinima;
		this.portaMaxima = portaMaxima;
		this.portaOuvinte = portaOuvinte;
	}

	public int getPortaMinima() {
		return portaMinima;
	}

	public void setPortaMinima(int portaMinima) {
		this.portaMinima = portaMinima;
	}

	public int getPortaMaxima() {
		return portaMaxima;
	}

	public void setPortaMaxima(int portaMaxima) {
		this.portaMaxima = portaMaxima;
	}

	public int getPortaOuvinte() {
		return portaOuvinte;
	}

	public void setPortaOuvinte(int portaOuvinte) {
		this.portaOuvinte = portaOuvinte;
	}

	public List<BancoDados> getBancoDadosList() {
		return bancoDadosList;
	}

	public void setBancoDadosList(List<BancoDados> bancoDadosList) {
		this.bancoDadosList = bancoDadosList;
	}

	public List<DadosConexao> getDadosConexaoList() {
		return dadosConexaoList;
	}

	public void setDadosConexaoList(List<DadosConexao> dadosConexaoList) {
		this.dadosConexaoList = dadosConexaoList;
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
