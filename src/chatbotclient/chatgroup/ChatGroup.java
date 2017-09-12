/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbotclient.chatgroup;

import chatbotclient.ChatBotClient;
import java.util.LinkedList;

/**
 *
 * @author DusanT
 */
public class ChatGroup {
    private int sifraGrupe;
    private boolean aktivna;
    private LinkedList<String> listaKlijenata;
    private LinkedList<String> bufferPoruka;

    public ChatGroup(LinkedList<String> listaKlijenata) {
        this.sifraGrupe = ++ChatBotClient.chatGroupNumber;
        this.aktivna = false;
        this.listaKlijenata = listaKlijenata;
        this.bufferPoruka = new LinkedList<String>();
    }
    public ChatGroup(){
    }

    public int getSifraGrupe() {
        return sifraGrupe;
    }

    public void setSifraGrupe(int sifraGrupe) {
        this.sifraGrupe = sifraGrupe;
    }

    public boolean isAktivna() {
        return aktivna;
    }

    public void setAktivna(boolean aktivna) {
        this.aktivna = aktivna;
    }

    public LinkedList<String> getListaKlijenata() {
        return listaKlijenata;
    }

    public void setListaKlijenata(LinkedList<String> listaKlijenata) {
        this.listaKlijenata = listaKlijenata;
    }

    public LinkedList<String> getBufferPoruka() {
        return bufferPoruka;
    }

    public void setBufferPoruka(LinkedList<String> bufferPoruka) {
        this.bufferPoruka = bufferPoruka;
    }
    
    
    
}
