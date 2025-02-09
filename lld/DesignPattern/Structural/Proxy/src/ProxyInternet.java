import java.util.Arrays;
import java.util.List;

public class ProxyInternet implements  Internet {
    private Internet realInternet;
    private static final List<String>blockedSites = Arrays.asList("facebook.com", "instagram.com", "twitter.com");

    public ProxyInternet() {
        this.realInternet = new RealInternet();
    }

    @Override
    public void connectTo(String host) throws Exception {
        if(blockedSites.contains(host.toLowerCase())) {
            throw new Exception("Access to " + host +  " site is blocked !!. Contact your Admin");
        }
        realInternet.connectTo(host);
    }
}
