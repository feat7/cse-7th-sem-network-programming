import java.io.*;
import java.net.*;
import java.util.*;

class Client {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        DatagramSocket ds = new DatagramSocket();
        InetAddress ip = InetAddress.getLocalHost();

        byte buf[] = null;

        while (true) {
            String input = scanner.nextLine();
            buf = input.getBytes();

            DatagramPacket dp = new DatagramPacket(buf, buf.length, ip, 6666);
            ds.send(dp);

            if (input.equals("bye")) {
                System.out.println("Exiting!");
                break;
            }
        }
    }
}