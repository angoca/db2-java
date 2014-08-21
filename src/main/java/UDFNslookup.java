import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Performs the basic nslookup operations on a given address (IP or hostname.)
 * 
 * @author Andres Gomez
 */
public class UDFNslookup {

    /**
     * Resolves a given IP by returning its corresponding hostname.
     * 
     * @param ip
     *            IP address.
     * @return Name of the corresponding host.
     */
    public static String resolveIP(String ip) {
        String ret = null;
        if (ip != null) {
            ip = ip.trim();
            if (ip.compareTo("") != 0) {
                InetAddress inetAddress;
                try {
                    inetAddress = InetAddress.getByName(ip);
                    ret = inetAddress.getHostName();
                } catch (final UnknownHostException e) {
                    ret = "Invalid";
                }
            } else {
                ret = null;
            }
        } else {
            ret = null;
        }
        return ret;
    }

    /**
     * Returns the IP of the given hostname.
     * 
     * @param hostname
     *            Name of the host.
     * @return IP address.
     */
    public static String resolveName(String hostname) {
        String ret = null;
        if (hostname != null) {
            hostname = hostname.trim();
            if (hostname.compareTo("") != 0) {
                InetAddress inetAddress;
                try {
                    inetAddress = InetAddress.getByName(hostname);
                    ret = inetAddress.getHostAddress();
                } catch (final UnknownHostException e) {
                    ret = "Invalid";
                }
            } else {
                ret = null;
            }
        } else {
            ret = null;
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
        String value = "localhost";
        if (args != null && args.length > 0 && args[0] != null) {
            value = args[0];
        }
        String hostname = UDFNslookup.resolveIP(value);
        String address = UDFNslookup.resolveName(value);
        System.out.println("Hostname: " + hostname + " address " + address);
    }
}

