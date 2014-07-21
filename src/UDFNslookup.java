import java.net.InetAddress;
import java.net.UnknownHostException;

public class UDFNslookup {

    /**
     * Resolves a given IP by returning its corresponding hostname.
     * 
     * @param ip
     *            IP address.
     * @return Name of the corresponding host.
     */
    public static String resolveIP(final String ip) {
        String ret = null;
        InetAddress inetAddress;
        try {
            inetAddress = InetAddress.getByName(ip);
            ret = inetAddress.getHostName();
        } catch (final UnknownHostException e) {
            ret = "Error:" + ip;
        }
        return ret;
    }

    /**
     * Returns the IP of the given hostname.
     * 
     * @param host
     *            Name of the host.
     * @return IP address.
     */
    public static String resolveName(final String host) {
        String ret = null;
        InetAddress inetAddress;
        try {
            inetAddress = InetAddress.getByName(host);
            ret = inetAddress.getHostAddress();
        } catch (final UnknownHostException e) {
            ret = "Error:" + host;
        }
        return ret;
    }

    /**
     * Tester
     * 
     * @param args
     *            Params for tests.
     */
    public static void main(final String[] args) {
        UDFNslookup.resolveIP(args[0]);
    }
}
