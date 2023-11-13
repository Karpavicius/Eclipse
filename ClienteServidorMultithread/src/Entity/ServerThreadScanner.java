/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author luciano
 */
public class ServerThreadScanner implements Runnable {

    private Socket s = null;
    private HashMap<String,String> conn = new HashMap<String,String>();

    public ServerThreadScanner(Socket s, HashMap<String,String> conn) {
    	this.conn = conn;
        this.s = s;
    }

    @Override
    public void run() {
        try {

            System.out.println("New thread started to handle " + s.getInetAddress().getHostAddress() + " connection");

            Scanner in = new Scanner(s.getInputStream());

            String nome = in.nextLine().toUpperCase();

            PrintStream out = new PrintStream(s.getOutputStream());

            out.println("Evelin;"+conn.get(nome));
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
