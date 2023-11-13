/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author luciano
 */
public class ServerDispatcherScanner {

    public static void main(String args[]) throws IOException {
    	
    	HashMap<String,String> conn = new HashMap<String,String>();

    	Random rand = new Random();
    	
    	conn.put("RAFAEL", (Integer.toString(rand.nextInt(100))));
    	conn.put("KARINE", (Integer.toString(rand.nextInt(100))));
    	conn.put("FERNANDO", (Integer.toString(rand.nextInt(100))));
    	conn.put("LUCAS", (Integer.toString(rand.nextInt(100))));
    	conn.put("JOHN", (Integer.toString(rand.nextInt(100))));
    	conn.put("MATEUS", (Integer.toString(rand.nextInt(100))));
    	conn.put("TIAGO", (Integer.toString(rand.nextInt(100))));
    	conn.put("THOMAS", (Integer.toString(rand.nextInt(100))));
    	conn.put("LUCIANO", (Integer.toString(rand.nextInt(100))));
    	conn.put("SILVIO", (Integer.toString(rand.nextInt(100))));
    	conn.put("GIOVANNI", (Integer.toString(rand.nextInt(100))));
    	conn.put("GUSTAVO", (Integer.toString(rand.nextInt(100))));	
    	
        ServerSocket ss = new ServerSocket(6666);
        System.out.println("Buffered Reader Server has stated...");
        while (true) {
            try {
                Socket s = ss.accept();
                System.out.println("New connection from " + s.getInetAddress().getHostAddress());

                ServerThreadScanner st = new ServerThreadScanner(s, conn);
                st.run();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}