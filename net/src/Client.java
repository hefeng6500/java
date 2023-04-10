import java.net.*;

public class Client {
    public static void main(String args[]) throws Exception {
        InetAddress IPAddress = InetAddress.getByName("127.0.0.1");
        int port = 5005;
        String[] messages = {"Hello, World!", "How are you?", "Goodbye!"};

        DatagramSocket clientSocket = new DatagramSocket();

        for (String message : messages) {
            byte[] sendData = message.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
            clientSocket.send(sendPacket);
        }

        clientSocket.close();
    }
}
