package br.com.musd.administrativo;

public class Master extends Host {

	private int portaOuvinte;

	private int portaMinima;

	private int portaMaxima;

	public int getPortaOuvinte() {
		return portaOuvinte;
	}

	public void setPortaOuvinte(int portaOuvinte) {
		this.portaOuvinte = portaOuvinte;
	}

	public int getPortaMinima() {
		return portaMinima;
	}

	public void setPortaMinima(int portaMinima) {
		this.portaMinima = portaMinima;
	}

	public int getPortaMaxima() {
		return portaMaxima;
	}

	public void setPortaMaxima(int portaMaxima) {
		this.portaMaxima = portaMaxima;
	}
}
