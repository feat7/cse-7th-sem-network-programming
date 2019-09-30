import java.io.*;
import java.net.*;

class Server {
    public static void main(String[] args) throws IOException {
        // Create socket
        DatagramSocket ds = new DatagramSocket(6666);

        // Store data in bytes
        byte[] receive = new byte[65535];

        // Create datapacket
        DatagramPacket dPacket = null;

        String message = "";

        while (true) {

            dPacket = new DatagramPacket(receive, receive.length);
            ds.receive(dPacket);

            message = new String(dPacket.getData()).trim();
            System.out.println("Data received: " + message);

            if (message.equals("bye")) {
                System.out.println("Exiting..");
                break;
            }

            receive = new byte[65535];
        }
    }
}