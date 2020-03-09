/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eXD
 */
public class Client {

    public static void main(String[] args) throws IOException {
        System.out.println("----------++ Client ++----------");
        Socket sckt = new Socket("localhost", 3200);
        System.out.println("----------++ Connected to server ++----------");
        try {
            while (true) {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                OutputStream os = sckt.getOutputStream();
                PrintWriter pw = new PrintWriter(os, true);
                System.out.print("Your Message >>");
                pw.println(br.readLine());
            }
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
