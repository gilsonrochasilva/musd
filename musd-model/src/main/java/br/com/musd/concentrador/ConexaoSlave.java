package br.com.musd.concentrador;

import br.com.musd.sincronizacao.Pacote;
import br.com.musd.util.Notificador;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ConexaoSlave implements Runnable {

	private int porta;

	private GerenciadorDados gerenciadorDados;

	private Notificador notificador;

	public ConexaoSlave() {
		gerenciadorDados = new GerenciadorDados();
		notificador = new Notificador();
	}

    public void run()  {
        try {
            Socket socketSlave = null;

            ServerSocket serverSocket = null;
            serverSocket = new ServerSocket(porta);
            System.out.println("Aguardando conexão na porta " + porta);
            socketSlave = serverSocket.accept();
            System.out.println("Conexão aceita na porta " + porta);

            ObjectInputStream objectInputSlave = new ObjectInputStream(socketSlave.getInputStream());

            Object data = null;
            while((data = objectInputSlave.readObject()) != null) {
                if(data instanceof Pacote) {
                    gerenciadorDados.salvar((Pacote) data);
                } else if(data instanceof String) {
                    System.out.println("Data Str: " + data);
                } else {
                    System.out.println("Data: " + data.toString());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void iniciar() {
        Thread thread = new Thread(this);
        thread.start();
    }

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
