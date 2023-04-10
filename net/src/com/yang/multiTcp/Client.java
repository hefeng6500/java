package com.yang.multiTcp;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        PrintWriter out = null;
        BufferedReader in = null;
        BufferedReader stdIn = null;

        try {
            socket = new Socket("localhost", 8000); // 创建客户端Socket，连接服务器

            // 获取客户端输入流
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // 获取客户端输出流
            out = new PrintWriter(socket.getOutputStream(), true);

            // 获取用户输入流
            stdIn = new BufferedReader(new InputStreamReader(System.in));

            String userInput;
            while ((userInput = stdIn.readLine()) != null) {
                out.println(userInput); // 将用户输入发送给服务器

                if (userInput.equals("exit")) {
                    break;
                }

                String response = in.readLine(); // 接收服务器响应
                System.out.println("Server response: " + response);
            }
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host: localhost.");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to: localhost.");
            System.exit(1);
        } finally {
            // 关闭连接
            out.close();
            in.close();
            stdIn.close();
            socket.close();
        }
    }
}

