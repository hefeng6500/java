package com.yang.multiClientMessageTcp;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(8000); // 创建服务器Socket，监听端口8000
            System.out.println("Server started.");

            while (true) {
                Socket clientSocket = serverSocket.accept(); // 等待客户端连接
                System.out.println("Client connected.");

                // 创建新线程来处理客户端的请求
                Thread thread = new ServerThread(clientSocket);
                thread.start();
            }
        } catch (IOException e) {
            System.err.println("Could not listen on port: 8000.");
            System.exit(1);
        } finally {
            serverSocket.close();
        }
    }
}

