package org.collibra.challenge;

import org.collibra.challenge.client.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.logging.Logger;

import static java.util.logging.Level.SEVERE;

public class TestClient {
    private static final Logger log = Logger.getLogger(Client.class.getName());

    public static void main(String[] args) {

        // IF args contains "detail log", set detailLogBoolean = true
        // many methods with if(detailLog) System.out.println...

        TestClient testClient = new TestClient();

        // Test 1
        System.out.println(testClient.test1());

        // Test 2
        // System.out.println(testClient.test2());

        // Test 3
        // System.out.println(testClient.test2());

        // etc...

    }

    private String test1() {
        System.out.print("Running Test1: Sending \"HI, I'M Massimo\"... ");
        Socket socket = connect();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
            socket.setSoTimeout(30000);
            out.println("HI, I'M Massimo");
            if (in.readLine().startsWith("HI, I'M"))
                return "Success";
        } catch (Exception e) {
            log.log(SEVERE, "Error connecting to server", e);
        }
        return "Failed";
    }

    private Socket connect() {
        Socket socket = new Socket();
        try {
            socket.connect(new InetSocketAddress("127.0.0.1", 50000));
            return socket;
        } catch (IOException e) {
            throw new RuntimeException("Unable to connect", e);
        }
    }
}
