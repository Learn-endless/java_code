package network;

import java.io.IOException;
import java.util.HashMap;

public class translateTcpThreadPoolServer extends TcpThreadPoolEchoServer{
    private HashMap<String,String> hashMap = new HashMap<>();
    public translateTcpThreadPoolServer(int port) throws IOException {
        super(port);

        hashMap.put("cat","小猫");
        hashMap.put("car","小汽车");
        hashMap.put("apple","苹果");
        hashMap.put("banana","香蕉");
        hashMap.put("TV","电视");

    }

    @Override
    public String process(String request) {
        String result = hashMap.getOrDefault(request, "没有收录该词!");
        return result;
    }

    public static void main(String[] args) throws IOException {
        translateTcpThreadPoolServer translateTcpThreadPoolServer = new translateTcpThreadPoolServer(9090);
        translateTcpThreadPoolServer.start();
    }
}
