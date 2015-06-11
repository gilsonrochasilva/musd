package br.com.musd.administrativo;

public class DadosConexao {

	private String host;

	private Integer porta;

	private String usuario;

	private String senha;

	private String driver;

	private BancoDados bancoDados;

	private Master master;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public Integer getPorta() {
		return porta;
	}

	public void setPorta(Integer porta) {
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
}
