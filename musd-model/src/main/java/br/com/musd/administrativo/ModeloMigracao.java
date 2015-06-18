package br.com.musd.administrativo;

import java.util.List;

public class ModeloMigracao {

	private Integer id;

	private String nome;

	private List<Slave> slaves;

	private Master master;

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

	public List<Slave> getSlaves() {
		return slaves;
	}

	public void setSlaves(List<Slave> slaves) {
		this.slaves = slaves;
	}

	public Master getMaster() {
		return master;
	}

	public void setMaster(Master master) {
		this.master = master;
	}

	public List<JanelaSincronizacao> getJanelaSincronizacao() {
		return janelaSincronizacao;
	}

	public void setJanelaSincronizacao(List<JanelaSincronizacao> janelaSincronizacao) {
		this.janelaSincronizacao = janelaSincronizacao;
	}

    @Override
    public String toString() {
        return "ModeloMigracao{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", slaves=" + slaves +
                ", master=" + master +
                ", janelaSincronizacao=" + janelaSincronizacao +
                '}';
    }
}