package br.com.musd.administrativo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "dados_conexao")
public class DadosConexao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private Integer id;

	@Column(name = "host", nullable = false, length = 15)
	private String host;

	@Column(name = "porta", nullable = false)
	private int porta;

	@Column(name = "usuario", nullable = false, length = 50)
	private String usuario;

	@Column(name = "senha", nullable = false, length = 100)
	private String senha;

	@Column(name = "driver", nullable = false, length = 100)
	private String driver;

	@ManyToOne(optional = false)
	@JoinColumn(name = "banco_dados", referencedColumnName = "id")
	private BancoDados bancoDados;

	@ManyToOne(optional = false)
	@JoinColumn(name = "master", referencedColumnName = "id")
	private Master master;

	public DadosConexao() {
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

	public BancoDados getBancoDados() {
		return bancoDados;
	}

	public void setBancoDados(BancoDados bancoDados) {
		this.bancoDados = bancoDados;
	}

	public Master getMaster() {
		return master;
	}

	public void setMaster(Master master) {
		this.master = master;
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
		return "DadosConexao[ id=" + id + " ]";
	}

}
