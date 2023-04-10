package com.yang.broadcast;

import java.net.*;

public class BroadcastSender {
    public static void main(String args[]) throws Exception {
        String message = "Hello, World!";
        int port = 5005;
        InetAddress broadcastAddress = InetAddress.getByName("255.255.255.255");

        DatagramSocket socket = new DatagramSocket();
        socket.setBroadcast(true);

        DatagramPacket packet = new DatagramPacket(message.getBytes(), message.length(), broadcastAddress, port);
        socket.send(packet);

        socket.close();
    }
}

