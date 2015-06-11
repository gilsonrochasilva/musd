package br.com.musd.concentrador;

import br.com.musd.util.Notificador;

public class ConexaoSlave {

	private int porta;

	private GerenciadorDados gerenciadorDados;

	private Notificador notificador;

	public int getPorta() {
		return porta;
	}

	public void setPorta(int porta) {
		this.porta = porta;
	}

	public GerenciadorDados getGerenciadorDados() {
		return gerenciadorDados;
	}

	public void setGerenciadorDados(GerenciadorDados gerenciadorDados) {
		this.gerenciadorDados = gerenciadorDados;
	}

	public Notificador getNotificador() {
		return notificador;
	}

	public void setNotificador(Notificador notificador) {
		this.notificador = notificador;
	}
}
