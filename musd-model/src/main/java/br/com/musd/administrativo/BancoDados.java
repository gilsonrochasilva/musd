package br.com.musd.administrativo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "banco_dados")
public class BancoDados implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;
	@Basic(optional = false)
	@Column(name = "nome")
	private String nome;
	@JoinColumn(name = "masterID", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Master masterID;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "bancoDadosID")
	private List<DadosConexao> dadosConexaoList;

	public BancoDados() {
	}

	public BancoDados(Integer id) {
		this.id = id;
	}

	public BancoDados(Integer id, String nome) {
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

	public Master getMasterID() {
		return masterID;
	}

	public void setMasterID(Master masterID) {
		this.masterID = masterID;
	}

	public List<DadosConexao> getDadosConexaoList() {
		return dadosConexaoList;
	}

	public void setDadosConexaoList(List<DadosConexao> dadosConexaoList) {
		this.dadosConexaoList = dadosConexaoList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof BancoDados)) {
			return false;
		}
		BancoDados other = (BancoDados) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}
}