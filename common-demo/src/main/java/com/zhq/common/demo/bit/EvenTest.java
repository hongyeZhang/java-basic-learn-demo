package com.zhq.common.demo.bit;

/**
 * @author : ZHQ
 * @date : 2020/2/27
 */
public class EvenTest {

    public static void main(String[] args) {
        int[] in = new int[] {-5, -3, -1, 1, 3, 5, 7, 9};
        for (int i : in) {
            // 判断奇数
            System.out.println((i & 1) == 1);
        }
    }
}
