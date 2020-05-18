package com.zhq.socket.demo;

import java.util.Scanner;

/**
 * @author : ZHQ
 * @date : 2020/2/22
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please input a string");
        String s = in.nextLine();

        System.out.println("please input a integer ");
        int i = in.nextInt();

        System.out.println(s);
        System.out.println(i);

    }
}
