package com.zhq.socket.demo.chapter3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author : ZHQ
 * @date : 2020/2/22
 */
public class ThreadEchoHander implements Runnable{
    private Socket incoming;

    public ThreadEchoHander(Socket incoming) {
        this.incoming = incoming;
    }

    @Override
    public void run() {
        try {
            try {
                InputStream inputStream = incoming.getInputStream();
                OutputStream outputStream = incoming.getOutputStream();

                Scanner in = new Scanner(inputStream);
                PrintWriter out = new PrintWriter(outputStream, true);
                out.println("hello, enter BYE to exit");

                boolean done = false;
                while (!done && in.hasNext()) {
                    String line = in.nextLine();
                    out.println("Echo : " + line);
                    if ("BYE".equals(line.trim())) {
                        done = true;
                    }
                }
            } finally {
                incoming.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
