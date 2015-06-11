package br.com.musd.concentrador;

import br.com.musd.administrativo.ModeloMigracao;

import java.util.List;

public class Concentrador {

	private int portaMaxima;

	private int portaMinima;

	private List<ModeloMigracao> modeloMigracao;

	private List<ConexaoSlave> conexaoSlave;

	public int getPortaMaxima() {
		return portaMaxima;
	}

	public void setPortaMaxima(int portaMaxima) {
		this.portaMaxima = portaMaxima;
	}

	public int getPortaMinima() {
		return portaMinima;
	}

	public void setPortaMinima(int portaMinima) {
		this.portaMinima = portaMinima;
	}

	public List<ModeloMigracao> getModeloMigracao() {
		return modeloMigracao;
	}

	public void setModeloMigracao(List<ModeloMigracao> modeloMigracao) {
		this.modeloMigracao = modeloMigracao;
	}

	public List<ConexaoSlave> getConexaoSlave() {
		return conexaoSlave;
	}

	public void setConexaoSlave(List<ConexaoSlave> conexaoSlave) {
		this.conexaoSlave = conexaoSlave;
	}
}
