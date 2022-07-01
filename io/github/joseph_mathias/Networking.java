import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Networking {
    public static void main(String[] args) {
        String url = "www.google.com";
        try {
            InetAddress inetAddress = Inet4Address.getByName(url);
            System.out.println("Address: " + Arrays.toString(inetAddress.getAddress()));
            System.out.println("Host Address: " + inetAddress.getHostAddress());
            System.out.println("isLinkLocalAdddress: " + inetAddress.isLinkLocalAddress());
            System.out.println("isLoopback: " + inetAddress.isSiteLocalAddress());
            System.out.println("hashCode: " + inetAddress.hashCode());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
