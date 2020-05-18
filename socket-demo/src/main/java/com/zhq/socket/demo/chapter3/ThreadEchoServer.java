package com.zhq.socket.demo.chapter3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author : ZHQ
 * @date : 2020/2/22
 */
public class ThreadEchoServer {
    public static void main(String[] args) {
        int i = 1;
        try {
            ServerSocket serverSocket = new ServerSocket(8189);
            while (true) {
                Socket incoming = serverSocket.accept();
                System.out.println("spawning " + i);
                Runnable r = new ThreadEchoHander(incoming);
                Thread t = new Thread(r);
                t.start();
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
