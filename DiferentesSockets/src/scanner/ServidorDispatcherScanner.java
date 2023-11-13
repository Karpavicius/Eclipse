/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner;

import bufferedStream.*;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author luciano
 */
public class ServidorDispatcherScanner {

    public static void main(String args[]) throws IOException {

        ServerSocket ss = new ServerSocket(6666);
        System.out.println("Buffered Reader Server has stated...");
        while (true) {
            try {
                Socket s = ss.accept();
                System.out.println("New connection from " + s.getInetAddress().getHostAddress());

                ServidorThreadScanner st = new ServidorThreadScanner(s);
                st.run();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
