package network;

import java.io.IOException;
import java.net.SocketException;
import java.util.HashMap;

public class UdpDictServer extends UdpEchoServer{
    private HashMap<String,String> dict = new HashMap<>();
    public UdpDictServer(int port) throws SocketException {
        super(port);

        dict.put("hello","你好");
        dict.put("rivers","河流");
        dict.put("eye","眼睛");
        dict.put("chinese","语文");
    }

    @Override
    public String dealWith(String requestStr) {
        return dict.getOrDefault(requestStr,"检索不到该词!!");
    }

    public static void main(String[] args) throws IOException {
        UdpDictServer udpDictServer = new UdpDictServer(9090);
        udpDictServer.start();
    }
}
