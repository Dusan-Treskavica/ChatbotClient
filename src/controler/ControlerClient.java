/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import chatbotclient.ChatBotClient;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DusanT
 */
public class ControlerClient {
    
    //public static ChatBotClient aktivniKlijent;
    
    public static boolean prijavljivanjeIRegistracija() throws Exception{
        boolean signal = false;
        System.out.println("Do you have account?(yes/no)");
        String s = new Scanner(System.in).nextLine();
        if(s.equalsIgnoreCase("yes")){
            ChatBotClient.outputStream.println("signin");
            while(!signal){
                signal = prijavljivanje1();
            }
//            ChatBotClient.outputStream.println("signin");
//            return prijavljivanje(); 
        }            
        else
            if(s.equalsIgnoreCase("no")){
                ChatBotClient.outputStream.println("signup");
                while(!signal){
                signal = registracija1();
            }
//                ChatBotClient.outputStream.println("signup");
//                return registracija();
            }                
            else
                throw new Exception("Greska");
        
        return signal;        
    }
    
    private static boolean prijavljivanje1() throws IOException, Exception {
        //ChatBotClient.outputStream.println("signin");
        
        System.out.println("Unesi sledece podatke u zadatom formatu.");
        System.out.println("username:password");
        ChatBotClient.outputStream.println(new Scanner(System.in).nextLine());
        String porukaOdServera = ChatBotClient.inputStream.readLine();
        if(porukaOdServera.startsWith("bad"))
            return false;
        else{
            // ovde izmeniti kad se budu dodaavale funkcionalnosti
            // ovde su vraceni podaci od servera koji su potrebni za prikaz na gui-ju
            if(porukaOdServera.startsWith("success"))
                return true;
        }
            
        throw new Exception("Greska");
    }

    private static boolean registracija1() throws IOException, Exception {
        //ChatBotClient.outputStream.println("signup");
        
         System.out.println("Unesi sledece podatke u zadatom formatu.");
        System.out.println("ime:prezime:datumrodjenja:pol:drzava:username:password");
        ChatBotClient.outputStream.println(new Scanner(System.in).nextLine());
        String porukaOdServera = ChatBotClient.inputStream.readLine();
        if(porukaOdServera.startsWith("bad"))
            return false;
        else{
            // ovde izmeniti kad se budu dodaavale funkcionalnosti
            // ovde su vraceni podaci od servera koji su potrebni za prikaz na gui-ju
            if(porukaOdServera.startsWith("success"))
                return true;
        }
            
        throw new Exception("Greska");
    }
    private static String registracija() {
        System.out.println("Unesi sledece podatke u zadatom formatu.");
        System.out.println("ime:prezime:datumrodjenja:pol:drzava:username:password");
        return new Scanner(System.in).nextLine();
    }

    private static String prijavljivanje() {
        System.out.println("Unesi sledece podatke u zadatom formatu.");
        System.out.println("username:password");
        return new Scanner(System.in).nextLine();
    }
}
