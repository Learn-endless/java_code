package network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TcpThreadPoolEchoServer {
    //socket对象
    private ServerSocket socket = null;

    //构造方法，显式的给服务器绑定一个端口号
    public TcpThreadPoolEchoServer(int port) throws IOException {
        socket = new ServerSocket(port);
    }

    public void start() throws IOException {
        System.out.println("服务器启动!");
        //创建一个根据任务量自动扩充的线程池
        ExecutorService threadPool = Executors.newCachedThreadPool();
        while(true){
            //1.TCP协议需要先进行连接
            Socket clientSocket = socket.accept();
            //每当一个客户端建立了连接，就添该任务到线程池中去，去执行 processConnection
            threadPool.submit(new Runnable() {
                @Override
                public void run() {
                    processConnection(clientSocket);
                }
            });
        }
    }

    private void processConnection(Socket clientSocket) {
        System.out.printf("客户端建立连接 IP:%s Port:%d\n",clientSocket.getInetAddress().toString(),clientSocket.getPort());
        try(InputStream inputStream = clientSocket.getInputStream();
            OutputStream outputStream = clientSocket.getOutputStream()){
            Scanner scanner = new Scanner(inputStream);

            while(true){
                if(!scanner.hasNext()){
                    System.out.println("客户端连接失败!\n");
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
                System.out.printf("IP:%s Port:%d req:%s resp:%s\n",clientSocket.getInetAddress().toString(),clientSocket.getPort(),
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
    public String process(String request) {
        return request;
    }

    public static void main(String[] args) throws IOException {
        TcpThreadPoolEchoServer tcpThreadPoolEchoServer = new TcpThreadPoolEchoServer(9090);
        tcpThreadPoolEchoServer.start();
    }
}
