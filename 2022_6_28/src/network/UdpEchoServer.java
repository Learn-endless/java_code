package network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpEchoServer {
    //首先准备好 Socket 实例,这时进行网络编程的基础。
    private DatagramSocket socket = null;

    //在构造方法中创建一个 Socket 对象，并且显式的给它绑定一个 端口号（port）
    public UdpEchoServer(int port) throws SocketException {
        //这里有一个异常，表示创建 Socket 对象可能会失败！
        //比如：1.port指定的端口号已经被占用
        //     2.每个进程所能打开的文件数是有限的，如果当前进程已经打开了很多的文件，那么可能就会导致 socket文件打不开。从而创建失败！
        socket = new DatagramSocket(port);
    }

    //启动服务器
    public void start() throws IOException {
        System.out.println("启动服务器!");
        //1.读取请求
        while(true){
            //创建一个DatagramPacket对象，接收请求
            DatagramPacket request = new DatagramPacket(new byte[1024],1024);
            //如果没有请求，在这就会进行阻塞。
            socket.receive(request);
            //2.根据请求计算响应
            String requestStr = new String(request.getData(),0,request.getLength(),"utf-8");
            //调用专门处理请求的方法。
            String responseStr = dealWith(requestStr);
            //3.发送响应，先打包成 DatagramPacket 对象，然后真正发送。
            DatagramPacket response = new DatagramPacket(responseStr.getBytes(),responseStr.getBytes().length,
                    request.getSocketAddress());   //这个参数表示拿到 请求的 IP 和 端口号
            socket.send(response);

            //在这里可以使用控制台打印一下 IP、端口号、请求内容、响应内容
            System.out.printf("IP:%s Port:%d req:%s resp:%s\n",request.getAddress().toString(),request.getPort(),
                    requestStr,responseStr);
        }
    }
    //由于我们实现的是一个 回显服务，所以直接返回就好。
    public String dealWith(String requestStr) {
        return requestStr;
    }

    public static void main(String[] args) throws IOException {
        UdpEchoServer udpEchoServer = new UdpEchoServer(9090);
        udpEchoServer.start();
    }
}
