/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import chatbotclient.ChatBotClient;
import java.util.Scanner;

/**
 *
 * @author DusanT
 */
public class ControlerClient {
    
    //public static ChatBotClient aktivniKlijent;
    
    public static String prijavljivanjeIRegistracija() throws Exception{
        System.out.println("Do you have account?(yes/no)");
        String s = new Scanner(System.in).nextLine();
        if(s.equalsIgnoreCase("yes")){
            ChatBotClient.outputStream.println("signin");
            return prijavljivanje(); 
        }            
        else
            if(s.equalsIgnoreCase("no")){
                ChatBotClient.outputStream.println("signup");
                return registracija();
            }                
            else
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
