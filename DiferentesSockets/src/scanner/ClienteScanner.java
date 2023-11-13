/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner;

import bufferedStream.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luciano
 */
public class ClienteScanner {

    public static void main(String args[]) throws IOException {

        Socket s = new Socket("localhost", 6666);
        try {
            
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);

            out.println("Client message");

            Scanner in = new Scanner(s.getInputStream());

            while (in.hasNextLine()) {
                System.out.println(in.nextLine());
            }
        } catch (IOException ex) {
            Logger.getLogger(ClienteScanner.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
                s.close();
        }
    
    }

}
