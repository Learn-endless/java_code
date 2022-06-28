package network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UdpEchoClient {
    private DatagramSocket socket = null;
    //这里的 IP 是用来存储 服务器 的 ip 地址。
    private String ipServer;
    //同样 port 也是只 服务器 的端口。
    private int portServer;

    //构造方法,不需要手动指定端口,由操作系统自动分配。（客户端的端口号不需要用户来指定）
    public UdpEchoClient(String ip,int port) throws SocketException {
        socket = new DatagramSocket();
        ipServer = ip;
        portServer = port;
    }

    //启动客户端
    public void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        //1.从键盘接收用户输入的数据。
        while(true){
            System.out.print("request-> ");
            String requestStr = scanner.next();
            //2.将从键盘接收的数据打包成一个 UDP 请求,并发送给服务器。
            DatagramPacket request = new DatagramPacket(requestStr.getBytes(),requestStr.getBytes().length,
                    InetAddress.getByName(ipServer),portServer);  //指定服务器的IP和端口号
            socket.send(request);
            //3.从服务器读取响应,并解析。
            DatagramPacket response = new DatagramPacket(new byte[1024],1024);
            socket.receive(response);
            String responseStr = new String(response.getData(),0,response.getLength(),"UTF-8");
            //4.把响应的结果显示在控制台上。
            System.out.println("response: "+responseStr);
        }
    }

    public static void main(String[] args) throws IOException {
        UdpEchoClient udpEchoClient = new UdpEchoClient("127.0.0.1",9090);
        udpEchoClient.start();
    }
}
