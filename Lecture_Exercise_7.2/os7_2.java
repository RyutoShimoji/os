import java.net.InetAddress;
public class os7_2 {
    public static void main(String[] args){
        try{
            InetAddress localHost = InetAddress.getLocalHost();
            String hostIP = localHost.getHostAddress();
            System.out.println("local host IP : "+hostIP);
            String hostName = localHost.getHostName();
            System.out.println("local host Name : "+hostName);
            InetAddress[] addresses = InetAddress.getAllByName(hostName);
            for(int i=0;i<addresses.length;i++){
                System.out.println("available address : "+addresses[i].getHostAddress());
            }
        }
        catch(Exception e){
            System.out.println("error : "+ e.getMessage());
        }
    }
}