import java.io.*;
import java.net.*;

class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(6666);
        DataInputStream in = null;
        Socket socket = server.accept();
        in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

        while (true) {

            String line = in.readUTF().trim();

            if (line.equals("bye")) {
                System.out.println("Exiting..");
                break;
            }

            System.out.println(line);

        }

    }
}