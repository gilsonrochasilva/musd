package br.com.musd.concentrador;

import br.com.musd.administrativo.DadosConexao;
import br.com.musd.sincronizacao.Pacote;

import java.util.List;

public class GerenciadorDados {

	private ConexaoSlave conexaoSlave;

	private List<Pacote> pacote;

	private DadosConexao dadosConexao;

	public ConexaoSlave getConexaoSlave() {
		return conexaoSlave;
	}

	public void setConexaoSlave(ConexaoSlave conexaoSlave) {
		this.conexaoSlave = conexaoSlave;
	}

	public List<Pacote> getPacote() {
		return pacote;
	}

	public void setPacote(List<Pacote> pacote) {
		this.pacote = pacote;
	}

	public DadosConexao getDadosConexao() {
		return dadosConexao;
	}

	public void setDadosConexao(DadosConexao dadosConexao) {
		this.dadosConexao = dadosConexao;
	}
}
