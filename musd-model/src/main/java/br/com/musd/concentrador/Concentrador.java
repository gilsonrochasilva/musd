package br.com.musd.concentrador;

import br.com.musd.administrativo.ModeloMigracao;

import java.io.IOException;
import java.util.List;

public class Concentrador {

	private int portaMaxima;

	private int portaMinima;

	private List<ModeloMigracao> modeloMigracao;

	private List<ConexaoSlave> conexaoSlave;

	public void iniciar() throws IOException, ClassNotFoundException {
        for (ModeloMigracao _modeloMigracao : modeloMigracao) {
            System.out.println("Modelos de Migração: " + _modeloMigracao.toString());

            ConexaoSlave conexaoSlave = new ConexaoSlave();
            conexaoSlave.setPorta(proximaPorta());
            conexaoSlave.iniciar();
        }
    }

    /**
     * Pegará a pŕoxima porta disponível dentro do range portaMinima <= porta <= portaMaxima
     *
     * @return proximaPorta
     */
    private int proximaPorta() {
        //TODO Fazer cálculo da próximo porta

        return portaMinima++;
    }

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
