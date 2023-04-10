package com.yang.multiClientMessageTcp;

import java.io.*;
import java.net.*;


class ServerThread extends Thread {
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            // 获取客户端输入流: 是为了能够读取客户端发来的消息
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // 获取客户端输出流: 是为了能够向客户端发送消息
            out = new PrintWriter(socket.getOutputStream(), true);

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println("Received message: " + inputLine);
                out.println("Server received message: " + inputLine);
            }

            // 关闭连接
            out.close();
            in.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
