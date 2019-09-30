import java.io.*;
import java.net.*;

class Client {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 6666);

        while (true) {

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            // in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

            String line = in.readLine().trim();
            out.writeUTF(line);

            if (line.equals("bye")) {
                System.out.println("Exiting..");
                break;
            }

        }
    }
}