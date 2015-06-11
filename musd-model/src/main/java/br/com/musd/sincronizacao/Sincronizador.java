package br.com.musd.sincronizacao;

import br.com.musd.administrativo.JanelaSincronizacao;
import br.com.musd.administrativo.Master;
import br.com.musd.administrativo.Slave;
import br.com.musd.util.Notificador;

import java.util.List;

public class Sincronizador {

	private Repositorio repositorio;

	private List<JanelaSincronizacao> janelaSincronizacao;

	private Master master;

	private Slave slave;

	private Notificador notificador;

    public Sincronizador() {
        this.repositorio = Repositorio.getInstance();
    }

    public Integer solitarConexao(int master) {
		return null;
	}

	public void conectar(Integer porta) {

	}

	public void enviar(Pacote pacote) {

	}

	public void enviar(List pacotes) {

	}

	public void notificar(String erro) {

	}

	public List<JanelaSincronizacao> getJanelaSincronizacao() {
		return janelaSincronizacao;
	}

	public void setJanelaSincronizacao(List<JanelaSincronizacao> janelaSincronizacao) {
		this.janelaSincronizacao = janelaSincronizacao;
	}

	public Master getMaster() {
		return master;
	}

	public void setMaster(Master master) {
		this.master = master;
	}

	public Slave getSlave() {
		return slave;
	}

	public void setSlave(Slave slave) {
		this.slave = slave;
	}

	public Notificador getNotificador() {
		return notificador;
	}

	public void setNotificador(Notificador notificador) {
		this.notificador = notificador;
	}
}
