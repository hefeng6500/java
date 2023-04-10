package com.yang.broadcast;

import java.net.*;

public class BroadcastReceiver {
    public static void main(String args[]) throws Exception {
        int port = 5005;

        DatagramSocket socket = new DatagramSocket(port);
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        while (true) {
            socket.receive(packet);
            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received message: " + message);
        }
    }
}

