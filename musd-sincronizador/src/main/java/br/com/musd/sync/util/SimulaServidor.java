package br.com.musd.sync.util;

import br.com.musd.sincronizacao.Pacote;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by domingos on 17/06/15.
 */
public class SimulaServidor implements Runnable {

    public void run() {

        try {
            ServerSocket servSocket;
            Socket clientSocket;
            Pacote pacote;

            int porta = 9000;

            servSocket = new ServerSocket(porta);

            System.out.println("Aguardando conexão na porta "+porta);

            clientSocket = servSocket.accept();

            ObjectOutputStream saida = new ObjectOutputStream(clientSocket.getOutputStream());

            ObjectInputStream entrada = new ObjectInputStream(clientSocket.getInputStream());

            while((pacote = (Pacote) entrada.readObject()) != null){
                System.out.println("Dados do pacote: "+pacote.getDados());

                saida.writeObject("Fim do pacote");
            }

            saida.close();
            clientSocket.close();

        }
        catch (IOException iox){
            System.out.println(iox.getMessage());
        }
        catch (ClassNotFoundException cnfx){
            System.out.println(cnfx.getMessage());
        }

    }
}
