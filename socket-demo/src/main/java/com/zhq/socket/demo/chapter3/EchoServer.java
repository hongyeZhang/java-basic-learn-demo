package com.zhq.socket.demo.chapter3;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author : ZHQ
 * @date : 2020/2/22
 */
public class EchoServer {
    public static void main(String[] args) throws Exception {
        try (ServerSocket server = new ServerSocket(8189)) {
            try (Socket incoming = server.accept()) {
                InputStream inputStream = incoming.getInputStream();
                OutputStream outputStream = incoming.getOutputStream();
                try (Scanner in = new Scanner(inputStream)) {
                    PrintWriter out = new PrintWriter(outputStream, true);
                    out.println("hello, enter BYE to quit");

                    boolean done = false;
                    while (!done && in.hasNext()) {
                        String line = in.nextLine();
                        System.out.println("Echo : " + line);
                        if ("BYE".equals(line.trim())) {
                            done = true;
                        }
                    }
                }
            }
        }
    }
}
