package com.zhq.socket.demo.chapter3;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author : ZHQ
 * @date : 2020/2/22
 */
public class SocketTest {
    public static void main(String[] args) throws IOException {
        try (Socket s = new Socket("www.baidu.com", 80)) {
            InputStream inputStream = s.getInputStream();
            Scanner in = new Scanner(inputStream);
            while (in.hasNextLine()) {
                String s1 = in.nextLine();
                System.out.println(s1);
            }
        }
    }
}
