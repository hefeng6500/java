package com.yang.multicast;

import java.net.*;

public class MulticastReceiver {
    public static void main(String[] args) throws Exception {
        int port = 5005;
        InetAddress group = InetAddress.getByName("224.0.0.1");

        MulticastSocket socket = new MulticastSocket(port);
        socket.joinGroup(group);

        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        while (true) {
            socket.receive(packet);
            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received message: " + message);
        }
    }
}

