package br.com.musd.sync;

import br.com.musd.administrativo.JanelaSincronizacao;
import br.com.musd.administrativo.Master;
import br.com.musd.administrativo.ModeloMigracao;
import br.com.musd.administrativo.Slave;
import br.com.musd.sincronizacao.Pacote;
import br.com.musd.sincronizacao.Repositorio;
import br.com.musd.sincronizacao.Sincronizador;
import br.com.musd.sync.util.GeradorDeDados;
import br.com.musd.sync.util.SimulaServidor;

import javax.swing.*;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by domingos on 17/06/15.
 */
public class syncGUI extends JFrame{

    private JTextArea txInfo = new JTextArea();
    private JButton btControle = new JButton();
    private JButton btFechar = new JButton();

    public syncGUI(){
        super("Módulo Sincronizador MUSD");
        this.componentesGUI();
    }

    private void componentesGUI(){
        this.getContentPane().add(txInfo);

    }

    public static void main(String[] args)  {

        try {
            syncGUI janela = new syncGUI();
            janela.setSize(640, 480);
            janela.setVisible(true);
            janela.txInfo.setText("aqui");

            // Inicialização de objetos
            JanelaSincronizacao janelaSincronizacao = new JanelaSincronizacao();
            ModeloMigracao modeloMigracao = new ModeloMigracao();
            Master master = new Master();
            Slave slave = new Slave();
            Sincronizador sincronizador = new Sincronizador();
            Repositorio repositorio = new Repositorio();

            // Set valores
            master.setId(1);
            master.setInstancia("Servidor Master");
            master.setIp("localhost");
            master.setPortaOuvinte(9000);
            master.setPortaMaxima(9100);
            master.setPortaMinima(9001);

            modeloMigracao.setMaster(master);

            slave.setId(1);
            slave.setInstancia("Host Slave");
            slave.setIp("localhost");
            slave.setPorta(9000);

            List<Slave> slaves = new ArrayList<Slave>();
            slaves.add(slave);

            modeloMigracao.setSlaves(slaves);

            DateFormat formatoData = new SimpleDateFormat("H:s");
            String strHoraInicio = "10:00";
            String strHoraFim = "23:00";


            janelaSincronizacao.setHoraInicio(formatoData.parse(strHoraInicio));
            janelaSincronizacao.setHoraFim(formatoData.parse(strHoraFim));

            List<Pacote> pacotes = GeradorDeDados.geradorDePacote(30);

            for(Pacote pacote : pacotes){
                repositorio.adicionar(pacote);
            }

            sincronizador.conectar();


            SimulaServidor simulaServidor = new SimulaServidor();

            simulaServidor.run();

        }
        catch (ParseException pex){
            System.out.println(pex.getMessage());
        }
        catch (IOException iox){
            System.out.println(iox.getMessage());
        }

    }






}
