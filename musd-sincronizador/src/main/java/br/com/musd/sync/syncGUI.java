package br.com.musd.sync;

import javax.swing.*;
import java.util.Timer;

/**
 * Created by domingos on 17/06/15.
 */
public class syncGUI extends JFrame{

    Timer timer;

    private JTextArea txInfo = new JTextArea();

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
    }

}
