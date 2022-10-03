import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.DatagramPacket;

public class MultiCastSender{
    public static void main(String[] args) {
        try{
            int port = 1234;
            String text = "Hello, World!";
            byte[] buf = text.getBytes("UTF-8");
            InetAddress address = InetAddress.getByName("239.255.255.255");
            DatagramPacket packet = new DatagramPacket(buf, buf.length, address, port);
            MulticastSocket socket = new MulticastSocket();
            socket.send(packet);
            socket.close();
        }catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
    }
}