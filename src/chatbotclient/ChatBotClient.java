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
            
            outputStream.println("hello");
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
            
        } catch (IOException ex) {
            Logger.getLogger(ChatBotClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        new Thread(new ChatBotClient()).start();
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
