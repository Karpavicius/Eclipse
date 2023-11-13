/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferedStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luciano
 */
public class ClienteBS {

    public static void main(String args[]) throws IOException {

        Socket s = new Socket("localhost", 6666);
        try {
            
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);

            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));

            out.println("Client message");

            String line = in.readLine();
            
            System.out.println(line);
        } catch (IOException ex) {
            Logger.getLogger(ClienteBS.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
                s.close();
        }
    
    }

}
