package com.yang.multiClientMessageTcp;

import java.io.BufferedReader;
import java.io.IOException;

class ReceiveThread extends Thread {
    private BufferedReader in;

    public ReceiveThread(BufferedReader in) {
        this.in = in;
    }

    public void run() {
        try {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println("Server: " + inputLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
