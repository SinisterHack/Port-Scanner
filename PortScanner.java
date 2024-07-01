import java.net.Socket;
import java.net.InetSocketAddress;
import java.io.IOException;

public class PortScanner {
    public static void main(String[] args) {
        for (int port = 1; port < 1024; port++) {
            try (Socket socket = new Socket()) {
                socket.connect(new InetSocketAddress("0.0.0.0", port), 1000);
                System.out.println(port + ": OPEN");
            } catch (IOException e) {
                // Continue to the next port
            }
        }
    }
}
