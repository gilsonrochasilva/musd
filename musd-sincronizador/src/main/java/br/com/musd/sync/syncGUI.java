package br.com.musd.sync;

import javax.swing.*;
import java.net.Socket;

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

    public static void main(String[] args){
        syncGUI janela = new syncGUI();
        janela.setSize(640,480);
        janela.setVisible(true);
        janela.txInfo.setText("aqui");


        Socket socket;

    }



}
