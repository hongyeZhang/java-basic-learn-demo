package com.zhq.common.demo.memory;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author : ZHQ
 * @date : 2020/2/28
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(ClassLayout.parseInstance(new NullObject()).toPrintable());
    }

}
