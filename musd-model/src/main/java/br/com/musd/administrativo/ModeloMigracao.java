package br.com.musd.administrativo;

import java.util.List;

public class ModeloMigracao {

	private Integer id;

	private String nome;

	private List<Host> host;

	private List<JanelaSincronizacao> janelaSincronizacao;

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

	public List<Host> getHost() {
		return host;
	}

	public void setHost(List<Host> host) {
		this.host = host;
	}

	public List<JanelaSincronizacao> getJanelaSincronizacao() {
		return janelaSincronizacao;
	}

	public void setJanelaSincronizacao(List<JanelaSincronizacao> janelaSincronizacao) {
		this.janelaSincronizacao = janelaSincronizacao;
	}
}