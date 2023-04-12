package com.yang.bs;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
    // 用于存储所有已连接的客户端
    private ArrayList<ClientHandler> clients = new ArrayList<>();

    public static void main(String[] args) {
        new Server().runServer();
    }

    public void runServer() {
        try {
            // 创建ServerSocket并监听端口
            ServerSocket serverSocket = new ServerSocket(8000);
            System.out.println("Server started on port 8000...");

            while (true) {
                // 接受客户端连接
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket);

                // 创建ClientHandler并将其添加到客户端列表中
                ClientHandler client = new ClientHandler(clientSocket, this);
                clients.add(client);

                // 启动ClientHandler线程处理客户端消息
                Thread thread = new Thread(client);
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 用于广播消息给所有客户端
    public void broadcast(String message) {
        for (ClientHandler client : clients) {
            client.sendMessage(message);
        }
    }

    // 用于将客户端从客户端列表中移除
    public void removeClient(ClientHandler client) {
        clients.remove(client);
    }
}

class ClientHandler implements Runnable {
    private Socket clientSocket;
    private Server server;
    private PrintWriter out;
    private BufferedReader in;

    public ClientHandler(Socket clientSocket, Server server) {
        this.clientSocket = clientSocket;
        this.server = server;
    }

    public void run() {
        try {
            // 获取客户端输入流和输出流
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                // 将客户端消息广播给所有客户端
                server.broadcast(inputLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 将客户端从客户端列表中移除
            server.removeClient(this);

            try {
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // 用于向客户端发送消息
    public void sendMessage(String message) {
        out.println(message);
    }
}

