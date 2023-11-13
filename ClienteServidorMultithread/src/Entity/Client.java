/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *
 * @author luciano
 */
public class Client {

    public static void main(String args[]) throws IOException {
    	
    	List<String> listServerConnection = new ArrayList<String>();
    	Map<String, String> mapServerConection = new HashMap<String, String>();

        Socket client;
        String ipServer = "";
        PrintWriter out;
        BufferedReader in;
        String inExtract[] = new String[2];
        
        for(int i = 78; i < 84; i++) {
        	ipServer = "192.168.1." + i;
        	
        	if(InetAddress.getByName(ipServer).isReachable(1000)) {
        		listServerConnection.add(ipServer);
        		System.out.println("Successful connection with IP: " + ipServer);
        	} else {
        		System.out.println("Without connection with IP: " + ipServer);
        	}
        }
        
        for(int i = 0; i < listServerConnection.size(); i++) {
        	
        	try {
        		
        		client = new Socket(listServerConnection.get(i), 6666);
        		out = new PrintWriter(client.getOutputStream(), true);
        		in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        		out.println("Evelin");
        		inExtract = in.readLine().toUpperCase().split(";");
        		mapServerConection.put(inExtract[0], inExtract[1]);
        		
        		System.out.println("IP: " + listServerConnection.get(i));
        		System.out.println("Message received: " + inExtract[0] + ";" + inExtract[1]);
        		System.out.println("Map: " + mapServerConection);
        		
        	} catch(Exception e){
        		
        		System.out.println("Error: " + e.getMessage());
        		System.out.println("Exception: " + e.getClass());
        		
        	}
        }
    }
}
