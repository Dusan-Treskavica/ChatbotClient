/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbotclient;

import controler.ControlerClient;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DusanT
 */
public class ChatBotClient implements Runnable{

    public static Socket communicationSocket;
    public static BufferedReader console;
    public static BufferedReader inputStream;
    public static PrintStream outputStream;
    public static int chatGroupNumber = 0;
    
    public static void main(String[] args) {
        try {
            communicationSocket = new Socket("localhost", 5555);
            console = new BufferedReader(
                        new InputStreamReader(
                                System.in));
            
            inputStream = new BufferedReader(
                            new InputStreamReader(
                                    communicationSocket.getInputStream()));
            outputStream = new PrintStream(
                                communicationSocket.getOutputStream());
            
           // new Thread(new ChatBotClient()).start();
            
           // outputStream.println("hello");
           
           //PRIJAVLJIVANJE I REGISTRACIJA
            boolean signal = false;
            while(!signal){
                try {
                    signal = ControlerClient.prijavljivanjeIRegistracija();
                   // outputStream.println(log);
                } catch (Exception ex) {
                    Logger.getLogger(ChatBotClient.class.getName()).log(Level.SEVERE, null, ex);
                }
                //inputStream.readLine();
                System.out.println(inputStream.readLine());
                //outputStream.println(console.readLine());
            }
            
            new Thread(new ChatBotClient()).start();
            
            boolean kraj = false;
            while(!kraj){
                izborAktivnosti();
            }
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(ChatBotClient.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }

    private static void izborAktivnosti() throws IOException {
        System.out.println("Izaberite aktivnost:");
        System.out.println("1. Kreiraj chatgrupu");
        System.out.println("2. Izaberi chatgrupu");
        System.out.println("3. Posalji poruku botu");
        System.out.println("4. Osvezi listu aktivnih klijenata");
        System.out.println("5. Odjavi se");
        
        String izbor = console.readLine();
        
        switch(izbor){
            case "1":
                //kreirajChatGrupu();
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            default:
                break;
        }
    }

    @Override
    public void run() {
        //String poruka;
        try {
            while(true){
        
                System.out.println(inputStream.readLine());
            
            }
        }catch (IOException ex) {
                Logger.getLogger(ChatBotClient.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
