import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class BroadCastReceiver{
    public static void main(String[] args) {
        try{
            int port = 1234;
            byte[] buf = new byte[1000];
            DatagramSocket socket = new DatagramSocket(port);
            DatagramPacket packet = new DatagramPacket(buf,buf.length);
            socket.receive(packet);
            String text = new String(buf,"UTF-8");
            System.out.println(text);
            socket.close();
        }catch(Exception e){
            System.out.println("error : " +e.getMessage());
        }
        
    }
}
