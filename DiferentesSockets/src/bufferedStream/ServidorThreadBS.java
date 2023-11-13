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

/**
 *
 * @author luciano
 */
public class ServidorThreadBS implements Runnable {

    private Socket s = null;

    public ServidorThreadBS(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {

            System.out.println("New thread started to handle " + s.getInetAddress().getHostAddress() + " connection");

            PrintWriter out = new PrintWriter(s.getOutputStream(), true);

            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));

            String line = in.readLine();

            System.out.println(line);

            out.println("Server Message");
        } catch (IOException e) {
             e.printStackTrace();
        } finally {
            try {
                s.close();
                System.out.println("Thread done. Socket closed. Bye bye!");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

}
