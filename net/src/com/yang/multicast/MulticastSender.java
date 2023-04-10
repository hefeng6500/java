package com.yang.multicast;

import java.net.*;

public class MulticastSender {
    public static void main(String[] args) throws Exception {
        String message = "Hello, World!";
        int port = 5005;
        InetAddress group = InetAddress.getByName("224.0.0.1");

        MulticastSocket socket = new MulticastSocket();
        socket.setTimeToLive(1);

        DatagramPacket packet = new DatagramPacket(message.getBytes(), message.length(), group, port);
        socket.send(packet);

        socket.close();
    }
}

