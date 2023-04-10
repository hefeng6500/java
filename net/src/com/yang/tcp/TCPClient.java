package com.yang.tcp;

import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) throws Exception {
        String message = "Hello, World!";
        String host = "localhost";
        int port = 5005;

        Socket socket = new Socket(host, port);

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        out.println(message);
        String response = in.readLine();
        System.out.println("Received message: " + response);

        out.close();
        in.close();
        socket.close();
    }
}

