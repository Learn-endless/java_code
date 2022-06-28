package network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TcpEchoServer {
    //socket对象
    private ServerSocket socket = null;

    //构造方法，显式的给服务器绑定一个端口号
    public TcpEchoServer(int port) throws IOException {
        socket = new ServerSocket(port);
    }

    public void start() throws IOException {
        System.out.println("服务器启动!");
        while(true){
            //1.TCP协议需要先进行连接
            Socket clientSocket = socket.accept();
            processConnection(clientSocket);
        }
    }

    private void processConnection(Socket clientSocket) {
        System.out.printf("客户端建立连接 IP:%s Port:%d ",clientSocket.getInetAddress().toString(),clientSocket.getPort());
        try(InputStream inputStream = clientSocket.getInputStream();
            OutputStream outputStream = clientSocket.getOutputStream()){
            Scanner scanner = new Scanner(inputStream);

            while(true){
                if(!scanner.hasNext()){
                    System.out.println("客户端连接失败!");
                    break;
                }
                //2.读取请求数据
                String request = scanner.next();
                //3.计算对应的响应
                String response = process(request);
                //4.将响应写回客户端
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream,"UTF-8");
                PrintWriter printWriter = new PrintWriter(outputStreamWriter);
                printWriter.println(response);

                //手动刷新缓冲区
                printWriter.flush();

                //打印一下日志
                System.out.printf("IP:%s Port:%d req:%s resp:%s ",clientSocket.getInetAddress().toString(),clientSocket.getPort(),
                        request,response);;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                //每次断开连接就进行资源的释放
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //回显服务
    private String process(String request) {
        return request;
    }

    public static void main(String[] args) throws IOException {
        TcpEchoServer tcpEchoServer = new TcpEchoServer(9090);
        tcpEchoServer.start();
    }
}
