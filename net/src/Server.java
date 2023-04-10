import java.net.*;

public class Server {
    public static void main(String args[]) throws Exception {
        int port = 5005;

        DatagramSocket serverSocket = new DatagramSocket(port);
        byte[] receiveData = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        System.out.println("Listening on port " + port + "...");

        while (true) {
            serverSocket.receive(receivePacket);
            String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Received message: " + message);
        }
    }
}
