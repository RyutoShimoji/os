import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.DatagramPacket;

public class MultiCastReceiver {
    public static void main(String[] args) {
        try {
            int port = 1234;
            byte[] buf = new byte[100000];
            InetAddress address = InetAddress.getByName("239.255.255.255");
            MulticastSocket socket = new MulticastSocket(port);
            socket.joinGroup(address);
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            socket.receive(packet);
            String text = new String(buf,"UTF-8");
            System.out.println(text);
        } catch (Exception e) {
            System.err.println("error : " + e.getMessage());
        }
    }
}