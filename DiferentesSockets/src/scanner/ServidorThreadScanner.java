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
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luciano
 */
public class ServidorThreadScanner implements Runnable {

    private Socket s = null;

    public ServidorThreadScanner(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {

            System.out.println("New thread started to handle " + s.getInetAddress().getHostAddress() + " connection");

            Scanner in = new Scanner(s.getInputStream());

            while (in.hasNextLine()) {
                System.out.println(in.nextLine());
            }

            PrintStream out = new PrintStream(s.getOutputStream());

            out.println("Server Message");
            out.flush();
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
