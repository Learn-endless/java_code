package network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TcpEchoClient {
    private Socket socket = null;

    //这里所传的 IP 和 端口号，表示与客户端相连接的服务器的 IP 和 端口号
    public TcpEchoClient(String serverIp,int serverPort) throws IOException {
        socket = new Socket(serverIp, serverPort);
    }

    public void start(){
        System.out.println("客户端连接成功!");
        try(InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream()){

            Scanner scanner = new Scanner(System.in);
            while(true){
                //1.从控制台输入请求
                String request = scanner.next();
                //2.将接收到的字符串请求进行构造，并发送给服务器。
                PrintWriter printWriter = new PrintWriter(outputStream);
                printWriter.println(request);
                //写一个,手动刷新一下
                printWriter.flush();
                //3.接收服务器的响应
                Scanner responseScanner = new Scanner(inputStream);
                String response = responseScanner.next();
                //4.打印到控制台
                System.out.println(response);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        TcpEchoClient tcpEchoClient = new TcpEchoClient("127.0.0.1",9090);
        tcpEchoClient.start();
    }
}
