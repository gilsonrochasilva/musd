package br.com.musd.administrativo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "dados_conexao")
public class DadosConexao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;

	@Basic(optional = false)
	@Column(name = "host")
	private String host;

	@Basic(optional = false)
	@Column(name = "porta")
	private int porta;

	@Basic(optional = false)
	@Column(name = "usuario")
	private String usuario;

	@Basic(optional = false)
	@Column(name = "senha")
	private String senha;

	@Basic(optional = false)
	@Column(name = "driver")
	private String driver;

	@JoinColumn(name = "bancoDadosID", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private BancoDados bancoDadosID;

	@JoinColumn(name = "masterID", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Master masterID;

	public DadosConexao() {
	}

	public DadosConexao(Integer id) {
		this.id = id;
	}

	public DadosConexao(Integer id, String host, int porta, String usuario, String senha, String driver) {
		this.id = id;
		this.host = host;
		this.porta = porta;
		this.usuario = usuario;
		this.senha = senha;
		this.driver = driver;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPorta() {
		return porta;
	}

	public void setPorta(int porta) {
		this.porta = porta;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public BancoDados getBancoDadosID() {
		return bancoDadosID;
	}

	public void setBancoDadosID(BancoDados bancoDadosID) {
		this.bancoDadosID = bancoDadosID;
	}

	public Master getMasterID() {
		return masterID;
	}

	public void setMasterID(Master masterID) {
		this.masterID = masterID;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof DadosConexao)) {
			return false;
		}
		DadosConexao other = (DadosConexao) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "entity.DadosConexao[ id=" + id + " ]";
	}

}
