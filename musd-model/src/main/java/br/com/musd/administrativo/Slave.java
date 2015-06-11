package br.com.musd.administrativo;

import br.com.musd.sincronizacao.Sincronizador;

public class Slave extends Host {

	private int porta;

	private Sincronizador sincronizador;

	public int getPorta() {
		return porta;
	}

	public void setPorta(int porta) {
		this.porta = porta;
	}

	public Sincronizador getSincronizador() {
		return sincronizador;
	}

	public void setSincronizador(Sincronizador sincronizador) {
		this.sincronizador = sincronizador;
	}
}
