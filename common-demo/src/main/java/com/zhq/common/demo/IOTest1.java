package com.zhq.common.demo;

import java.io.*;
import java.util.Scanner;

/**
 * @author : ZHQ
 * @date : 2019/12/2
 */
public class IOTest1 {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(new FileInputStream("test1.txt"))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }


    }

    public void test1() throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter("test1.txt"));
        printWriter.println("harry hacker");
        printWriter.println("   ");
        printWriter.println(7500);
        printWriter.close();
    }

    public void read1() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("test1.txt"), "UTF-8"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
