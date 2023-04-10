package com.yang.multiTcp;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        PrintWriter out = null;
        BufferedReader in = null;

        try {
            serverSocket = new ServerSocket(8000); // 创建服务器Socket，监听端口8000
            System.out.println("Server started.");

            while (true) {
                clientSocket = serverSocket.accept(); // 等待客户端连接
                System.out.println("Client connected.");

                // 获取客户端输入流
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                // 获取客户端输出流
                out = new PrintWriter(clientSocket.getOutputStream(), true);

                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    System.out.println("Received message: " + inputLine);
                    out.println("Server received message: " + inputLine);
                }

                // 关闭连接
                out.close();
                in.close();
                clientSocket.close();
            }
        } catch (IOException e) {
            System.err.println("Could not listen on port: 8000.");
            System.exit(1);
        } finally {
            serverSocket.close();
        }
    }
}

