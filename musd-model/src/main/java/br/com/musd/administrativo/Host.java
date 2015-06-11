package br.com.musd.administrativo;

public class Host {

	protected Integer id;

	protected String instancia;

	protected String ip;

	protected ModeloMigracao modeloMigracao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getInstancia() {
		return instancia;
	}

	public void setInstancia(String instancia) {
		this.instancia = instancia;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public ModeloMigracao getModeloMigracao() {
		return modeloMigracao;
	}

	public void setModeloMigracao(ModeloMigracao modeloMigracao) {
		this.modeloMigracao = modeloMigracao;
	}
}
