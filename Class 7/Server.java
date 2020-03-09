/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eXD
 */
public class Server {

    static String ClinetChatMsg;
    static String Msg =" ----------------------------------> Client Server Chat ----------------------------------> ";
    static int count=0;

    public static void writeToFile(String ChatMsg) {
        try {
            Path filePath = Paths.get("D:/client_chat.txt");
            Files.write(filePath, ChatMsg.getBytes(),StandardOpenOption.CREATE,StandardOpenOption.TRUNCATE_EXISTING);

        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        System.out.println("----------++ Server ++----------");
        try {
            ServerSocket ssckt = new ServerSocket(3200);
            Socket s = ssckt.accept();
            System.out.println("----------++ Client Request Accepted ++----------");
            InputStream ins = s.getInputStream();
            while (s.isConnected()) {
                BufferedReader br = new BufferedReader(new InputStreamReader(ins));
                ClinetChatMsg = br.readLine();
                count = count +1;
                System.out.println("Client Says : >>" + " " + ClinetChatMsg);
                
                /**
                 * ************************************ writing to a file
                 * **************************************
                 */
                 Msg = Msg +"\r\n" +" "+"Message "+count+" From Client"+" >> "+ClinetChatMsg;


                /**
                 * ************************************ writing to a file
                 * **************************************
                 */
            }

        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally{
            writeToFile(Msg);
        
        }
//        Socket sckt = new Socket();
    }

}
