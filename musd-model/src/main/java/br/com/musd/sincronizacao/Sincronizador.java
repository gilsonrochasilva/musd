package br.com.musd.sincronizacao;

import br.com.musd.administrativo.JanelaSincronizacao;
import br.com.musd.administrativo.Master;
import br.com.musd.administrativo.Slave;
import br.com.musd.util.Notificador;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;

public class Sincronizador  {

	private Repositorio repositorio;

	private List<JanelaSincronizacao> janelaSincronizacao;

	private Master master;

	private Slave slave;

	private Notificador notificador;

	private Socket socket;

	private ObjectInputStream entrada;

	private ObjectOutputStream saida;

    public Sincronizador() {

		this.repositorio = Repositorio.getInstance();
    }


	public Integer solitarConexao(int masterID)  {

		return null;
	}

	public void conectar() throws IOException {
        System.out.println("Conectando...");
		socket = new Socket(InetAddress.getByName(master.getIp()), master.getPortaOuvinte());
		//entrada = new ObjectInputStream(socket.getInputStream());
		saida = new ObjectOutputStream(socket.getOutputStream());
        System.out.println(String.format("Conectado no host %s, porta %s ", InetAddress.getByName(master.getIp()), master.getPortaOuvinte()));
	}

	public void enviar(Pacote pacote) throws IOException {
        System.out.println(String.format("Enviando o pacote %s ", pacote.toString()));
        saida.writeObject(pacote);
	}

	public void enviar(List<Pacote> pacotes) throws IOException{
		for(Pacote pacote : pacotes){
            enviar(pacote);
		}
	}

	public void desconectar() throws IOException{
		entrada.close();
		saida.close();
		socket.close();
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
