package br.com.musd.sincronizacao;

import java.io.Serializable;

public class Pacote implements Serializable {

	private String dados;

	private String checksun;

	public String getDados() {
		return dados;
	}

	public void setDados(String dados) {
		this.dados = dados;
	}

	public String getChecksun() {
		return checksun;
	}

	public void setChecksun(String checksun) {
		this.checksun = checksun;
	}

	@Override
	public String toString() {
		return "Pacote{" +
				"dados='" + dados + '\'' +
				", checksun='" + checksun + '\'' +
				'}';
	}
}
